package com.example.api.controller;

import com.example.api.domain.ConsumerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/consumer")
    public String getConsumer(@RequestHeader(name = "consumer_id") String consumerId) {
        return "Este é o consumer id recebido via GET: " + consumerId;
    }

    @PostMapping("/consumer-post")
    public String getConsumerPost(@RequestHeader(name = "consumer_id") String consumerId) {
        return "Este é o consumer id recebido via POST: " + consumerId;
    }

    @PostMapping("/consumer-post-with-body")
    public String getConsumerPostWithBody(@RequestBody ConsumerDTO consumer) {
        return "Este é o CPF do consumer recebido via POST: " + consumer.getCpf();
    }

}
