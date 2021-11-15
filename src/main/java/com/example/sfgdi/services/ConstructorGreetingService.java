package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author rejaul.reaj
 * @since 11/15/21
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello-constructor";
    }
}