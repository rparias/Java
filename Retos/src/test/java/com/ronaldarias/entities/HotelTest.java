package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.Day;
import com.ronaldarias.enums.DayType;
import com.ronaldarias.util.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    @Test
    public void shouldBeCheapestHotel() {

        List<Rate> ratesLakewood = new ArrayList<>();
        Rate weekdayRegularL = new Rate(DayType.WEEKDAY ,Customer.REGULAR, 110.0);
        Rate weekdayRewardsL = new Rate(DayType.WEEKDAY ,Customer.REWARDS, 80.0);
        Rate weekendRegularL = new Rate(DayType.WEEKEND ,Customer.REGULAR, 90.0);
        Rate weekendRewardsL = new Rate(DayType.WEEKEND ,Customer.REWARDS, 80.0);
        ratesLakewood.add(weekdayRegularL);
        ratesLakewood.add(weekdayRewardsL);
        ratesLakewood.add(weekendRegularL);
        ratesLakewood.add(weekendRewardsL);
        Hotel lakewood = new HotelImpl("Lakewood", 3, ratesLakewood);

        List<Rate> ratesBridgewood = new ArrayList<>();
        Rate weekdayRegularB = new Rate(DayType.WEEKDAY ,Customer.REGULAR, 160.0);
        Rate weekdayRewardsB = new Rate(DayType.WEEKDAY ,Customer.REWARDS, 110.0);
        Rate weekendRegularB = new Rate(DayType.WEEKEND ,Customer.REGULAR, 60.0);
        Rate weekendRewardsB = new Rate(DayType.WEEKEND ,Customer.REWARDS, 50.0);
        ratesBridgewood.add(weekdayRegularB);
        ratesBridgewood.add(weekdayRewardsB);
        ratesBridgewood.add(weekendRegularB);
        ratesBridgewood.add(weekendRewardsB);
        Hotel bridgewood = new HotelImpl("Bridgewood", 4, ratesBridgewood);

        List<Rate> ratesRidgewood = new ArrayList<>();
        Rate weekdayRegularR = new Rate(DayType.WEEKDAY ,Customer.REGULAR, 220.0);
        Rate weekdayRewardsR = new Rate(DayType.WEEKDAY ,Customer.REWARDS, 100.0);
        Rate weekendRegularR = new Rate(DayType.WEEKEND ,Customer.REGULAR, 150.0);
        Rate weekendRewardsR = new Rate(DayType.WEEKEND ,Customer.REWARDS, 40.0);
        ratesRidgewood.add(weekdayRegularR);
        ratesRidgewood.add(weekdayRewardsR);
        ratesRidgewood.add(weekendRegularR);
        ratesRidgewood.add(weekendRewardsR);
        Hotel ridgewood = new HotelImpl("Ridgewood", 5, ratesRidgewood);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);

        String inputFormat = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        String[] inputs = inputFormat.split(":");
        Customer customer = Utilities.getCustomerFromString(inputs[0]);
        List<Day> days = Utilities.getDaysFromString(inputs[1]);

        Finder finder = new FinderImpl();
        Hotel cheapestHotel = finder.searchCheapestHotel(hotels, customer, days);

        assertEquals("Ridgewood", cheapestHotel.name());
    }
}
