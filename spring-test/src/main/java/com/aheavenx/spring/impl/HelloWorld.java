package com.aheavenx.spring.impl;

import com.aheavenx.spring.api.Printer;

/**
 * @author Skovorodnikov
 *         Created on 24.05.2017 12:24
 */
public class HelloWorld implements Printer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printMessage(String msg) {
        System.out.println("Message from hello: " + msg);
    }

}
