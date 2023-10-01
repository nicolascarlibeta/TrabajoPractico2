package ar.edu.unlu.poo;

import java.sql.Time;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Diagramacion {

    private int id = new Random().nextInt(9000);
    private String descripcion = "";
    private ArrayList<DayOfWeek> dias;
    private Time horario;
    private Nivel nivel;
    private Disciplina disciplina;
    private Profesor profesor;
    private Map<Alumno,Integer> alumnos = new HashMap<>();

    //CONSTRUCTOR
    public Diagramacion(String descripcion, String dia, String horario, int nivel,
                        int disciplina, Profesor profesor){
        this.descripcion = descripcion;
        this.nivel = Nivel.values()[nivel];
        this.disciplina = Disciplina.values()[disciplina];
        this.profesor = profesor;
    }

    public void addAlumno(Alumno alumno){
        alumnos.put(alumno,0);
    }

    public void darPresente(Alumno alumno){
        alumnos.put(alumno,alumnos.get(alumno)+1);
    }

    public int getId() {
        return id;
    }

    public ArrayList<DayOfWeek> getDias() {
        return dias;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Time getHorario() {
        return horario;
    }

    public Map<Alumno, Integer> getAlumnos() {
        return alumnos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Metodo toString()
    public String toString(){
        return "ID: " + id + " - "
                + "DESCRIPCION: " + descripcion + " - "
                + "DIAS: " + dias + " - "
                + "HORARIO: " + horario + " - "
                + "NIVEL: " + nivel + " - "
                + "DISCIPLINA: " + disciplina + " - "
                + "PROFESOR/A: " + profesor.getNombreCompleto() + "\n";

    }

}
