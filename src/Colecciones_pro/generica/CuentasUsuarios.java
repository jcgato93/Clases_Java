
package Colecciones_pro.generica;

import java.util.HashSet;
import java.util.Set;


public class CuentasUsuarios {

   
    public static void main(String[] args) {
       
        
        Cliente cl1=new Cliente("Antonio Banderas","00001",200000);
        
        Cliente cl2=new Cliente("Jessica paz","00002",250000);
        
        Cliente cl3=new Cliente("Penelope Cruz","00003",300000);
        
        Cliente cl4=new Cliente("Julio Iglesias","00004",500000);
        
        
  /**
   *---------------------------------------
   * Creando la Coleccion                  |
   * --------------------------------------
   */      
        
  Set <Cliente> clientesBanco=new HashSet<Cliente>(); //se hace una instancia a la clase HashSet que implementa la interface Set
  
  //se agregan a la coleccion objetos de tipo Cliente
  clientesBanco.add(cl1);
  clientesBanco.add(cl2);
  clientesBanco.add(cl3);
  clientesBanco.add(cl4);
        
        
        for (Cliente cliente : clientesBanco) { //recorre todos los objetos de tipo cliente que estan en la coleccion clientesBanco
            
            System.out.println(cliente.getNombre()+" "
                    +cliente.getN_cuenta()+" "+cliente.getSaldo());
            
        }
  
  
    }
    
}
