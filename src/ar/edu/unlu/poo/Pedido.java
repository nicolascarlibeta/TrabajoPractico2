package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.Random;

public class Pedido {

    private int id = new Random().nextInt(9000);
    private LocalDate fecha = LocalDate.now();
    private Cliente cliente;
    private PaqueteTurismo producto;
    private int cantidad;

    //CONSTRUCTOR
    public Pedido(Cliente cliente, PaqueteTurismo producto, int cantidad){
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //INTERFAZ

    //Metodo toString()
    public String toString(){
        return id + " - " + fecha + " - " + cliente.getId() + " - " + cliente.getNombreCompleto() + " - " + cliente.getDireccion() + " - " + cliente.getCuit() + " - " +  cliente.getEmail()  + " - " + cliente.getTelefono() + " - "
        + producto.getDestino() + " - " + cantidad + "\n";
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }
    public PaqueteTurismo getProducto() {
        return producto;
    }

    public String getDescripcion() {
        return producto.getDestino();
    }
}
