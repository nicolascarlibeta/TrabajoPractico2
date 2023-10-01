package ar.edu.unlu.poo;

public class Combustible {

    private String descripcion = "";
    private TipoCombustible tipo;
    private double precioXLitro = 0.0;

    //CONSTRUCTOR
    public Combustible(String descripcion, int tipo, double precioXLitro){
        this.descripcion = descripcion;
        this.tipo = TipoCombustible.values()[tipo];
        this.precioXLitro = precioXLitro;
    }

    //Setters y Getters
    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioXLitro() {
        return precioXLitro;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }
    public boolean setPrecio(double precio) {
    	if(precio > 0) {
    		precioXLitro = precio;
    		return true;
    	}
    	return false;
    }

}
