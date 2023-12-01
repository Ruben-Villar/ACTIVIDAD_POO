/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class conexion {
     Connection con;
     
    public conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1?characterEncoding=UTF-8", "root", "");
            System.out.println("Se conecto ala Base de datos");
        } catch (Exception e) {
            System.out.println("Error conexion " + e);
        }
    }
     public Connection getConnection(){
        return con;
    }
}
