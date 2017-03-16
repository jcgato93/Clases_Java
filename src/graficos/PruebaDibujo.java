/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaDibujo {

   
    public static void main(String[] args) {
       
    }
    
}

class MarcoConDibujos extends JFrame{

 public MarcoConDibujos(){
 
     setVisible(true);
     setSize(400,400);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setTitle("titulo");
     LaminaConFiguras miLamina=new LaminaConFiguras();
     
     add(miLamina);
 
 
 }
}

/**
 * 
 * Con esta clase se da el ejemplo de como crear una lamina dentro del Frame
 */
class LaminaConFiguras extends JPanel{//hereda de JPanel

   public void paintComponent(Graphics g){
       
       super.paintComponent(g);
       
//       g.drawRect(50, 50, 200,200);//para dibujar un cuadrado 
//       
//       //La clase Graphics Tiene otros muchos mas metodos para dibijar figuras

    

}

}