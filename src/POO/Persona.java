
package POO;

public class Persona {
  
   private  String nombre,apellido;
   private  int edad,ID;

    public Persona(String nombre, String apellido, int edad, int ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
  
    
}
