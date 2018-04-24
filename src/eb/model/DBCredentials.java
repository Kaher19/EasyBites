/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.model;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Kirbey
 */
public class DBCredentials {
    private static String user;
    private static String password;
    private final String fileName = "DBCredentials.txt";
    
    //Función que recibe un parámetro String el cual será el nombre del
    //archivo contenedor de las credenciales
    
    public DBCredentials() throws FileNotFoundException{
        Scanner scan = new Scanner(new FileReader(fileName));
        //Uso una coma como delimitador
        scan.useDelimiter("\\s*,\\s*");
        while (scan.hasNext()) {
            //Busca en el documento el token "user" y guarda el
            //siguiente valor en user.
            if ("user".equals(scan.next())) {
                user = scan.next();
            }
            //Busca en el documento el token "password" y guarda el
            //siguiente valor en password.
            if ("password".equals(scan.next())) {
                password = scan.next();
            }
        }
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    
   
}
