/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosFinalesBucles;

import java.util.Scanner;

public class F02_binarioMod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero decimal: ");

        int numb = sc.nextInt();

        double operacion = 0;

        int resto = 0;

        int suma = 0;

        for (int i = 0; numb > 0; i++) {

            resto = (numb % 10) * 2; // devuelve el ultimo numero
            
            numb /= 10; // le quita a numb el ultimo numero

            operacion = Math.pow(resto, i);

            if (resto != 0) {
                suma += operacion;
            }

        }
        
        System.out.println("El numero decimal es:  " + suma);

    }

}
