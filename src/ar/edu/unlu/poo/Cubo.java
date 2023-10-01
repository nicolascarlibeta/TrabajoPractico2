package ar.edu.unlu.poo;

public class Cubo extends Fig3D{

    private float arista;

    //CONSTRUCTOR
    public Cubo(float arista){
        super();
        nombre = "Cubo";
        this.arista = arista;
    }

    public float calcularArea(){
        area = (float) (6 * Math.pow(arista,2));
        return area;
    }

    public float calcularVolumen(){
        volumen = (float) Math.pow(arista,3);
        return volumen;
    }


}
