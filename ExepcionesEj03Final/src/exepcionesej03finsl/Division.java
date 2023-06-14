/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesej03finsl;

/**
 *
 * @author Usuario
 */
public class Division {
        private int num;
        private int num2;
        
    public Division() {
        
    }
        
    public Division(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int division ()throws Exception /*throws expection guarda el error*/ {
        int resultado;
        try {
            resultado =num/num2;
            
        } catch (ArithmeticException e) {
            throw new Exception("error en la division");
 
        }
        return resultado;
    }
        
}
