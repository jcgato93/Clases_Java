
package Manipulacion_Directorios_Ficheros;

import java.io.File;

public class Listar_objetos_enla_ruta {

   
    public static void main(String[] args) {
        
        
        File ruta=new File("C:/Users/juan camilo/Desktop");
        
        System.out.println(ruta.getAbsolutePath());
        System.out.println(ruta.exists());
        
        String[] lista_carpeta=ruta.list();// para listar el contenido de un directorio se usa el metodo list() de la clase File (devuelve un array de String)
        
        for(int i=0;i<lista_carpeta.length;i++)//con este ciclo se muestran todos los archivos
        {
        System.out.println(lista_carpeta[i]);//para mostrar los nombres de los archivos listados
        
        File f=new File(ruta.getAbsolutePath(), lista_carpeta[i]);//este es otro constructo que necesita la ruta de la carpeta padre y luego las subcarpetas
        
                if(f.isDirectory()){ //if el archivo en el indice [i] es una carpeta(listar los archivos de esa subcarpeta)
                    String[] archivos_subcarpeta=f.list();
                    for(int j=0;j<archivos_subcarpeta.length;j++){
                    System.out.println(archivos_subcarpeta[j]);
                    
                    }
                    
                }
        
        }
        
    }
    
}
