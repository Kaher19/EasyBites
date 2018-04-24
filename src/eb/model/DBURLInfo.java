/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/**
 *
 * @author Kirbey
 */
public class DBURLInfo {
    private static String dbms;
    private static String serverName;
    private static String serverPort;
    private static String database;
    private final String fileName = "DBURLInfo.txt";
    
    
    //Función que recibe el nombre del archivo donde se almacena
    //la información del URL. Devuelve un string diseñado para la función
    //getConnection(String, Propperties) en DBConnection.
    public DBURLInfo() throws FileNotFoundException{
        Scanner scan = new Scanner(new FileReader(fileName));
        //Uso una coma como delimitador de tokens
        scan.useDelimiter("\\s*,\\s*");
        //Mientras hayan tokens en el archivo, los leo
        while (scan.hasNext()) {
            //Busco el token "dbms" y guardo el valor siguiente en
            //this.dbms
            if ("dbms".equals(scan.next())) {
                dbms = scan.next();
            } else {
                System.out.println("No se encontro un dbms");
            }
            //Busco el token "serverName" y guardo el valor siguiente en
            //this.serverName
            if ("serverName".equals(scan.next())) {
                serverName = scan.next();
            }
            //Busco el token "serverPort" y guardo el valor siguiente en
            //this.serverPort
            if ("serverPort".equals(scan.next())) {
                serverPort = scan.nextBigInteger().toString();
            }
            //Busco el token "database" y guardo el valor siguiente en
            //this.database
            if ("database".equals(scan.next())) {
                database = scan.next();
            }
        }
        
        scan.close();
    }

    public String getDbms() {
        return dbms;
    }

    public String getServerName() {
        return serverName;
    }

    public String getServerPort() {
        return serverPort;
    }

    public String getDatabase() {
        return database;
    }
    
    
}

