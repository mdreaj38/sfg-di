package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import com.example.sfgdi.services.SettergreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author rejaul.reaj
 * @since 11/15/21
 */
@Controller
public class SetterinjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("settergreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String getGreetings(){
        return greetingService.sayHello();
    }
}