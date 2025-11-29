/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosFinales;

import java.util.Scanner;


public class actividad_3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // iniciamos la variable Scanner

        System.out.print("Introduce un numero: ");

        int num = sc.nextInt(); // El usuario introduce un número entero

        
        
        System.out.print("Introduce otro numero: ");
        
        int numM = sc.nextInt();
        

        int num2 = num; // Variable que se va a actualizar  del numero introducido
        
        
        //inicio del bucle
        do {

            num2++; // operacion unaria mientras while no sea true

        } while ((num2 % numM) != 0); // condicinal que se tiene que cumplir para para el bucle

        int resta = num2 - num; // resta del nuevo multiplo menos numero original

        // impresion de los valores formateados
        System.out.println(String.format("A %d hay que sumarle %d para que el resultado (%d + %d = %d) sea múltiplo de %d.", num, resta, num, resta, num2,numM));

        sc.close();
    }

    
}
