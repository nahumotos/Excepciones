/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcionesej04;

import java.util.InputMismatchException;

/**
 *
 * @author Usuario
 */
public class ExepcionesEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
[19:35, 26/1/2023] nauh: causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        int num;
        int num2;
        double division;
        try {
            System.out.println("ingrese un numero para convertirlo");
            num = Integer.parseInt(leer.next());
            System.out.println("ingrese un numero para dividir al anterior");
            num2 = leer.nextInt();
           //division = (double)num / (double)num2;
           division = num /num2;
            System.out.println("resultado: " + division);
        } catch (InputMismatchException e) {//InputMismatchException sirve para errores por teclado
            System.out.println("no es un numero entero ");
        } catch (ArithmeticException e) {//ArithmeticException sirve para errores en las divisiones SOLO CON ENTEROS!!!
            System.out.println("no es posible dividir por cero.");
            e.printStackTrace();
        }catch  (NumberFormatException e) {//sirve para erores al convertir un numero
            System.out.println("no se puede convertir esto a Nº entero.");
        }
    }

}
