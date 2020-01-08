package org.formacion.abstractfactory;

public class FactoryEn implements AbstractFactory {
    @Override
    public Saludos createSaludos() {
        return new SaludosEn();
    }

    @Override
    public Preguntas createPreguntas() {
        return new PreguntasEn();
    }
}
