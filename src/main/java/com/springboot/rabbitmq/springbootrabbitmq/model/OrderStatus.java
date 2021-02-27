package com.springboot.rabbitmq.springbootrabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus implements Serializable {

    private Order order;
    private String status;
    private String message;
}
