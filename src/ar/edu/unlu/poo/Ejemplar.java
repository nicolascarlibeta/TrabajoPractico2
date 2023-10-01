package ar.edu.unlu.poo;

import java.util.Random;

public class Ejemplar {

    private int id = new Random().nextInt(10000);
    private Libro libro;
    private boolean prestado = false;

    //CONSTRUCTOR
    public Ejemplar(Libro libro){
        this.libro = libro;
    }

    public int getId() {
        return id;
    }

    public boolean isPrestado(){
        return prestado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro getLibro() {
        return libro;
    }

    //Metodo toString()
    public String toString(){
        String e = "DISPONIBLE";
        if(prestado){
            e = "PRESTADO";
        }
        return "ID: " + id + " - "
                + libro.toString() + " - "
                + "ESTADO: " + e + "\n";
    }

}
