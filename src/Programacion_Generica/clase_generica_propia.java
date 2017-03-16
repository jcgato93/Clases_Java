
package Programacion_Generica;


import POO.*;


public class clase_generica_propia {


    public static void main(String[] args) {
       //la cuestion de la programacion generica ,es que el tipo de dato que reciben los metodos , se adapta segun como se ejemplarice la clase generica
        
        Pareja<String> una=new Pareja<String>();// se le instancia un objeto de tipo String
        
        una.setPrimero("Este objeto de tipo String");
        
        System.out.println(una.getPrimero());
        
        
        
       //////////////////////////////////////////////////////////////////
       Persona esta=new Persona("juan","castillo",23, 93);
        Pareja<Persona> otra=new Pareja<Persona>();//en esta se instancia un objeto de tipo Persona y se adapta a este
       
       otra.setPrimero(esta);
        System.out.println(otra.getPrimero());
        
        
    }
     
}

/**
 * Declaracion de una clase generica
 * @author juan camilo
 * @param <T> 
 */
 class Pareja<T>{

     
    Pareja (){
primero=null;
}
    

/**
 * 
 * @param nuevo_valor 
 */
    public void setPrimero(T nuevo_valor) {
        this.primero = nuevo_valor;
    }
    /**
     * 
     * @return  
     */
   public T getPrimero() {
        return primero;
    } 
   
   
 private T primero;

 
 }