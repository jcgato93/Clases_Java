/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import javax.swing.*;



public class Creando_marcos {

  
    public static void main(String[] args) {
      
        miMarco marco1=new miMarco();
        
        marco1.setVisible(true);//determina si se visualiza
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//determina accion del boton de cerrar ventana(X)
    }
    
}

class miMarco extends JFrame{//crear una clase que hereda de la clase JFrame
    
    public miMarco(){//metodo  constructor
        setSize(500,300);//setSize para determinar el tamaño del Marco
        
        setLocation(500, 300);//setLocation determina la posicion inicial de la pantalla
        
//        setBounds(500, 300,250,250);//setBounds construye la ventana con tamaña y posicion
        
        setResizable(false);//para permitir o no , redimensionar la ventana
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);//setExtendedState es para ajustar el ampliar la pantalla
        
        setTitle("titulo ");//setTitle   para dar un titulo a la ventana que aparece en el borde superior
        
    }



}
