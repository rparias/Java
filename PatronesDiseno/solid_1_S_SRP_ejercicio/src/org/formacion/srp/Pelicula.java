package org.formacion.srp;

public class Pelicula {

	private final String titulo;
	private final String genero;
	private final String director;
	
	public Pelicula(String titulo, String genero, String director) {
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", director=" + director + "]";
	}
	
	
}
