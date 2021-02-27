package com.springboot.rabbitmq.springbootrabbitmq.producer;

import com.springboot.rabbitmq.springbootrabbitmq.model.Order;
import com.springboot.rabbitmq.springbootrabbitmq.model.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderProducer {

    @Value("${sr.rabbit.routing.name}")
    private String routingName;

    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/{restaurantName}")
    public String orderFood(@RequestBody Order order, @PathVariable String restaurantName) {
        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "order placed succesfully in " + restaurantName);
        sendToQueue(orderStatus);
        return "Success !!";
    }

    public void sendToQueue(OrderStatus orderStatus) {
        System.out.println("Order Sent ID : " + orderStatus.getOrder().getOrderId());
        rabbitTemplate.convertAndSend(exchangeName, routingName, orderStatus);
    }
}
