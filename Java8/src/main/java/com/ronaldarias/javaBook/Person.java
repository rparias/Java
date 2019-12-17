package com.ronaldarias.javaBook;

import com.ronaldarias.javaBook.attributes.Name;
import com.ronaldarias.javaBook.attributes.Planet;

public class Person {

    private Name personName;
    private static Planet homePlanet;
    private static int personCounter;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
        personCounter += 1;
    }

    public static String helloWorld() {
        return "Hello World";
    }

    public Name name() {
        return personName;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }

    // Uso de Enums
    public void enumExample() {
        for (LoggingLevel state : LoggingLevel.values()) {
            if (state == LoggingLevel.PENDING) {
                /* call a method */
            }
            if (state == LoggingLevel.PROCESSING) {
                /* call a method */
            }
            if (state == LoggingLevel.PROCESSED) {
                /* call a method */
            }
        }
    }
}
