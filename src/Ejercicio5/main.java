package Ejercicio5;

import Ejercicio4.anio;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anio anio = new anio();
		System.out.println(anio.getNombreDelMes(1)); //Enero
		System.out.println(anio.diasTranscurridos(2)); //Hasta febrero (31)
		System.out.println(anio.diasTranscurridos(12)); //Hasta Diciembre
		System.out.println(anio.getNombreDelMes(3)); //Marzo
	}

}
