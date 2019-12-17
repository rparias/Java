package com.ronaldarias.javaBook;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person person = new Person();
        assertEquals("Hello World", person.helloWorld());
    }

    @Test
    public void shouldReturnHelloRonald() {
        Person ronald = new Person();
        assertEquals("Hello Ronald", ronald.hello("Ronald"));
    }

    @Test
    public void shouldRetunNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();
        assertEquals(3, myPerson.numberOfPersons());
    }
}