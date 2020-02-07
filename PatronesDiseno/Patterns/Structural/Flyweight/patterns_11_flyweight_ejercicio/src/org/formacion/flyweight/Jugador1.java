package org.formacion.flyweight;

public class Jugador1 {
	public String dibuja(String numero) {
		return Camiseta.UNICA.dibujaCamiseta(numero);
	}
}
