package Pregunta_1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*	PREGUNTA 1
 * 	----------
 * 	
 * 	Crear un flujo de una lista y filtrar ese flujo para devolver números que
 * tengan un valor inferior a 10. Luego llamamos a findAny() para obtener
 * cualquier número de ese flujo filtrado.
 */

public class Pregunta_1 {
	public static void main(String[] args) {

		List<Integer> numeros = List.of(18, 5, 13, 8);
		
		List<Integer> listaNumeros = numeros.stream()
				.filter(x -> x < 10)
				.collect(Collectors.toList());
		
		listaNumeros.forEach(num->System.out.println(num));
		
		Optional<Integer> listaNumeros2 = numeros.stream()
				.filter(x -> x < 10)
				.findAny();
		
		if(listaNumeros2.isPresent()) {
			System.out.println("numero menor de 10: "+ listaNumeros2.get());
		}else {
			System.out.println("sin valor");
		}
	}
}
