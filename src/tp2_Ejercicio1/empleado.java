package tp2_Ejercicio1;

public class empleado {
 private String nombre;
 private int edad;
public empleado(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	return "empleado [nombre=" + nombre + ", edad=" + edad + "]";
}
 
public float calcularPago() {return  0.0f;}




}
