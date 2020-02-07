package org.formacion.proxy;

public interface Cuenta {

	String getCliente();

	int getCantidad();

	void movimiento(int importe);

}