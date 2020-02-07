package org.formacion.flyweight;

public class Jugador2 {
	public String dibuja(String numero) {
		return Camiseta.UNICA.dibujaCamiseta(numero);
	}
}
