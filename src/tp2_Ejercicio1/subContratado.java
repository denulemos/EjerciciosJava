package tp2_Ejercicio1;

public class subContratado extends empleado{

 private float canthoras;
 private float preciohora;
public subContratado(String nombre, int edad, float canthoras, float preciohora) {
	super(nombre, edad);
	this.canthoras = canthoras;
	this.preciohora = preciohora;
}
public float getCanthoras() {
	return canthoras;
}
public void setCanthoras(float canthoras) {
	this.canthoras = canthoras;
}
public float getPreciohora() {
	return preciohora;
}
public void setPreciohora(float preciohora) {
	this.preciohora = preciohora;
}
@Override
public String toString() {
	return "subContratado " + getNombre() + " gana " + calcularPago();
}
 
@Override
 public float calcularPago() {
	 return preciohora * canthoras;
 }
 
 
}
