package ar.edu.unlu.poo;

public class CuentaCredito extends Cuenta {
	
	private float deuda = 0;
	private final float saldoEstablecido = 200000;
	
	//CONSTRUCTOR
    public CuentaCredito(ClienteBanco cliente){
        super(cliente);
    }
	
	public boolean comprar(float precio) {
		if(super.comprar(precio)) {
			saldo -= ((precio * 5) / 100);
			deuda += precio + ((precio * 5) / 100) ;
			return true;
		}
		else {
			System.out.println("No posee saldo suficiente para efectuar la compra");
			return false;
		}
	}
	
	public boolean cargar(float monto) {
		if((saldo + monto) <= saldoEstablecido) {
			super.cargar(monto);
			if(deuda > 0) {
				deuda -= monto;
			}
			System.out.println("La carga se ha realizado con exito");
			return true;
		}
		else {
			System.out.println("Hubo un problema con la carga");
			return false;
		}
	}

}
