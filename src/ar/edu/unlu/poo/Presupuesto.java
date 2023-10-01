package ar.edu.unlu.poo;

public class Presupuesto {

    private Vehiculo vehiculo;
    private int cantidadDiasAlquiler;
    private float monto;

    public Presupuesto(Vehiculo vehiculo, int cantidadDiasAlquiler){
        this.vehiculo = vehiculo;
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        monto = vehiculo.getPrecio() * cantidadDiasAlquiler;
    }

    public float getMonto() {
        return monto;
    }

    public int getCantidadDiasAlquiler() {
        return cantidadDiasAlquiler;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
