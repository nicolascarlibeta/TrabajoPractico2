package ar.edu.unlu.poo;


public class Proveedor {

    private String descripcion = "";
    private TipoProveedor tipoProveedor;

    //CONSTRUCTOR
    public Proveedor(String descripcion, TipoProveedor tipoProveedor){
        this.descripcion = descripcion;
        this.tipoProveedor = tipoProveedor;
    }

    //INTERFAZ

    //Metodo toString()
    public String toString(){
        return descripcion + " - " + tipoProveedor + "\n";
    }

    //Getters y Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    public TipoProveedor getTipoProveedor() {
        return tipoProveedor;
    }
}
