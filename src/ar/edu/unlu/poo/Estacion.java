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
    public void getEmpleadosXMontoTotal(){
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
        List<Map.Entry<Empleado, Integer>> empXTotal = new ArrayList(empleados.entrySet());
        empXTotal.sort(Map.Entry.comparingByValue());
        for(int i = 0; i < empXTotal.size(); i++){
            System.out.println(empXTotal.get(i).getKey() + "MONTO TOTAL: $" + empXTotal.get(i).getValue() + "\n");
        }
    }

    //ListaTop10Clientes()
    public List<ClienteEstacion> getListaTop10Clientes(){
        Venta ventaActual;
        Hashtable<ClienteEstacion, Double> clientes = new Hashtable<>();
        List<ClienteEstacion> top10 = new ArrayList<>();
        for(int i = 0; i < ventas.size(); i++){
            ventaActual = ventas.get(i);
            if(clientes.containsKey(ventaActual.getCliente())){
                clientes.put(ventaActual.getCliente(),
                        clientes.get(ventaActual.getCliente()) + ventaActual.getTotal());
            }
            else{
                clientes.put(ventaActual.getCliente(),ventaActual.getTotal());
            }
        }
        List<Map.Entry<ClienteEstacion, Double>> clienteXTotal = new ArrayList<>(clientes.entrySet());
        clienteXTotal.sort(Map.Entry.comparingByValue());
        for(int i = 0; i < clienteXTotal.size(); i++){
            top10.set(i, clienteXTotal.get(i).getKey());
        }
        return top10;
    }


}
