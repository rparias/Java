package poo;

public class UsoVehiculo {

    public static void main(String[] args) {

        Coche miCoche1 = new Coche();
        miCoche1.setColor("rojo");

        Furgoneta furgoneta1 = new Furgoneta(7, 580);
        furgoneta1.setColor("azul");
        furgoneta1.setAsientosCuero(true);
        furgoneta1.setClimatizador(true);

        System.out.println(furgoneta1.toString());

    }

}
