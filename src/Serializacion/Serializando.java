package serializacion;

import java.util.*;

import java.io.*;

public class Serializando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Administrador jefe=new Administrador("Juan", 80000, 2005,12,15);
		
		jefe.setIncentivo(5000);
		
		
		Empleado[] personal=new Empleado[3];
		
		personal[0]=jefe;
		
		personal[1]=new Empleado("Ana", 25000, 2008, 10,1);
		
		personal[2]=new Empleado("Luis", 18000, 2012, 9,15);
                
                
                
        ////////////////////////////////////////////////////////////////////////////////////
///////////Este es la parte importantte de la serializacion ////////////////////////////// 
/**
 * se serializo la clase Empleado , se implementa la interface Serializable
 */
        try{
            
            ObjectOutputStream escribiendo_Fichero=new ObjectOutputStream(new FileOutputStream("C:/Users/juan camilo/Desktop/empleado.dat"));
            
            escribiendo_Fichero.writeObject(personal);
            
            escribiendo_Fichero.close();
 /**
  * se recupera el fichero
  */           
            
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:/Users/juan camilo/Desktop/empleado.dat"));
            
            Empleado[]personal_recuperado=(Empleado[])recuperando_fichero.readObject();
            
            recuperando_fichero.close();
            for(Empleado e:personal_recuperado)//bucle for each
            {
            System.out.println(e);
            }
            
        }catch(Exception e){
        System.out.print("ruta invalida");
        }		
////////////////////////////////////////////////////////////////////////////////////////////		
		

	}

}

//-----------------------------------------------------------------------------------------------------------

class Empleado implements Serializable {
	
	private static final long serialVersionUID = 42L;//serialversion , es para establecer el ID de la clase programa, si no se establece ,se coloca una por defecto
        //se establece un serialversionUID en el caso de que se haga una actualizacion este no tenga ningun probleja al enviarlo
	
	public Empleado(String n, double s, int agno, int mes, int dia){
		
		nombre=n;
		
		sueldo=s;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		fechaContrato=calendario.getTime();
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	
	public void subirSueldo(double porcentaje){
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public String toString(){
		
		return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;
		
	}

	private String nombre;
	
	private double sueldo;
	
	private Date fechaContrato;
	
}

//--------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{
	
	

		public Administrador(String n, double s, int agno, int mes, int dia){
			
			super(n,s,agno,mes,dia);
			
			incentivo=0;
			
		}
		
		public double getSueldo(){
			
			double sueldoBase=super.getSueldo();
			
			return sueldoBase + incentivo;
			
		}
		
		public void setIncentivo(double b){
			
			incentivo=b;
		}
		
		
		public String toString(){
			
			return super.toString() + " Incentivo=" + incentivo;
			
		}
	
		private double incentivo;
	
}

