/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.model;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kirbey
 */
public class DBQuery {
    private DBConnection dbconnection;
    private Statement query;
    private ResultSet resultset;
    
    public ResultSet addNewSaucer(String tipo, String platillo, float costo){
        String SQLquery =
                "INSERT INTO platillos(`Tipo`, `Platillo`, Costo) " +
                "Values(\"" +tipo +"\", \"" +platillo +"\", " +costo +")";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        query.executeUpdate(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getPrecio(String platillo){
        String SQLquery =
                "SELECT Costo " +
                "FROM platillos " +
                "WHERE Platillo=\'" +platillo + "\' ";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getPlatillosPorTipo(String tipo){
        String SQLquery =
                "SELECT Platillo, Costo " +
                "FROM platillos " +
                "WHERE Tipo=\'" +tipo + "\' ";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getAllSaucers(String saucer){
        String SQLquery =
                "SELECT Platillo " +
                "FROM platillos " +
                "WHERE Platillo=\'" +saucer + "\' ";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getPlatillosFromThisMesa(String saucer, String mesa){
        String SQLquery =
                "SELECT Producto " +
                "FROM mesas " +
                "WHERE Producto=\'" +saucer + "\' AND Mesa=\'" +mesa + "\'";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getAllPedidosMesa(String mesa){
        String SQLquery =
                "SELECT Cantidad, Producto, Precio, Hora " +
                "FROM mesas " +
                "WHERE Mesa=\'" +mesa +"\'";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getAPedidoMesa(String mesa, String platillo){
        String SQLquery =
                "SELECT Cantidad, Producto " +
                "FROM mesas " +
                "WHERE Mesa=\'" +mesa +"\' AND Producto=\'" +platillo +"\'";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet setMesaPedidos(String mesa, int cantidad, String platillo, int precio){
        String SQLquery =
                "INSERT INTO restaurant.mesas (`Mesa`, `Cantidad`, `Producto`, `Precio`, `Hora`)" +
                "VALUES (\'" +mesa +"\', " +cantidad +", \'" +platillo +"\', " +precio+", CURRENT_TIME)";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        query.executeUpdate(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet updateCantidad(String mesa, int cantidad, String platillo){
        String SQLquery =
                "UPDATE mesas SET Cantidad = " +cantidad +" WHERE Mesa = \'" +mesa +"\' AND Producto = \'" +platillo +"\'";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        query.executeUpdate(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet sendInstruction(String instruction) throws SQLException, FileNotFoundException{
        String SQLquery = instruction;
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        
        return resultset;
    }
    
    public int sendUpdateInstruction(String instruction) throws SQLException, FileNotFoundException{
        String SQLquery = instruction;
        int respuesta;
        
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        respuesta = query.executeUpdate(SQLquery);
        
        return respuesta;
    }
    
    public void closeDBQuery() throws SQLException{
        dbconnection.closeConnection();
    }
}
