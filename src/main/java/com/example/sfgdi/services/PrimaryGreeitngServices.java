package com.example.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author rejaul.reaj
 * @since 11/15/21
 */
@Primary
@Service
public class PrimaryGreeitngServices implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello - Primary Beans";
    }
}