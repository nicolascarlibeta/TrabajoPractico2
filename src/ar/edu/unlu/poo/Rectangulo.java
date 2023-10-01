package ar.edu.unlu.poo;

public class Rectangulo extends Fig2D{

    private float base;
    private float altura;

    //CONSTRUCTOR
    public Rectangulo(float base, float altura){
        super();
        nombre = "Rectangulo";
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea(){
        area = base * altura;
        return area;
    }

}
