package com.aheavenx.spring.api;

import com.aheavenx.spring.impl.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Skovorodnikov
 *         Created on 24.05.2017 14:11
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    @Scope("prototype")
    public PrintDispatcher printDispatcher() {
        return new PrintDispatcher(printer());
    }

    @Bean
    public Printer printer() {
        return new HelloWorld();
    }
}
