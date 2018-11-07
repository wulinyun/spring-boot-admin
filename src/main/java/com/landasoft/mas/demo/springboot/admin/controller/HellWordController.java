package com.landasoft.mas.demo.springboot.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HellWordController {
	@Autowired
	private Environment environment;
	@RequestMapping("/getEnv")
    public String getEnv(String env) {
        return environment.getProperty(env);
    }
}
