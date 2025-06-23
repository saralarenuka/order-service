package com.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.model.Order;

@RestController
@RequestMapping("/orders")
public class MessageOrderController {

    @Autowired
    private MessageProducer producer;

    @GetMapping("/place/{item}")
    public String placeOrder(@PathVariable String item) {
        producer.send(item);
        return "Order sent to queue.";
    }
}