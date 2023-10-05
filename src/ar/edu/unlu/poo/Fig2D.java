package ar.edu.unlu.poo;

public abstract class Fig2D extends FiguraGeometrica{

    //MÉTODO GENÉRICO
    public float calcularArea(){
        return area;
    }
    public float getArea(){
        return calcularArea();
    }


}
