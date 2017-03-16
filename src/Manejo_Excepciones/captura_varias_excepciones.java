/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejo_Excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author juan camilo
 */
public class captura_varias_excepciones {

 
    public static void main(String[] args) {
       // para poder conocer errores de forma mas concreta utilizamos la captura de varias excepciones para saber de que va el error
        
       
       try{
        division();
       }catch(ArithmeticException e)
       { 
           System.out.println("Estas dividiendo por 0 y no es permitido");
           
           System.out.println("Se ha producido un Error de tipo " +e.getClass().getName());
       }catch(NumberFormatException e)
       {
           JOptionPane.showMessageDialog(null, "No ingresaste un numer o entero");
           System.out.println(e.getMessage());//las excepciones tambien cuentan con metodos para que se pueda conocer que tipo de alerta lanza
       }
       
    }
    
    
    static void division(){
    int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce dividendo "));
    int num2=Integer.parseInt(JOptionPane.showInputDialog("introduce divisor"));
    System.out.println("el resultado es : "+ num1/num2);
    }
}
