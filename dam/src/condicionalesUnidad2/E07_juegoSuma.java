/* 7. Realiza el «juego de la suma»: aparecen dos números aleatorios entre 1 y 99 y el usuario
debe sumarlos. La aplicación indicará si el resultado es correcto o incorrecto.*/
package condicionalesUnidad2;

import  java.util.Scanner;

public class E07_juegoSuma {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Van a aparecer dos numeros aleatorios y debes sumarlos" );
        
       int random1 = (int) (Math.random() * 100) - 1;
       
       int random2 = (int) (Math.random() * 100) - 1;
       
        System.out.printf("%d y %d \n",random1, random2);
    
        int suma = (random1 + random2);
        
        System.out.println("Introduce el resultado de la suma: ");
        
        int resultado = sc.nextInt();
        
       String respuesta =  (resultado == suma) ? "Verdadero" : "Falso";
       
        System.out.println("El resultado es " + respuesta);
        
        
        
    }
    
}
