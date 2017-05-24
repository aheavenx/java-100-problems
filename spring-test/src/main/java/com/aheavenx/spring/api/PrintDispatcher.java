package com.aheavenx.spring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Skovorodnikov
 *         Created on 24.05.2017 12:36
 */
@Component
public class PrintDispatcher {

    @Autowired private final Printer printer;

    public PrintDispatcher(Printer printer) {
        this.printer = printer;
    }

    public void print(String msg) {
        printer.printMessage(msg);
    }
}
