package ar.edu.unlu.poo;

public class Combi extends Vehiculo{

    //CONSTRUCTOR
    public Combi(String patente, String descripcion){
        super(patente,descripcion);
    }

    public float getPrecio(){
        return precio + 1500;
    }
}
