package ar.edu.unlu.poo;


import java.time.LocalDate;
import java.util.Random;

public class Socio {

    //Ocultación de la Información
    private String nombreCompleto = "", direccion = "",
            dni = "", email = "", telefono = "", id = "";
    private LocalDate fechaSuscripcion = LocalDate.now(), fechaNacimiento;
    private Suscripcion tipoDeSuscripcion = Suscripcion.NINGUNA;

    //CONSTRUCTOR
    public Socio(String nombreCompleto, String direccion, String dni, String email,
                 LocalDate fechaNacimiento, String telefono, int suscripcion){
        Random sml = new Random();
        id += sml.nextInt(9000);
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        tipoDeSuscripcion = Suscripcion.values()[suscripcion];
    }

    //INTERFAZ

    //Getters y Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaSuscripcion() {
        return fechaSuscripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public Suscripcion getTipoDeSuscripcion() {
        return tipoDeSuscripcion;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public void setTipoDeSuscripcion(Suscripcion suscripcion){
        tipoDeSuscripcion = suscripcion;
    }
    public String getId(){
        return id;
    }

    //Metodo toString()
    public String toString(){
        return "ID. SOCIO: " + id + "\n"
                + "NOMBRE COMPLETO: " + nombreCompleto + "\n"
                + "DIRECCION: " + direccion + "\n"
                + "DNI: " + dni + "\n"
                + "EMAIL: " + email + "\n"
                + "FECHA NACIMIENTO: " + fechaNacimiento + "\n"
                + "TELEFONO: " + telefono + "\n"
                + "FECHA SUSCRIPCION: " + fechaSuscripcion + "\n"
                + "SUSCRIPCION: " + tipoDeSuscripcion + "\n";
    }



}
