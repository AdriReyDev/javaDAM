package ejerciciosFinales;

import java.util.Scanner; //importa Scanner

public class actividad_7_distancias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Inicia Scanner

        System.out.print("Introduce una medida en mm: "); // Petición al usuario

        double mm = sc.nextDouble(); // declaracion variable mm

        System.out.print("Introduce una medida en cm: "); // Petición al usuario

        double cm = sc.nextDouble(); //declaracion variable mm

        System.out.print("Introduce una medida en m: "); // Petición al usuario

        double m = sc.nextDouble(); //declaracion variable mm

        double suma = (mm * 1000) + cm + (m / 100); // declaracion variable suma que consta de la operaciones a realizar.

        //resultado usando una cadena de texto formateada.
        System.out.println(String.format("El resultado de las medidas introducidas en cm es: %.2f cm ", suma));

        sc.close(); // cierre del Scanner

    }

}
