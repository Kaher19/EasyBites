/**
 * esta clase tiene la funcion de añadir elementos de la base de datos a la tabla
 * @author Kevin Daniel Basto Anquino
 */
package Model.Query;

import Model.Menu.Bebidas;
import Model.Menu.MainDish;
import Model.Menu.Platillos;
import Model.Menu.Postres;

import View.Menu;
import View.Caja.AgregaElemento;
import View.Caja.ConstructorCaja;

import Model.SQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryCaja extends Conexion{
    
    //constructores de uso
    Bebidas bebidas = new Bebidas();
    MainDish plato = new MainDish();
    Platillos platillos = new Platillos();
    Postres postres = new Postres();
    
    AgregaElemento elemento = new AgregaElemento();
    ConstructorCaja caja = new ConstructorCaja();
    Menu menu = new Menu();
    
    PreparedStatement ps = null;
    Connection con = getConexion();
    ResultSet rs = null;
    
    public boolean agregaPlatillo(String nombre){
        int cantidad;
        float precio;
        String element;
        
        
        String sql = "SELECT * FROM platillos WHERE nombre=?";
        
        try{
            //proceso de anexión y ejecucion de la sentencia en sql
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            
            //en caso de encontrar el resultado
            if(rs.next()){
                //System.out.println("elemento encontrado");
                platillos.setPrecio((float) Float.parseFloat(rs.getString("precio")));
                platillos.setPlatillo(rs.getString("nombre"));
                
                cantidad = caja.getCantidad();
                precio = platillos.getPrecio();
                element = platillos.getPlatillo();

                menu.guardardatos(element,cantidad, precio);
                return true;
            }
            
            //de otro modo
            return false;
        }catch(SQLException e){
            //en caso de error ala conexion a la base de datos
            System.err.println(e);
            return false;
            
        }finally{
            //proceso para cerrar la conexión a la base de datos
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
    
    public boolean agregaBebida(String nombre, int cantidad){
        return false;
    }
    
    public boolean agregaPostre(String nombre){
        return false;
    }
    
    public boolean agregaPlatoFuerte(String nombre){
        return false;
    }
}
