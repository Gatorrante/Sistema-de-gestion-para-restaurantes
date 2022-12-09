package RecursosHumanos;


public class Usuario {
    
    String ID;
    String password;

    public Usuario(String ID, String password) {
        this.ID = ID;
        this.password = password;
        
    }

    public Usuario() {
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }
    
    
}