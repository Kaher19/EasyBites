/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.controller;

import eb.DB.DBQuery;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kirbey García
 */
public class Controller {
    
    public String[] getHeader(){
        String[]header = {"Producto", "Precio"};
        return header;
    }
    
    public String[][] getAllTypeOfSauces (String tipo) throws SQLException{
        String[][] table;
        if(tipo != null){
            DBQuery query = new DBQuery();
            ResultSet rSet;
            int rowSize;
            rSet=query.getPlatillosPorTipo(tipo);

            //Comprobamos si la tabla tiene datos
            if(rSet.next()){
                //Obtenemos el tamaño del query para establecer
                //el tamaño de la tabla generada
                rSet.last();
                rowSize=rSet.getRow();
                rSet.beforeFirst();
                //
                table=new String[rowSize][getHeader().length];
                    for(int row=0; row<rowSize; row++){
                        if(rSet.next()){
                            table[row][0] = rSet.getString("Platillo");
                            table[row][1] = "" +rSet.getFloat("Costo");
                        }
                    }
                query.closeDBQuery();
                rSet.close();
            }else table=null;
        } else {
            table = null;
        }
        return table;
    }
    
}
