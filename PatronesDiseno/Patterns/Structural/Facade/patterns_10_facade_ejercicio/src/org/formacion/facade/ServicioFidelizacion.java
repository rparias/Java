package org.formacion.facade;

public class ServicioFidelizacion {

	public enum Tipo { BASICA, PREMIUM, VIP }
	
	public void crearTarjeta(String cliente, Tipo tipo) {
		BBDD.INSTANCE.addTarjeta(cliente, tipo);
	}

}
