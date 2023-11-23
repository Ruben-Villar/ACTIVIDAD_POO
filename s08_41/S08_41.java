/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08_41;

import s08_41.clasesegundo.clase2;
import s08_41.claseprimero.clase1;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class S08_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clase1 cl1 = new clase1("Rojo", "Pantalón", 10);
        clase2 cl2 = new clase2("Nike", "Negro", 20);
        cl1.ejemploUsoModificadores();
        // Accede al atributo color de la clase Clase1
        System.out.println("El color de la clase Clase1 es: " + cl1.color);

        // Accede al atributo zapatilla de la clase Clase2
        System.out.println("La zapatilla de la clase Clase2 es: " + cl2.zapatilla);      }
    
}
