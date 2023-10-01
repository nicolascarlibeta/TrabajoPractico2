package ar.edu.unlu.poo;

import java.util.Random;

public class Expendedor {

    private int id = new Random().nextInt(9000);
    //CADA EXPENDEDOR TIENE SU PROPIO <COMBUSTIBLE>
    private Combustible combustible;

    //CONSTRUCTOR
    public Expendedor(Combustible combustible){
        this.combustible = combustible;
    }

    public int getId() {
        return id;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    //Metodo toString()
    public String toString(){
        return "ID: " + id + " - " + "COMBUSTIBLE: " + combustible.getDescripcion() + "\n";
    }

}
