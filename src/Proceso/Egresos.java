package Proceso;

public class Egresos extends Dinero {

    private String tipo;

    public Egresos(String descripcion, double monto) {
        super(descripcion, monto);
    }

    public Egresos() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
