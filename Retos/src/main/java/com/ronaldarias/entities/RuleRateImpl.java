package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.DayType;

public class RuleRateImpl implements RuleRate {

    private DayType dayType;
    private Customer customer;

    public RuleRateImpl(DayType dayType, Customer customer) {
        this.dayType = dayType;
        this.customer = customer;
    }

    @Override
    public DayType dayType() {
        return dayType;
    }

    @Override
    public Customer customer() {
        return customer;
    }

    @Override
    public String toString() {
        return customer + "|" + dayType;
    }
}
