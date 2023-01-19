package Pregunta_5_y_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* PREGUNTA 5
 * Con el siguiente código:
 
List<String> names =
Arrays.asList("Reflection","Collection","Stream");

 * Mostrar los objetos que inicien con R
 */

/* PREGUNTA 6
 * 
 * Con el código anterior, utilizar el método sorted para ordenar
 */
public class Pregunta_5_y_6 {

	public static void main(String[] args) {

		List<String> names =
				Arrays.asList("Reflection","Collection","Stream");
		
		
		System.out.println("PREGUNTA 5");
		
		List<String> resultado = names.stream()
				.filter(s->s.startsWith("R"))
				.collect(Collectors.toList());
		
		System.out.println(resultado);
		
//		***************************************************************************************
		
		System.out.println("\nPREGUNTA 6");
		
		List<String> namesOrdenados = names.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(namesOrdenados);
	}

}
