
package Ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numdias;
        double preciohab;
        double descuento = 0;
        double total;
        double subtotal;
        
        System.out.println("Ingrese el precio diario de la habitación: ");
        preciohab = entrada.nextDouble();
        
        System.out.println("Cuántos días se va a hospedar: ");
        numdias = entrada.nextInt();
        
        if (numdias <=5){
            subtotal = numdias * preciohab;
            total = subtotal - descuento;
            System.out.printf("El subtotal a pagar es %.2f\nEl descuento "
                    + "es: %.2f\nEl total a pagar es: %.2f\n", 
                    subtotal,
                    descuento, 
                    total);
           
        }
        if (numdias >5){
            if (numdias <=10){
                descuento = 10;
            }
            if (numdias >=10 && numdias <=15){
                descuento = 15;
            }
            if (numdias >15){
                descuento = 20;
            }
            subtotal = numdias * preciohab;
            descuento = (subtotal * descuento)/100;
            total = subtotal - descuento;
            System.out.printf("El subtotal a pagar es %.2f\nEl descuento "
                    + "es: %.2f\nEl total a pagar es: %.2f\n", 
                    subtotal,
                    descuento, 
                    total);
        }
        
    }
    
}
