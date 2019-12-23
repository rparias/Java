package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.Day;
import com.ronaldarias.enums.DayType;


import java.util.ArrayList;
import java.util.List;

public class FinderImpl implements Finder {

    @Override
    public Hotel searchCheapestHotel(List<Hotel> hotels, Customer customer, List<Day> days) {

        List<DayType> dayTypes = getDayTypes(days);
        double amountCheapestHotel = 0.0;

        Hotel cheapestHotel = null;

        for (Hotel hotel: hotels) {

            Double totalHotel = 0.0;

            for (Rate rate: hotel.rates()) {
                for (DayType dayType: dayTypes) {
                    if (rate.dayType == dayType && rate.customer == customer)
                        totalHotel += rate.price;
                }
            }

            if (amountCheapestHotel == 0.0) {
                amountCheapestHotel = totalHotel;
                cheapestHotel = hotel;
            }
            else if (totalHotel < amountCheapestHotel) {
                amountCheapestHotel = totalHotel;
                cheapestHotel = hotel;
            } else if (totalHotel == amountCheapestHotel) {
                if (cheapestHotel.rating() < hotel.rating())
                    cheapestHotel = hotel;
            }

        }

        return cheapestHotel;
    }

    private List<DayType> getDayTypes(List<Day> days) {
        List<DayType> dayTypes = new ArrayList<>();

        for (Day day: days) {
            dayTypes.add(isWeekend(day) ? DayType.WEEKEND : DayType.WEEKDAY);
        }

        return dayTypes;
    }

    private boolean isWeekend(Day day) {
        return day == Day.SAT || day == Day.SUN;
    }
}
