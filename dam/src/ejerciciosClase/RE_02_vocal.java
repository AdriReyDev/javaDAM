/*
 2. Crea una función que, mediante un booleano, indique si el carácter que se pasa
como parámetro de entrada corresponde con una vocal.
 */
package ejerciciosClase;

import java.util.Scanner;

public class RE_02_vocal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      

        System.out.println("Introduce una letra para saber si es una vocal: ");

        String newVocal = sc.next();
        
        
        
       if( vocal(newVocal)){
       
           System.out.println("El parametro corresponde con una vocal.");
       
       }else{
       
           System.out.println("El parametro no corresponde con una vocal.");
           
       }
  
    }
static boolean vocal(String letraVocal){
    
String vocal = "aeiou";
       
   boolean  respuesta = vocal.contains(letraVocal);
     
        return respuesta;
    }
    
}



