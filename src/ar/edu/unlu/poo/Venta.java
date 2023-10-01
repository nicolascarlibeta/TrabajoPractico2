package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Venta {

    private int id = new Random().nextInt(9000);
    private String patente = "";
    private LocalDate fecha = LocalDate.now();
    private ClienteEstacion cliente;
    private Empleado empleado;
    private Expendedor expendedor;
    private int cantidadLitros;
    private double total;
    private boolean descuento = false;

    //CONSTRUCTOR
    public Venta(String patente, ClienteEstacion cliente, Empleado empleado,
                 Expendedor expendedor, int cantidadLitros){
        this.cliente = cliente;
        this.empleado = empleado;
        this.expendedor = expendedor;
        this.patente = patente;
        this.cantidadLitros = cantidadLitros;
        total = expendedor.getCombustible().getPrecioXLitro() * cantidadLitros;
        
    }

    public int getId() {
        return id;
    }

    public String getPatente() {
        return patente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public ClienteEstacion getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Expendedor getExpendedor() {
        return expendedor;
    }

    public double getTotal() {
        return total;
    }

    public int getCantidadLitros() {
        return cantidadLitros;
    }
    
    public void setTotal(double total) {
		this.total = total;
	}
    
    public boolean setDescuento(List<Cliente> top10clientes, List<Empleado> topEmpleados, boolean descuento) {
    	if(top10clientes.contains(cliente)) {
    		total -= ((total * 5) / 100);
    		return true;
    	}
    	if(topEmpleados.contains(empleado) && !this.descuento && descuento) {
    		total -= ((total * 10) / 100);
    		return true;
    	}
    	return false;
    }

}
