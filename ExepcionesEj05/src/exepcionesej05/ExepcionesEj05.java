/*
 * 
 *
 */
package exepcionesej05;

/**
 *
 * @author Usuario
 */
public class ExepcionesEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        //String convert;
        int num=0;
        int c=0;
        int inc= (int)(Math.random()*10);
        System.out.println("inc: "+ inc);
        do {
            System.out.println("adivine el numero 1-10");
            c++;
            //convert= leer.next();
            try {
                //num = leer.nextInt();//asi no funciona
                num = Integer.parseInt(leer.next());//asi si (raro)
                if (num<inc) {
                    System.out.println("tu numero es menor");
                }else if (num>inc) {
                    System.out.println("tu numero es mayor");
                }
            } catch (NumberFormatException e) {
                System.out.println("no es un numero");
               /* System.out.println(e);
                System.out.println(e.getMessage());*/
            }
        } while (num!=inc);
        System.out.println("si se pudo burro");
        System.out.println("intentos : "+c);          
    }
    
}
