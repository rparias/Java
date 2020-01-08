package org.formacion.abstractfactory;

public class FactoryEs implements AbstractFactory {
    @Override
    public Saludos createSaludos() {
        return new SaludosEs();
    }

    @Override
    public Preguntas createPreguntas() {
        return new PreguntasEs();
    }
}
