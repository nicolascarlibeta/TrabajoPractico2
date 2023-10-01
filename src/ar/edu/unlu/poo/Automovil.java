package ar.edu.unlu.poo;

public class Automovil extends Vehiculo{

    private int asientos;
    private boolean vip = false;

    //CONSTRUCTOR
    public Automovil(String patente, String descripcion, int asientos, boolean vip){
        super(patente,descripcion);
        this.vip = vip;
        if(asientos == 2 || asientos == 4 || asientos == 5){
            this.asientos = asientos;
        }
        else{
            System.out.println("<La cantidad de asientos no coincide con los requisitos del sistema.>");
        }
    }

    public float getPrecio(){
        if(vip){
            return precio + (500 * asientos);
        }
        else{
            return precio + (300 * asientos);
        }
    }
}
