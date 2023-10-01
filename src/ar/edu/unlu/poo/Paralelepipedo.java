package ar.edu.unlu.poo;

public class Paralelepipedo extends Fig3D{

    private float arista1, arista2, arista3;

    //CONSTRUCTOR
    public Paralelepipedo(float arista1, float arista2, float arista3){
        super();
        nombre = "Paralelepipedo";
        this.arista1 = arista1;
        this.arista2 = arista2;
        this.arista3 = arista3;
    }

    public float calcularArea(){
        area = 2 * (arista1 * arista2 + arista1 * arista3 + arista2 * arista3);
        return area;
    }

    public float calcularVolumen(){
        volumen = arista1 * arista2 * arista3;
        return volumen;
    }


}
