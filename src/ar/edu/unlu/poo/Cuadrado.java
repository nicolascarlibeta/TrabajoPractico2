package ar.edu.unlu.poo;

public class Cuadrado extends Rectangulo{

    private float lado;

    //CONSTRUCTOR
    public Cuadrado(float lado){
        super(0,0);
        nombre = "Cuadrado";
        this.lado = lado;
    }

    public float calcularArea(){
        area = lado * lado;
        return area;
    }

}
