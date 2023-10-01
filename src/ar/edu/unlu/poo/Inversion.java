package ar.edu.unlu.poo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Inversion {
	
	private int id = new Random().nextInt(10000);
	private LocalDate fecha;
	private CuentaNormal cuenta;
	private float monto;
	private boolean estado = true;
	
	//CONSTRUCTOR
	public Inversion(String fecha, CuentaNormal cuenta, float monto) throws ParseException {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fecha = LocalDate.parse(fecha,formato);
		this.cuenta = cuenta;
		this.monto = monto;
	}
	
	public void obtenerInteres() {
		LocalDate treintaDias = fecha.plusDays(30);
		if(estado && LocalDate.now().isAfter(treintaDias)) {
			monto += ((monto * 40) / 100);
			cuenta.cargar(monto);
			estado = false;
			System.out.println("El interes del 40% se obtuvo con exito");
		}
		else {
			System.out.println("Debe esperar hasta 30 dias para obtener el interes");
		}
		
	}
	
	public CuentaNormal getCuenta() {
		return cuenta;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public int getId() {
		return id;
	}
	
	public float getMonto() {
		return monto;
	}
	
	public boolean isEstado() {
		return estado;
	}

}
