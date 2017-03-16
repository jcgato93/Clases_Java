
package clases_java;

import java.util.*;

public class Clase_scanner {
    
    
      public static void main(String[] args){
      
      Scanner lector=new Scanner(System.in);
      
      String nombre;
      
      System.out.println("Introduce tu nombre por favor :");
      nombre=lector.nextLine();
      
      System.out.println("Introduce tu edad, por favor :");
      int edad=lector.nextInt();
      
      System.out.println("Hola "+nombre+" el año que viene tendras "+(edad+1)+" años");
      
      
      
      
      
      
      
      
      
      
      
      }
    
    
    
}
