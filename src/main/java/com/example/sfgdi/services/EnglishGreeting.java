package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author rejaul.reaj
 * @since 11/16/21
 */
@Profile("EN")
@Service("I18nService")
public class EnglishGreeting implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello - English";
    }
}