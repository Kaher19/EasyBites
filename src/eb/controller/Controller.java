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
    private ResultSet rSet;
    private final DBQuery query = new DBQuery();
    
    public String[] getHeader(){
        String[]header = {"Producto", "Precio"};
        return header;
    }
    
    public String[][] getThisTypeOfSauces (String tipo) throws SQLException{
        String[][] table;
        if(tipo != null){
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
    
    public String[][] getPedidosFromMesas (String mesa) throws SQLException{
        String[][] table;
        if(mesa != null){
            int rowSize;
            rSet=query.getAllPedidosMesa(mesa);

            //Comprobamos si la tabla tiene datos
            if(rSet.next()){
                //Obtenemos el tamaño del query para establecer
                //el tamaño de la tabla generada
                rSet.last();
                rowSize=rSet.getRow();
                rSet.beforeFirst();
                //
                table=new String[rowSize][4];
                    for(int row=0; row<rowSize; row++){
                        if(rSet.next()){
                            table[row][0] = "" +rSet.getInt("Cantidad");
                            table[row][1] = rSet.getString("Producto");
                            table[row][2] = "" +rSet.getInt("Precio");
                            table[row][3] = rSet.getString("Hora");
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
    
    public String[] getPlatillosByType(String tipo) throws SQLException{
        String[] platillos;
        if(tipo != null){
            int numElementos;
            rSet=query.getPlatillosPorTipo(tipo);

            //Comprobamos si la tabla tiene datos
            if(rSet.next()){
                //Obtenemos el tamaño del query para establecer
                //el tamaño de la tabla generada
                rSet.last();
                numElementos=rSet.getRow();
                rSet.beforeFirst();
                //
                platillos = new String[numElementos];
                    for(int i=0; i<numElementos; i++){
                        if(rSet.next()){
                            platillos[i] = rSet.getString("Platillo");
                        }
                    }
                query.closeDBQuery();
                rSet.close();
            }else platillos=null;
        } else {
            platillos = null;
        }
        return platillos;
    }
    
    public void addSaucerToList(String mesa, int cantidad, String platillo, int precio) throws SQLException{
        rSet=query.setMesaPedidos(mesa, cantidad, platillo, precio);
        query.closeDBQuery();
        rSet.close();
    }
    
    public void modifyQuantitySaucerToList(String mesa, int cantidad, String platillo) throws SQLException{
        try (ResultSet rSet2 = query.getAPedidoMesa(mesa, platillo)) {
            int cantidadAnterior;
            int total;
            String[][] table=new String[1][2];
            for(int row=0; row<1; row++){
                if(rSet2.next()){
                    table[row][0] = "" +rSet2.getInt("Cantidad");
                    table[row][1] = rSet2.getString("Producto");
                }
            }
            
            cantidadAnterior=Integer.parseInt(table[0][0]);
            total = cantidad+cantidadAnterior;
            rSet=query.updateCantidad(mesa, total, platillo);
            query.closeDBQuery();
            rSet.close();
        }
    }
    
    public void addNewSaucer(String type, String sauce, float precio) throws SQLException{
        rSet=query.addNewSaucer(type, sauce, precio);
        query.closeDBQuery();
        rSet.close();
    }
    
    public void limpiarPedidosMesa(String mesa) throws SQLException{
        rSet=query.deleteAllpedidos(mesa);
        query.closeDBQuery();
    }
    
    public boolean existThisSaucer(String saucer) throws SQLException {
        boolean exist = false;
        rSet=query.getAllSaucers(saucer);
        
        if(rSet.next()){
            exist=true;
        }
        query.closeDBQuery();
        rSet.close();
        return exist;
    }
    
    public boolean existThisSaucerInThisTable(String saucer, String mesa) throws SQLException {
        boolean exist = false;
        rSet = query.getPlatillosFromThisMesa(saucer, mesa);
        
        if(rSet.next()){
            exist=true;
        }
        query.closeDBQuery();
        rSet.close();
        return exist;
    }
    
    public boolean isTableEmpty(String mesa) throws SQLException{
        boolean empty = false;
        rSet = query.getAllPedidosMesa(mesa);
        if(!rSet.next()){
            empty=true;
        }
        return empty;
    }
}
