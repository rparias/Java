package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.DayType;

public class Rate {
    DayType dayType;
    Customer customer;
    Double price;

    public Rate(DayType dayType, Customer customer, Double price) {
        this.dayType = dayType;
        this.customer = customer;
        this.price = price;
    }
}
