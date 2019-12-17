package com.ronaldarias.javaBook;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person ronald = new Person();
        assertEquals("Hello World", ronald.helloWorld());
    }
}