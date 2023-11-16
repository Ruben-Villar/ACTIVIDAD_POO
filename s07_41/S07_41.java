/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_41;

import java.util.Scanner;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class S07_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       persona1 ob = new persona1();
         
         ob.preguntar("Ruben", "Julio");
            Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
         persona2 ob1 = new persona2(a,b);
        
    }
    
}
