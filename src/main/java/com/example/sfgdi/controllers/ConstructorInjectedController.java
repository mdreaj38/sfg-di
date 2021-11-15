package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author rejaul.reaj
 * @since 11/15/21
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayHello();
    }
}