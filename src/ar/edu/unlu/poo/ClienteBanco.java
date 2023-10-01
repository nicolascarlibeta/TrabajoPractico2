package ar.edu.unlu.poo;

import java.util.Random;

public class ClienteBanco {
	
	private int id = new Random().nextInt(9000);
    private String nombreCompleto = "", direccion = "",
            cuit = "", email = "", telefono = "";
    
  //CONSTRUCTOR
    public ClienteBanco(String nombreCompleto, String direccion, String cuit,
                   String email, String telefono){

        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.cuit = cuit;
        this.email = email;
        this.telefono = telefono;

    }

}
