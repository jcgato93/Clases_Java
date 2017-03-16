
package clases_java;


public class Bucle_for_each {

  public static void main(String[] args){
  
//  String[] paises=new String[8];
//  
//  paises[0]="España";
//  paises[1]="Mexico";
//  paises[2]="Colombia";
//  paises[3]="Peru";
//  paises[4]="Brasil";
//  paises[5]="Chile";
//  paises[6]="Venezuela";
//  paises[7]="Bolivia";
  
  
String[] paises={"España","Mexico","Colombia","Peru","Brasil","Chile","Venezuela","Bolivia"};
  //una forma de recorrerlo con el metodo lengt
  
//  for(int i=0;i<paises.length;i++){
//  
//  System.out.println(paises[i]);
//  }
  
for(String recorrer:paises){  //el ciclo for-each se usa declarando una variable del mismo tipo de la matriz
   
   
  
System.out.println(recorrer);
   
   }


  
  }


    
}
