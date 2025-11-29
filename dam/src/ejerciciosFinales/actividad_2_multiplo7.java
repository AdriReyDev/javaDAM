package ejerciciosFinales;

import java.util.*; // se importa toda la clase java util

public class actividad_2_multiplo7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // iniciamos la variable Scanner

        System.out.println("Introduce un numero: ");

        int num = sc.nextInt(); // El usuario introduce un número entero

        int num2 = num; // Variable que se va a actualizar  del numero introducido

        //inicio del bucle
        do {

            num2++; // operacion unaria mientras while no sea true

        } while ((num2 % 7) != 0); // condicinal que se tiene que cumplir para para el bucle

        int resta = num2 - num; // resta del nuevo multiplo menos numero original

        // impresion de los valores formateados
        System.out.println(String.format("A %d hay que sumarle %d para que el resultado (%d + %d = %d) sea múltiplo de 7.", num, resta, num, resta, num2));

        sc.close();

    }

}
