package ejerciciosFinales;

import java.util.Scanner;

public class actividad_4_area_triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del triangulo: ");

        double base = sc.nextDouble();

        System.out.println("Introduce la altura del triangulo: ");

        double altura = sc.nextDouble();

        double formula = ((base * altura) / 2);

        System.out.println(String.format("El area del triángulo es %.2f cm", formula));
        
        sc.close();

    }

}
