/* 8. Modifica la actividad anterior para que no solo se generen dos números aleatorios, sino
también la operación que debe realizar el jugador: suma, resta o multiplicación.*/
package condicionalesUnidad2;

import  java.util.Scanner;

public class E08_juegoSumaMod {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Van a aparecer dos numeros aleatorios y la operacion que debes realizar" );
        
       int random1 = (int) (Math.random() * 100) - 1;
       
       int random2 = (int) (Math.random() * 100) - 1;
       
       int operador =  (int) (Math.random() * 3) ;
              
       int operacion = 0; 
            
       String nombreOperador = "";
                     
       if (operador == 0) {
           
           operacion = random1 + random2;
           
           nombreOperador = " + ";
                                 
       }else if (operador == 1) {
       
           operacion = random1 - random2;
           
           nombreOperador = " - ";

       }else if(operador == 2){
       
           operacion = random1 * random2;
           
           nombreOperador = " * ";
           
       }
       
        System.out.printf("Los numeros son %d y %d y la operacion es : " + nombreOperador, random1, random2);
        
        System.out.println("\nIntroduce tu respuesta: ");
        
        int resultado = sc.nextInt();
        
        String respuesta = (resultado == operacion) ? " El resultado es correcto " : " El resultado es incorrecto ";
        
        System.out.println(respuesta);
                            
    }
    
}
