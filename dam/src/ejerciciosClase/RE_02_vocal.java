/*
 2. Crea una función que, mediante un booleano, indique si el carácter que se pasa
como parámetro de entrada corresponde con una vocal.
 */
package ejerciciosClase;

import java.util.Scanner;

public class RE_02_vocal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String newVocal;

        do {

            System.out.println("Introduce una letra para saber si es una vocal: ");

            newVocal = sc.next();

            if (vocal(newVocal)) {

                System.out.println("El parametro corresponde con una vocal.");

            } else if (newVocal.length() > 1) {

                System.out.println("Has metido más de un parámetro ");

            } else {

                System.out.println("El parametro no corresponde con una vocal ");

            }

        } while (!vocal(newVocal));

    }

    static boolean vocal(String letraVocal) {

        letraVocal = letraVocal.toLowerCase();

        String vocal = "aeiou";

        boolean respuesta = vocal.contains(letraVocal);

        return respuesta;
    }

}
