package org.formacion.factorymethod;

public class CargaSuperior extends LavadoraFactory {
    @Override
    protected Lavadora createLavadora() {
        return new LavadoraCargaSuperior();
    }
}
