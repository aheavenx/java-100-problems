package com.aheavenx.spring;

import com.aheavenx.spring.api.HelloWorldConfig;
import com.aheavenx.spring.api.PrintDispatcher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Skovorodnikov
 *         Created on 24.05.2017 12:27
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        PrintDispatcher printer = ctx.getBean(PrintDispatcher.class);
        printer.print("haha");
        printer.print("hoho");
    }
}
