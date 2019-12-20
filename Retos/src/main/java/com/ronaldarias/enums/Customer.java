package com.ronaldarias.enums;

public enum Customer {

    REGULAR(1), REWARDS(2);

    private int id;

    private Customer(int id) {
        this.id = id;
    }
}
