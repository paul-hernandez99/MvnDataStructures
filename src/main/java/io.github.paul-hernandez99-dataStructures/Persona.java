
public class Persona {
  private String nombre;
  private int edad;
  private int dni;

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
