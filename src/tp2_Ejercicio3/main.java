package tp2_Ejercicio3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos el negocio
		
		negocio negocio = new negocio();
		
     //Agregamos los productos
		
		producto producto1 = new heladera("Marca1", "Modelo Heladera", 2353, 220, true, 1200, 500,
		true);
		producto producto2 = new heladera("Marca2", "Modelo Heladera 2", 2353, 220, true, 1200, 500,
				true);
		producto producto3 = new licuadora("Marca3", "Modelo licuadora", 2353, 220, true, 200, 3, 10);
		
		negocio.productos.add(producto1);
		negocio.productos.add(producto2);
		negocio.productos.add(producto3);
		
		negocio.elegirArticulos();
		
	}

}
