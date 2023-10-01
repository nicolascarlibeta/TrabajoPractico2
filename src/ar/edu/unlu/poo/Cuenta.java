package ar.edu.unlu.poo;

public class Cuenta {
	
	protected ClienteBanco cliente;
	protected float saldo = 0;
	
	//CONSTRUCTOR
    public Cuenta(ClienteBanco cliente){
        this.cliente = cliente;
    }
	
	public boolean comprar(float precio) {
		if(saldo > 0 && saldo >= precio) {
			saldo -= precio;
			System.out.println("La compra se ha realizado con exito");
			return true;
		}
		return false;
	}
	
	public boolean cargar(float monto) {
		if(monto > 0) {
			saldo += monto;
			return true;
		}
		return false;
	}
	
	public float getSaldo() {
		return saldo;
	}

}
