/*
4. Realiza un programa que pida un número n y muestre cuántos números hay entre 1 y n que
sean primos. Un número primo es aquel que solo es divisible entre 1 y él mismo. Ejemplo para
n = 8:

1 → primo
2 → primo
3 → primo
4 → no primo
5 → primo
6 → no primo
7 → primo
8 → no primo
Resultado: Hay un total de 5 números primos.
 */
package ejerciciosFinalesBucles;

import java.util.Scanner;

public class F04_secuenciaPrimos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero  y te digo cuantos numeros son primos desde el 1 hasta el numero introducido: ");

        int numb = sc.nextInt();

        int uno = 1;

        int contador = 0;

        for (int numero = 1; numero <= numb; numero++) {

            boolean primo = true;

            for (int i = 2; i <= numero / 2; i++) {

                if (numero % i == 0) {

                    primo = false;
                    
                    break;

                }

            }
            if (primo) {

                System.out.println(numero + "-> primo");

                contador++;

            } else {

                System.out.println(numero + "-> no primo");

            }

        }

        System.out.printf("Hay un total de %d numeros primos", contador);
        
    }

}
