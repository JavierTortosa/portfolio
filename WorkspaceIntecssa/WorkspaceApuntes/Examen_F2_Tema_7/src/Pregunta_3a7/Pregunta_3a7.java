package Pregunta_3a7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* PREGUNTA 3
 * 
 * Realizar el código del método accept
 */

/*PREGUNTA 4
 * 
 * Realizar el método and then()
 */

/*PREGUNTA 5
 * 
 * Una vez realizados los anteriores metodos , mostrar la excepción
 */

/* PREGUNTA 6
 * 
 * Con el código anterior, utilizar el método sorted para ordenar.
 */

/* PREGUNTA 7
 * 
 * Con el código del ejercicio 4, utilizar el método forEach
 */


public class Pregunta_3a7 {

	public static void main(String[] args) {
		
		Consumer<List<Integer>> modify = list ->
		{
			for(int i =0; i< list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
		};
		
		//pregunta 7 (he puesto otro ejemplo al final)
		Consumer<List<Integer>> 
		dispList = list -> list.stream().forEach(a -> System.out.println(a + " "));
		
		List <Integer> list = new ArrayList<>();

		for (int i = 0 ; i<20; i++)
			list.add(i);
		
		//pregunta 3
		System.out.println("\nPregunta 3: metodo accept");
		modify.accept(list);
		
		dispList.accept(list);

		//pregunta 4
		System.out.println("\nPregunta 4: metodo andThen");
		modify.andThen(dispList).accept(list);
	
		//pregunta 5
		System.out.println("\nPregunta 5: mostrar excepcion");
		try {
			modify.andThen(null).accept(list);
		} catch (Exception e) {
			System.out.println("Excepcion " + e);
		}
		
		//pregunta 6
		System.out.println("\nPregunta 6: metodo sort");
		
		List<Integer> listaInvertida = list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(listaInvertida);

		//pregunta 7
		System.out.println("\nPregunta 7: metodo foreach");
		listaInvertida.forEach(str -> System.out.print(str + " "));
		
		//ejemplo filter
		System.out.println("\n\nEjemplo de filter");
		List<Integer> divisible_3 = ((Stream<Integer>) list.stream()
				.filter(s-> (s%3==0)))
				.collect(Collectors.toList());
		
		System.out.println(divisible_3);
	}
}
