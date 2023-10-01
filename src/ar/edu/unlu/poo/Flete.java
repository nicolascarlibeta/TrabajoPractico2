package ar.edu.unlu.poo;

public class Flete extends Vehiculo{

    private float PAT;

    //CONSTRUCTOR
    public Flete(String patente, String descripcion, float PAT){
        super(patente,descripcion);
        this.PAT = PAT;
    }

    public float getPAT() {
        return PAT;
    }

    public float getPrecio(){
        return precio + (600 * PAT);
    }

}
