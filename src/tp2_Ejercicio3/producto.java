package tp2_Ejercicio3;

public class producto {
 private String marca;
 private String modelo;
 private int numSerie;
 private int voltaje;
 private boolean encendido;
 private double precio;
public producto(String marca, String modelo, int numSerie, int voltaje, boolean encendido, double precio) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.numSerie = numSerie;
	this.voltaje = voltaje;
	this.encendido = encendido;
	this.precio = precio;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getNumSerie() {
	return numSerie;
}
public void setNumSerie(int numSerie) {
	this.numSerie = numSerie;
}
public int getVoltaje() {
	return voltaje;
}
public void setVoltaje(int voltaje) {
	this.voltaje = voltaje;
}
public boolean isEncendido() {
	return encendido;
}
public void setEncendido(boolean encendido) {
	this.encendido = encendido;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
 
public void mostrarInfo() {
}
}
