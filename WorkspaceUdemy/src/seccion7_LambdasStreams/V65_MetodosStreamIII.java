package seccion7_LambdasStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class MetodosIII{
	public static void main(String[] args) {
	
/*	 Metodos de Stream III
 * 	 ---------------------
 * 
 * 	 Transformacion			-Metodos intermedios
 * 	 -------------------------------------------
 * 
 * 	 Stream <R> map (Function <? super T, ? extends R> mapper)		-Metodos intermedios
 * 
 *   	Transforma cada elemento del Stream en otro segun el criterio definido por Function
 *   
 *   Ejemplo:
 */
		System.out.println("Stream <R> map (Function <? super T, ? extends R> mapper)");
		Stream <String> st1 = Stream.of("Juan", "Maria", "Ana");
		Stream <String> st2 = st1
				.map(s -> s.toUpperCase());//convierte cada elemento en mayusculas
		st2.forEach(n-> System.out.println(n));
		
/* 	 IntStream 		mapToInt (ToIntFunction <? super T> mapper)				-Metodos intermedios
 * 	 DoubleStream 	mapToDouble (ToDoubleFunction <? super T> mapper)		-Metodos intermedios
 * 	 LongStream 	mapToLong (ToLongFunction <? super T> mapper)			-Metodos intermedios
 * 
 * 		Aplica una funcion a cada elemento del stream que genera un int de cada elemento
 * 		El resultado se devuelve como IntStream
 * 
 * 	 Ejemplo:
 */
		System.out.println("\nIntStream mapToInt (ToIntFunction <? super T> mapper)");
		Stream <String> st1_ = Stream.of("Juan", "Maria", "Ana");
		System.out.println(st1_
				.mapToInt(s->s.length())//calcula la longitud de cada elemento
				.sum()//suma la longitud de cada elemento
				);
		
/* 	 Stream de tipos primitivos
 * 	 --------------------------
 * 
 * 	 Las interfaces IntStream, DoubleStream y LongStream cuyos objetos son obtenidos mediante
 * 	los metodos mapToInt, mapToDouble y mapToLong respectivamente
 * 	 Proporcionan los siguientes metodos de calculo:
 * 
 * 	 IntStream 		mapToInt (ToIntFunction <? super T> mapper)				-Metodos intermedios
 * 	 DoubleStream 	mapToDouble (ToDoubleFunction <? super T> mapper)		-Metodos intermedios
 * 	 LongStream 	mapToLong (ToLongFunction <? super T> mapper)			-Metodos intermedios
 *  
 * 		int 				sum()			-Metodo final
 * 		double 				sum()			-Metodo final
 * 		long 				sum()			-Metodo final
 * 
 * 			Devuelve la suma de todos los elementos del stream del tipo llamado (int, double, long)
 * 
 * 		OptionalDouble 		average()		-Metodo final
 * 
 * 			Devuelve la media encapsulada en un OptionalDouble en los 3 casos
 * 
 * 		OptionalInt 		max()			-Metodo final
 * 		OptionalDouble 		max()			-Metodo final
 * 		OptionalLong 		max()			-Metodo final
 * 
 * 			Devuelve el mayor de los numeros
 * 			El resultado se encapsula en un OptionalInt, OptionalDouble y OptionalLong 
 * 
 * 		OptionalInt 		min()			-Metodo final
 * 		OptionalDouble 		min()			-Metodo final
 * 		OptionalLong 		min()			-Metodo final
 * 
 * 			Devuelve el menor de los numeros 
 * 			El resultado se encapsula en un OptionalInt, OptionalDouble y OptionalLong
 * 
  
 *	 Transformacion y aplanamiento			-Metodo intermedio
 *	 ---------------------------------------------------------
 *
 *	 Stream <R> flatMap (Function <T, Stream<R>> mapper)
 *
 *		 Devuelve un nuevo Stream resultante de unir los Streams generados por la aplicacion de una funcion
 *		sobre cada elemento
 *
 *	 Ejemplo:
 *
 *		 Partiendo de una lista de listas de nombres, calcular cuantos nombres en total tienen mas de 
 *		cuatro caracteres
 */
		System.out.println("\nStream <R> flatMap (Function <T, Stream<R>> mapper)");
		List<List <String>> datos = Arrays.asList(	Arrays.asList("Gemma", "Maria", "Carlos"),
													Arrays.asList("Laura", "Ana", "Luis"));
		System.out.println(datos.stream()
				.flatMap(lista -> lista.stream().map(s->s.length())) //lista recorre las listas
																	 //s recorre cada elemento de cada lista
				.filter(n-> n>4)
				.count());
		
/*	 Revision de conceptos
 * 	 ---------------------
 * 
 * 	 Dado el siguiente array bidimensional de integer escribir un bloque de codigo que nos muestre
 * 	el mayor de todos los numeros de dicho array
 */
		System.out.println("\nRevision de conceptos");
		
		Integer[][] datosRc = {{8,3,5},{2,11,7},{4,1,9,6}};
		
		System.out.println(
				Arrays.stream(datosRc)			//Convertimos el array principal en un stream
				.flatMap(l -> Arrays.stream(l))	//convertimos cada subarray en un stream
				.mapToInt(s->s)					//transformamos a intStream
				.max()							//aplicamos el metodo de calculo
				.getAsInt()						//Extraemos el resultado
				);
		
/*
 * 
 */
	}
}

public class V65_MetodosStreamIII {

	public static void main(String[] args) {

		List<Integer> str = Arrays.asList(1, 2, 3, 4);
		str.stream().filter(x -> {
			System.out.print(x + " ");
			return x > 2;
		});
		
	}

}
