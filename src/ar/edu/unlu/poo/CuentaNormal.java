package ar.edu.unlu.poo;

import java.text.ParseException;
import java.util.ArrayList;

public class CuentaNormal extends Cuenta {

	private float limite = 20000;
	private final float limiteEstablecido = 20000;
	private ArrayList<Inversion> inversiones = new ArrayList();
	
	//CONSTRUCTOR
    public CuentaNormal(ClienteBanco cliente){
        super(cliente);
    }
	
	public boolean comprar(float precio) {
		if(super.comprar(precio)) {
			return true;
		}
		else if(limite > 0 && limite >= precio) {
				float resto = precio - saldo;
				saldo = 0;
				limite -= resto;
				return true;
		}
		else {
			System.out.println("No posee saldo suficiente para efectuar la compra");
			return false;
		}	
	}
	
	public boolean cargar(float monto) {
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
			return true;
		}
		else if(super.cargar(monto)) {
			System.out.println("La carga se ha realizado con exito");
			return true;
		}
		else {
			System.out.println("Hubo un problema con la carga");
			return false;
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
			return nuevaInversion;
		}
		System.out.println("Hubo un error con la inversion");
		return null;
	}
	
	public float getLimite() {
		return limite;
	}
	
	
	
}
