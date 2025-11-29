package condicionalesUnidad2;

import java.util.Scanner; //importar Scanner

public class numeroCapicua_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // declarar Scanner

        System.out.println("Introduce un numero entre 0 y 9999");

        int number = sc.nextInt(); // declarar variable int de usuario

        String numero; // declarar variable para transformar int en string
        numero = String.valueOf(number); // transformar el valor de number en string

        if (numero.length() <= 1) { // inicio de condicion segun longitud de string

            System.out.println(String.format("El numero %d no es capicua.", number));

        } else if ((numero.length() - 1 == 2) && (numero.charAt(0) == numero.charAt(numero.length() - 1))) { // para hayar el valor del ultimo string no olvidar poner -1

            System.out.println(String.format("El numero %d es capicua", number));

        } else if ((numero.length() - 1 == 2) && (numero.charAt(0) != numero.charAt(numero.length() - 1))) {

            System.out.println(String.format("El numero %d no es capicua", number));

        } else if (((numero.length() - 1) == 3) && (numero.charAt(0) == numero.charAt(3)) && (numero.charAt(1) == numero.charAt(2))) {

            System.out.println(String.format("El numero %d es capicua", number));

        } else if ((numero.length() - 1 == 3) && (numero.charAt(0) == numero.charAt(numero.length() - 1)) && (numero.charAt(1) == numero.charAt(2))) {

            System.out.println(String.format("El numero %d es capicua", number));

        } else if ((numero.length() - 1 == 3) && (numero.charAt(0) != numero.charAt(3)) && (numero.charAt(1) != numero.charAt(2))) {

            System.out.println(String.format("El numero %d no es capicua", number));

        } else {

            System.out.println(String.format("El numero %d no es capicua", number));

        }

    }

}
