
/*Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación
debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe
correspondiente al IVA y al total.*/
package ejerciciosFinales;

import java.util.*; // importamos la clase java util entera

public class calculosIva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Iniciamos el scanner

        System.out.print("Introduce la base imponible: ");

        double base = sc.nextDouble(); // declaramos la variame base con el scanner

        System.out.print("Introduce el iva a aplicar: ");

        double iva = sc.nextDouble(); // declaramos la base iva con el scanner

        System.out.println("El importe correspondiete al iva es: " + ((iva * base) / 100) + "€"); // calculamos iva e imprimimos

        System.out.println("El importe total es: " + (((iva * base) / 100) + base) + "€"); // calculamos coste total e imprimimos

        sc.close(); // cerramos scanner

    }

}
