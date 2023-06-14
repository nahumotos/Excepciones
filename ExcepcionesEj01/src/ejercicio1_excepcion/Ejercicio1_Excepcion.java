
package ejercicio1_excepcion;

import ejercicio1_excepcion.enti.Persona;


public class Ejercicio1_Excepcion {

    
    public static void main(String[] args) {
        Persona c2 = null;

        try {
            
            if (c2.getEdad()>=18) {
                System.out.println("Es mayor de edad");
            }
            else{
                System.out.println("Es menor de edad");
            }           
        } catch (Exception e) {
            System.out.println("error");
        }
        
     

    }
    
}
