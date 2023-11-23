/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08_41.clasesegundo;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class clase2 {
   public String zapatilla;
   private String ojo;
   protected int num2;
   String ar;
    public clase2(String zapatilla, String ojo, int num2) {
        this.zapatilla = zapatilla;
        this.ojo = ojo;
        this.num2 = num2;
    }
    public String getZapatilla() {
        return zapatilla;
    }
    private void cambiarOjo(String nuevoOjo) {
        ojo = nuevoOjo;
    }
    protected void incrementarNum2() {
        num2++;
    }
    void setAr(String nuevoAr) {
        ar = nuevoAr;
        System.out.println(ar);
    }
}
