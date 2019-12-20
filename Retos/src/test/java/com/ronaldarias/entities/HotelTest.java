package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.DayType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    @Test
    public void shouldBeCheapestHotel() {

        List<Rate> ratesLakewood = new ArrayList<Rate>();
        Rate weekdayRegularL = new Rate(DayType.WEEKDAY ,Customer.REGULAR, 110.0);
        Rate weekdayRewardsL = new Rate(DayType.WEEKDAY ,Customer.REWARDS, 80.0);
        Rate weekendRegularL = new Rate(DayType.WEEKEND ,Customer.REGULAR, 90.0);
        Rate weekendRewardsL = new Rate(DayType.WEEKEND ,Customer.REWARDS, 80.0);
        ratesLakewood.add(weekdayRegularL);
        ratesLakewood.add(weekdayRewardsL);
        ratesLakewood.add(weekendRegularL);
        ratesLakewood.add(weekendRewardsL);
        Hotel lakewood = new HotelImpl("Lakewood", 3, ratesLakewood);

        List<Rate> ratesBridgewood = new ArrayList<Rate>();
        Rate weekdayRegularB = new Rate(DayType.WEEKDAY ,Customer.REGULAR, 160.0);
        Rate weekdayRewardsB = new Rate(DayType.WEEKDAY ,Customer.REWARDS, 110.0);
        Rate weekendRegularB = new Rate(DayType.WEEKEND ,Customer.REGULAR, 60.0);
        Rate weekendRewardsB = new Rate(DayType.WEEKEND ,Customer.REWARDS, 50.0);
        ratesBridgewood.add(weekdayRegularB);
        ratesBridgewood.add(weekdayRewardsB);
        ratesBridgewood.add(weekendRegularB);
        ratesBridgewood.add(weekendRewardsB);
        Hotel bridgewood = new HotelImpl("Bridgewood", 4, ratesBridgewood);

        List<Rate> ratesRidgewood = new ArrayList<Rate>();
        Rate weekdayRegularR = new Rate(DayType.WEEKDAY ,Customer.REGULAR, 220.0);
        Rate weekdayRewardsR = new Rate(DayType.WEEKDAY ,Customer.REWARDS, 100.0);
        Rate weekendRegularR = new Rate(DayType.WEEKEND ,Customer.REGULAR, 150.0);
        Rate weekendRewardsR = new Rate(DayType.WEEKEND ,Customer.REWARDS, 40.0);
        ratesRidgewood.add(weekdayRegularR);
        ratesRidgewood.add(weekdayRewardsR);
        ratesRidgewood.add(weekendRegularR);
        ratesRidgewood.add(weekendRewardsR);
        Hotel ridgewood = new HotelImpl("Ridgewood", 5, ratesRidgewood);

        List<Hotel> hotels = new ArrayList<Hotel>();
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);

        Finder finder = new FinderImpl();
        Hotel cheapestHotel = finder.searchCheapestHotel(hotels, "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)");

        assertEquals("Lakewood", cheapestHotel.name());
    }
}
