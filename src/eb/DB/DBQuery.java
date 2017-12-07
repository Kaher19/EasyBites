/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.DB;

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
    
    public void closeDBQuery(){
        dbconnection.closeConnection();
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
}
