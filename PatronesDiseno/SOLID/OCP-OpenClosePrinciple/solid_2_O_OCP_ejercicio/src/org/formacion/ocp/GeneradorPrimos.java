package org.formacion.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class GeneradorPrimos {

	abstract Comparator<Integer> getOrdenacion();
	
	public List<Integer> primos (int limit) {
		
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}

		Collections.sort(primos, getOrdenacion());

		return primos;

	}
	
	private boolean esPrimo (int candidato) {
		for (int i = 2; i < candidato; i++) {
			if (candidato % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
