package Ejercicio5;

public class anio {
	  
	  private int[] dias = {31, 28,31,30, 31, 30, 31, 31, 30, 31, 30, 31};
	  
	  public mesesEnum getNombreDelMes (int numeroMes) {
		  
		 switch (numeroMes) {
		 case 1: 
			return mesesEnum.Enero;
			
		 case 2:
			 return mesesEnum.Febrero;
			
		 case 3:
			 return mesesEnum.Marzo;
			
		 case 4:
			 return mesesEnum.Abril;
			 
			
		 case 5:
			 return mesesEnum.Mayo;
			
		 case 6:
			 return mesesEnum.Junio;
			
		 case 7:
			 return mesesEnum.Julio;
			
		 case 8:
			 return mesesEnum.Agosto;
			 
		 case 9:
			 return mesesEnum.Septiembre;
			
		 case 10:
			 return mesesEnum.Octubre;
		
		 case 11:
			 return mesesEnum.Noviembre;
			 
		 case 12:
			 return mesesEnum.Diciembre;
		 }
		return null;
		 
	  }
	  
	  public int diasTranscurridos (int numeroMes) {
		  int contador = 0;
		  
		  for (int i = 0; i < (numeroMes - 1) ; i++) {
			  contador += dias[i];
		  }
		  
		  return contador;
	  }
	 
	  
}
