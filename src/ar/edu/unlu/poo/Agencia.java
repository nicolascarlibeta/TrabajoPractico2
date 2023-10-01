package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Agencia {

    private ArrayList<Proveedor> proveedores = new ArrayList<>();
    private ArrayList<PaqueteTurismo> paquetes = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    //INTERFAZ

    public boolean addProvedor(Proveedor proveedor){
        if(!proveedores.contains(proveedor)){
            return proveedores.add(proveedor);
        }
        return false;
    }

    public boolean addPaquete(PaqueteTurismo paqueteTurismo){
        if(!paquetes.contains(paqueteTurismo)){
            return paquetes.add(paqueteTurismo);
        }
        return false;
    }

    public boolean addPedido(Pedido pedido){
        if(!pedidos.contains(pedido)){
            return pedidos.add(pedido);
        }
        return false;
    }

    public void getListadoProveedores(){
        Proveedor provActual, provSiguiente;
        for (int j = 0; j < proveedores.size(); j++){
            for(int i = 0; i < proveedores.size() - 1; i++){
                provActual = proveedores.get(i);
                provSiguiente = proveedores.get(i+1);
                if(provActual.getTipoProveedor().ordinal() > provSiguiente.getTipoProveedor().ordinal()){
                    proveedores.set(i,provSiguiente);
                    proveedores.set(i+1,provActual);
                }
            }
        }

        System.out.println("DESCRIPCION - TIPO DE PROVEEDOR");
        for(int i = 0; i < proveedores.size(); i++){
            provActual = proveedores.get(i);
            System.out.println(provActual);
        }
    }

    public void getListadoPaquetes(){
        PaqueteTurismo paqActual;
        System.out.println("ID - DESCRIPCION - TRANSPORTE - HOSPEDAJE - EXCURSIONES");
        for(int i = 0; i < paquetes.size(); i++){
            paqActual = paquetes.get(i);
            System.out.println(paqActual);
        }
    }

    public void getListadoPedidos(){
        Pedido pedidoActual;
        System.out.println("ID PEDIDO - FECHA - ID CLIENTE - NOMBRE COMPLETO - DIRECCION - CUIT - EMAIL - TELEFONO - PRODUCTOS - CANTIDAD");
        for(int i = 0; i < pedidos.size(); i++){
            pedidoActual = pedidos.get(i);
            System.out.print(pedidoActual);
        }
    }

    public void getListadoVentasMensual(String mes){
        int n = Integer.parseInt(mes);
        Month m = Month.of(n);
        Pedido pedidoActual;
        Comparator<Pedido> cmpPorDescripcion = Comparator.comparing(Pedido::getDescripcion);
        ArrayList<Pedido> pedidosMensuales = new ArrayList<>();
        for(int i = 0; i < pedidos.size(); i++){
            pedidoActual = pedidos.get(i);
            if(pedidoActual.getFecha().getMonth().equals(m)){
                pedidosMensuales.add(pedidoActual);
            }
        }
        pedidosMensuales.sort(cmpPorDescripcion);
        for(int i = 0; i < pedidosMensuales.size(); i++){
            System.out.print(pedidosMensuales.get(i));
        }

    }

    public void getDestinoRecurrente(){
        ArrayList<String> destinos = new ArrayList<>();
        PaqueteTurismo paqActual;
        for(int i = 0; i < paquetes.size(); i++){
            paqActual = paquetes.get(i);
            if(!destinos.contains(paqActual.getDestino())){
                destinos.add(paqActual.getDestino());
            }
        }



    }


}
