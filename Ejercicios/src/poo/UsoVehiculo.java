package poo;

public class UsoVehiculo {

    public static void main(String[] args) {

        Coche miCoche1 = new Coche("rojo");

        Furgoneta furgoneta1 = new Furgoneta("azul",7, 580);
        furgoneta1.setAsientosCuero(true);
        furgoneta1.setClimatizador(true);

        System.out.println(furgoneta1.toString());

    }

}
