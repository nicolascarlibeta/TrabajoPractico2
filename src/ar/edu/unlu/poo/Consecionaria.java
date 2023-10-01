package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Consecionaria {

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Alquiler> alquileres = new ArrayList<>();

    public boolean addVehiculo(Vehiculo vehiculo){
        for(Vehiculo v: vehiculos){
            if(v.getPatente().equals(vehiculo.getPatente())){
                return false;
            }
        }
        return vehiculos.add(vehiculo);
    }

    public boolean prestarVehiculo(ClienteAuto cliente, Vehiculo vehiculo,
                                   int dias){
        Presupuesto nuevoPresupuesto = new Presupuesto(vehiculo,dias);
        Alquiler nuevoAlquiler = new Alquiler(cliente,nuevoPresupuesto);
        return alquileres.add(nuevoAlquiler);
    }

    public void getMontoTotalXCliente(ClienteAuto cliente){
        float montoTotal = 0;
        for(Alquiler a: alquileres){
            if(a.getCliente().equals(cliente)){
                montoTotal += a.getPresupuesto().getMonto();
            }
        }
        System.out.println("El MONTO TOTAL del cliente es de $" + montoTotal);
    }

    public void getMontoTotalXAlquiler(){
        float montoTotal = 0;
        for(Alquiler a: alquileres){
            montoTotal += a.getPresupuesto().getMonto();
        }
        System.out.println("El MONTO TOTAL de todos los alquileres es de $" + montoTotal);
    }



}
