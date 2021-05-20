package main.java.io.github.paulHernandez99.dataStructures;

/**
* Clase persona.
* @author Paul Hernandez
*/

public class Persona {
  private String nombre;
  private int edad;
  private int dni;

  /**
  * Constructor de la clase Persona
  * @param nombre nombre de la persona
  * @param edad edad de la persona
  * @param dni dni de la persona
  */
  public Persona (String nombre, int edad, int dni){
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getNombre() {
    return this.nombre;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public int getEdad() {
    return this.edad;
  }
  public void setDni(int dni) {
    this.dni = dni;
  }
  public int getDni() {
    return this.dni;
  }
}
