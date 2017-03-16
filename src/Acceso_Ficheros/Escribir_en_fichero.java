
package Acceso_Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Escribir_en_fichero {

    
    public static void main(String[] args) {
       Escribiendo accede=new Escribiendo();
       
       accede.Escribiendo();
        
    }
    
}

class Escribiendo{
 
    public void Escribiendo(){
        FileWriter escritura=null;
        try {
            String frase="esto es una prueba";
            escritura = new FileWriter("C:/Users/juan camilo/Desktop/nuevo_texto.txt",true);//se coloca true para indicar que el archivo ya existe, si se quita, la instruccion crea el fichero
            /**
             * el bucle escribe cada caracter de la variable String 
             */
            for(int i=0;i<frase.length();i++)
            {
            escritura.write(frase.charAt(i));
            
            
            }
        } catch (IOException ex) {
            Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escritura.close();//cierra el flujo de datos ,por la apertura del 
            } catch (IOException ex) {
                Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }

}
