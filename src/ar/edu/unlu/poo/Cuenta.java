package ar.edu.unlu.poo;

import java.util.Random;

public abstract class Cuenta {
	
	protected int id = new Random().nextInt(10000);
	protected ClienteBanco cliente;
	protected float saldo = 0;
	
	//CONSTRUCTOR
    public Cuenta(ClienteBanco cliente){
        this.cliente = cliente;
    }
	
    //MÉTODOS ABSTRACTOS (DEFINICIÓN)
	public abstract void comprar(float precio);
	public abstract void cargar(float monto);
	
	public float getSaldo() {
		return saldo;
	}
	

}
