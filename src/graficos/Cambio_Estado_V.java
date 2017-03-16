
package graficos;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.*;

public class Cambio_Estado_V {

   
    public static void main(String[] args) {
      
         MarcoEstado mimarco=new MarcoEstado();
         
         
    }
    
}
class MarcoEstado extends JFrame{
 public MarcoEstado (){
     setVisible(true);
     setBounds(300, 300, 500, 350);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setTitle("Estado Ventana");
     
     CambiaEstado nuevo_estado = new CambiaEstado();
     addWindowStateListener(nuevo_estado);
 }
}

class CambiaEstado implements WindowStateListener{

    public void windowStateChanged(WindowEvent we) {
        System.out.println("la ventana cambio de estado");
        System.out.println(we.getNewState());
    }

}