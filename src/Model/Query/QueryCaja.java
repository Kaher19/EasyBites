/**
 *
 * @author Kevin Daniel Basto Anquino
 */
package Model.Query;

import View.Caja.AgregaElemento;
import View.Caja.ConstructorCaja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryCaja {
    
    //constructores de uso
    AgregaElemento elemento = new AgregaElemento();
    ConstructorCaja caja = new ConstructorCaja();
    PreparedStatement ps = null;
    Connection con = null;
    ResultSet rs = null;
    
    public void agregaTabla(){
        switch(caja.getBase()){
            case "platillo":
                
                break;
            case "bebida":
                
                break;
            case "postre":
                
                break;
            case "plato fuerte":
                
                break;
        }

    }//aqui termina el metodo agregaTabla
    
    
}
