package ru.iteco.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String port;

    @GetMapping("/name")
    public String getTest() {
        return port;
    }
}
