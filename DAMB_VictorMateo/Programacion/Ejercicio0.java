package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Víctor Mateo
 */
public class Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Introduzca el radio del ciclindro:");
        
        double radio = lectura.nextDouble();
        
        System.out.println("Introduzca la altura del cilindro:");// TODO code application logic here
    
        double altura = lectura.nextDouble();
        
        System.out.println("El volumen es:" + Math.PI * Math.pow(radio, 2) * altura);        
         
    }
    
}
