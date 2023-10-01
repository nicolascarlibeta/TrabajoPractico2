package ar.edu.unlu.poo;

import java.text.ParseException;

public class PCySalario extends PorComision{


    //CONSTRUCTOR
    public PCySalario(String nombreCompleto, String fechaNacimiento, String direccion, String cuit,
                    String email, String telefono, int porcentaje, float saldo) throws ParseException {
        super(nombreCompleto,fechaNacimiento,direccion,cuit,email,telefono,porcentaje);
        this.saldo = saldo;
    }

    public float calcularSueldo(){
    	return saldo + montoTotalVentas + ((montoTotalVentas * porcentaje) / 100) + bonoCumple();
    }
    
    public float bonoCumple() {
       	return super.bonoCumple() + 1000;
    }


}
