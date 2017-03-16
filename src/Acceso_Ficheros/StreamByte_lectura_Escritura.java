
package Acceso_Ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StreamByte_lectura_Escritura {

   
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////////////////
        /**
         * con este se lee el archivo , se lee cada byte
         */
         int datos_entrada[]=new int[221032];
           boolean final_ar=false;
           int conta=0;
       try {
           FileInputStream archivo_lectura = new FileInputStream("C:/Users/juan camilo/Pictures/ironman.png");
           
          
           while(final_ar!=true){
           
           int byte_entrada=archivo_lectura.read();
           
           if(byte_entrada!=-1){
           datos_entrada[conta]=byte_entrada;
           }
           
           else{
              
               final_ar=true;
               System.out.print(datos_entrada[conta]);
               
                       
           
           }conta++;
           
           }
       archivo_lectura.close();
       } catch (IOException ex) {
           Logger.getLogger(StreamByte_lectura_Escritura.class.getName()).log(Level.SEVERE, null, ex);
    
       }
       
       System.out.print("\n"+conta);
        crear_fichero(datos_entrada);
       
    }
    
    ////////////////////////////////////////////////////////////////////////////////
    /**
     * crea el nuevo archivo con los datos de los bytes leidos 
     * @param datos_nuevo_fichero 
     */
    static void crear_fichero(int datos_nuevo_fichero[]){
       
        try {
            FileOutputStream nuevo_fichero=new FileOutputStream("C:/Users/juan camilo/Desktop/nuevo_imagen.png");
        
            for(int i=0;i<datos_nuevo_fichero.length;i++){
            nuevo_fichero.write(datos_nuevo_fichero[i]);
            }
        
        nuevo_fichero.close();
        } catch (IOException ex) {
            System.out.print("Error al crear el archivo");
        }
       }
}

