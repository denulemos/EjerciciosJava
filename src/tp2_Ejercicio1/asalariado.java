package tp2_Ejercicio1;

public class asalariado extends empleado{
private float sueldo;

public asalariado(String nombre, int edad, float sueldo) {
	super(nombre, edad);
	this.sueldo = sueldo;
}

public float getSueldo() {
	return sueldo;
}

public void setSueldo(float sueldo) {
	this.sueldo = sueldo;
}

@Override
public String toString() {
	return "asalariado " + getNombre() + " Gana: " + sueldo ;
}

@Override
public float calcularPago() {
	return sueldo;
}

}
