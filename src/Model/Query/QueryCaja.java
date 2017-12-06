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
import Model.SQL.Conexion;
import View.Caja.AgregaElemento;
import View.Caja.ConstructorCaja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class QueryCaja extends Conexion{
    
    //constructores de uso
    Bebidas bebidas = new Bebidas();
    MainDish plato = new MainDish();
    Platillos platillos = new Platillos();
    Postres postres = new Postres();
    
    AgregaElemento elemento = new AgregaElemento();
    ConstructorCaja caja = new ConstructorCaja();
    PreparedStatement ps = null;
    Connection con = getConexion();
    ResultSet rs = null;
    Menu menu = new Menu();
    
    //variable enviada para addtableelement
    float precio;
    
    public void addfila(String nombre, String base, int cantidad){  
       int ids = 1;
       
       
       //alfin funciona esta mierda estoy llorando a las 2 de la mañana 
       if(base.equals("platillo")){
            ids = 1;
        }
        if(base.equals("bebida")){
            ids = 2;
        }
        if(base.equals("plato fuerte")){
            ids = 4;
        }
        if(base.equals("postre")){
            ids = 3;
        }
        
       
        switch(ids){
            case 1:
                if(agregaPlatillo(nombre)==true){
                    JOptionPane.showMessageDialog(null, "platillo agregado");
                    menu.addTableElement(nombre, cantidad, precio);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "error al agregar platillo");
                }
                break;
            //------------------------------------------------------------------
            case 2:
                if(agregaBebida(nombre, cantidad)==true){
                    JOptionPane.showMessageDialog(null, "bebida agregado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al agregar bebida");
                }
                break;
            //------------------------------------------------------------------
            case 3:
                if(agregaPostre(nombre)==true){
                    JOptionPane.showMessageDialog(null, "postre agregado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al agregar postre");
                }
                break;
            //------------------------------------------------------------------
            case 4:
                if(agregaPlatoFuerte(nombre)==true){
                    JOptionPane.showMessageDialog(null, "plato fuerte agregado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al agregar plato fuerte");
                }
                break;
            //------------------------------------------------------------------
            default:
                JOptionPane.showMessageDialog(null, "error! tabla no seleccionada");
                break;
        }//fin del switch idbase    
    }//fin del metodo
    
    public boolean agregaPlatillo(String nombre){
        
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
                precio = platillos.getPrecio();
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
