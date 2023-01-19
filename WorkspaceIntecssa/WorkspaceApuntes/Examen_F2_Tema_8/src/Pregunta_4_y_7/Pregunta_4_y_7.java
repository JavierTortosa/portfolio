package Pregunta_4_y_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* PREGUNTA 4
 * Con el siguiente código
 * 
List<Integer> number = Arrays.asList(2,3,4,5);
 
 * Utulizar la función map para elevar los numeros de la lista al cuadrado
 */

/* PREGUNTA 7
 * Con el código del ejercicio 4, utilizar el método forEach
 */

public class Pregunta_4_y_7 {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(2,3,4,5);
		
		System.out.println("Pregunta 4");
		
		List<Integer> cuadrado = number.stream()
				.map (x -> x*x)
				.collect(Collectors.toList());
		
		System.out.println(cuadrado);
		
//		**********************************************************************************
		
		System.out.println("\nPregunta 7");
		
		cuadrado.forEach((n -> System.out.println(n)));
		
	}
}
