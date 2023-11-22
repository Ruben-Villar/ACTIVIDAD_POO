/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_41;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class S05_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro_41 calculadora = new Libro_41();
        calculadora.preguntar();
        calculadora.sumar();
        calculadora.resta();
        calculadora.multiplicar();
        
        Auto_41 ani = new Auto_41();
        ani.preguntar();
        
        ani.mostrarInfo();
        
        Estudiante_41 per = new Estudiante_41();
        per.preguntar();
        per.mostrarInfo();
        
        cuentabancaria per1 = new cuentabancaria();
        per1.aea();
        per1.mostrarInfo6();
    }
    
}
