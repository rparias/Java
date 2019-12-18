package org.formacion.srp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recomendador {

	public List<Pelicula> recomendaciones (Cliente cliente) {
		
		List<Pelicula> recomendadas = new ArrayList<>();
		
		for (Pelicula favorita: cliente.getFavoritas()) {
			//agrega todas las peliculas del mismo director
			recomendadas.addAll(BBDD.PELIS_POR_DIRECTOR.get(favorita.getDirector()));
		}
		//elimina las que ya ha visto el cliente que estan como favoritas
		recomendadas.removeAll(cliente.getFavoritas());
		
		return recomendadas;
	}

	/*El recomendador no tiene la responsabilidad de generar un CSV, para ello se crea una nueva clase*/
}
