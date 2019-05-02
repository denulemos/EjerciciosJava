package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Grupo grupo = new Grupo("Denu y los demas"); //Creá una instancia de Grupo asignándole el número, la letra o el nombre que le  hayan puesto.
      
      grupo.agregarIntegrante("Denisse");
      grupo.agregarIntegrante("Pablo");
      grupo.agregarIntegrante("Juancito");
      grupo.agregarIntegrante("Denisse 2");
     System.out.println(grupo.buscarIntegrante("Denisse"));
     System.out.println(grupo.buscarIntegrante("Pepecito")); //Deberia devolver null 
     grupo.agregarIntegrante("Denisse"); //Deberia avisarme que ya esta agregado
     grupo.mostrar();
     System.out.println(grupo.removerIntegrante("Pablo"));
     grupo.mostrar();
     System.out.println(grupo.removerIntegrante("Pablo")); //null ya que ya no existe
     grupo.mostrar();
     grupo.vaciar();
     grupo.mostrar(); //Grupo ya vacio
     

      
	}

}
