package com.ronaldarias.entities;

public class RateImpl implements Rate {
    RuleRate ruleRate;
    Double price;

    public RateImpl(RuleRate ruleRate, Double price) {
        this.ruleRate = ruleRate;
        this.price = price;
    }

    @Override
    public RuleRate priceRate() {
        return ruleRate;
    }

    @Override
    public Double price() {
        return price;
    }
}
