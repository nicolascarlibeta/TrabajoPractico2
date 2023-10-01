package ar.edu.unlu.poo;

import java.util.Random;

public class ClienteAuto {

    private int id = new Random().nextInt(9000);
    private String nombreCompleto = "", direccion = "",
            dni = "", telefono = "";

    //CONSTRUCTOR
    public ClienteAuto(String nombreCompleto, String direccion, String dni,
                           String telefono){

        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;

    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    //Metodo toString()
    public String toString(){
        return "ID. CLIENTE: " + id + " - "
                + "NOMBRE COMPLETO: " + nombreCompleto + " - "
                + "DIRECCION: " + direccion + " - "
                + "DNI: " + dni + " - "
                + "TELEFONO: " + telefono + "\n";
    }

}
