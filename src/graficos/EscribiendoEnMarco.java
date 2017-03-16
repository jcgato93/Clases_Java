
package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {
        
        MarcoConTexto mimarco=new MarcoConTexto();
        
        
        
    }
    
}

class Lamina extends JPanel{

public void paintComponent(Graphics g){
    super.paintComponent(g);
    
g.drawString("texto",100, 100);

}

}


class MarcoConTexto extends JFrame{
   
       public MarcoConTexto(){
       
           setVisible(true);
           setSize(600, 450);
           setLocation(400,200);
           setTitle("Marco texto");
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
           Lamina miLamina=new Lamina();
       add(miLamina);
       
       
       }
}
