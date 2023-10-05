package ar.edu.unlu.poo;

public abstract class Fig3D extends FiguraGeometrica{

    protected float volumen;

    //CONSTRUCTOR
    public Fig3D(){
    }

    //MÉTODOS GENÉRICO
    public float calcularArea(){
        return area;
    }
    public float getArea(){
        return calcularArea();
    }

    public float calcularVolumen(){
        return volumen;
    }
    public float getVolumen() {
        return calcularVolumen();
    }
}
