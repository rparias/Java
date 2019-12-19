package org.formacion.liskov;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestPuntos {

	private final Punto2D referencia = new Punto2D(3,5);
	private final List<Punto2D> puntos_prueba = Arrays.asList(
			                                         new Punto2D(2,3), 
			                                         new Punto2D(3,5), 
			                                         new Punto2D(4,3)
			                                         );
	
	
	@Test
	public void test_iguales_si_solo_si_distancia_0() {
		
		for (Punto2D punto: puntos_prueba) {
			Assert.assertEquals("test para " + referencia + " y " + punto,
					             referencia.equals(punto), 
					             referencia.distancia(punto) == 0);
		}
	}

}
