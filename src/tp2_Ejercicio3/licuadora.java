package tp2_Ejercicio3;

public class licuadora extends producto{

	private int potencia;
	private int velocidades;
	public licuadora(String marca, String modelo, int numSerie, int voltaje, boolean encendido, double precio,
			int potencia, int velocidades) {
		super(marca, modelo, numSerie, voltaje, encendido, precio);
		this.potencia = potencia;
		this.velocidades = velocidades;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getVelocidades() {
		return velocidades;
	}
	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}
	
	public void mostrarInfo() {
		System.out.println("Licuadora " + this.getMarca() +" "+ this.getModelo());
	}
}
