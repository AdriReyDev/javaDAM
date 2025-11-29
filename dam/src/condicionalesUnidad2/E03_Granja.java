package condicionalesUnidad2;

import java.util.Scanner;

public class E03_Granja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce kg comida a comprada:  ");

        int comidaDiaria = sc.nextInt();

        System.out.print("Introduce el número de animales a alimentar: ");

        int numAnimales = sc.nextInt();

        System.out.print("Introduce la media de kg que come cada animal: ");

        int kilosPorAnimal = sc.nextInt();

        int kgNecesarios = numAnimales * kilosPorAnimal;

        double racion = (kgNecesarios - comidaDiaria) / numAnimales;

        if (comidaDiaria < kgNecesarios && numAnimales != 0 ) {

            System.out.printf("La comida comprada no alcanza, la racion que le toca a cada animal es de : %.2f  kg", racion);

        } else if (comidaDiaria >= kgNecesarios) {

            System.out.println("La comida comprada alcanza para alimentar a los animales.");

        } else {

            System.out.println("No se puede dividir entre 0");

        }

    }

}
