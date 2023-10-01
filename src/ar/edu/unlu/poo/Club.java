package ar.edu.unlu.poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

public class Club {

    private ArrayList<Socio> socios = new ArrayList<>();
    private ArrayList<Actividad> actividades = new ArrayList<>();

    //INTERFAZ

    //AgregarSocios()
    public boolean addSocio(Socio nuevoSocio){
        if(!socios.contains(nuevoSocio)){
            return socios.add(nuevoSocio);
        }
        else{
            return false;
        }
    }

    //AgregarActividades()
    public boolean addActividad(Actividad nuevaActividad){
        if(!actividades.contains(nuevaActividad)){
            return actividades.add(nuevaActividad);
        }
        else{
            return false;
        }
    }

    //ObtenerListadoDeActividades()
    public void getListadoActividades(){
        Actividad actActual, actSiguiente;
        for (int j = 0; j < actividades.size(); j++){
            for(int i = 0; i < actividades.size() - 1; i++){
                actActual = actividades.get(i);
                actSiguiente = actividades.get(i+1);
                if(actActual.getSuscripcion().ordinal() > actSiguiente.getSuscripcion().ordinal()){
                    actividades.set(i,actSiguiente);
                    actividades.set(i+1,actActual);
                }
            }
        }

        System.out.println("CODIGO - NOMBRE DE ACTIVIDAD - CAPACIDAD - TIPO DE SUSCRIPCION");
        for(int i = 0; i < actividades.size(); i++){
            actActual = actividades.get(i);
            System.out.println(actActual.getCodigo() + " " + actActual.getDescripcion() + " " + actActual.getCapacidad() + " " + actActual.getSuscripcion());
        }

    }

    //ObtenerListadoDeSocios()
    public void getListadoSocios(){
        Socio socActual, socSiguiente;
        for (int j = 0; j < socios.size(); j++){
            for(int i = 0; i < socios.size() - 1; i++){
                socActual = socios.get(i);
                socSiguiente = socios.get(i+1);
                if(socActual.getTipoDeSuscripcion().ordinal() > socSiguiente.getTipoDeSuscripcion().ordinal()){
                    socios.set(i,socSiguiente);
                    socios.set(i+1,socActual);
                }
            }
        }

        System.out.println("ID. SOCIO - NOMBRE COMPLETO - DIRECCION - DNI - EMAIL - FECHA NACIMIENTO - TELEFONO - FECHA SUSCRIPCION - SUSCRIPCION");
        for(int i = 0; i < socios.size(); i++){
            socActual = socios.get(i);
            System.out.println(socActual.getId() + " - " + socActual.getNombreCompleto() + " - " + socActual.getDireccion() + " - " + socActual.getDni() + " - " + socActual.getEmail() + " - " + socActual.getFechaNacimiento() + " - " + socActual.getTelefono() + " - " + socActual.getFechaSuscripcion() + " - " + socActual.getTipoDeSuscripcion());
        }

    }

    //ObtenerReporteMensual()
    public void getReporteMensual(String mes){
        int n = Integer.parseInt(mes);
        Month m = Month.of(n);
        Socio socActual, socSiguiente;
        for (int j = 0; j < socios.size(); j++){
            for(int i = 0; i < socios.size() - 1; i++){
                socActual = socios.get(i);
                socSiguiente = socios.get(i+1);
                if(socActual.getFechaSuscripcion().isAfter(socSiguiente.getFechaSuscripcion())){
                    socios.set(i,socSiguiente);
                    socios.set(i+1,socActual);
                }
            }
        }

        System.out.println("ID. SOCIO - NOMBRE COMPLETO - DIRECCION - DNI - EMAIL - FECHA NACIMIENTO - TELEFONO - FECHA SUSCRIPCION - SUSCRIPCION");
        for(int i = 0; i < socios.size(); i++){
            socActual = socios.get(i);
            if(m.equals(socActual.getFechaSuscripcion().getMonth())){
                System.out.println(socActual.getId() + " - " + socActual.getNombreCompleto() + " - " + socActual.getDireccion() + " - " + socActual.getDni() + " - " + socActual.getEmail() + " - " + socActual.getFechaNacimiento() + " - " + socActual.getTelefono() + " - " + socActual.getFechaSuscripcion() + " - " + socActual.getTipoDeSuscripcion());
            }
        }

    }






}
