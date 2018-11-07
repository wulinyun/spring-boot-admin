package com.landasoft.mas.demo.springboot.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HellWordController {
	@RequestMapping("/")
    public String home() {
        return "Spring Boot Admin Hello World ！！！！！！";
    }
}
