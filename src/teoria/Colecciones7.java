package teoria;/*
 * Colecciones7.java
 */

import java.util.*;
public class Colecciones7 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList();
		int numero = -1;
		
		/*do {
			System.out.println("Introduce un número, valor negativo para terminar");
			numero = sc.nextInt();
			numeros.add(numero);
		} while(numero >= 0);
		//quitar el -1
		numeros.remove(numeros.size() -1);*/
		
		//otra fora de hacerlo
		do {
			System.out.println("Introduce un número, valor negativo para terminar");
			numero = sc.nextInt();
			if (numero >= 0)
				numeros.add(numero);
		} while(numero >= 0);
		System.out.printf("Datos introducidos: %s%n", numeros);
		System.out.printf("Nº datos introducidos: %d%n", numeros.size());

		//otra fora de hacerlo
		/*do {
			System.out.println("Introduce un número, valor negativo para terminar");
			numero = sc.nextInt();
			if (numero < 0)
				break;
			numeros.add(numero);
		} while(numero >= 0);
		System.out.printf("Datos introducidos: %s%n", numeros);*/
		
		float suma = 0;
		float valorMedio = 0;
		for (int digito : numeros ) {
			suma += digito;
		}
		if (! numeros.isEmpty() ) { //es lo mismo que numero.size() > 0
			valorMedio = suma / numeros.size();
			System.out.printf("Valor medio: %.2f%n", valorMedio);
		} else 
			System.out.println("No hay valor medio, porque no hay datos");

		System.out.println("Eliminando el primer y último elemento");
		if (numeros.size() >= 2) {
			numeros.remove(0);
			numeros.remove(numeros.size() - 1);
		} else 
			System.out.println("Necesitamos mínimo dos elementos para esta operación");
		System.out.println(numeros);
		
		
	}
}

