package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.DayType;

public interface RuleRate {
    DayType dayType();
    Customer customer();
}
