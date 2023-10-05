package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.Random;

public class Alquiler {

    private int id = new Random().nextInt(9000);
    private LocalDate fecha = LocalDate.now();
    private ClienteAuto cliente;
    private Presupuesto presupuesto;

    public Alquiler(ClienteAuto cliente, Presupuesto presupuesto){
        this.cliente = cliente;
        this.presupuesto = presupuesto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getId() {
        return id;
    }

    public ClienteAuto getCliente() {
        return cliente;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    //Metodo toString()
    public String toString(){
        return "ID: " + id + " - "
                + "FECHA: " + fecha + " - "
                + "CLIENTE: " + cliente + " - "
                + "VEHICULO: " + presupuesto.getVehiculo().getDescripcion() + " - "
        		+ "PATENTE: " + presupuesto.getVehiculo().getPatente() + " - "
                + "CANTIDAD DIAS ALQUILER: " + presupuesto.getCantidadDiasAlquiler() + " - "
                + "MONTO: $" + presupuesto.getMonto() + "\n";
    }


}
