/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08_41.claseprimero;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class clase1 {
   public String color;
   private String ropa;
   protected int num1;
   String ru;
    public clase1(String color, String ropa, int num1) {
        this.color = color;
        this.ropa = ropa;
        this.num1 = num1;
    }
    public String getColor() {
        return color;
    }
    private void cambiarRopa(String nuevaRopa) {
        ropa = nuevaRopa;
    }
    protected void incrementarNum1() {
        num1++;
    }
    void setRu(String nuevoRu) {
        ru = nuevoRu;
    }
    public void ejemploUsoModificadores() {
        System.out.println("Color: " + color); 
        incrementarNum1(); 
        setRu("1234567890"); 
    }
}
