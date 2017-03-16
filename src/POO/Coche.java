
package POO;

public class Coche {
    
   private  int ruedas;
   private  int ancho;
   private  int largo;
   private  int motor;
   private  int peso_plataforma;
   
   private  String color;
   private  int peso_final;
   private  boolean asientos_cuero,aire_acondicionado;
    
    public Coche(){
    ruedas=4;
    ancho=2000;
    largo=300;
    motor=1600;
    peso_plataforma=500;
    
    }
    
  public String caracteristicas_coche()
  {//con la llamada de este metodo se podran ver todas sus caracteristicas
  
  return "la plataforma tiene "+ruedas+" ruedas \n"+"mide "+largo+"metros \n"+"tiene un ancho de: "+ancho+"cm \n"
          +"un peso de plataforma: "+peso_plataforma+"kg";
  }  
  public void establece_color(String elige_color){//SETTER metodo para cambiar el color del coche
      color=elige_color;
  }
  public String dime_color(){//retorna el color del coche pero se debe establecer primero con el metodo establece_color()
  return "el color del coche es: "+color;
  }
  
  public void configura_asientos(String asientos_cuero){//para indicar si tiene o no asientos de cuero, recibe "si" o "no"
  if(asientos_cuero.equalsIgnoreCase("si")){this.asientos_cuero=true;}
  else{this.asientos_cuero=false;}
  }
  /**
   * @return el si tiene o no asientos de cuero
   **/ 
  public String dime_asientos(){
  
  if(this.asientos_cuero==true){return "El coche tiene asientos de cuero";}
  else{return "El coche tiene asientos de serie";}
  }
  /**
   * 
   * @param aire_acondicionado
   * metodo SETTER
   * da un valor de true o false a la variable privada aire_acondicionado  
   */
  public void configura_aire(String aire_acondicionado){
  
if (aire_acondicionado.equalsIgnoreCase("si")){this.aire_acondicionado=true;}
else{this.aire_acondicionado=false;}
  }
  /** 
  * @return String
  * indica si el coche cuenta con aire acondicionado
  */
  public String dime_aire(){
  if(this.aire_acondicionado==true){return "El coche viene con aire acondicionado";}
  else{return "El coche no cuenta con aire acondicionado";}
  }
  /**
   * @return String 
   * Da la inforcaion del peso total , segun la suma de todos sus componentes
   */
  public String dime_peso_total(){//este metodo es un setter y getter a la vez, porque retorna un valor y tambien hace modificaciones
         
      int peso_carroseria=500;
     peso_final=peso_carroseria+peso_plataforma;
     if(asientos_cuero==true){
     peso_final=peso_final+50;
     }
     if(aire_acondicionado==true){
     peso_final=peso_final+20;
     }
      
      return "El peso total del coche es: "+peso_final;
  }
  public int precio_coche(){
      int precio_total=20000000;
      if(asientos_cuero==true){
      precio_total+=500000;
      }
      if(aire_acondicionado==true){
      precio_total+=300000;
      }
      
      return precio_total;
  }
          
}
