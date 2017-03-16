
package Programacion_Generica;
import POO.*;

public class Metodos_Genericos_Propios {

    
    public static void main(String[] args) {
        
        String nombres[]={"juan","camilo","catillo","saucedo"};
        
        String elementos=MisMAtrices.getElementos(nombres);
        
        System.out.println(elementos);
        
        
        
        //prueba con array de un objeto persona
        
        Persona listaPersonas[]={
            new Persona("juan","castillo", 23,1993),
            new Persona("juan","castillo", 23,1993),
            new Persona("juan","castillo", 23,1993),
            new Persona("juan","castillo", 23,1993),
             new Persona("juan","castillo", 23,1993),
              new Persona("camilo","castillo", 23,1993)
        };
    
//uso del metodo que devuelve el elemento menor
System.out.println(MisMAtrices.getMenor(nombres));

    
    
    }//fin del metodo main
    
}


class MisMAtrices{
 /**
  * METODO GENERICO
  * @param <T>
  * @param a
  * @return 
  */
    public static <T>String getElementos(T[]array){
    
        
        return "La matriz tiene "+array.length+" elementos"; 
    }
    
    
    //en caso de que queramos que nos devuelva un elemento generito 
    
    
    //este metodo devuelve el elemento menor de un array
    //para poder usar el metodo "compareTo" es necesacio implementar la interface 
    //"Compare" en este caso en el tipo de dato generico pero con extends en ves de implements
    //es obligatorio que el array que se le pase este implementando Comparable o marcara error
    public static <T extends Comparable> T getMenor(T[]array){
    
        if(array==null || array.length==0){
        return null;
        }
       T elementoMenor=array[0];
        for (int i = 0; i <array.length; i++) {
            if(elementoMenor.compareTo(array[i])>0){
            elementoMenor=array[i];
            }
        }
        return elementoMenor;
    }

}