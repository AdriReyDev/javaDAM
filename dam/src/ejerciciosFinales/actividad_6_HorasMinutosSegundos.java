package ejerciciosFinales;

import java.util.Scanner; //importa Scanner

public class actividad_6_HorasMinutosSegundos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Inicia el scanner

        System.out.println("Introduce los segundos: "); // Pide al usuario los segundos

        double seg = sc.nextDouble(); // se declara la variable seg

        double horas = seg / 3600; // se declara la variable horas

        double min = seg / 60; // se declara la variable minutos

        // Se imprime el resultado en una cadena de texto formateada.
        System.out.println(String.format("En %f seg hay %.2f seg , %.2f min, %.2f h. ", seg, seg, min, horas));

        sc.close(); // cierre del Scanner

    }

}
