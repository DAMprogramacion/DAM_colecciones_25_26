package teoria;/*
 * Colecciones3.java
  */


public class Colecciones3 {
	
	public static void main (String[] args) {
		
		int[][] numeros = new int[4][5];
		int contador = 0;
		//inicializando valores desde 0 a 11
		//for (int i = 0; i < 3; i++) { desacomplamos el valor de 3
		for (int i = 0; i < numeros.length; i++) {
			//for (int j = 0; j < 4; j++) { desacoplamos el valor de 4
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = contador++;
				//igual que
				/* numeros[i][j] = contador;
				 * contador++;*/
			}
		}
		
		//mostramos valores
		for ( int[] array : numeros) {
			for (int numero : array) {
				System.out.println(numero);
			}
		}
		
		
		
		
		
		
	}
}

