
package Hilos_Threads.Ejercicio_Banco;


public class EjecucionTransferencias implements Runnable {

    /**
     * Constuctor
     * @param b 
     * @param de cuenta origen
     * @param max maximo a transferir
     */
    public EjecucionTransferencias(Banco b,int de,double max){
    
        this.banco=b;
        this.deLaCuenta=de;
        this.cantidadMax=max;
  }
    
    
    
    @Override
    public void run() {
     
        try{
         while(true){
          
             int paraLaCuenta=(int)(100*Math.random());//establece de forma aleatoria la cuenta de destino
             
             double cantidad=cantidadMax*Math.random();//valor maximo a transferir
         
             banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
             
             Thread.sleep((int)(Math.random()*10));
         }
        }catch(InterruptedException ex){ }
        
    }

    
    
    private Banco banco;
    private int deLaCuenta;//cuenta de la que parte (origen)
    private double cantidadMax;
    
}
