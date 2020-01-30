package org.formacion.factorymethod;

public abstract class LavadoraFactory {

    public Lavadora create() {
        Lavadora lavadora = createLavadora();
        lavadora.ponerMandos();
        lavadora.ponerTambor();
        return lavadora;
    }

    protected abstract Lavadora createLavadora();
}
