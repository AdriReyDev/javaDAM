package ejerciciosFinales;

import java.util.Scanner;

public class actividad_8_biologo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las hormigas capturadas: ");

        int hormigas = sc.nextInt();

        System.out.print("Introduce el número de arañas capturadas: ");

        int arañas = sc.nextInt();

        System.out.print("Introduce el número de cochinillas capturadas");

        int cochinillas = sc.nextInt();

        int total = (hormigas * 6) + (arañas * 8) + (cochinillas * 14);

        System.out.print(String.format(" El número total de patas de los invertebrados capturados es: %d patas", total));

        sc.close();
    }

}
