package tp2_Ejercicio1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
empleado empleado1 = new asalariado ("Jose", 30, 10000);
empleado empleado2 = new subContratado ("Carlos", 23, 50, 100);

System.out.println(empleado1.toString());
System.out.println(empleado2.toString());

empleado empleado3 = new vendedor("Pedro" , 25, 100, 200, 5);
empleado empleado4 = new vendedor("Maria" , 30,100, 200, 10);

System.out.println(empleado3.toString());
System.out.println(empleado4.toString());

	}

}
