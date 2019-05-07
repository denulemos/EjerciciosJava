package tp2_Ejercicio3;
import java.util.*;
public class negocio {

	ArrayList <producto> productos;
	ArrayList <producto> elegidos;

	public negocio() {
		super();
		this.productos = new ArrayList<>();
		this.elegidos = new ArrayList<>();
	}
	
	public void elegirArticulos() {
		
		Scanner sc = new Scanner(System.in);
		int eleccion = -1;
		String confirmacion = null;
		
		for (int i = 0; i<this.productos.size() ; i++) {
			System.out.println("Producto numero " + i);
			this.productos.get(i).mostrarInfo();
		}
		
		while (eleccion != 0 ) {
			System.out.println("Elija un articulo");
			eleccion = sc.nextInt();
			System.out.println("Elegiste: " );
			this.productos.get(eleccion).mostrarInfo();
			System.out.println("Estas seguro? Ingrese si o no");
			confirmacion = sc.next();
			
			if (confirmacion.equals("si")) {
				elegidos.add(this.productos.get(eleccion));
			}
			else {
				System.out.println("No se eligio este articulo");
			}
			
			System.out.println("Ingrese 0 si quiere salir o si quiere elegir algo mas");
			eleccion = sc.nextInt();
			
			
			
		}
		
		hacerTicket();
		
	}
	
	private void hacerTicket() {
		double sumatoria = 0;
		System.out.println("Ticket de venta");
		System.out.println("Articulos= ");
		for (int i = 0; i < this.elegidos.size() ; i++) {
			this.elegidos.get(i).mostrarInfo();
			sumatoria += this.elegidos.get(i).getPrecio();
		}
		
		System.out.println("Total a pagar = " + sumatoria + "$");
		
		
	}
	
	
}
