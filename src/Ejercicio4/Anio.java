package Ejercicio4;

public class Anio {

	private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre" , "Octubre", "Noviembre", "Diciembre"};
	private int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 31};
	private int[][] a�o; //Mes y dia
	
	public String getNombreMes(int numeroMes) {
		String mes = null;
		if (numeroMes>12 || numeroMes < 1) {
			System.out.println("Numero no valido");
		}
		else {
			mes = meses[numeroMes];
			
		}
		return mes;
		
	}
	
	public int diasTranscurridosMes (int numeroMes) {
		
		int diasTrans = 0;
		if (numeroMes > 12 || numeroMes < 1) {
			System.out.println("No valido");
		}
		else {
			for (int i = 0; i < numeroMes ; i++) {
				diasTrans += dias[i];
			}
		}
		
		return diasTrans;
	}
	public int cumplea�os (int numeroMes , int dia) {
		int diasTrans =0;
		return diasTrans += (diasTranscurridosMes(numeroMes) + dia); //Suma los dias del mes transcurridos mas los dias del cumple
	}
}
