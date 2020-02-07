package org.formacion.flyweight;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n\n------ jugador 1 -----\n\n");
		System.out.println(new Jugador1().dibuja());
		System.out.println("\n\n------ jugador 2 -----\n\n");
		System.out.println(new Jugador2().dibuja());
		System.out.println("\n\n------ jugador 3 -----\n\n");
		System.out.println(new Jugador3().dibuja());
	}

}
