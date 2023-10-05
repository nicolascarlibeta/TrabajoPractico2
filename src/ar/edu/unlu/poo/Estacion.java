package ar.edu.unlu.poo;

import java.util.*;

public class Estacion {

    private ArrayList<Venta> ventas = new ArrayList<>();

    public boolean addVenta(Venta nuevaVenta){
        return ventas.add(nuevaVenta);
    }

    //ProporciónXTipoCombustible()
    public void getVentasXCombustible(){
        Venta ventaActual;
        Hashtable<TipoCombustible, Integer> combustible = new Hashtable<>();
        for(int i = 0; i < ventas.size(); i++){
            ventaActual = ventas.get(i);
            if(combustible.containsKey(ventaActual.getExpendedor().getCombustible().getTipo())){
                combustible.put(ventaActual.getExpendedor().getCombustible().getTipo(),
                        combustible.get(ventaActual.getExpendedor().getCombustible().getTipo()) +
                                1);
            }
            else{
                combustible.put(ventaActual.getExpendedor().getCombustible().getTipo(),1);
            }
        }
        List<Map.Entry<TipoCombustible, Integer>> combustibleXVenta
                = new ArrayList<>(combustible.entrySet());
        combustibleXVenta.sort(Map.Entry.comparingByValue());
        for(int i = 0; i < combustibleXVenta.size(); i++){
            System.out.println(combustibleXVenta.get(i).getKey() + " - CANTIDAD DE VENTAS: " + combustibleXVenta.get(i).getValue() + " ventas realizadas\n");
        }

    }

    //SurtidoresOrdenadosXMontoTotalVentas()
    public void getSurtidoresXMontoTotal(){
        Venta ventaActual;
        Hashtable<Expendedor, Double> surtidores = new Hashtable<>();
        for(int i = 0; i < ventas.size(); i++){
            ventaActual = ventas.get(i);
            if(surtidores.containsKey(ventaActual.getExpendedor())){
                surtidores.put(ventaActual.getExpendedor(),
                        surtidores.get(ventaActual.getExpendedor()) +
                        ventaActual.getTotal());
            }
            else{
                surtidores.put(ventaActual.getExpendedor(),ventaActual.getTotal());
            }
        }
        List<Map.Entry<Expendedor, Double>> surtidoresXMonto
                = new ArrayList<>(surtidores.entrySet());
        surtidoresXMonto.sort(Map.Entry.comparingByValue());
        for(int i = 0; i < surtidoresXMonto.size(); i++){
            System.out.println(surtidoresXMonto.get(i).getKey() + "MONTO TOTAL DE VENTAS: $" + surtidoresXMonto.get(i).getValue() + "\n");
        }

    }

    //SurtidoresOrdenadosXLitros()
    public void getSurtidoresXLitrosTotales(){
        Venta ventaActual;
        Hashtable<Expendedor, Integer> surtidores = new Hashtable<>();
        for(int i = 0; i < ventas.size(); i++){
            ventaActual = ventas.get(i);
            if(surtidores.containsKey(ventaActual.getExpendedor())){
                surtidores.put(ventaActual.getExpendedor(),
                        surtidores.get(ventaActual.getExpendedor()) + ventaActual.getCantidadLitros());
            }
            else{
                surtidores.put(ventaActual.getExpendedor(),ventaActual.getCantidadLitros());
            }
        }
        List<Map.Entry<Expendedor, Integer>> surtidoresXLitros = new ArrayList<>(surtidores.entrySet());
        surtidoresXLitros.sort(Map.Entry.comparingByValue());
        for(int i = 0; i < surtidoresXLitros.size(); i++){
            System.out.println(surtidoresXLitros.get(i).getKey() + "LITROS EXPENDIDOS TOTALES: " + surtidoresXLitros.get(i).getValue() + "ls\n");
        }
    }

    //EmpleadosOrdenadosXMontoTotal()
    public List<Map.Entry<Empleado, Float>> getEmpleadosXMontoTotal(){
        Venta ventaActual;
        Hashtable<Empleado, Double> empleados = new Hashtable<>();
        for(int i = 0; i < ventas.size(); i++){
            ventaActual = ventas.get(i);
            if(empleados.containsKey(ventaActual.getEmpleado())){
                empleados.put(ventaActual.getEmpleado(),
                        empleados.get(ventaActual.getEmpleado()) + ventaActual.getTotal());
            }
            else{
                empleados.put(ventaActual.getEmpleado(),ventaActual.getTotal());
            }
        }
        List<Map.Entry<Empleado, Float>> empXTotal = new ArrayList(empleados.entrySet());
        empXTotal.sort(Map.Entry.comparingByValue());
        return empXTotal;
    }

    //ListaTop10Clientes()
    public List<Map.Entry<ClienteEstacion, Float>> getListaTop10Clientes(){
        Hashtable<ClienteEstacion, Float> clientes = new Hashtable<>();
        for(Venta v: ventas){
            if(clientes.containsKey(v.getCliente())){
                clientes.put(v.getCliente(),
                        (float) (clientes.get(v.getCliente()) + v.getTotal()));
            }
            else{
                clientes.put(v.getCliente(),(float) v.getTotal());
            }
        }
        List<Map.Entry<ClienteEstacion, Float>> top10 = new ArrayList<>(clientes.entrySet());
        top10.sort(Map.Entry.comparingByValue());
        
        return top10;
    }


}
