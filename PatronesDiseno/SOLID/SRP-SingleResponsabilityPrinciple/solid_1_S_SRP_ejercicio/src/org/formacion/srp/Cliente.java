package org.formacion.srp;

import java.util.Arrays;
import java.util.List;

public class Cliente {
 
	private final String nombre;
	private final List<Pelicula> favoritas;
	
	public Cliente (String nombre, Pelicula ... favoritas) {
		this.nombre = nombre;
		this.favoritas = Arrays.asList(favoritas);
	}

	public String getNombre() {
		return nombre;
	}

	public List<Pelicula> getFavoritas() {
		return favoritas;
	}
	
	
}
