package clases_java;

import java.util.*;
public class Clase_Math {

    public static void main(String[] args) {
    //clase predefinidas
//    String
//    math
//    Array
//    thread


//Math.sqrt(n)raiz cuadrada de un numero 
//Math.pow(base, exponente)potencia de un numero.Base y exponente son Double
//Math.sin(ángulo): seno
//Math.cos(ángulo) : coseno
//Math.tan(ángulo) : tangente
//Math.atan(ángulo) : cotangente

//Math.round(decimal) : redondeo de un numero
//Math.PI  :constante predefinida de la clase Math con el numero PI(3.1416)

int resul=(int)Math.round(Math.PI);
System.out.println(resul);

//en los casos en los que no se devuelve el valor en el tipo de variable que se desea almacenar
//hacemos una refundicion del metodo

int raiz=(int)Math.sqrt(20);
System.out.println("La raiz de 20 es "+raiz);


double base=0;
double exponente=0;
double potencia=0;
Scanner lector= new Scanner(System.in);

System.out.println("ingrese el numer de la base");
base=lector.nextDouble();

System.out.println("Ingrese el numero del exponente");
exponente=lector.nextDouble();

potencia=Math.pow(base, exponente);

System.out.println("La potencia de "+base+" con exponenete "+ exponente+ " es : "+potencia);

    }
}