package com.ronaldarias.entities;

import java.util.Map;

public class HotelImpl implements Hotel {

    private String name;
    private int rating;
    private Map<String, Rate> rates;

    public HotelImpl(String name, int rating, Map<String, Rate> rates) {
        this.name = name;
        this.rating = rating;
        this.rates = rates;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int rating() {
        return rating;
    }

    @Override
    public Map<String, Rate> rates() {
        return rates;
    }

    @Override
    public double priceForDay(RuleRate ruleRate) {
        return rates.get(ruleRate.toString()).price();
    }
}
