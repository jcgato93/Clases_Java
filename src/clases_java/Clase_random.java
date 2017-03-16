
package clases_java;

import java.util.Random;

public class Clase_random {
    
    
    
    public static void main(String[] args){
    
        Random aleatorio=new Random();
        
        int [] vector=new int[105];
        
        
//        for(int i=0;i<vector.length;i++){
//        
//        vector[i]=aleatorio.nextInt(100);
//        
//        }

for(int i=0;i<vector.length;i++){

  vector[i]=(int)Math.round(Math.random()*100);//el metodo random de la clase math devuelve un dooble por eso hay que hacer la refundicion
}
    
    for(int lector:vector){
    
    System.out.println(lector);
    }
    
    }
}
