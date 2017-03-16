//cualquier duda ,ir a la API en la clase File 
package Manipulacion_Directorios_Ficheros;

import java.io.*;


public class Eliminar_Carpetas_Ficheros {

 
    public static void main(String[] args) {
        
         File nueva_ruta=new File("C:/Users/juan camilo/Desktop/nueva carpeta");
         
        
        System.out.println(nueva_ruta.exists());
        nueva_ruta.delete();//para borrar carpetas o ficheros 
   
    }
    
}
