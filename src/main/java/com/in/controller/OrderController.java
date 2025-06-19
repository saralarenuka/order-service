package com.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/place")
    public String placeOrder() {
        String paymentResponse = restTemplate.getForObject("http://localhost:8082/payment/pay", String.class);
        return "Order placed successfully. " + paymentResponse;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

