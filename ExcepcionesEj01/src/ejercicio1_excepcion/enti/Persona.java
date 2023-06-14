
package ejercicio1_excepcion.enti;

import java.util.Scanner;


public class Persona {
    String nombre;
    int edad;
    String sexo;
    double peso;
    double altura;
    int calculoIMC;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
/////
    public int getCalculoIMC() {
        return calculoIMC;
    }

    public void setCalculoIMC(int calculoIMC) {
        this.calculoIMC = calculoIMC;
    }
    ///////
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        do{
            System.out.println("Ingrese el sexo (H, M, O)");
            sexo = leer.next();
            
            if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")){
                System.out.println("Sexo no válido. Intente nuevamente");
            }
            
        }while(!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));
        
        System.out.println("Ingrese el peso");
        peso = leer.nextDouble();
        System.out.println("Ingrese la altura");
        altura = leer.nextDouble();
        
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        
    }
    
    public int calcularIMC(){
        double IMC = peso/Math.pow(altura, 2);
        
        
        if (IMC<20){
            calculoIMC = -1;
            return calculoIMC;
        }else if (IMC<=25){
            calculoIMC = 0;
            return calculoIMC;
        }else{
            calculoIMC = 1;
            return calculoIMC;
        }
    }
    
    public boolean esMayorDeEdad(){
        return (edad>=18);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    } 
}
