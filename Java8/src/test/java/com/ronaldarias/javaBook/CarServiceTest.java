package com.ronaldarias.javaBook;

import org.junit.Test;

public class CarServiceTest {

    @Test
    public void shouldDemostrateLogging() {
        CarService carService = new CarService();
        carService.process("BMW");
    }
}
