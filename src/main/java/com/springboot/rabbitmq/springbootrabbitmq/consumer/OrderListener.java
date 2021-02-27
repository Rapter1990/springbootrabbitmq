package com.springboot.rabbitmq.springbootrabbitmq.consumer;

import com.springboot.rabbitmq.springbootrabbitmq.model.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderListener {

    public static final String queueName = "order-queue";

    @RabbitListener(queues = OrderListener.queueName)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}
