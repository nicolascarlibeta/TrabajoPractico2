package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Cliente {

    private int id = new Random().nextInt(9000);
    private String nombreCompleto = "", direccion = "",
            cuit = "", email = "", telefono = "";


    //CONSTRUCTOR
    public Cliente(String nombreCompleto, String direccion, String cuit,
                   String email, String telefono){

        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.cuit = cuit;
        this.email = email;
        this.telefono = telefono;

    }

    //INTERFAZ

    public int getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCuit() {
        return cuit;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
