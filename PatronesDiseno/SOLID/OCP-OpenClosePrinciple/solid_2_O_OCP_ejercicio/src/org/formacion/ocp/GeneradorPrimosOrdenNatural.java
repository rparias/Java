package org.formacion.ocp;

import java.util.Comparator;

public class GeneradorPrimosOrdenNatural extends GeneradorPrimos {
    @Override
    Comparator<Integer> getOrdenacion() {
        return (a, b) -> a > b ? 1 : -1;
    }
}
