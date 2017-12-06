/**
 * esta clase tiene la funcion de añadir elementos de la base de datos a la tabla
 * @author Kevin Daniel Basto Anquino
 */
package Model.Query;

import View.Caja.AgregaElemento;
import View.Caja.ConstructorCaja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class QueryCaja {
    
    //constructores de uso
    AgregaElemento elemento = new AgregaElemento();
    ConstructorCaja caja = new ConstructorCaja();
    PreparedStatement ps = null;
    Connection con = null;
    ResultSet rs = null;
    
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
                if(agregaPlatillo(nombre)){
                    JOptionPane.showMessageDialog(null, "platillo agregado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al agregar platillo");
                }
                break;
            case 2:
                if(agregaBebida(nombre, cantidad)){
                    JOptionPane.showMessageDialog(null, "bebida agregado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al agregar bebida");
                }
                break;
            case 3:
                if(agregaPostre(nombre)){
                    JOptionPane.showMessageDialog(null, "postre agregado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al agregar postre");
                }
                break;
            case 4:
                if(agregaPlatoFuerte(nombre)){
                    JOptionPane.showMessageDialog(null, "plato fuerte agregado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al agregar plato fuerte");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "error! tabla no seleccionada");
                break;
        }//fin del switch idbase    
    }//fin del metodo
    
    public boolean agregaPlatillo(String nombre){
        return false;
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
