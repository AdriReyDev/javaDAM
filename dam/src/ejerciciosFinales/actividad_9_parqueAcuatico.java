package ejerciciosFinales;

import java.util.Scanner;

public class actividad_9_parqueAcuatico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de entradas infantiles: ");

        double infantil = sc.nextDouble();

        infantil *= 15.50;

        System.out.print("Introduce el numero de entradas adulto: ");

        double adulto = sc.nextDouble();

        adulto *= 20;

        double total = adulto + infantil;

        if (total >= 100) {

            total = total - (total * 0.05);

            System.out.print(String.format("El total con el descuento aplicado es: %.2f €.", total));

        } else {

            System.out.print(String.format("El total con el descuento aplicado es: %.2f €.", total));
        }
        sc.close();
    }

}
