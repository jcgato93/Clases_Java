
package graficos;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Eventos_Ventana {

 
    
    public static void main(String[] args) {
      
        MarcoVentana mimarco=new MarcoVentana();
        
    }
    
}

class MarcoVentana extends JFrame{
 public MarcoVentana (){
     setVisible(true);
     setBounds(300, 300, 500, 350);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setTitle("Respondiendo");
     
     M_Ventana oyente_ventana=new M_Ventana();
     
     addWindowListener(oyente_ventana);
     
 }

}

class M_Ventana extends WindowAdapter{ // heredando la clase WindowAdapter se ahorra el tener que declarar todos los metodos de la interface Listerne
//    public void windowActivated(WindowEvent e){}
//    public void windowClosed(WindowEvent e){}
//    public void windowClosing(WindowEvent e){}
//    public void windowDeactivated(WindowEvent e){}
//    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){
    System.out.println("Ventana minimizada");
    }
   
    

}
