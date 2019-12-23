package com.ronaldarias.util;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.Day;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UtilitiesTest {

    @Test
    public void shouldBeCustomerType() {
        Customer customer = Utilities.getCustomerFromString("Regular");
        assertEquals(Customer.REGULAR, customer);
    }

    @Test
    public void shouldBeDay() {
        List<Day> days = Utilities.getDaysFromString(" 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)");

        List<Day> expectedDays = new ArrayList<>();
        expectedDays.add(Day.MON);
        expectedDays.add(Day.TUES);
        expectedDays.add(Day.WED);

        assertEquals(expectedDays, days);
    }
}
