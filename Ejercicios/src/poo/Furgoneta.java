package poo;

public class Furgoneta extends Coche {

    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int capacidadCarga, int plazasExtra) {

        super(); //llama al constructor del padre

        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    @Override
    public String toString() {
        return super.toString() + " Furgoneta{" +
                "capacidadCarga=" + capacidadCarga +
                ", plazasExtra=" + plazasExtra +
                '}';
    }
}
