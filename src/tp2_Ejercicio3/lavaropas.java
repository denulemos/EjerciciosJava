package tp2_Ejercicio3;

public class lavaropas extends producto{

	private int capacidad;
	private boolean automatico;
	public lavaropas(String marca, String modelo, int numSerie, int voltaje, boolean encendido, double precio,
			int capacidad, boolean automatico) {
		super(marca, modelo, numSerie, voltaje, encendido, precio);
		this.capacidad = capacidad;
		this.automatico = automatico;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	
	public void mostrarInfo() {
		System.out.println("Lavaropa " + this.getMarca() +" "+ this.getModelo());
	}
	
}
