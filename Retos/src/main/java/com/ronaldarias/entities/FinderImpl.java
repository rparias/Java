package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.Day;
import com.ronaldarias.enums.DayType;

import java.util.List;

public class FinderImpl implements Finder {

    private List<Hotel> hotels;
    private static FinderImpl finder;

    public static FinderImpl getFinderFromHotels(List<Hotel> hotels) {
        if (finder == null)
            return new FinderImpl(hotels);
        else
            return finder;
    }

    private FinderImpl(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    @Override
    public Hotel searchCheapestHotel(Customer customer, List<Day> days) {

        double amountCheapestHotel = 0.0;
        double totalHotel;
        Hotel cheapestHotel = null;

        for (Hotel hotel: hotels) {
            totalHotel = 0.0;
            for (Day day: days) {
                totalHotel += getDailyAmmount(customer, hotel, day);
            }

            if (amountCheapestHotel == 0 || totalHotel < amountCheapestHotel) {
                amountCheapestHotel = totalHotel;
                cheapestHotel = hotel;
            } else if (amountCheapestHotel == totalHotel && cheapestHotel.rating() < hotel.rating()) {
                cheapestHotel = hotel;
            }
        }

        return cheapestHotel;
    }

    private double getDailyAmmount(Customer customer, Hotel hotel, Day day) {
        return hotel.priceForDay(new RuleRateImpl(getDayType(day), customer));
    }

    private DayType getDayType(Day day) {
        return isWeekend(day) ? DayType.WEEKEND : DayType.WEEKDAY;
    }

    private boolean isWeekend(Day day) {
        return day == Day.SAT || day == Day.SUN;
    }
}
