package ar.edu.unlu.poo;

public class CuentaCredito extends Cuenta {
	
	private float deuda = 0;
	private final float saldoEstablecido = 200000;
	
	//CONSTRUCTOR
    public CuentaCredito(ClienteBanco cliente){
        super(cliente);
        saldo = saldoEstablecido;
    }
	
	public void comprar(float precio) {
		if(saldo > 0 && saldo >= precio) {
			saldo -= precio + ((precio * 5) / 100);
			deuda += precio + ((precio * 5) / 100);
			System.out.println("La compra fue realizada con exito");
		}
		else {
			System.out.println("No posee saldo suficiente para efectuar la compra");
		}
	}
	
	public void cargar(float monto) {
		if((saldo + monto) <= saldoEstablecido && monto > 0) {
			saldo += monto;
			if(deuda > 0) {
				deuda -= monto;
			}
			System.out.println("La carga se ha realizado con exito");
		}
		else {
			System.out.println("Hubo un problema con la carga");
		}
	}
	
	//Metodo toString()
    public String toString(){
        return
                "ID CUENTA: " + id + " - "
                + "CLIENTE: " + cliente.getNombreCompleto() + " - "
        		+ "SALDO ESTABLECIDO: $" + saldoEstablecido + " - "
                + "SALDO ACTUAL: $" + saldo + " - "
                + "SALDO DEUDOR: $" + deuda + "\n";
    }

}
