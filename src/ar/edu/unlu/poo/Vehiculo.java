package ar.edu.unlu.poo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class Vehiculo {

    protected String patente = "";
    protected static Set<String> patentes = new HashSet<String>();
    protected String descripcion = "";
    protected float precio = 3000;

    //CONSTRUCTOR
    public Vehiculo(String patente, String descripcion){
    	while(!patentes.add(patente)) {
        	patente = generarPatente();
    	}
    	this.patente = patente;
		this.descripcion = descripcion;    		
    }
    
    public String generarPatente() {
    	String patente = "";
    	for(int i = 0; i < 3; i++) {
    		patente += (char)((char) new Random().nextInt(91 - 65) + 65);    		
    	}
    	patente += " ";
    	for(int i = 0; i < 3; i++) {
    		patente += (char)((char) new Random().nextInt(58 - 48) + 48);	
    	}
    	return patente;
    }

    public String getPatente() {
        return patente;
    }

    public float getPrecio(){
        return precio;
    }
    
    public String getDescripcion() {
		return descripcion;
	}
    


}
