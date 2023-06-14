/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepcionesej03finsl;

/**
 *
 * @author Usuario
 */
public class ExepcionesEj03Finsl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/
        
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        Division d;
        
       try {
            System.out.println("ingrese un numero ");
            String cadena = leer.next();
            System.out.println("ingrese un numero ");
            String cadena2 = leer.next();
            d = new Division(Integer.parseInt(cadena), Integer.parseInt(cadena2));
           System.out.println(d.division());
        } catch (NumberFormatException e) {
            System.out.println("no es un numero");
            
        }catch (Exception e) {
            System.out.println(e);
        }
 
    }
    
}
