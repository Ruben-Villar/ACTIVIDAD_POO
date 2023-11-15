/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07v2_41_rubenvillar;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class S07v2_41_RubenVillar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Persona_41 objpersona2 = new Persona_41(); 
       Persona_41 objpersona1 = new Persona_41();
        objpersona1.nombre = "Ruben";
        objpersona1.apellidos = " Prada ";
        objpersona1.edad = 18;
        objpersona1.lugardeNacimiento = " Peruvian ";
        objpersona1.ocupacion = " Chef ";

        objpersona1.cambiarNombre("Roberto");
        objpersona1.cambiarEdad(19);
        objpersona1.saludar();
    }
    
}
