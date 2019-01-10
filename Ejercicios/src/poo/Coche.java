package poo;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private int pesoTotal;
    private String color;
    private boolean asientosCuero;
    private boolean climatizador;

    public Coche(String color) {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
        this.color = color;
    }

    public String damePesoTotalCoche() {
        int pesoCarroceria = 500;

        pesoTotal = pesoPlataforma + pesoCarroceria;

        if (asientosCuero)
            pesoTotal += 50;

        if (climatizador)
            pesoTotal += 50;

        return "El peso del coche es " + pesoTotal;
    }

    public String dimeAsientos() {
        if (asientosCuero)
            return "Tiene asientos de cuero";
        else
            return "Tiene asientos de serie";
    }

    @Override
    public String toString() {
        return "Coche{" +
                "ruedas=" + ruedas +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", motor=" + motor +
                ", pesoPlataforma=" + pesoPlataforma +
                ", pesoTotal=" + pesoTotal +
                ", color='" + color + '\'' +
                ", asientosCuero=" + asientosCuero +
                ", climatizador=" + climatizador +
                '}';
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPesoPlataforma() {
        return pesoPlataforma;
    }

    public void setPesoPlataforma(int pesoPlataforma) {
        this.pesoPlataforma = pesoPlataforma;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAsientosCuero() {
        return asientosCuero;
    }

    public void setAsientosCuero(boolean asientosCuero) {
        this.asientosCuero = asientosCuero;
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }
}
