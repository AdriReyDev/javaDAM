package ejerciciosFinales;

import java.util.Scanner; // importa clase Scanner

public class actividad_12_lanzamientoAlgoritmo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Inicia la variable Scanner sc

        System.out.print("Introduce los metros del lanzamiento: "); // pide un valor al usuario

        var metros = sc.nextDouble(); // declara la variable que hace referencia al valor introducido por el usuario

        metros *= 100; // convierte metros en cm

        int resultado = (int) metros; // nueva variable que convierte la variable double metros en variable int metro ( perdiendo info )

        System.out.println(String.format("El lanzamiento ha sido de %d cm", resultado)); // se imprime el resultado usando format.

        sc.close(); // se cierra el Scanner.
    }

}
