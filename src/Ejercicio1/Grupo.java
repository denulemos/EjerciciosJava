package Ejercicio1;
import java.util.*;
import java.util.ArrayList;

public class Grupo {
	 private String nombre;
	  private ArrayList <Integrante> Integrantes;
	  
	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
		Integrantes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.Integrantes.size();
	}
	
	public void agregarIntegrante (String nombreIntegrante) {
		if (buscarIntegrante(nombreIntegrante) == null) {
			Integrante integrante = new Integrante (nombreIntegrante);
			this.Integrantes.add(integrante);
			System.out.println(nombreIntegrante + " fue agregado al grupo " + this.nombre);
		}
		else {
			System.out.println("Integrante ya existe");
		}
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int valor = -1, contador = 0;
		
		if (buscarIntegrante (nombreIntegrante) != null) {
			while (valor == -1 && contador < this.Integrantes.size()) {
				Integrante nombre = this.Integrantes.get(contador);
				if (nombre.getNombre().equals(nombreIntegrante)) {
					valor = contador;
				}
				else {
					contador++;
				}
				
			}
		}
		
		return valor;
	}

	public String obtenerIntegrante (int posicion) {
		
	    String nombre = this.Integrantes.get(posicion-1).getNombre();
	    return nombre;
		
	}

	public String buscarIntegrante (String nombre) {
		Integrante integrante = null;
		int i = 0;
		while (integrante == null && i < this.Integrantes.size()) {
			if (this.Integrantes.get(i).getNombre().equals(nombre)) {
				integrante = this.Integrantes.get(i);
				
			}
			else {
				i++;
			}
		}
		
		if (integrante == null) {
			return null;
		}
		else {
			return integrante.getNombre();
		}
		
	}

	public String removerIntegrante(String nombreIntegrante) {
		String nombreAux = nombreIntegrante;
		int posicion= obtenerPosicionIntegrante(nombreIntegrante);
		
		if (posicion == -1) {
			return null;
		}
		else {
			this.Integrantes.remove(posicion);
			return (nombreAux + " fue eliminado");
		}
		
	}

	private void mostrarIntegrantes() {
		int contador = 0;
		for (Integrante i : Integrantes) {
			System.out.println(i.getNombre());
			
		}
		System.out.println("Hay " + this.Integrantes.size() + " integrantes");
	}
	  
	 public void mostrar() {
		System.out.println(this.nombre);
		mostrarIntegrantes();
	 }
	 
	  public void vaciar() {
		 this.Integrantes.clear();
		 System.out.println("Todos los integrantes fueron eliminados");
	  }
}
