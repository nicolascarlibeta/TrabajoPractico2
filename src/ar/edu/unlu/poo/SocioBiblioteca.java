package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class SocioBiblioteca {

    private int id = new Random().nextInt(10000);
    private String nombreCompleto = "", direccion = "",
            dni = "", email = "", telefono = "";
    private LocalDate fechaNacimiento;

    //CONSTRUCTOR
    public SocioBiblioteca(String nombreCompleto, String direccion, String dni, String email,
                 LocalDate fechaNacimiento, String telefono){
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    //Setters y Getters
    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    //Metodo toString()
    public String toString(){
        return "ID. SOCIO: " + id + " - "
                + "NOMBRE COMPLETO: " + nombreCompleto + " - "
                + "DIRECCION: " + direccion + " - "
                + "DNI: " + dni + " - "
                + "EMAIL: " + email + " - "
                + "FECHA NACIMIENTO: " + fechaNacimiento + " - "
                + "TELEFONO: " + telefono + "\n";
    }

}
