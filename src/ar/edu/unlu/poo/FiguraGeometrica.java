package ar.edu.unlu.poo;

public class FiguraGeometrica {

    protected String nombre = "";
    protected float area;


    //MÉTODO GENÉRICO
    public float calcularArea(){
        return area;
    }
    public float getArea(){
        return calcularArea();
    }

}
