/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_41;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class cuentabancaria {
    

    int numeroCuenta;
    String nombreTitular;
    double saldo;

  public void aea(){
  Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los datos de la cuenta
        System.out.print("Ingrese el número de cuenta:");
         numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el nombre del titular:");
       nombreTitular = scanner.nextLine();
       
        System.out.println("Ruben");
        
        System.out.print("Ingrese el saldo inicial:");
         saldo = scanner.nextDouble();
  }
   
   public void mostrarInfo6() {
        System.out.println("DATOS RECIBIDOS");
         System.out.println(numeroCuenta +"--" + saldo);
    }
  

}