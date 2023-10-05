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
		if(cuenta.getSaldo() < monto) {
			cancelarInversion();
		}
	}
	
	public void obtenerInteres() {
		LocalDate cuarentaDias = fecha.plusDays(40);
		LocalDate treintaDias = fecha.plusDays(30);
		if(estado && LocalDate.now().isAfter(cuarentaDias)) {
			monto += ((monto * 40) / 100);
			cuenta.cargar(monto);
			cuenta.setMontoInvertido(0);
			estado = false;
			System.out.println("El interes del 40% se obtuvo con exito");
		}
		else if(!estado) {
			if(LocalDate.now().isAfter(treintaDias)) {
			monto += ((monto * 5) / 100);
			cuenta.cargar(monto);
			cuenta.setMontoInvertido(0);
			System.out.println("Se obtuvo con exito un interes del 5%");
			}
			else {
				System.out.println("La inversion ya esta fuera de operacion");
			}
		}
		else {
			System.out.println("Debe esperar hasta 30 dias para obtener el interes");
		}
		
	}
	
	public void cancelarInversion() {
		estado = false;
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
