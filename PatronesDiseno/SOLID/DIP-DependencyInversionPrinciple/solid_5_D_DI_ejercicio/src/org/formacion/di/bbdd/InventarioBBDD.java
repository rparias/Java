package org.formacion.di.bbdd;


public class InventarioBBDD {


	// Metodo de consulta a la base de datos
	
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}
}
