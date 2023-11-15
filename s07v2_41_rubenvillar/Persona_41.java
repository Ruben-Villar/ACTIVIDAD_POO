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
public class Persona_41 {
  //atributos

    String nombre,
            apellidos, 
            lugardeNacimiento,
            ocupacion;
    int edad;

    //metodos
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + apellidos + "tengo de edad " + edad + " vivo en " + lugardeNacimiento + " mi ocupación es" + ocupacion);
    }

    //sobrecarga de metodo
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public void saludar(String nombre, String apellido) {
        System.out.println("Hola, " + nombre + " " + apellidos + "!");
    }

    //retorno
    public String getNombre() {
        return "Rudiger";
    }

    public int getEdad() {
        return 10;
    }
    public double getchi(){
        return 20;
    }

    // Métodos con parámetros y argumentos
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void cambiarEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }
}
