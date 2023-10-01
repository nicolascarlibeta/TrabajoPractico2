package ar.edu.unlu.poo;

import java.util.ArrayList;

public class Vuelo {

    private ArrayList<Persona> miembrosVuelo = new ArrayList<>();

    public boolean addPersona(Persona persona){
        return miembrosVuelo.add(persona);
    }

}
