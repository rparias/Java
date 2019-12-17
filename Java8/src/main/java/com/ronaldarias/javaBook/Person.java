package com.ronaldarias.javaBook;

import com.ronaldarias.javaBook.attributes.Name;

public class Person {

    private Name personName;

    public String helloWorld() {
        return "Hello World";
    }

    public Name name() {
        return personName;
    }
}
