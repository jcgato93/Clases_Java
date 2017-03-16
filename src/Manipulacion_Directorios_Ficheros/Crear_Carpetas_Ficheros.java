
package Manipulacion_Directorios_Ficheros;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crear_Carpetas_Ficheros {

   
    public static void main(String[] args) {
        
        try {
            File nueva_ruta=new File("C:/Users/juan camilo/Desktop/nueva carpeta");
            
            nueva_ruta.mkdir();//crea otra carpeta segun como aparezca en la instancia de File
            
            
            //para crear un fichero
            
            File nuevo_fichero=new File("C:/Users/juan camilo/Desktop/nueva carpeta/fichero.txt");
            
            nuevo_fichero.createNewFile();
            
        } catch (IOException ex) {
           System.out.println("Error , no se pudo crear archivo \nLa ruta no existe");
        }
        
    }
    
}
