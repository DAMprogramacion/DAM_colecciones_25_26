package teoria;/*
 * Colecciones1.java
 * Programa que lee 10 valores por teclado y calcula
 * el número de elemento que hay por debajo de la media
 * 
 */

import java.util.Scanner;
public class Colecciones1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUMERO_ELEMENTOS = 10;
		double[] numeros = new double[NUMERO_ELEMENTOS];
		double suma = 0;
		for (int i = 0; i < NUMERO_ELEMENTOS; i++){
			System.out.println("Introduce un valor:");
			numeros[i] = sc.nextDouble();
			suma += numeros[i];
		}
		sc.close();
		double valorMedio = suma / NUMERO_ELEMENTOS;
		System.out.printf("Valor medio %.2f%n",  valorMedio);
		//recorremos con un bucle for la colección numeros
		//calculamos el número de números cuyo valor es inferior a la media
		int contador = 0;
		for (int i = 0; i < NUMERO_ELEMENTOS; i++){
			if (numeros[i] < valorMedio)
				contador++;
		}
		System.out.printf("Nº valores por debajo de la media: %d%n", contador);
		System.out.println("Imprimiendo la referencia del array: " + numeros);
		
		
	}
}

