package ar.edu.unlu.poo;

import java.text.ParseException;

public class Pasante extends Empleado{


    //CONSTRUCTOR
    public Pasante(String nombreCompleto, String fechaNacimiento, String direccion, String cuit,
                    String email, String telefono) throws ParseException {
        super(nombreCompleto,fechaNacimiento,direccion,cuit,email,telefono);
    }

    public float calcularSueldo(){
        return 0;
    }

}
