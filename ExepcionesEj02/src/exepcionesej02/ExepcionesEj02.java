/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcionesej02;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ExepcionesEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/
        ArrayList <String> lista = new ArrayList();
        lista.add("jose");
        lista.add("Marcelo");
        lista.add("juan");
        lista.add("diego");
        
        for (int i = 0; i < 6; i++) {
                
            try {
                System.out.println(lista.get(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println("te pasaste bro");
                break;
            
            }
    }
    
}
