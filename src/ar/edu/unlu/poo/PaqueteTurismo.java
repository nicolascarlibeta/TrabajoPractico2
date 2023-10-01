package ar.edu.unlu.poo;

import java.util.ArrayList;
import java.util.Random;

public class PaqueteTurismo {

    private int id = new Random().nextInt(9000);
    private String destino = "";
    private Proveedor transporte, hospedaje;
    private ArrayList<Proveedor> excursiones = new ArrayList<>();
    private float precio;

    //CONSTRUCTOR
    public PaqueteTurismo(String descripcion, Proveedor transporte, Proveedor hospedaje,
                          Proveedor excursion, float precio){
        this.destino = descripcion;
        if(transporte.getTipoProveedor().equals(TipoProveedor.TRANSPORTE) &&
                hospedaje.getTipoProveedor().equals(TipoProveedor.HOSPEDAJE) &&
                excursion.getTipoProveedor().equals(TipoProveedor.EXCURSION) &&
                precio >= 0){
            this.transporte = transporte;
            this.hospedaje = hospedaje;
            excursiones.add(excursion);
            this.precio = precio;
        }
        else{
            System.out.println("<No se puedo crear el paquete de turismo.>");
        }

    }

    //INTERFAZ

    public boolean addExcursion(Proveedor excursion){
        if(excursion.getTipoProveedor().equals(TipoProveedor.EXCURSION)
                && !excursiones.contains(excursion)){
            return excursiones.add(excursion);
        }
            return false;
    }

    //Metodo toString()
    public String toString(){
        String dato = id + " - " + destino + " - " + transporte.getDescripcion() + " - " + hospedaje.getDescripcion() + " - $" + precio + " - ";
        for(int i = 0; i < excursiones.size(); i++){
            dato += excursiones.get(i).getDescripcion() + ";";
        }
        return dato + "\n";
    }


    //Getters y Setters
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setHospedaje(Proveedor hospedaje) {
        this.hospedaje = hospedaje;
    }

    public Proveedor getHospedaje() {
        return hospedaje;
    }

    public Proveedor getTransporte() {
        return transporte;
    }

    public void setTransporte(Proveedor transporte) {
        this.transporte = transporte;
    }

    public ArrayList<Proveedor> getExcursion() {
        return excursiones;
    }

    public int getId() {
        return id;
    }
}
