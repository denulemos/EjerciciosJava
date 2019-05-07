package tp2_Ejercicio3;

public class televisores extends producto{

	private int dimension;
	private boolean smart;
	public televisores(String marca, String modelo, int numSerie, int voltaje, boolean encendido, double precio,
			int dimension, boolean smart) {
		super(marca, modelo, numSerie, voltaje, encendido, precio);
		this.dimension = dimension;
		this.smart = smart;
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	public void mostrarInfo() {
		System.out.println("Televisor " + this.getMarca() +" "+ this.getModelo());
	}
}
