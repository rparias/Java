package com.ronaldarias.entities;

import java.util.List;

public class HotelImpl implements Hotel {

    private String name;
    private int rating;
    private List<Rate> rates;

    public HotelImpl(String name, int rating, List<Rate> rates) {
        this.name = name;
        this.rating = rating;
        this.rates = rates;
    }

    public String name() {
        return name;
    }

    public int rating() {
        return rating;
    }

    public List<Rate> rates() {
        return rates;
    }
}
