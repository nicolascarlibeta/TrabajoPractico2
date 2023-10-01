package ar.edu.unlu.poo;

import java.util.Random;

public class Profesor {

    private int id = new Random().nextInt(9000);
    private String nombreCompleto = "", direccion = "",
            cuit = "", email = "", telefono = "";

    //CONSTRUCTOR
    public Profesor(String nombreCompleto, String direccion, String cuit,
                    String email, String telefono){

        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.cuit = cuit;
        this.email = email;
        this.telefono = telefono;

    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCuit() {
        return cuit;
    }

    //Metodo toString()
    public String toString(){
        return "ID: " + id + " - "
                + "NOMBRE COMPLETO: " + nombreCompleto + " - "
                + "DIRECCION: " + direccion + " - "
                + "CUIT: " + cuit + " - "
                + "EMAIL: " + email + " - "
                + "TELEFONO: " + telefono + "\n";
    }

}
