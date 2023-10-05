package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Consecionaria {

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Alquiler> alquileres = new ArrayList<>();

    public boolean addVehiculo(Vehiculo vehiculo){
        return vehiculos.add(vehiculo);
    }
    
    public boolean addAlquiler(Alquiler alquiler){
        return alquileres.add(alquiler);
    }

    public void getMontoTotalXCliente(ClienteAuto cliente){
        double montoTotal = 0;
        for(Alquiler a: alquileres){
            if(a.getCliente().equals(cliente)){
                montoTotal += a.getPresupuesto().getMonto();
            }
        }
        System.out.println("El MONTO TOTAL del cliente es de $" + montoTotal);
    }

    public void getMontoTotalXAlquiler(){
        double montoTotal = 0;
        for(Alquiler a: alquileres){
            montoTotal += a.getPresupuesto().getMonto();
        }
        System.out.println("El MONTO TOTAL de todos los alquileres es de $" + montoTotal);
    }
    
    public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}
    
    public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}



}
