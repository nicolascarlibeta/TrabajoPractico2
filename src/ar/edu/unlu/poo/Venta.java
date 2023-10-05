package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Venta {

    private int id = new Random().nextInt(9000);
    private String patente = "";
    private LocalDate fecha = LocalDate.now();
    private ClienteEstacion cliente;
    private Empleado empleado;
    private Expendedor expendedor;
    private int cantidadLitros;
    private float total;
    private boolean descuento = false;

    //CONSTRUCTOR
    public Venta(String patente, ClienteEstacion cliente, Empleado empleado,
                 Expendedor expendedor, int cantidadLitros){
        this.cliente = cliente;
        this.empleado = empleado;
        this.expendedor = expendedor;
        this.patente = patente;
        this.cantidadLitros = cantidadLitros;
        total = (float)expendedor.getCombustible().getPrecioXLitro() * cantidadLitros;
        
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
    
    public void setTotal(float total) {
    	if(total >= 0) {
    		this.total = total;    		
    	}
	}
    
    public boolean setDescuento(List<Map.Entry<ClienteEstacion, Float>> top10clientes, List<Map.Entry<Empleado, Float>> topEmpleados, boolean descuento) {
    	boolean descuentoAplicado = false;
    	for(Map.Entry<ClienteEstacion, Float> c: top10clientes) {
    		if(c.getKey().equals(cliente)) {
    			total -= ((total * 5) / 100);
    			descuentoAplicado = true;
    		}
    	}
    	if(descuento) {
    		for(Map.Entry<Empleado, Float> e: topEmpleados) {
        		if(e.getKey().equals(empleado)) {
        			total -= ((total * 10) / 100);
        			descuentoAplicado = true;
        		}
        	}
    	}
    	return descuentoAplicado;
    }
    
  //Metodo toString()
    public String toString(){
        return "ID: " + id + "-"
                + "FECHA: " + fecha + " - "
                + "ID CLIENTE: " + cliente.getId() + " - "
                + "NOMBRE COMPLETO: " + cliente.getNombreCompleto() + " - "
                + "EMPLEADO: " + empleado.getNombreCompleto() + " - "
                + "ID EXPENDEDOR: " + expendedor.getId() + " - "
                + "COMBUSTIBLE: " + expendedor.getCombustible().getDescripcion() + " - "
                + "CANT.LITROS: " + cantidadLitros + " - "
                + "MONTO TOTAL: " + total + "\n";
    }

}
