package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLavadora {

	LavadoraFactory lavadoraFactory;

	@Test
	public void test_carga_frontal() {

		lavadoraFactory = new CargaFrontal();

		Lavadora lavadora = lavadoraFactory.createLavadora();
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {

		lavadoraFactory = new CargaSuperior();

		Lavadora lavadora = lavadoraFactory.createLavadora();
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
