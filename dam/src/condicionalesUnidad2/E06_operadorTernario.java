//6. Utiliza el operador ternario para calcular el valor absoluto de un número introducido por
//teclado.
package condicionalesUnidad2;

import java.util.Scanner;
public class E06_operadorTernario {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        
        int numero = sc.nextInt();
        
        int absoluto = (numero >= 0) ? numero : -numero;
        
        System.out.printf("El valor absoluto de %d es %d ", numero, absoluto);

    }
    
}
