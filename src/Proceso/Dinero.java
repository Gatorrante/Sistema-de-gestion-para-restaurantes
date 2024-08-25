
package Proceso;


public class Dinero {
    
    
   private String descripcion;
   private double monto;

    public Dinero() {
    }

   
    public Dinero(String descripcion, double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

 
}