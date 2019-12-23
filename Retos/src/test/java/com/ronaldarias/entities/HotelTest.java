package com.ronaldarias.entities;

import com.ronaldarias.enums.Customer;
import com.ronaldarias.enums.Day;
import com.ronaldarias.enums.DayType;
import com.ronaldarias.util.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    @Test
    public void shouldBeCheapestHotel() {

        RuleRate ruleRegularWeekday = new RuleRateImpl(DayType.WEEKDAY ,Customer.REGULAR);
        RuleRate ruleRegularWeekend = new RuleRateImpl(DayType.WEEKEND ,Customer.REGULAR);
        RuleRate ruleRewardsWeekday = new RuleRateImpl(DayType.WEEKDAY ,Customer.REWARDS);
        RuleRate ruleRewardsWeekend = new RuleRateImpl(DayType.WEEKEND ,Customer.REWARDS);

        Map<String, Rate> ratesLakewood = new HashMap<>();
        ratesLakewood.put(ruleRegularWeekday.toString(), new RateImpl(ruleRegularWeekday, 110.0));
        ratesLakewood.put(ruleRegularWeekend.toString(), new RateImpl(ruleRegularWeekend, 90.0));
        ratesLakewood.put(ruleRewardsWeekday.toString(), new RateImpl(ruleRewardsWeekday, 80.0));
        ratesLakewood.put(ruleRewardsWeekend.toString(), new RateImpl(ruleRewardsWeekend, 80.0));
        Hotel lakewood = new HotelImpl("Lakewood", 3, ratesLakewood);

        Map<String, Rate> ratesBridgewood = new HashMap<>();
        ratesBridgewood.put(ruleRegularWeekday.toString(), new RateImpl(ruleRegularWeekday, 160.0));
        ratesBridgewood.put(ruleRegularWeekend.toString(), new RateImpl(ruleRegularWeekend, 60.0));
        ratesBridgewood.put(ruleRewardsWeekday.toString(), new RateImpl(ruleRewardsWeekday, 110.0));
        ratesBridgewood.put(ruleRewardsWeekend.toString(), new RateImpl(ruleRewardsWeekend, 50.0));
        Hotel bridgewood = new HotelImpl("Bridgewood", 4, ratesBridgewood);

        Map<String, Rate> ratesRidgewood = new HashMap<>();
        ratesRidgewood.put(ruleRegularWeekday.toString(), new RateImpl(ruleRegularWeekday, 220.0));
        ratesRidgewood.put(ruleRegularWeekend.toString(), new RateImpl(ruleRegularWeekend, 150.0));
        ratesRidgewood.put(ruleRewardsWeekday.toString(), new RateImpl(ruleRewardsWeekday, 100.0));
        ratesRidgewood.put(ruleRewardsWeekend.toString(), new RateImpl(ruleRewardsWeekend, 40.0));
        Hotel ridgewood = new HotelImpl("Ridgewood", 5, ratesRidgewood);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);

        String inputFormat = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        String[] inputs = inputFormat.split(":");
        Customer customer = Utilities.getCustomerFromString(inputs[0]);
        List<Day> days = Utilities.getDaysFromString(inputs[1]);

        Finder finder = FinderImpl.getFinderFromHotels(hotels);
        Hotel cheapestHotel = finder.searchCheapestHotel(customer, days);

        assertEquals("Ridgewood", cheapestHotel.name());
    }
}
