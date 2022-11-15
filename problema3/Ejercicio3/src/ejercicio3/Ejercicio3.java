
package ejercicio3;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Alexito
 */
public class Ejercicio3 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double costo;
        double total;
        double impuesto = 0;
        
        
        System.out.println("Ingrese la marca del automóvil: ");
        marca = entrada.nextLine();
        
        System.out.println("Ingrese el origen del automóvil: ");
        origen = entrada.nextLine();
        
        System.out.println("Ingrese el costo del automóvil: ");
        costo = entrada.nextDouble();
        
        
        if ("Alemania".equals(origen)){
            impuesto = 20;
        }
        if ("Japon".equals(origen)){
            impuesto = 30;
        }
        if ("Italia".equals(origen)){
            impuesto = 15;
        }
        if ("USA".equals(origen)){
            impuesto = 8;
        }
        impuesto = (costo * impuesto)/100;
        total = costo + impuesto;
        
        System.out.printf("El impuesto adicional a pagar por el automóvil de "
                + "marca: %s ,fue de: %.2f por lo tanto, el precio de venta con"
                + " el impuesto incluido es: %.2f"
                ,marca
                ,impuesto
                ,total); 
                 
    }
    
}
