package condicionalesUnidad2;

import java.util.Scanner;

public class E05_areaTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");

        var base = sc.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        
        var altura = sc.nextDouble();
        
        if (base > 0 && altura > 0){
        
            System.out.println("El area del triángulo es : " + (base * altura) / 2);
        
        }else{
        
            System.out.println("Los datos introducidos no pueden ser negativos");
            
        }
        
    }

}
