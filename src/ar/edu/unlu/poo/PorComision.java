package ar.edu.unlu.poo;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;

public class PorComision extends Empleado{

    protected int cantidadVentas = 0;
    protected float montoTotalVentas = 0;
    protected int porcentaje;

    //CONSTRUCTOR
    public PorComision(String nombreCompleto, String fechaNacimiento, String direccion, String cuit,
                    String email, String telefono, int porcentaje) throws ParseException {
        super(nombreCompleto,fechaNacimiento,direccion,cuit,email,telefono);
        this.porcentaje = porcentaje;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }
    
    public void setMontoTotalVentas(float montoTotalVentas) {
    	if(montoTotalVentas >= 0) {
    		this.montoTotalVentas = montoTotalVentas;    		
    	}
	}

    public boolean bonoCumple() {
    	if(super.bonoCumple()) {
    		saldo += ((montoTotalVentas * 50) / 100);
    		return true;
    	}
    	return false;
    }
    
    public float calcularSueldo(){
    	bonoCumple();
    	saldo += montoTotalVentas + ((montoTotalVentas * porcentaje) / 100);
        return saldo;
    }

}
