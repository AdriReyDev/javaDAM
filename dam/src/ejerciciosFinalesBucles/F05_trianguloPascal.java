/*
5. Diseña una aplicación que dibuje el Triángulo de Pascal con n filas. Numerando filas y
posiciones desde 0, el elemento situado en la posición m de la fila n se calcula mediante la
fórmula:
E(n, m) = n! / (m! · (n − m)!)
 */
package ejerciciosFinalesBucles;

import java.util.Scanner;

public class F05_trianguloPascal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de filas : ");

        int n = sc.nextInt();

        //Iniciamos el bucle que da forma al triangulo, el exterior son las filas, el interior las columnas
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                // El resultado de  cada columna (m) es devuelto por la funcion e() que calcula la formula dada en el ejercicio
                System.out.print(e(i, j));

            }
            // Esta linea separa una fila de otra cada vez que termina el bucle interno
            System.out.println();
        }

    }

    // creamos una clase que realiza factoriales
    static long factorial(int numero) {

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {

            factorial = factorial * i;

        }
        return factorial;
    }

    // Creamos una clase que devuelve la formula dada en el ejercicio para completar el dato de las columnas
    static long e(int n, int m) {
        // La formula la realizamos llamando a la funcion que hemos creado anteriormente.
        long e = factorial(n) / (factorial(m) * factorial(n - m));

        return e;

    }

}
