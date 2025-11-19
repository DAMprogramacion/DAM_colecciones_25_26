package teoria;/*
 * Colecciones3.java
  */


public class Colecciones4 {
	
	public static void main (String[] args) {
		
		int[][][] numeros = new int[2][30][4];
		int contador = 0;
		//inicializando valores desde 0 a 11
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				for (int k = 0; k < numeros[i][j].length; k++) {
					numeros[i][j][k] = contador++;
				}
			}
		}
		
		//mostramos valores
		for ( int[][] arrayArrays : numeros) {
			for (int[] array : arrayArrays) {
				for (int numero : array) {
					System.out.println(numero);
				}
			}
		}
		
		
		
		
		
		
	}
}

