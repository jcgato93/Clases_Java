
package Acceso_Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class buffer_lee {

     public static void main(String[] args) {
       
       buffer_lectura accede=new buffer_lectura();
        
        accede.lee();
    }
    
}

class buffer_lectura{
  
    public void lee() {
    
        try { 
            FileReader entrada=new FileReader("C:/Users/juan camilo/Desktop/acceso paladins.txt");
        
            BufferedReader mibuffer=new BufferedReader(entrada);
            
            String linea="";
            
            while(linea!=null){
            
                linea=mibuffer.readLine();   //le pása al String toda la linea que lee
           
            System.out.println(linea);
            }
            
           entrada.close();//se debe cerra el flujo de datos del Strem ,es decir el acceso al fichero externo
           
        } catch (IOException ex) {
            
            System.out.println("No se encontro el archivo");
        }
    }

}
