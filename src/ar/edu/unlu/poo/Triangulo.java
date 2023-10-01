package ar.edu.unlu.poo;

public class Triangulo extends Fig2D{

    private float base;
    private float altura;

    //CONSTRUCTOR
    public Triangulo(float base, float altura){
        super();
        nombre = "Triangulo";
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea(){
        area = (base * altura) / 2;
        return area;
    }


}
