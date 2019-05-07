package Ejercicio3;

import Ejercicio3.Carrera;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Carrera carrera = new Carrera ("Carrera Test");
carrera.agregarAtletas("Juan", 235); //Segundo Lugar
carrera.agregarAtletas("Ganador", 10000); //Primer Lugar
carrera.agregarAtletas("Empate", 10000);
carrera.agregarAtletas("Pedro", 40); //Ultimo lugar
carrera.Ganadores();
	}

}
