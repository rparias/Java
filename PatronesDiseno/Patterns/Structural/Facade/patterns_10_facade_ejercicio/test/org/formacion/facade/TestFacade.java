package org.formacion.facade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFacade {

	private String nombreCliente = "Antonia";
	private String emailCliente = "antonia@email.com";
	
	@Before
	public void init() {
		BBDD.INSTANCE.clear();
	}
	
	@Test
	public void test_original() {

		// Codigo necesario para dar de alta un cliente con la configuracion tipica
		
		ServicioConfiguracion configuracion = new ServicioConfiguracion();
		ServicioFidelizacion fidelizacion = new ServicioFidelizacion();
		ServicioComunicacion comunicacion = new ServicioComunicacion();

		fidelizacion.crearTarjeta(nombreCliente, ServicioFidelizacion.Tipo.BASICA);
		configuracion.addEmail(nombreCliente, emailCliente);
		PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
		comunicacion.setPreferencias(nombreCliente, preferencias);
		
		// tests de la incripcion
		compruebaInscripion();
	}
	
	@Test
	public void test_facade() {
		// usa aqui tu servicio facade para dar de alta un usuario
		// con los datos particulares nombreCliente e emailCliente
		Facade facade = new FacadeImp();
		facade.registroExpress(nombreCliente, emailCliente);

		// deja esta invocacion para comprobar el comprortamiento de tu facade
		compruebaInscripion();
	}

	private void compruebaInscripion() {
		assertEquals(BBDD.INSTANCE.getTarjeta(nombreCliente), ServicioFidelizacion.Tipo.BASICA);
		assertEquals(BBDD.INSTANCE.getEmail(nombreCliente), emailCliente);
		PreferenciasComunicacion preferencias = BBDD.INSTANCE.getPreferencias(nombreCliente);
		assertNotNull(preferencias);
		assertFalse("no recibe email diario", preferencias.isEmailDiario());
		assertTrue("recibe email semanal", preferencias.isEmailSemanal());
		assertTrue("recibe email html", preferencias.isEmailHtml());
	}

}
