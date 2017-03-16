
package clases_java;


public class Uso__Matriz {
    
    
    
    public static void main(String[] args){
    int [][] matriz=new int[4][5];
    
    for(int i=0;i<matriz.length;i++){
    for(int j=0;j<matriz.length;j++){
    matriz[i][j]=(int)Math.round(Math.random()*20);
    }
    
    }
    
//    for(int k=0;k<4;k++){
//        System.out.println("");
//    for(int l=0;l<5;l++){
//       
//        
//    System.out.print(matriz[k][l]+" ");
//   
//    
//    }
//    
//    }
    
    
    //con el uso del bucle for-each
    
    for(int[]fila:matriz){
        System.out.println("");
    for (int z:fila){
    
    System.out.print(z+" ");
    }
    }
    
    }
}
