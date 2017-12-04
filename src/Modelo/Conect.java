/**
 * esta clase es utilizada para la conexion a la base de datos
 * @author Kevin Daniel Basto Anquino
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conect{
    
    //Strings utilizadas para conectarse a la base de datos
    private final String user = "root";
    private final String password = "12345678";
    private final String database = "easybites";
    private final String url = "jdbc:mysql://localhost:3306/" + database;
    private Connection con = null;
    
    public Connection getConexion(){
     
        //proceso para la conexión a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
