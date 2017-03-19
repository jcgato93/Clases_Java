//Aplicacion de  Manejo de transacciones entre cuentas bancarias 
//Tendra 100 cuentas las cuales realizaran tranferencias infinitas
//utilizando la sincronizacion de hilos


package Hilos_Threads.Ejercicio_Banco;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class BancoSincronizar {
    
    public static void main(String[] args){
    
    
        Banco banco=new Banco();
        
        for (int i = 0; i <100; i++) {
            EjecucionTransferencias r=new EjecucionTransferencias(banco,i,2000 );
            
            Thread t=new Thread(r);
            
            t.start();
        }
        
    }
    
    
}



class Banco{
   
    public Banco(){
    
    cuentas=new double[100];
    //llena las cuentas con el numero de la cuenta
    //y llena cada cuenta con 2000
        for (int i = 0; i <cuentas.length; i++) {
             cuentas[i]=2000;
        }
    
    }
    
    
    /**
     * Metodo para realizar la transferencia entre una cuenta a otra
     * @param cuentaOrigen
     * @param cuentaDestino
     * @param cantidad 
     */
    public void transferencia(int cuentaOrigen,int cuentaDestino,double cantidad){
    
        cierreBanco.lock();//Cierra el hilo de ejecucion lo que impide que otro lo inicialice
        
        try{
        if (cuentas[cuentaOrigen]<cantidad) {//evalúa que el saldo no es inferior a la transferencia
            
            return;    
        }
        System.out.println(Thread.currentThread());//devuelve el hilo que esta ejecutando la transferencia para detectar posibles errores
        
        cuentas[cuentaOrigen]-=cantidad;//dinero que sale de la cuenta origen
    
         System.out.printf("%10.2f de %d para %d",cantidad,cuentaOrigen,cuentaDestino);       
         
         cuentas[cuentaDestino]+=cantidad;//incrementa la cantidad de la cuenta Destino
  
         System.out.printf("Saldo total: %10.2f%n ",getSaldoTotal());
         
        }finally{//si ocurre o no una excepcion 
            
            cierreBanco.unlock(); //Desbloquea el hilo de ejecucion 
        
        }
    }
    
   
    /**
     * Devuelve el saldo total al sumar todas las cuentas
     * @return 
     */
public double getSaldoTotal(){

    double suma_cuentas=0;
    for(double a: cuentas){
    
      suma_cuentas+=a;
    }
    
    return suma_cuentas;

}

    
    
private final double[] cuentas;

private Lock cierreBanco=new ReentrantLock();//Bloquea el codigo que este dentro de un hilo de ejecucion

}