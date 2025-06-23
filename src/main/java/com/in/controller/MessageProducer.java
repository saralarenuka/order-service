package com.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.in.model.Order;

@Service
public class MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String item) {
        jmsTemplate.convertAndSend("order.queue", item);
    }
}