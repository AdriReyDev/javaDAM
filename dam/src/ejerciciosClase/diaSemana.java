package ejerciciosClase;

/*Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
correspondiente a un día de la semana. Se debe mostrar el nombre del día de la
semana al que corresponde. Por ejemplo, el número 1 corresponde a “lunes” y el 6 
a “sábado”.*/
import java.util.Scanner;

public class diaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de un dia de la semana: ");

        int num = sc.nextInt();

        String diaSemana = switch (num) {

            case 1 ->
                "Lunes";
            case 2 ->
                "Martes";
            case 3 ->
                "Miercoles";
            case 4 ->
                "Jueves";
            case 5 ->
                "Viernes";
            case 6 ->
                "Sabado";
            case 7 ->
                "Domingo";
            default ->
                "No existe ese dia de la semana";
        };
        
        System.out.println("Ese dia de la semana es " + diaSemana);
    }   
    

}
