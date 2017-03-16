/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventos {

    public static void main(String[] args) {
     
        MarcoBotones mimarco=new MarcoBotones();
        
        
    }
    
}

class MarcoBotones extends JFrame{
 public MarcoBotones(){
 
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBounds(700,300, 500, 300);
     setTitle("Evento Botones");
     LaminaBotones milamina=new LaminaBotones();
     add(milamina);
 
 }}
 
 class LaminaBotones extends JPanel implements ActionListener{//se implementa la interface ActionListener 
 
 JButton botonazul=new JButton("Azul");//se crea instancia de la clase JButton
 JButton botonamarillo=new JButton("Amarillo");
 JButton botonrojo=new JButton("Rojo");
     public LaminaBotones(){//metodo constructor
     add(botonazul);
     add(botonamarillo);
     add(botonrojo);
     botonazul.addActionListener(this);//se indica sobre que se realizara la accion , en este caso en la misma clase "this"
     botonamarillo.addActionListener(this);
     botonrojo.addActionListener(this);
     }


public void actionPerformed(ActionEvent e){//se reescribe el metodo actionPerformed de la clase ActionListener 
   
    Object botonPulsado=e.getSource();//getsource es un metodo de ActionEvent ,captura el origen del evento
    
    if(botonPulsado==botonazul){
    setBackground(Color.blue);//cambiar color 
    }
    else if(botonPulsado==botonamarillo){
        setBackground(Color.yellow);
    }
    else if(botonPulsado==botonrojo){
        setBackground(Color.red);
    }
    
    }
 }
 

//action , es lo mismo que decir al hacer click
//Listener (escucha), el objeto donde tendra efecto

 
