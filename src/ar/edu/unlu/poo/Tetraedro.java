package ar.edu.unlu.poo;

public class Tetraedro extends Fig3D{

    private float arista;

    //CONSTRUCTOR
    public Tetraedro(float arista){
        super();
        nombre = "Tetraedro";
        this.arista = arista;
    }

    public float calcularArea(){
        area = (float) (Math.pow(arista,2) * Math.sqrt(3));
        return area;
    }

    public float calcularVolumen(){
        volumen = (float) (Math.pow(arista,3) * (Math.sqrt(2) / 12));
        return volumen;
    }
}
