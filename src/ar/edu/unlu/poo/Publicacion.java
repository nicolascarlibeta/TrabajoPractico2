package ar.edu.unlu.poo;

public abstract class Publicacion {

    protected String titulo;
    protected String editor;
    protected String contacto;
    protected int anio;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
