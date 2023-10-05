package ar.edu.unlu.poo;

import java.text.ParseException;
import java.util.ArrayList;

public class CuentaNormal extends Cuenta {

	private float limite = 20000;
	private final float limiteEstablecido = 20000;
	private ArrayList<Inversion> inversiones = new ArrayList();
	private float montoInvertido = 0;
	
	//CONSTRUCTOR
    public CuentaNormal(ClienteBanco cliente){
        super(cliente);
    }
	
	public void comprar(float precio) {
		if(saldo > 0 && saldo >= precio) {
			saldo -= precio;
			System.out.println("La compra se ha realizado con exito");
		}
		else if(limite > 0 && limite >= precio) {
				float resto = precio - saldo;
				saldo = 0;
				limite -= resto;
				System.out.println("Esta compra fue realizada con parte del saldo limite en descubierto");
		}
		else {
			System.out.println("No posee saldo suficiente para efectuar la compra");
		}	
	}
	
	public void cargar(float monto) {
		if(saldo == 0 && monto > 0) {
			if((limite + monto) > limiteEstablecido) {
				float aux = monto, resto = limiteEstablecido - limite;
				limite += resto; 
				aux -= resto; 
				saldo += aux; 
			}
			else {
				limite += monto;
			}
			System.out.println("La carga se ha realizado con exito");
		}
		else if(monto > 0) {
			saldo += monto;
			System.out.println("La carga se ha realizado con exito");
		}
		else {
			System.out.println("Hubo un problema con la carga");
		}
	}
	
	public Inversion invertir(String fecha, CuentaNormal cuenta, float monto) throws ParseException {
		for(Inversion i: inversiones) {
			if(i.isEstado()) {
				System.out.println("Solo puede hacer una inversion a la vez");
				return null;
			}
		}
		if(monto > 0) {
			Inversion nuevaInversion = new Inversion(fecha,cuenta,monto);
			inversiones.add(nuevaInversion);
			comprar(monto);
			montoInvertido = monto;
			return nuevaInversion;
		}
		System.out.println("Hubo un error con la inversion");
		return null;
	}
	
	public float getLimite() {
		return limite;
	}
	
	public void setMontoInvertido(float montoInvertido) {
		if(montoInvertido >= 0) {
			this.montoInvertido = montoInvertido;			
		}
	}
	
	//Metodo toString()
    public String toString(){
        return
                "ID CUENTA: " + id + " - "
                + "CLIENTE: " + cliente.getNombreCompleto() + " - "
                + "SALDO: $" + saldo + " - "
                + "SALDO EN INVERSION: $" + montoInvertido + " - "
                + "LIMITE: $" + limite + "\n";
    }
	
	
	
}
