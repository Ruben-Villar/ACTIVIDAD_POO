/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lab30
 */
public class Conexxion {
    Connection con;
    //Parametros
    
    String url = "jdbc:mysql://localhost:3306/ruben?characterEnconding=UTF-8";
    String usuario = "root";
    String contraseña = "";
            
    public Conexxion(){
    try{
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url,usuario,contraseña);
    
    }catch(Exception e){
        System.out.println("Esto es el error: " + e );
    }
    
    
  
    
    }
    
      public Connection getConection(){
    return con;
    }

    
}
