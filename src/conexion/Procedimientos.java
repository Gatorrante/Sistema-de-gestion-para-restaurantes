
package conexion;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedimientos {
    
    
      public static void EntradaIngreso(String a ,String b, String c )throws SQLException{
        
        CallableStatement entrada = conexionBD.getConexion().prepareCall("{call EntradaIngreso(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
  
        entrada.execute();
    }
      
        public static void EntradaEgreso(String a ,String b, String c )throws SQLException{
        
        CallableStatement entrada = conexionBD.getConexion().prepareCall("{call EntradaEgreso(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
  
        entrada.execute();
    }
        public static void EntradaColaborador(String a ,String b, Integer c,Integer d,Integer e ,String f, String g, Integer h, Float i, String j )throws SQLException{
        
        CallableStatement entrada = conexionBD.getConexion().prepareCall("{call sp_insertar_colaborador(?,?,?,?,?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setInt(3, c);
        entrada.setInt(4, d);
        entrada.setInt(5, e);
        entrada.setString(6, f);
        entrada.setString(7, g);
        entrada.setInt(8, h);
        entrada.setFloat(9, i);
        entrada.setString(10, j);
  
        entrada.execute();
    }
        
  
}
