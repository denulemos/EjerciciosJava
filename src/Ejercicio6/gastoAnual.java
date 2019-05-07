package Ejercicio6;
import java.util.ArrayList;

public class GastoAnual {
	private ArrayList<rubro> rubros;

	public GastoAnual() {
		this.rubros = new ArrayList<rubro>();
	}
	
	public void agregarGasto (Mes mes, String nombreRubro, double importe) {
		if (importe > 0) {
			rubro r = obtenerRubro(nombreRubro);
			r.agregarGasto(mes, importe);
		}
	}
	
	public void agregarRubro (String nombre) {
		this.rubros.add( new rubro (nombre) );
	}
	
	private rubro obtenerRubro(String nombreRubro) {
		rubro r = buscarRubro(nombreRubro);
		if ( r == null ) {
			r = new rubro(nombreRubro);
			this.rubros.add( r );
		}
		return r; 
	}
	
	private rubro buscarRubro(String nombreRubro) {
		rubro r = null;
		int i = 0;
		boolean encontrado = false;
		while (!encontrado && i < this.rubros.size()) {
			System.out.println();
			if ( this.rubros.get(i).getNombre().equals(nombreRubro) ) {
				encontrado = true;
				r = this.rubros.get(i); // Guardo el rubro
			}
			i++;
		}
		return r;
	}
	
	private double[][] consolidadoDeGastos() {
		final int CANT_RUBROS = this.rubros.size();
		double[][] gastos = new double[CANT_RUBROS][rubro.CANT_MESES];
		for (int i = 0; i < CANT_RUBROS; i++) { // Por cada rubro
			for (int j = 0; j < rubro.CANT_MESES; j++) { // Por cada mes
				rubro r = this.rubros.get(i); // Rubro actual
				Mes m = Mes.values()[j]; // Mes actual
				gastos[i][j] = r.getTotalGastos(m);
			}
		}
		return gastos;
	}
	
	public double gastoAcumulado(Mes mes) {
		double sumatoria = 0;
		for (rubro rubro : rubros) {
			sumatoria += rubro.getTotalGastos(mes);
		}
		return sumatoria;
	}
	
	public double gastoAcumulado(String nombreRubro) {
		rubro r = buscarRubro(nombreRubro);
		double gasto;
		if (r == null) { // Si no lo encontro
			gasto = -1; // Devolveré -1
		} else {
			gasto = r.getTotalGastos(); // Devolveré el gasto total
		}
		return gasto;
	}

	public void informarConsumosPorMes() {
		double[][] matriz = consolidadoDeGastos();
		System.out.print("Meses\t"); // Imprime "Meses" y tabula
		// Imprime la fila con los nombres de los meses tabulados
		for (Mes mes : Mes.values()) {
			System.out.print( mes.name().substring(0,3) + "\t");
		}
		System.out.println(); // Salto de linea
		for (int i = 0; i < matriz.length; i++) {
			// Imprime el nombre del rubro una sola vez y tabula
			System.out.print(this.rubros.get(i).getNombre() + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				// Imprime cada gasto mensual tabulando
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(); // Salto de linea
		}
	}
	


}

