package teoria;/*
 * Colecciones6.java
 * 
 * Introducción a las listas dinámicas
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Colecciones6 {
	
	public static void main (String[] args) {
		
		String[] cadenas = {"juan", "pedro", "luisa", "gabriel", "emilio"};
		System.out.println(cadenas);
		System.out.println(Arrays.toString(cadenas));
		System.out.printf("Nº de datos: %d%n", cadenas.length);
		//¿Qué ocurre si necesitamos añadir un dato más?
		String[] cadenas1 = new String[cadenas.length + 1];
		for (int i = 0; i < cadenas.length; i++) {
			cadenas1[i] = cadenas[i];   //pasamos los datos de cadenas -> cadenas1
		}
		
		//añadimos el nuevo dato
		cadenas1[cadenas1.length - 1] = "Iñigo";  //ocupa la última posición
		System.out.println(Arrays.toString(cadenas1));
		System.out.printf("Nº de datos: %d%n", cadenas1.length);
		
		//añadimos un nuevo datos usando la clase ayudante Arrays y el método copyOf
		String[] cadenas2 = Arrays.copyOf(cadenas1, cadenas1.length + 1);
		cadenas2[cadenas2.length -1] = "Emilia";
		System.out.println(Arrays.toString(cadenas2));
		System.out.printf("Nº de datos: %d%n", cadenas2.length);
		
		
		
		System.out.println("=====Usando listas dinámicas=====");
		//Vamos a usar una lista dinámica
		List<String> listaCadenas = new  ArrayList(); //se está creando una lista vacia preparada para almacenar String
		System.out.println(listaCadenas);
		System.out.printf("Nº de datos: %d%n", listaCadenas.size());
		
		//añadiendo cadenas
		listaCadenas.add("Pepe"); listaCadenas.add("Pepito"); listaCadenas.add("Pepa");
		System.out.println(listaCadenas);
		System.out.printf("Nº de datos: %d%n", listaCadenas.size());
		
		//buscando cadenas
		boolean existePepe = listaCadenas.contains("Pepe");
		System.out.printf("¿Existe %s? %B%n", "Pepe", existePepe); 
		boolean existeJose = listaCadenas.contains("Jose");
		System.out.printf("¿Existe %s? %B%n", "Jose", existeJose); 
		
		//eliminando cadenas
		listaCadenas.remove("Pepito");
		System.out.println(listaCadenas);
		System.out.printf("Nº de datos: %d%n", listaCadenas.size());


		
		
		
		
		
		
		
		
		
	}
}

