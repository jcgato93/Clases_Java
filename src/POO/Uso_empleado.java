
package POO;

import java.util.*;

/**
 * @author juan camilo
 */
public class Uso_empleado {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("juan",600000,1993,8,10);
        
        empleado1.sube_sueldo(5);
        System.out.println("Nombre:" +empleado1.nombre_emp()+"\n sueldo: "+empleado1.sueldo_emp()
        +"\n fecha salida empresa:"+ empleado1.fcha_contrato()
        );
        
    }
    
}

 class Empleado{//objeto empleado
     //propiedades de clase Empleado
     private String nombre;
     private  double sueldo;
     private Date alta_contrato;
     /**
      * 
      * @param nom
      * @param sue
      * @param agno
      * @param mes
      * @param dia
      * Metodo constructor de Empleado
      */
 public Empleado(String nom,double sue,int agno,int mes,int dia){
   
      nombre=nom;
      sueldo=sue;
      GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);//uso del Constructor de la clase GreforianCalendar
      alta_contrato=calendario.getTime();
  
  }
 
public String nombre_emp(){//getter
return  this.nombre;
}
public double sueldo_emp(){//getter
return this.sueldo;
}
public Date fcha_contrato(){//getter
return this.alta_contrato;
}
/**
 * @param porcentaje
 * aumenta  la variable sueldo segun el porcentaje que se le de 
 */
 public void sube_sueldo(double porcentaje){//setter
 double aumento=this.sueldo*porcentaje/100;
 this.sueldo+=aumento;
 
 }
  
 }
