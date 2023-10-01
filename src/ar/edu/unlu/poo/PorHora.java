package ar.edu.unlu.poo;

import java.text.ParseException;

public class PorHora extends Empleado{

    private int cantidadHoras = 0;

    //CONSTRUCTOR
    public PorHora(String nombreCompleto, String fechaNacimiento, String direccion, String cuit,
                    String email, String telefono, float saldo, int cantidadHoras) throws ParseException {
        super(nombreCompleto,fechaNacimiento,direccion,cuit,email,telefono);
        this.saldo = saldo;
        this.cantidadHoras = cantidadHoras;
    }

    public float calcularSueldo(){
        if(cantidadHoras > 1){
            return saldo * cantidadHoras;
        }
        return saldo * cantidadHoras;
    }



}
