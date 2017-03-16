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
public class Furgoneta extends Coche{//extends hace referencia a la clase de la cual se va a heredar
    
    private int capacidad_carga;
    private int espacios_extra;
    
    /**
     * 
     * @param espacios_extra
     * @param capacidad_carga
     * metodo constructor de la clase furgoneta 
     * hereda de la clase Coche
     */
    public Furgoneta(int espacios_extra,int capacidad_carga){
        super();//llamar al constructor de la clase padre(Coche)
        this.espacios_extra=espacios_extra;
        this.capacidad_carga=capacidad_carga;
        
    }
    /**
     * 
     * @return String con los datos de la furgoneta 
     */
    public String dimeDatosFurgoneta(){//getter
    
    return "Los espacios Extra son : "+espacios_extra+" y la capacidad de carga de la furgoneta es : "+capacidad_carga;
    }
}
