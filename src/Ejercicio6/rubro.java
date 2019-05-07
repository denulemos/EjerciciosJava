package Ejercicio6;

public class rubro {
	private String nombre;
	private double[] gastosPorMes;
	public static final int CANT_MESES = Mes.values().length;
	
	public rubro(String nombre) {
		this.nombre = nombre;
		this.inicializarGastos();
	}
	
	private void inicializarGastos () {
		gastosPorMes = new double[CANT_MESES];
		for (int i = 0; i < gastosPorMes.length; i++) {
			gastosPorMes[i] = 0;
		}	
	}

	public String getNombre() {
		return nombre;
	}
	
	public void agregarGasto (Mes mes, double importe) {
		int posicion = mes.ordinal();
		gastosPorMes[posicion] += importe;
	}
	
	public double getTotalGastos (Mes mes) {
		int posicion = mes.ordinal();
		return gastosPorMes[posicion];
	}
	
	public double getTotalGastos () {
		double total = 0;
		for (int i = 0; i < gastosPorMes.length; i++) {
			total += gastosPorMes[i];
		}
		return total;
	}
}
