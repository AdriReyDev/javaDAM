
package condicionalesUnidad2;

import java.util.Scanner;
public class E04_numerosLetras {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entre 1 y 99: ");
        int n = sc.nextInt();

        String resultado;

        if (n < 1 || n > 99) {
            resultado = "Número fuera de rango";
        } else {
            resultado = switch (n) {

                // 1–29
                case 1 -> "uno";
                case 2 -> "dos";
                case 3 -> "tres";
                case 4 -> "cuatro";
                case 5 -> "cinco";
                case 6 -> "seis";
                case 7 -> "siete";
                case 8 -> "ocho";
                case 9 -> "nueve";
                case 10 -> "diez";
                case 11 -> "once";
                case 12 -> "doce";
                case 13 -> "trece";
                case 14 -> "catorce";
                case 15 -> "quince";
                case 16 -> "dieciséis";
                case 17 -> "diecisiete";
                case 18 -> "dieciocho";
                case 19 -> "diecinueve";
                case 20 -> "veinte";
                case 21 -> "veintiuno";
                case 22 -> "veintidós";
                case 23 -> "veintitrés";
                case 24 -> "veinticuatro";
                case 25 -> "veinticinco";
                case 26 -> "veintiséis";
                case 27 -> "veintisiete";
                case 28 -> "veintiocho";
                case 29 -> "veintinueve";

                // 30–39
                case 30 -> "treinta";
                case 31 -> "treinta y uno";
                case 32 -> "treinta y dos";
                case 33 -> "treinta y tres";
                case 34 -> "treinta y cuatro";
                case 35 -> "treinta y cinco";
                case 36 -> "treinta y seis";
                case 37 -> "treinta y siete";
                case 38 -> "treinta y ocho";
                case 39 -> "treinta y nueve";

                // 40–49
                case 40 -> "cuarenta";
                case 41 -> "cuarenta y uno";
                case 42 -> "cuarenta y dos";
                case 43 -> "cuarenta y tres";
                case 44 -> "cuarenta y cuatro";
                case 45 -> "cuarenta y cinco";
                case 46 -> "cuarenta y seis";
                case 47 -> "cuarenta y siete";
                case 48 -> "cuarenta y ocho";
                case 49 -> "cuarenta y nueve";

                // 50–59
                case 50 -> "cincuenta";
                case 51 -> "cincuenta y uno";
                case 52 -> "cincuenta y dos";
                case 53 -> "cincuenta y tres";
                case 54 -> "cincuenta y cuatro";
                case 55 -> "cincuenta y cinco";
                case 56 -> "cincuenta y seis";
                case 57 -> "cincuenta y siete";
                case 58 -> "cincuenta y ocho";
                case 59 -> "cincuenta y nueve";

                // 60–69
                case 60 -> "sesenta";
                case 61 -> "sesenta y uno";
                case 62 -> "sesenta y dos";
                case 63 -> "sesenta y tres";
                case 64 -> "sesenta y cuatro";
                case 65 -> "sesenta y cinco";
                case 66 -> "sesenta y seis";
                case 67 -> "sesenta y siete";
                case 68 -> "sesenta y ocho";
                case 69 -> "sesenta y nueve";

                // 70–79
                case 70 -> "setenta";
                case 71 -> "setenta y uno";
                case 72 -> "setenta y dos";
                case 73 -> "setenta y tres";
                case 74 -> "setenta y cuatro";
                case 75 -> "setenta y cinco";
                case 76 -> "setenta y seis";
                case 77 -> "setenta y siete";
                case 78 -> "setenta y ocho";
                case 79 -> "setenta y nueve";

                // 80–89
                case 80 -> "ochenta";
                case 81 -> "ochenta y uno";
                case 82 -> "ochenta y dos";
                case 83 -> "ochenta y tres";
                case 84 -> "ochenta y cuatro";
                case 85 -> "ochenta y cinco";
                case 86 -> "ochenta y seis";
                case 87 -> "ochenta y siete";
                case 88 -> "ochenta y ocho";
                case 89 -> "ochenta y nueve";

                // 90–99
                case 90 -> "noventa";
                case 91 -> "noventa y uno";
                case 92 -> "noventa y dos";
                case 93 -> "noventa y tres";
                case 94 -> "noventa y cuatro";
                case 95 -> "noventa y cinco";
                case 96 -> "noventa y seis";
                case 97 -> "noventa y siete";
                case 98 -> "noventa y ocho";
                case 99 -> "noventa y nueve";

                default -> "Número no válido";
            };
        }

        System.out.println(  resultado);
        
    }
    
}
