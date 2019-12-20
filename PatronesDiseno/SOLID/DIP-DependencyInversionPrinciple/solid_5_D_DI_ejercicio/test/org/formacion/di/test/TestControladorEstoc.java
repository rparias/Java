package org.formacion.di.test;

import org.formacion.di.bbdd.InventarioBBDD;
import org.formacion.di.negocio.ControladorEstoc;
import org.junit.Assert;
import org.junit.Test;

public class TestControladorEstoc {

	@Test
	public void test_control_estoc() {
		ControladorEstoc controlador = new ControladorEstoc(new InventarioBBDD());
		
		Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}

}
