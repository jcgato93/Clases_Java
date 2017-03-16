
package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;


public class Eventos_Mouse {

  
    public static void main(String[] args) {
       
        
        MarcoRaton mimarco=new MarcoRaton();
        
        
    }
    
}

class MarcoRaton extends JFrame{
 public MarcoRaton(){
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBounds(600,300,650,450);
     
     EventoRaton eventoraton=new EventoRaton();
     addMouseListener(eventoraton);
     
     EventoRaton2 eventorato2=new EventoRaton2();
     addMouseMotionListener(eventorato2);
 }
}

class EventoRaton implements MouseListener{// esta tambien se puede usar con MouseAdapter para no llamar todos los metodos

    
    public void mouseClicked(MouseEvent me) {
    
        System.out.println("diste click una vez \n se desencadena accion cuando baja y sube el boton ");
     System.out.println("la posicion  X :"+me.getX()+"la posicion Y : "+me.getY());
     System.out.println("el numero de clicks es :"+me.getClickCount());
    System.out.println("devuelve el valor final o static que representa el boton que se clickea"+me.getModifiers());
    
    if(me.getModifiers()==8 || me.getModifiers()==MouseEvent.BUTTON3_DOWN_MASK){System.out.println("diste click en el boton de la rueda del mouse");
    }
    else if(me.getModifiers()==16 || me.getModifiers()==MouseEvent.BUTTON1_DOWN_MASK){
        System.out.println("diste click en el boton izquido del raton ");
        }
    
    else if(me.getModifiers()==4 || me.getModifiers()==MouseEvent.BUTTON2_DOWN_MASK){
          System.out.println("diste click en el boton derecho del raton");
         }
        
    }
    
    public void mousePressed(MouseEvent me) {
     
       System.out.println("Cuando se da click la accion se da cuando baja");
    
    }


    public void mouseReleased(MouseEvent me) {
       System.out.println("Cuando se da click la accion se da cuando sube el boton del raton");

       }

    
    public void mouseEntered(MouseEvent me) {
   
        System.out.println("cuando esta dentro del harea del MouseListener es decir el area de escucha");
    }

   
    public void mouseExited(MouseEvent me) {
        System.out.println("cuando sale del area de escucha ");
   
    }
 

}


class EventoRaton2 implements MouseMotionListener{//tambien tiene un Adapter

    
    public void mouseDragged(MouseEvent me) {
    System.out.println("estas arrastrando con el raton");
    }

    
    public void mouseMoved(MouseEvent me) {
    System.out.println("estas moviendo el raton");
    }

}