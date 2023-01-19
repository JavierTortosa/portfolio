package seccion7_LambdasStreams;

import java.util.stream.Stream;

class MetodosI{
	public static void main(String[] args) {
		
	
/*	 Metodos de Stream I
 * 	 -------------------
 * 
 * 	 Conteo y procesado		-Metodos finales
 * 	 ---------------------------------------
 * 
 * 	 long count()			-Metodo final
 * 
 * 		Devuelve el numero de elementos de un Stream
 * 		
 * 	 Ejemplo:
 */ 
  			System.out.println("long count()");
			Stream st = Stream.of(2,5,7,3,6,2,3);
  			System.out.println(st.count());	// 7
 
/* 	 void forEach (Consumer<? super T>action)			-Metodo final
 * 
 * 		Realiza una operacion para cada elemento del stream
 * 
 * 	 Ejemplo:
 */ 
  			System.out.println("void forEach (Consumer<? super T>action)");
  			Stream st1 = Stream.of(2,5,7,3,6,2,3);
  			st1.forEach(n->System.out.print(n+" "));
  			
/* 	 Extraccion de datos	-Metodos intermedios
 * 	 -------------------------------------------
 * 
 * 	 Stream <T> distinct ()			-Metodo intermedio
 * 
 * 		Devuelve un stream eliminando elementos duplicados segun aplicacion de equals
 * 
 * 	 Ejemplo:
 */
  			System.out.println("\n\nStream <T> distinct ()");
  			Stream <Integer>st2 = Stream.of(2,5,3,3,6,2,4);
  			System.out.println(st2.distinct().count());//5 //pipe line... concatena un metodo con otro
  			
/*	 Stream <T> limit (long n)			-Metodo intermedio
 * 
 * 		Devuelve un nuevo stream con los n primeros elementos del mismo 
 * 
 * 	 Ejemplo:
 */
  			System.out.println("Stream <T> limit ()");
  			Stream <Integer>st3 = Stream.of(1,2,3,4,5,6,7,8,9);
  			Stream <Integer>st4 = st3.limit(3);
  			st4.forEach(n -> System.out.print(n + " "));

/* 	 Stream <T> skip (long n)			-Metodo intermedio
 * 
 * 		Devuelve un nuevo stream saltandose los n primeros elementos del mismo 
 * 
 *	 Ejemplo:
 */
  			System.out.println("\nStream <T> skip ()");
  			Stream <Integer>st5 = Stream.of(1,2,3,4,5,6,7,8,9);
  			
//  			Creamos st6 a partir de st5 y luego hacemos un forEach para mostrarlo por pantalla
  			
  			//Stream <Integer>st6 = st5.skip(3);
  			//st6.forEach(n -> System.out.print(n + " "));
  			
//  			Aqui mostramos por pantalla lo que valdría st6 pero directamente, 
  			
  			st5.skip(3).forEach(n -> System.out.print(n + " "));
  			
/*	 Comprobaciones		- Metodos Finales
 * 	 ------------------------------------
 * 
 * 	 boolean anyMatch(Predicate<= super T> predicate)			-Metodo final	
 * 
 * 		 Devuelve true si algun elemento del Stream cumple con la condicion del predicado
 * 		 Funciona en modo cortocircuito (en el momento que encuentra un true deja de comprobar el resto)
 * 
 * 	 Ejemplo:
 */ 
   			System.out.println("\n\nboolean anyMatch(Predicate<= super T> predicate)");
  			Stream <Integer>st7 = Stream.of(1,2,3,4,5,6,7,8,9);
  			System.out.println("Alguno mayor que 5? "+ st7.anyMatch(n->n>5));//true
  			
  			
/*	 boolean allMatch(Predicate <? super T> predicate)			-Metodo final
 * 
 * 		 Devuelve true si todos los elementos del Stream cumplen con la condicion del predicado 
 * 		 Funciona en modo cortocircuito (en el momento que encuentra un false deja de comprobar el resto)
 * 
 * 	 Ejemplo:
 */
  			System.out.println("boolean allMatch(Predicate<= super T> predicate)");
  			Stream <Integer>st8 = Stream.of(1,2,3,4,5,6,7,8,9);
  			System.out.println("todos menores de 10? "+ st8.allMatch(n->n<10));//true
  			
/* 	 boolean noneMatch(Predicate <? super T> predicate)			-Metodo final
 * 
 * 		 Devuelve true si ningun elemento del Stream cumple con la condicion del predicado 
 * 		 Funciona en modo cortocircuito (en el momento que encuentra un true deja de comprobar el resto)
 * 
 * 	 Ejemplo:
 */
  			System.out.println("boolean noneMatch(Predicate<= super T> predicate)");
  			Stream <Integer>st9 = Stream.of(1,2,3,4,5,6,7,8,9);
  			System.out.println("ninguno es menor de 10? "+ st9.noneMatch(n->n<10));//false
  	
	}
}
public class V63_MetodosStreamI {

	public static void main(String[] args) {

//		Revision de conceptos 
//		---------------------
		
//		Dado el siguiente stream de nombres, escribir el bloque de codigo que nos indique si alguno
//		de los nombres finaliza por la letra d
		
		Stream<String> nombres = Stream.of("Mario", "Ana", "David", "Belen");
		//System.out.println("Algun nombre termina por d? " + nombres.anyMatch(n->n.endsWith("d")));
		System.out.println("Algun nombre termina por d? " + nombres.anyMatch(n->n.matches("Belen")));
	}

}
