
package Programacion_Generica;
import java.util.*;

public class arraylist {

   
    public static void main(String[] args) {
       
    ArrayList<String>nombre=new ArrayList<>();//arraylist tambien permite instanciar variable de tipo objeto
     
   // nombre.ensureCapacity(3);//con este metodo podemos establecer la cantidad de elementos que debe tener el arraylist, aunque no siempre es necesario
       
   
//para establecer una posicion en concreto utilizamos el metodo set(0,objeto que se le pasa), en el add indicarla posicion
    try{
    nombre.add("Juan");
    nombre.add(0,"esteban");
    nombre.add("pablo");
    }catch(Exception e){}
    //para ver una posicion en concreto se usa el metodo get
    System.out.println(nombre.get(1));
    
    System.out.println(nombre.size());//size devuelve la cantidad de elementos en el arraylist
    
    
    //la mejor forma de recorrer un arraylist es con un bucle foreach
//    for(String s:nombre){
//    System.out.println(nombre);
//    }

//para recorrer con un bucle for
for (int i = 0; i <nombre.size(); i++) {
    System.out.println(nombre.get(i));
            
        }
        
    }
    
}
