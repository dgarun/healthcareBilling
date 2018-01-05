package com.healthcare.billing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingCommonController {

	@RequestMapping("/hello")  
    public String hello(){  
        return "Hello!";  
    }  
}
