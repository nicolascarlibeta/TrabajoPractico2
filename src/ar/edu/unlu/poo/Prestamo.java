package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.Random;

public class Prestamo {

    private int id = new Random().nextInt(10000);
    private LocalDate fecha = LocalDate.now();
    private SocioBiblioteca socio;
    private Ejemplar ejemplar;
    private boolean estado = true;

    //CONSTRUCTOR
    public Prestamo(SocioBiblioteca socio, Ejemplar ejemplar){
        this.socio = socio;
        this.ejemplar = ejemplar;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public SocioBiblioteca getSocio() {
        return socio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado(){
        return estado;
    }

    //Metodo toString()
    public String toString(){
        String e = "EN PRESTAMO";
        if(!estado){
            e = "DEVUELTO";
        }
        return "ID: " + id + "-"
                + "FECHA: " + fecha + " - "
                + socio.toString() + " - "
                + ejemplar.toString() + " - "
                + "ESTADO: " + e + "\n";
    }

}
