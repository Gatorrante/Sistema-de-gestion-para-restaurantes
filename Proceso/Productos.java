package Proceso;

public class Productos {

    private String nombrepro;
    private int cantidad;

    private double precio;
    private String descripcion;

    public Productos() {
    }

    public Productos(String nombrepro, int cantidad, double precio) {
        this.nombrepro = nombrepro;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Productos(String nombrepro, int cantidad, double precio, String descripcion) {
        this.nombrepro = nombrepro;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
