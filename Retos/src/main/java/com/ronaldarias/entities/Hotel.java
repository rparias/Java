package com.ronaldarias.entities;

import java.util.List;

public interface Hotel {
    String name();
    int rating();
    List<Rate> rates();
}
