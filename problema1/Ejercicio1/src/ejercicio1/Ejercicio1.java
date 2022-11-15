
package ejercicio1;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Alexito
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costo_kilovatio;
        double consumo;
        int edad;
        double descuento = 10;
        double total;
        
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese el costo de kilovatio por hora: ");
        costo_kilovatio = entrada.nextDouble();
        
        System.out.println("Ingrese el consumo mensual: ");
        consumo = entrada.nextDouble();
        
        total = costo_kilovatio * consumo;
        
        if (edad > 65){
            descuento = (total * descuento)/100;
            total = total - descuento;
        }
        
        System.out.println("El valor total a pagar por la planilla es: " 
                + total);
     
    }
    
}
