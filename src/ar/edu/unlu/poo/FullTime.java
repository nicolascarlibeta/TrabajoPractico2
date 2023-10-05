package ar.edu.unlu.poo;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;

public class FullTime extends Empleado{


    //CONSTRUCTOR
    public FullTime(String nombreCompleto, String fechaNacimiento, String direccion, String cuit,
                    String email, String telefono, float saldo) throws ParseException {
        super(nombreCompleto,fechaNacimiento,direccion,cuit,email,telefono);
        this.saldo = saldo;
    }
    
    public boolean bonoCumple() {
       	if(super.bonoCumple()) {
       		saldo += 1000;
       		return true;
       	}
       	return false;
    }
    
    public float calcularSueldo(){
    	bonoCumple();
        return saldo;
    }



}
