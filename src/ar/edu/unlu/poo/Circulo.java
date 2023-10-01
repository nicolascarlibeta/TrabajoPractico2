package ar.edu.unlu.poo;

import java.math.*;

public class Circulo extends Fig2D{

    private float radio;

    //CONSTRUCTOR
    public Circulo(float radio){
        super();
        nombre = "Circulo";
        this.radio = radio;
    }

    public float calcularArea(){
        area = (float)Math.pow(Math.PI * radio,2);
        return area;
    }


}
