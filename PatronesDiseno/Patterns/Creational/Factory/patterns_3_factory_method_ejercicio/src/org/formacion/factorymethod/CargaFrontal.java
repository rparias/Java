package org.formacion.factorymethod;

public class CargaFrontal extends LavadoraFactory {
    @Override
    protected Lavadora createLavadora() {
        return new LavadoraCargaFrontal();
    }
}
