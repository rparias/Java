package com.ronaldarias.entities;

import java.util.List;

public interface Finder {

    /**
     * @param hotels all hotels
     * @param inputFormat Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
     * @return cheapestHotel
     */
    Hotel searchCheapestHotel(List<Hotel> hotels, String inputFormat);
}
