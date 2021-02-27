package com.springboot.rabbitmq.springbootrabbitmq.consumer;

import com.springboot.rabbitmq.springbootrabbitmq.model.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderListener {

    @RabbitListener(queues = "${sr.rabbit.queue.name}")
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}
