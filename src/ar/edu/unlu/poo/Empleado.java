package ar.edu.unlu.poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Empleado {

    protected int id = new Random().nextInt(9000);
    protected String nombreCompleto = "", direccion = "",
            cuit = "", email = "", telefono = "";
    protected LocalDate fechaNacimiento;
    protected float saldo;


    //CONSTRUCTOR
    public Empleado(String nombreCompleto, String fechaNacimiento, String direccion, String cuit,
                   String email, String telefono) {

        this.nombreCompleto = nombreCompleto;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento,formato);
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

    public float bonoCumple() {
    	float saldo = 0;
       	if(LocalDate.now().getMonth().equals(fechaNacimiento.getMonth())) {
            saldo = 2000;
        }
       	return saldo;
    }
    
    public float calcularSueldo(){
        return saldo;
    }

    //Metodo toString()
    public String toString(){
        return "ID. EMPLEADO: " + id + " - "
                + "NOMBRE COMPLETO: " + nombreCompleto + " - "
                + "FECHA NACIMIENTO: " + fechaNacimiento + " - "
                + "DIRECCION: " + direccion + " - "
                + "CUIT: " + cuit + " - "
                + "EMAIL: " + email + " - "
                + "TELEFONO: " + telefono + "\n";
    }


}
