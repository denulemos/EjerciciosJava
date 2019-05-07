package Ejercicio6;

public enum Mes {
	ENERO("Enero","January"),
	FEBRERO("Febrero","February"),
	MARZO("Marzo","March"),
	ABRIL("Abril","April"),
	MAYO("Mayo","May"),
	JUNIO("Junio","June"),
	JULIO("Julio","July"),
	AGOSTO("Agosto","August"),
	SEPTIEMBRE("Septiembre","September"),
	OCTUBRE("Octubre","October"),
	NOVIEMBRE("Noviembre","November"),
	DICIEMBRE("Diciembre","December");
	
	private String nombreESP;
	private String nombreING;
	
	private Mes(String nombreESP, String nombreING) {
		this.nombreESP = nombreESP;
		this.nombreING = nombreING;
	}

	public String getNombreESP() {
		return nombreESP;
	}

	public String getNombreING() {
		return nombreING;
	}
}
