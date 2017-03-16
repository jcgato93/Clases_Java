
package Acceso_Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lee_fichero {

 
    public static void main(String[] args) {
       
        Leer_Fichero accede=new Leer_Fichero();
        
        accede.lee();
    }
    
}

class Leer_Fichero{
  
    public void lee() {
    
        try { 
            FileReader entrada=new FileReader("C:/Users/juan camilo/Desktop/acceso paladins.txt");
        
            int c=0;   //El metodo read() deuelve un entero , cuando termina de leer el fichero devuelve un -1
            
            while(c!=-1){
            
                c=entrada.read();
            char letra=(char)c;
            System.out.print(letra);
            }
            
           entrada.close();//se debe cerra el flujo de datos del Strem ,es decir el acceso al fichero externo
           
        } catch (IOException ex) {
            
            System.out.println("No se encontro el archivo");
        }
    }

}