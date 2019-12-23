package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.Day;

import java.util.List;

public interface Finder {
    Hotel searchCheapestHotel(List<Hotel> hotels, Customer customer, List<Day> days);
}
