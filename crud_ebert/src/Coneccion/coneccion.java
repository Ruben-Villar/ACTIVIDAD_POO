/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC08
 */
public class coneccion {
      Connection con;
    //Parametros
    
    String url = "jdbc:mysql://localhost:3306/ebertForm?characterEnconding=UTF-8";
    String usuario = "root";
    String contraseña = "admin";
            
    public coneccion(){
    try{
 
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url,usuario,contraseña);
        System.out.println("Conexion exitoso amiguito");
    }catch(Exception e){
        System.out.println("Esto es el error: " + e );
    }
    
    
  
    
    }
    
      public Connection getConection(){
    return con;
    }
}
