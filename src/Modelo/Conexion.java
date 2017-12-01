/**
 * @author Kevin Basto
 */
package Modelo;

//su función principal de la clase es establecer la conexión entre la base de datos

//imports usados para la conexion
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    //atributos usados para la conexion
    private final String base = "easybites";
    private final String user = "root";
    private final String password = "12345678";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    private Connection con = null;
    
    
    //metodo para la conexion a la base de datos
    public Connection getConexion(){
        
        //aqui se genera la conexion a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
