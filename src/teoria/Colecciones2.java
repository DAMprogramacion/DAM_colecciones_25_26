package teoria;/*
 * Colecciones2.java
 */


public class Colecciones2 {
	
	public static void main (String[] args) {
		
		float[] numeros = {1.1F, 2, 3.3f, 5.5f, 7};
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Elemento %d: %.2f%n", i, numeros[i]); 
		}
		//usando un bucle mejorado (no se usa para conocer posiciones)
		for (float numero  :  numeros) {
			System.out.println("Nº: " + numero);
		}
		
	}
}

