
package RecursosHumanos;




public abstract class Colaborador {
    
     String nombre, apellido,edad, telefono, dni,cargo,numeroTelefono,turno;
     double horasSemana;

    public Colaborador(String nombre, String apellido, String edad, String telefono, String dni, String cargo, String numeroTelefono, String turno, double horasSemana) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.dni = dni;
        this.cargo = cargo;
        this.numeroTelefono = numeroTelefono;
        this.turno = turno;
        this.horasSemana = horasSemana;
    }

    public Colaborador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double gethorasSemana() {
        return horasSemana;
    }

    public void sethorasSemana(double horasSemana) {
        this.horasSemana = horasSemana;
    }

  
    public abstract  double sueldoTotal();


   

 
    
}
