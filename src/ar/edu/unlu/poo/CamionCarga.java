package ar.edu.unlu.poo;

public class CamionCarga extends Vehiculo{

    //CONSTRUCTOR
    public CamionCarga(String patente, String descripcion){
        super(patente,descripcion);
    }

    public float getPrecio(){
        precio = 100000;
        return precio;
    }

}
