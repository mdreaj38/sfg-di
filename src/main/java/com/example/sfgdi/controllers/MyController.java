package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author rejaul.reaj
 * @since 11/15/21
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayHello();
    }
}
