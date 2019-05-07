package Ejercicio3;

import java.util.ArrayList;

import Ejercicio2.Atleta;

public class Carrera {
	private String especialidad;
	private ArrayList <Atleta> Atletas;
	private ArrayList <Atleta> Ganadores;
	private Atleta[] podio = new Atleta[3];
	
	public Carrera(String especialidad) {
		super();
		this.especialidad = especialidad;
		Atletas = new ArrayList<>();
		Ganadores = new ArrayList<>();
	}
	
	
    public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void agregarAtletas(String nombre, float tiempo) {
		Atleta atleta = new Atleta(nombre, tiempo);
		this.Atletas.add(atleta);
		System.out.println("Atleta Agregado");
	}

	private void buscarGanadores() {
       double max = sacarTiempoMax(); //Primer Ganador
       
       for (Atleta a : Atletas) {
    	   if (a.getSegundos() >= max) { //Si el primer ganador es mayor o igual al tiempo maximo 
    		   podio[0] = a;
    	   }
       }
       
       for (Atleta a : Atletas) {
    	   if (a.getSegundos() < max && a.getSegundos() > 0) { //Si el tercer ganador es menor al tiempo maximo pero mayor a cero
    		   podio[2] = a;
    	   }
       }
       
       for (Atleta a : Atletas) {
    	   if (a.getSegundos() > podio[2].getSegundos() && a.getSegundos() < podio[0].getSegundos()) { //Si el tercer ganador es menor al 2do tiempo pero mayor a cero
    		   podio[1] = a;
    	   }
       }
    }
    
    public void Ganadores() {
    	
    	buscarGanadores();
    	System.out.println("Especialidad : " + this.especialidad);
    	System.out.println("Los ganadores son: ");
    	for (int i = 0 ; i < this.podio.length ; i++) {
    		System.out.println(podio[i].getNombre());
    		System.out.println("Con un tiempo de " + podio[i].getSegundos() + " segundos");
    	}
    	
    	
    }
    
    private double sacarTiempoMax( ) {
    	
    	double maxTiempo = 0;
    	
    	for (Atleta a : Atletas) {
    		if (a.getSegundos() > maxTiempo) {
    			maxTiempo =  a.getSegundos();
    		}
    	}
    	
    	return maxTiempo;
    }
    
   
}
