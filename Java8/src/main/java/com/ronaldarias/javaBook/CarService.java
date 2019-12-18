package com.ronaldarias.javaBook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input) {
        log.debug("processing car: {}", input);
    }
}
