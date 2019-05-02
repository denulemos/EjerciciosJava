package Ejercicio2;
import java.util.*;
public class Carrera {

	private String especialidad;
	private ArrayList <Atleta> Atletas;
	private ArrayList <Atleta> Ganadores;
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
       double max = sacarTiempoMax();
       for (Atleta a : Atletas) {
    	   if (a.getSegundos() >= max) {
    		   Ganadores.add(a);
    	   }
       }
       
       
       
    }
    
    public void Ganadores() {
    	
    	buscarGanadores();
    	System.out.println("Especialidad : " + this.especialidad);
    	System.out.println("Los ganadores son: ");
    	for (Atleta g : Ganadores) {
    		System.out.println(g.getNombre());
    	}
    	System.out.println("Con un tiempo de " + sacarTiempoMax() + " segundos");
    	
    }
    
    private double sacarTiempoMax() {
    	double maxTiempo = 0;
    	for (Atleta a : Atletas) {
    		if (a.getSegundos() > maxTiempo) {
    			maxTiempo =  a.getSegundos();
    		}
    	}
    	
    	return maxTiempo;
    }
	
	
}
