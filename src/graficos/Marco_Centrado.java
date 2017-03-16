
package graficos;
import java.awt.*;
import javax.swing.*;


public class Marco_Centrado {


    public static void main(String[] args) {
        
        MarcoCentrado marco1=new MarcoCentrado();
        
        
    }
    
}

class MarcoCentrado extends JFrame{

 public MarcoCentrado(){//constructor del Frame
     
     Toolkit mipantalla=Toolkit.getDefaultToolkit();//se instancia la clase Toolkit y se utiliza el metodo para que tome las dimensiones de la pantalla anfitrion
      
     Dimension tamanoPantalla=mipantalla.getScreenSize();//se instancia la clase Dimension para tomar alto y ancho en pixeles con el metodo getScreenSize
     
     int alturaPantalla=tamanoPantalla.height;//guardo la altura en una variable
     int anchoPantalla=tamanoPantalla.width;//guarda el ancho de la pantalla
     
     setSize(alturaPantalla/2, anchoPantalla/4);
     
     setLocation(alturaPantalla/2,anchoPantalla/6);
     
     setVisible(true);
     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     setTitle("Marco Centrado");
     
     
     Image miIcono=mipantalla.getImage("src/graficos/archivo.png");//creo una variable imagen que contenga la ruta del archivo
     // solo acepta imagenes con extencion .png .jpg
     
     setIconImage(miIcono);
             
             

 
 }

}
