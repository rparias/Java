package org.formacion.facade;

public class ServicioComunicacion {

	public void setPreferencias (String cliente, PreferenciasComunicacion preferencias) {
		BBDD.INSTANCE.setPreferencias(cliente, preferencias);
	}

}
