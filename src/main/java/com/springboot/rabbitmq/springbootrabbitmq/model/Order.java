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
public class Order implements Serializable {

    private String orderId;
    private String name;
    private int qty;
    private double price;
}
