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
    
    public String[][] getThisTypeOfSauces (String tipo) throws SQLException{
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
                            table[row][1] = "" +rSet.getInt("Costo");
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
    
    public void addNewSaucer(String type, String sauce, float precio){
        DBQuery query = new DBQuery();
        ResultSet rSet;
        rSet=query.addNewSaucer(type, sauce, precio);
    }
    
    public boolean existThisSaucer(String saucer) throws SQLException {
        boolean exist = false;
        DBQuery query = new DBQuery();
        ResultSet rSet;
        rSet=query.getAllSaucers(saucer);
        
        if(rSet.next()){
            exist=true;
        }
        query.closeDBQuery();
        rSet.close();
        return exist;
    }
}
