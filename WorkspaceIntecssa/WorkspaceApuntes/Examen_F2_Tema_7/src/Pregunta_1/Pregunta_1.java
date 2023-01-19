package Pregunta_1;

import java.util.ArrayList;
import java.util.Arrays;

/* PREGUNTA 1
 * Mostrar los elementos de un Array Array con Lambda
 */ 

public class Pregunta_1 {

	public static void main(String[] args) {
	
		Integer[] numeros = new Integer[20];
		
		ArrayList<Integer> array = new ArrayList<>();
		
		for(int i = 0 ; i<20; i++) {
			array.add(i*i);
			numeros[i] = i*i;
		}
		
		System.out.println("Salida de un array normal \n");
		Arrays.asList(numeros).forEach((num) -> System.out.println(num));
		
		System.out.println("\n\nSalida de un arraylist\n");
		array.forEach((nume) -> System.out.println(nume));
	}
}
