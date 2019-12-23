package com.ronaldarias.util;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.Day;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

    public static Customer getCustomerFromString(String input) {
        return Customer.valueOf(input.toUpperCase());
    }

    public static List<Day> getDaysFromString(String input) {

        List<Day> days = new ArrayList<>();

        //16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
        String[] array = input.split(",");

        //16Mar2009(mon)
        for (String s: array) {
            s = s.substring(s.indexOf("(") + 1);
            s = s.substring(0, s.indexOf(")"));
            days.add(Day.valueOf(s.toUpperCase()));
        }

        return days;
    }
}
