package ar.edu.unlu.poo;

public class CajaAhorro extends Cuenta{
	
	//CONSTRUCTOR
    public CajaAhorro(ClienteBanco cliente){
        super(cliente);
    }
    
    public void comprar(float precio) {
    	if(saldo > 0 && saldo >= precio) {
			saldo -= precio;
			System.out.println("La compra se ha realizado con exito");
		}
		else {
			System.out.println("No posee saldo suficiente para efectuar la compra");
		}	
    }
    
    public void cargar(float monto) {
    	if(monto > 0) {
			saldo += monto;
			System.out.println("La carga se ha realizado con exito");
		}
    	else {
			System.out.println("Hubo un problema con la carga");
		}
    }
    
    
	

}
