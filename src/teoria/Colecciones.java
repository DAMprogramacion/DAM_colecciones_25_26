package teoria;/*
 * Colecciones.java
 
 * 
 */

import java.util.Arrays;
public class Colecciones {
	
	public static void main (String[] args) {
		final int[] enteros1 = {1, 2};
		System.out.println(enteros1);
		System.out.println(Arrays.toString(enteros1));
		enteros1[0] = 12;
		System.out.println(Arrays.toString(enteros1));
		int[] enteros2 = {3, 4};
		int[] enteros3 = {4, 5};
		enteros2 = enteros3;
		System.out.println(Arrays.toString(enteros2));
		//enteros1 = enteros3; no se puede cambiar la referencia inicial, al ser final


	}
}

