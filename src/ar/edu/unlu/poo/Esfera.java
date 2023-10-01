package ar.edu.unlu.poo;

public class Esfera extends Fig3D{

    private float radio;

    //CONSTRUCTOR
    public Esfera(float radio){
        super();
        nombre = "Esfera";
        this.radio = radio;
    }

    public float calcularArea(){
        area = (float)Math.pow(4 * Math.PI * radio,2);
        return area;
    }

    public float calcularVolumen(){
        volumen = (float)Math.pow((4/3) * Math.PI * radio,3);
        return volumen;
    }



}
