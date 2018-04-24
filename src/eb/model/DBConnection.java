/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.model;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 *
 * @author Kirbey
 */
public class DBConnection {
    private Connection connection;
    private Properties props;
    
    private DBURLInfo urlInfo;
    private DBCredentials credInfo;
    
    public Connection getConnection() throws SQLException, FileNotFoundException  {
        props = new Properties();
        credInfo = new DBCredentials();
        props.put("user", credInfo.getUser());
        props.put("password", credInfo.getPassword());
        
        urlInfo = new DBURLInfo();
        if (urlInfo.getDbms().equals("mysql")) {
            connection = DriverManager.getConnection("jdbc:" + urlInfo.getDbms() 
                    +"://" +urlInfo.getServerName() +":" +urlInfo.getServerPort() + "/" +
                    urlInfo.getDatabase(), props);
        }
        return connection;
    }
    
    public boolean closeConnection() throws SQLException{
        boolean flag = true;
        try{
                connection.close();
        }
        catch(SQLException ex){
            flag = false;
            throw ex;
        }
        return flag;
    }
}
