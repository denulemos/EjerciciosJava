package Ejercicio4;

public class anio {
  private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre" , "Octubre", "Noviembre" , "Diciembre"};
  private int[] dias = {31, 28,31,30, 31, 30, 31, 31, 30, 31, 30, 31};
  
  public String getNombreDelMes (int numeroMes) {
	  if (numeroMes >= 1 && numeroMes <= 12) {
		  return meses[numeroMes - 1];
	  }
	  else {
		  return "No valido";
	  }
  }
  
  public int diasTranscurridos (int numeroMes) {
	  int contador = 0;
	  
	  for (int i = 0; i < (numeroMes - 1) ; i++) {
		  contador += dias[i];
	  }
	  
	  return contador;
  }
 
  
  
  

}
