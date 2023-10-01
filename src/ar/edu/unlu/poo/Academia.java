package ar.edu.unlu.poo;

import java.util.*;

public class Academia {

    private ArrayList<Diagramacion> diagramaciones = new ArrayList<>();

    public boolean addDiagramacion(Diagramacion diagramacion){
        return diagramaciones.add(diagramacion);
    }

    public Diagramacion buscar(String descripcion){
        int i = 0;
        boolean esta = false;
        Diagramacion diagActual = null;
        while(!esta){
            if(diagramaciones.get(i).getDescripcion().equals(descripcion)){
                diagActual = diagramaciones.get(i);
                esta = true;
            }
            i++;
        }
        return diagActual;
    }

    //ListadoAlumnosXAsistencia()
    public float getListadoAlumnosXAsistencia(Diagramacion diagramacion){
        float paga = 0;
        Iterator<Map.Entry<Alumno, Integer>> iter = diagramacion.getAlumnos().entrySet().iterator();
        System.out.println("ALUMNOS PRESENTES: \n");
        while(iter.hasNext()){
           Map.Entry<Alumno, Integer> elemento = iter.next();
           System.out.println(elemento.getKey() + "ASISTENCIAS: " + elemento.getValue());
           paga += (elemento.getValue() * 10);
        }
        return paga;
    }

    //ReporteDisciplinaXMayorIngreso()
    public void getReporteDisciplinaXMayorIngreso(){
        Hashtable<Disciplina, Integer> disciplina = new Hashtable<>();
        for(Diagramacion d: diagramaciones){
            if(disciplina.containsKey(d.getDisciplina())){
                disciplina.put(d.getDisciplina(),disciplina.get(d.getDisciplina()) + d.getAlumnos().size());
            }
            else{
                disciplina.put(d.getDisciplina(),d.getAlumnos().size());
            }
        }
        List<Map.Entry<Disciplina, Integer>> disciplinaXIngreso = new ArrayList<>(disciplina.entrySet());
        disciplinaXIngreso.sort(Map.Entry.comparingByValue());
        Disciplina d = disciplinaXIngreso.get(disciplinaXIngreso.size() - 1).getKey();
        System.out.println("La disciplina que reditua mayor ingreso es " + d);
    }

}
