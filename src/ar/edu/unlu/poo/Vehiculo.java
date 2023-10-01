package ar.edu.unlu.poo;

public abstract class Vehiculo {

    public enum TipoVehiculo {
        AUTOMOVIL, COMBI, FLETE, CARGA
    }
    protected String patente;
    protected String descripcion = "";
    protected TipoVehiculo tipo;
    protected float precio = 3000;

    //CONSTRUCTOR
    public Vehiculo(String patente, String descripcion){
        this.patente = patente;
        this.descripcion = descripcion;
    }

    public String getPatente() {
        return patente;
    }

    public float getPrecio(){
        return precio;
    }


}
