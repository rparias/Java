package org.formacion.facade;

public class FacadeImp implements Facade {

    @Override
    public void registroExpress(String nombreCliente, String emailCliente) {
        ServicioConfiguracion configuracion = new ServicioConfiguracion();
        ServicioFidelizacion fidelizacion = new ServicioFidelizacion();
        ServicioComunicacion comunicacion = new ServicioComunicacion();

        fidelizacion.crearTarjeta(nombreCliente, ServicioFidelizacion.Tipo.BASICA);
        configuracion.addEmail(nombreCliente, emailCliente);
        PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
        comunicacion.setPreferencias(nombreCliente, preferencias);
    }
}
