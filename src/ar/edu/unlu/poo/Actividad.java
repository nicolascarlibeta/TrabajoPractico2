package ar.edu.unlu.poo;

import java.util.Random;

public class Actividad {

    private String descripcion = "", codigo = "";
    private int capacidad;
    private Suscripcion suscripcion = Suscripcion.BASICA;

    //CONSTRUCTOR
    public Actividad(String nombre, int capacidad, int suscripcion){
        Random sml = new Random();
        codigo += sml.nextInt(40000000-20000000) + 20000000;
        this.descripcion = nombre;
        this.capacidad = capacidad;
        this.suscripcion = Suscripcion.values()[suscripcion];
    }

    //INTERFAZ

    //Getters y Setters

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    //Metodo toString()
    public String toString(){
        return "CODIGO: " + codigo + "\n"
                + "NOMBRE DE ACTIVIDAD: " + descripcion + "\n"
                + "CAPACIDAD: " + capacidad + "\n"
                + "TIPO DE SUSCRIPCION: " + suscripcion + "\n";
    }

}
