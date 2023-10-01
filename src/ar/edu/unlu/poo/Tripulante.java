package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Tripulante extends Persona{

    private String cargo = "";
    private ArrayList<ReciboSueldo> recibos = new ArrayList<>();

    public Tripulante(String nombre, String telefono, String direccion, String cargo){
        super(nombre,telefono,direccion);
        this.cargo = cargo;
    }

}
