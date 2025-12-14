/*
 Crear un programa que muestre las tablas de multiplicar del 1 al 10. 
 */
package ejerciciosClase;

public class FAnidado_01_tablasMultiplicar {

    public static void main(String[] args) {

        int count = 1;

        for (int j = 1; j <= 10; j++) {

            for (int i = 1; i <= 10; i++) {

                count = j * i;
                System.out.println(count);

            }

        }

    }

}
