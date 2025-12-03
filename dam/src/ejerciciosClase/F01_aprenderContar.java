package ejerciciosClase;

import java.util.Scanner;
public class F01_aprenderContar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero y contaremos desde el numero 1: ");
        
        int n = sc.nextInt();
        
        for (int i = 1; i < n + 1; i++) {
            
            System.out.println(i);
            
        }
        
    }
    
}
