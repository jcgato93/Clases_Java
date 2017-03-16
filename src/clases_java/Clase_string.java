
package clases_java;


public class Clase_string {
    
    
    public static void main(String[] args) {
    
    
  String nombre="Juan";


System.out.println("Mi nombre es "+nombre);
System.out.println();

System.out.println("Mi nombre tiene es "+nombre+" y tiene "+nombre.length()+" letras");
System.out.println();

System.out.println("La primera letra de mi nombre es : "+nombre.charAt(0));
System.out.println();

int ultima;
ultima=nombre.length();

System.out.println("La ultima letra de mi nombre es :"+nombre.charAt(ultima-1));


// metodo SubString -nos extrane cierta parte de una frase 

String frase="Hoy es un excelente dia para programar ";

String resumen=frase.substring(4);//segun el numero que se le coloque no muestra esos primeros caracteres
System.out.println(resumen);

resumen=frase.substring(0,19);//se elige de donde hasta donde quiere mostrar
System.out.println(resumen);
System.out.println();

//Metodo equals- compara cadenas

String nombre1,nombre2;
nombre1="camilo";
nombre2="camilo";

System.out.println(nombre1.equals(nombre2)); 
    
    
    }
    
    
}
