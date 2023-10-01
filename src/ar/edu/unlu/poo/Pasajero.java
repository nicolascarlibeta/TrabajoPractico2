package ar.edu.unlu.poo;

import java.util.Random;

public class Pasajero extends Persona{

    private int numeroPasajero = new Random().nextInt(10000);

    public Pasajero(String nombre, String telefono, String direccion){
        super(nombre,telefono,direccion);
    }


}
