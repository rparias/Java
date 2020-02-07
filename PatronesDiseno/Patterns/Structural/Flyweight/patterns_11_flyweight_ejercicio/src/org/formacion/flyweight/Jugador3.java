package org.formacion.flyweight;

public class Jugador3 {
	public String dibuja(String numero) {
		return Camiseta.UNICA.dibujaCamiseta(numero);
	}
}
