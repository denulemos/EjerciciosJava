package tp2_Ejercicio3;

public class heladera extends producto{
private int capacidad;
private boolean nofrost;
public heladera(String marca, String modelo, int numSerie, int voltaje, boolean encendido, double precio, int capacidad,
		boolean nofrost) {
	super(marca, modelo, numSerie, voltaje, encendido, precio);
	this.capacidad = capacidad;
	this.nofrost = nofrost;
}
public int getCapacidad() {
	return capacidad;
}
public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
}
public boolean isNofrost() {
	return nofrost;
}
public void setNofrost(boolean nofrost) {
	this.nofrost = nofrost;
}

public void mostrarInfo() {
	System.out.println("Heladera " + this.getMarca() +" "+ this.getModelo());
}

}
