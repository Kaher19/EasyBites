/**
 *
 * @author Kevin
 */
package Model.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    //parametros de conexion
    private String base = "easybites";
    private String user = "root";
    private String password = "12345678";
    private String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
    
    public Connection getConexion(){
        //la transaccion de la conexión de la base de datos
        try{
            //direccion del driver
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        }catch(SQLException e){
            //en caso de no conectarse a la base de datos
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            //en caso de no encontrar el Driver
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }//aqui termina el metodo getConexion
    
}
