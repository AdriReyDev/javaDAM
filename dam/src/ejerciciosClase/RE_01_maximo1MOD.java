/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import java.util.Scanner;

public class RE_01_maximo1MOD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");

        int numb1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");

        int numb2 = sc.nextInt();

        System.out.println("Introduce el tercer numero");

        int numb3 = sc.nextInt();

        System.out.println("El numero mayor es: " + maximo(numb1, numb2, numb3));

    }
    
    static int maximo(int m1, int m2, int m3) {

        int max;

        int max1 = Math.max(m1, m2);

        int max2 = Math.max(max1, m3);

        if (max1 < max2) {

            max = max2;

        } else {

            max = max1;

        }
        return max;
    }
    
}
    
