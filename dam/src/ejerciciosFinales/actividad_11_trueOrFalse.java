package ejerciciosFinales;

import java.util.Scanner;

public class actividad_11_trueOrFalse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");

        var num1 = sc.nextDouble();

        System.out.print("Introduce otro numero: ");

        var num2 = sc.nextDouble();

        System.out.println(num1 == num2);

        sc.close();
    }

}
