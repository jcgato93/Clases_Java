
package graficos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos_teclado {

  
    public static void main(String[] args) {
      
        MarcoTeclas mimarco=new MarcoTeclas();
        
        
        
    }
    
}

class MarcoTeclas extends JFrame{
     public MarcoTeclas(){
         setVisible(true);
         setBounds(700,300,650,450);
         setTitle("Eventos Teclado");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         EventoDeTeclado tecla=new EventoDeTeclado();
         addKeyListener(tecla);//se coloca a la escucha 
     }

}

class EventoDeTeclado extends KeyAdapter{// tambien esta la interface KeyListener pero si no se usan todos los metodos no hay necesidad de usarla 

   
    public void keyTyped(KeyEvent ke) {
     
    }

    
    public void keyPressed(KeyEvent ke) {
     int codigo=ke.getKeyCode();
    System.out.println(codigo);
    }

    
    public void keyReleased(KeyEvent ke) {
    char letra_presionada=ke.getKeyChar();
    System.out.println(letra_presionada);
    }

    
  
   

}
