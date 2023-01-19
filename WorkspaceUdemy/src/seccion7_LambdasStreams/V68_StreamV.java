package seccion7_LambdasStreams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MetodoV{
	public static void main(String[] args) {
		
/*	 Metodos de Stream V
 * 	 -------------------
 * 
 * 	 Reduccion a coleccion			- Metodo Final
 * 	 ---------------------------------------------
 * 
 * 	 R collect (Collector<? super T, A, R> collector)
 * 
 * 			R collect 								-> un collect de tipo R
 * 			Collector<? super T, A, R> collector 	-> implementacion de collector
 * 
 * 		Devuelve un List, Map o Set con los datos del Stream en funcion de la implementacion de Collector
 * 		Collector no es una interfaz funcional y no se puede utilizar con las expresiones lambda
 * 		En su lugar usaremos una clase llamada Collectors que tiene metodos statics que si se pueden usar
 * 
 * 	 Ejemplo:
 */
		System.out.println("\nEjemplo Collectors.toList()\n");
		Stream <Integer> nums = Stream.of(20,5,8,5,3,3,9);
		//Generamos una lista con los elementos del stream sin duplicados
		List<Integer> lista = nums.distinct().collect(Collectors.toList());
		
		for(int l : lista) {
			System.out.println(l);
		}
		
		// la clase persona esta definida en la clase V59_Lambdas.java
		Stream<Persona> persona = Stream.of(
				new Persona("Jaime", 20, 12345),
				new Persona("Irene", 25, 432015),
				new Persona("Pilar", 30, 1584363));
		
		// Genera una tabla con los datos de las personas usando el dni como clave y el nombre como valor
		
		System.out.println("\nEjemplo Collectors.toMap()\n");
		Map <Integer,String> lista1 = persona.collect(Collectors.toMap(p->p.getDni(), p-> p.getNombre()));
			
		Set <Integer> setLista = lista1.keySet();
		for(Integer l : setLista) {
			System.out.println("DNI: " + l + "\t/\tNombre: " + lista1.get(l) );
		}
				
/* 	 Agrupacion
 * 	 ----------
 * 
 * 	 Utilizando el metodo collect() de Stream se puede conseguir una agrupacion de objetos
 * 	 Para ello usamos el siguiente metodo de Collectors:
 * 
 * 			Collector<T,?,Map<K,List<T>>> groupingBy(Function<? super T,? extends K> classifier)
 * 
 * 	 Devuelve un Collector que implementa una agrupacion tipo groupBy
 * 	 El metodo recibe como parametro un objeto Function con el criterio de agrupacion
 * 	 Con este tipo de Collector, la llamada a collect() devolvera un Map de listas
 * 	 Cada elemento del mapa tiene:
 * 		 Una clava que es el dato por el que se hace la agrupacion 
 * 	  	 Un valor con la lista de objetos de cada grupo
 * 
 * 	 Ejemplo:
 */

		System.out.println("\nEjemplo Collectors.groupingBy\n");
		Stream <Persona> st = Stream.of(
				new Persona("Jaime", 30, "Jaime@gmail.com"),
				new Persona("Irene", 40, "irene@gmail.com"),
				new Persona("Pilar", 35, "pilar250@hotmail.com"),
				new Persona("Andrea", 40, "andrea@yahoo.com"));
		//agrupa las personas por edad
		Map<Integer, List<Persona>> personas = st.collect(Collectors.groupingBy(p->p.getEdad()));
		personas.forEach((k,v)->System.out.println(v));
		
/* 
 * 
 * 
 * 		
 */
	}
}
public class V68_StreamV {

	public static void main(String[] args) {

		
	}

}
