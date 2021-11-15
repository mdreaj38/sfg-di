package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author rejaul.reaj
 * @since 11/16/21
 */
@Profile("SN")
@Service("I18nService")
public class SpanishGreeting implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello - Spanish";
    }
}