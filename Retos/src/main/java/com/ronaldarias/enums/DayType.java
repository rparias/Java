package com.ronaldarias.enums;

public enum DayType {

    WEEKDAY(1), WEEKEND(2);

    private int id;

    private DayType(int id) {
        this.id = id;
    }
}
