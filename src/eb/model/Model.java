/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.model;

import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Kirbey García
 */
public class Model {

    private static DBQuery query;
    private ResultSet rSet;

    public Model() {
        query = new DBQuery();
    }

    public ArrayList<Platillos> getFromDBTipoPlatillos(String tipo) throws SQLException, FileNotFoundException {
        ArrayList<Platillos> lista = new ArrayList<>();
        int rowSize;
        Platillos platillo;
        String nombre;
        double precio;

        rSet = query.sendInstruction("SELECT Nombre, Precio "
                + "FROM Platillos "
                + "WHERE Tipo=\'" + tipo + "\' ");

        if (rSet != null) {
            //Obtenemos el tamaño del query para establecer
            //el tamaño de la tabla generada
            rSet.last();
            rowSize = rSet.getRow();
            rSet.beforeFirst();
            //
            //
            
            for (int tamanio = 0; tamanio < rowSize; tamanio++) {
                if (rSet.next()) {
                    nombre = rSet.getString("Nombre");
                    precio = rSet.getDouble("Precio");
                    platillo = new Platillos(nombre, precio, null);
                    lista.add(tamanio, platillo);
                }
            }
            query.closeDBQuery();
            rSet.close();
        } else {
            throw new NullPointerException("No hay elementos en la Base de Datos");
        }

        return lista;
    }
    
    public int addNewPlatillo(Platillos platillo) throws SQLException, FileNotFoundException{
        
        String nombre = platillo.getNombre();
        double precio = platillo.getPrecio();
        String tipo = platillo.getTipo();
        int resultado;
        
        resultado = query.sendUpdateInstruction(
                "INSERT INTO platillos(`Nombre`, Precio, `Tipo` ) " +
                "Values(\"" +nombre +"\", " +precio +", \"" +tipo +"\")"
        );
        query.closeDBQuery();
        
        return resultado;
    }
    
    public int deletePlatillo(Platillos platillo) throws SQLException, FileNotFoundException{
        String nombre = platillo.getNombre();
        int resultado;
        resultado = query.sendUpdateInstruction(
                "DELETE FROM platillos WHERE `Nombre` = \"" +nombre +"\";"
        );
        query.closeDBQuery();
        
        return resultado;
    }
}
