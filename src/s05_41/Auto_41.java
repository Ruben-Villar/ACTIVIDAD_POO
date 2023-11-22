/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_41;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class Auto_41 {
      String marca;
    String raza;
    int edad;
    
    Scanner si = new Scanner(System.in);
    
    public void preguntar() {
        
        System.out.print("La marca del carro es: ");
        marca = si.nextLine();
      
        System.out.print("La raza del carro es: ");
        raza = si.nextLine();
      
         System.out.print("La edad del carro es: ");
        edad = si.nextInt();
       
       
    }

    public void mostrarInfo() {
        System.out.println("DATOS RECIBIDOS");
        System.out.println(marca +" "+ raza +" "+ edad  );
    }
}
