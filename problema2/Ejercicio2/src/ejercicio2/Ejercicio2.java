
package ejercicio2;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Alexito
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String descripcion;
        int cantidad;
        double preciouni;
        double descuento = 15;
        double total;
        
        System.out.println("Ingrese la descripción/nombre del artículo: ");
        descripcion = entrada.nextLine();
        
        System.out.println("Ingrese la cantidad de artículos que tendra el "
                + "pedido: ");
        cantidad = entrada.nextInt();
        
        System.out.println("Ingrese el valor unitario del artículo: ");
        preciouni = entrada.nextDouble();
        
        total = preciouni * cantidad;
        
        if (cantidad > 50){
            descuento = (total * descuento)/100;
            total = total - descuento;
        }
        
        System.out.printf("El valor total a pagar por la cantidad de %d "
                + "articulos, de descripcion: %s, es de %.2f: "
                ,cantidad
                ,descripcion
                ,total);
     
    }
    
}
