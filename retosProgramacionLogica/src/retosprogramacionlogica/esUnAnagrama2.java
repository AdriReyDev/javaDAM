/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
package retosprogramacionlogica;

import java.util.Scanner;
public class esUnAnagrama2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la primera palabra: ");
        
        String palabra1 = sc.next();
        
        
        
        System.out.println("Introduce la segunda palabra: ");
        
        String palabra2 = sc.next();
       
      boolean resultado;
        
        if (((palabra1.length()) == (palabra2.length())) && !(palabra1.equals(palabra2)) ){
           
            for (int i = 0; i < palabra2.length(); i++) {
             
              resultado = (palabra1.contains(String.valueOf(palabra2.charAt(i))));  
           
             }
           
 
            }
            
            
            
            
            //System.out.println( palabra1.contains(String.valueOf(palabra2.charAt(0))));
                   
           
            
            }
   
        }      
       
        }
        
        
                
                
        
    }
    
}
