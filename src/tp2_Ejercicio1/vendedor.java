package tp2_Ejercicio1;

public class vendedor extends subContratado{

	private float porcentaje;

	public vendedor(String nombre, int edad, float canthoras, float preciohora, float porcentaje) {
		super(nombre, edad, canthoras, preciohora);
		this.porcentaje = porcentaje;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "vendedor " + this.getNombre() + this.cobrarPago();
	}
	
	
	private float cobrarPago() {
		float resultado = (this.getCanthoras() * this.getPreciohora()) * (this.porcentaje); 
		return resultado;}
}
