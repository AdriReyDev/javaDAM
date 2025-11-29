package ejerciciosFinales;

import java.util.Scanner; // importa scanner

public class actividad_10_raizCuadrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // inicia scanner

        System.out.print("Introduce un numero para calcular su raiz cuadrada: "); // pide al usuario un numero

        int num = sc.nextInt(); // declara la variable num

        var raiz = Math.sqrt(num); // nombre cualificado clase Math para realizar raiz cuadrada

        System.out.println(String.format("La raiz cuadra de %d es %.0f.", num,raiz)); // resultado de la operacion.

        sc.close();

    }
}
