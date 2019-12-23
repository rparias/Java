package com.ronaldarias.entities;

import java.util.Map;

public interface Hotel {
    String name();
    int rating();
    Map<String, Rate> rates();
    double priceForDay(RuleRate ruleRate);
}
