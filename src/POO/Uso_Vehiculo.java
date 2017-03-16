/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author juan camilo
 */
public class Uso_Vehiculo {
    
    public static void main(String[] args){
    
        Coche auto1=new Coche();
        auto1.establece_color("Rojo");
        
        Furgoneta mifurgoneta1=new Furgoneta(7, 580);
        
        mifurgoneta1.establece_color("Azul");
        mifurgoneta1.configura_asientos("si");
        mifurgoneta1.configura_aire("si");
        
        System.out.println("Datos del automovil"+auto1.dime_color()+"\n"+auto1.caracteristicas_coche()+"\n"+auto1.dime_peso_total());
        System.out.println("\nDatos de la furgoneta \n"+mifurgoneta1.dime_color()+"\n"+mifurgoneta1.caracteristicas_coche()+"\n"+mifurgoneta1.dime_peso_total()
                +"\n"+mifurgoneta1.dimeDatosFurgoneta());
        
        
        
//   Coche spark=new Coche();
//   
//   spark.establece_color(JOptionPane.showInputDialog("Intruduce el color"));
//   System.out.println(spark.dime_color()+"\n");
//   System.out.println(spark.caracteristicas_coche());
//   
//   
//   spark.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
//   System.out.println(spark.dime_asientos());
//   
//   spark.configura_aire(JOptionPane.showInputDialog("Tiene aire acondicionado?"));
//   System.out.println(spark.dime_aire());
//   
//   System.out.println(spark.dime_peso_total()+"Kg");
//   System.out.println("El precio del coche es "+spark.precio_coche());




    }
}
