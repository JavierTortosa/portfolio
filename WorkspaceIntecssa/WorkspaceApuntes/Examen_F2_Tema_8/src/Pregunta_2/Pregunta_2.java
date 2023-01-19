package Pregunta_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/* PREGUNTA 2
 * ----------
 * 
 * Crear una Lista de animales, que contienen datos de tipo String e Integer,
 * respectivamente, usando el método findFirst().
 */ 

public class Pregunta_2 {

	public static void main(String[] args) {
		
		Map<String, Integer> animales = new HashMap<>();
		
		animales.put("PERRO", 10);
		animales.put("GATO", 5);
		animales.put("PAJARO",2);
		
		animales.forEach((k,v) -> System.out.println("Tipo: "+ k + " edad: "+ v+ " años"));
		
		Optional<String> listaAnimales = animales.keySet().stream()
				.filter(x -> x.length()>5)
				.findFirst();
		
		if(listaAnimales.isPresent()) {
			System.out.println("Primer nombre de animal de mas de 5 letras: "+ listaAnimales.get());
		}else {
			System.out.println("sin valor");
		}
	}
}
