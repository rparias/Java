package com.ronaldarias.enums;

public enum Day {

    MON(1), TUES(2), WED(3), THUR(4), FRI(5), SAT(6), SUN(7);

    private int id;

    private Day(int id) {
        this.id = id;
    }
}
