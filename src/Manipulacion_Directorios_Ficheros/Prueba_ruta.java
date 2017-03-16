
package Manipulacion_Directorios_Ficheros;

import java.io.File;

public class Prueba_ruta {

   
    public static void main(String[] args) {
       
        File archivo=new File("ejemplo_ruta");
        
        
        
        System.out.println(archivo.getAbsolutePath());//getAbsolutePath (devuelve la ruta absoluta especificada la instancia de File)
        //en este caso devuelve la ruta de la carpeta del proyecto aunque el archivo no exista
        
        
        
        System.out.println(archivo.exists());//exists (devuelve un boolean si existe o no)
        
        
    }
    
}
