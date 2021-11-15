package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author rejaul.reaj
 * @since 11/15/21
 */
@Service
public class SettergreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello - Property";
    }
}