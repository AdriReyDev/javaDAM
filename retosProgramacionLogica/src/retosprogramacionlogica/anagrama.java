/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
package retosprogramacionlogica;

import java.util.Scanner;
import java.util.Arrays;

public class anagrama {

    public static void main(String[] args) {

        /*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
                * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
                * - Dos palabras exactamente iguales no son anagrama.
         */
        Scanner sc = new Scanner(System.in); // Iniciar Scanner
// Declarar variable resultado
        boolean resultado;

        System.out.println("Introduce la primera palabra: ");
        String palabra1 = sc.next();

        char[] lista1 = palabra1.toCharArray(); // Convertir variable palabra1 en Arraylist Char Lista1

        System.out.println("Introduce la segunda palabra: ");

        String palabra2 = sc.next();

        char[] lista2 = palabra2.toCharArray(); // Convertir variable palabra2 en Arraylist Char Lista2

        if (palabra1.equals(palabra2)) { // Primera condicion (filtro para impedir palabras iguales)

            System.out.println("Las palabras son iguales, no es un anagrama");

        } else if (palabra1 != palabra2) { // Segunda condicion (si las palabras no son iguales continua el programa)

                Arrays.sort(lista1); // Ordena por orden alfabetico el primer Array Char lista1

                Arrays.sort(lista2); // Ordena por orden alfabetico el segundo Array Char lista2

                resultado = Arrays.equals(lista1, lista2); // compara los dos Arrays y devuelve un resultado Booleano

                if (resultado) { // if anidado, si resultado es true imprime la sentencia de abajo.

                System.out.println("Las palabras introducidas son un anagrama.");

            } else { // si resultado es false imprime la sentencia de abajo.

                System.out.println("Las palabras introducidas no son un anagrama.");

            }

        }
    }

}
