package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Libro extends Publicacion{

    private ArrayList<String> autores = new ArrayList<>();
    private ArrayList<Ejemplar> ejemplares = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();
    private String isbn;
    private int numPaginas;
    private int ejemDisponibles;
    private int ejemPrestados = 0;

    //INTERFAZ (MÉTODOS)

    //CONSTRUCTOR
    public Libro(String titulo, String autor, int pag, int ed, String isbn){
        this.titulo = titulo;
        autores.add(autor);
        numPaginas = pag;
        ejemDisponibles = ed;
        this.isbn = isbn;
        //Cargo los ejemplares disponibles
        for(int i = 0; i < ed; i++){
            ejemplares.add(new Ejemplar(this));
        }
    }

    //Getters y Setters (COMUNICACIÓN CON OTRAS CLASES)
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public ArrayList<String> getAutores(){
        return autores;
    }
    public boolean addAutor(String autor){
        return autores.add(autor);
    }

    public int getNumPaginas(){
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    public void setEjemDisponibles(int ed){
        ejemDisponibles = ed;
    }
    public int getEjemDisponibles(){
        return ejemDisponibles;
    }

    public int getEjemPrestados(){
        return ejemPrestados;
    }

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    //Metodo toString()
    public String toString(){
        String autor = "";
        for(int i = 0; i < autores.size(); i++){
            autor += autores.get(i) + ";";
        }
        return
                "TITULO: " + titulo + " - "
                + "AUTOR: " + autor + " - "
                + "PAG.: " + numPaginas + " - "
                + "DISPONIBLES: " + ejemDisponibles + " - "
                + "PRESTADOS: " + ejemPrestados + "\n";

    }

    //PrestarLibro()
    public int prestar(SocioBiblioteca socio){
        if(ejemDisponibles > 1){
            boolean prestado = true;
            Ejemplar ejempActual = ejemplares.get(ejemDisponibles - 1);
            //Lo presto
            ejempActual.setPrestado(prestado);
            //Adiciono el prestamo
            prestamos.add(new Prestamo(socio,ejempActual));
            ejemDisponibles -= 1;
            ejemPrestados += 1;
            return ejempActual.getId();
        }
        else{
            System.out.println("<NO se puede prestar este libro, solo queda (un) ejemplar.>");
            return -1;
        }
    }

    //DevolverLibro()
    public void devolver(int id){
        if(ejemDisponibles > 0){
            //Busco el prestamo
            int i = 0;
            boolean esta = false, prestado = false;
            Prestamo prestamoActual;
            Ejemplar ejempActual;
            while(!esta && i < prestamos.size()){
                //Lo devuelvo
                if(prestamos.get(i).getEjemplar().getId() == id){
                    prestamoActual = prestamos.get(i);
                    ejempActual = prestamoActual.getEjemplar();
                    ejempActual.setPrestado(prestado);
                    prestamoActual.setEstado(prestado);
                    ejemDisponibles += 1;
                    ejemPrestados -= 1;
                    esta = true;
                }
                i++;
            }
        }
    }

    //MostrarEjemplaresPrestados()
    public void mostrarEjemplaresPrestados(){
        for(Prestamo p: prestamos){
            if(p.isEstado()){
                System.out.println(p);
            }
        }
    }



}
