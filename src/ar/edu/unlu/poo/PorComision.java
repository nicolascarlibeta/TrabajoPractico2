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
    	if(montoTotalVentas > 0) {
    		this.montoTotalVentas = montoTotalVentas;    		
    	}
	}

    public float bonoCumple() {
       	return super.bonoCumple() + ((montoTotalVentas * 50) / 100);
    }
    
    public float calcularSueldo(){
        return montoTotalVentas + ((montoTotalVentas * porcentaje) / 100) + bonoCumple();
    }

}
