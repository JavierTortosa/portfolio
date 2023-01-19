package seccion7_LambdasStreams;

import java.util.Optional;
import java.util.stream.Stream;

class MetodosIV {
	public static void main(String[] args) {
		
/*	 Metodos Stream IV
 * 	 -----------------
 * 
 * 	 Procesamiento intermedio		- Metodos intermedios
 * 	 ----------------------------------------------------
 *  
 * 	 Stream <T> peek (Consumer <? super T> proceso)		- Metodo Intermedio
 * 
 * 		Aplica el proceso a cada un de los elementos del stream
 * 		Devuelve un stream identico para continuar con la manipulacion de los elementos
 * 
 * 	 Ejemplo
 */
			Stream <Integer> nums = Stream.of(20,5,8,3,9);
			//muestra los pares y el total de estos
			System.out.println("En total hay "+nums
					.filter(n->n%2==0)
					.peek(n->System.out.println("par:" + n))
					.count()
					);
			
/* 	 Revision de conceptos
 * 	 ---------------------
 * 
 * 	 Que se mostrara al ejecurtar los siguientes codigos?
 */ 
			System.out.println("\nRevision de conceptos\n");
			
			Stream <Integer> num = Stream.of(20,5,8,3,9);
			num.peek(n -> System.out.println("esto: " + n));
			
 /* 
 * 	 Respuesta: NADA porque peek es un metodo intermedio. 
 * 				Hasta que no se ponga un metodo final los streams estan en modo lazy y no hacen nada 
 */ 
			Stream <Integer> num2 = Stream.of(20,5,8,3,9);
			num2.peek(n->System.out.println(n)).allMatch(n->n>5);
/* 				
 * 	 Respuesta: Solo mostrara el 20 y el 5, porque allMatch funciona en modo cortocircuito y en el momento
 * 				que encuentra un elemento que no cumple la condicion, devuelve false y se para
  		
 *	 Ordenacion			-Metodos intermedios
 *	 ---------------------------------------
 *
 * 	 Stream <T> sorted()	-Metodo intermedio
 * 
 * 		Devuelve un stream ordenado segun el orden natural de los mismos
 * 
 * 	 Ejemplo:
 */
			System.out.println("\nStream <T> sorted()");
			Stream <String> st = Stream.of("pelota","casa","lampara","disco");
			//muestra los nombres ordenados por orden natural
			st.sorted()
			.forEach(s->System.out.println(s));
/*	 Stream <T> sorted(Comparator <? super T> comparator)		-Metodo intermedio
 * 		
 * 		Devuelve un stream ordenado segun el criterio de ordenacion especificado
 * 
 * 	 Ejemplo:
 */
			System.out.println("\nStream <T> sorted(Comparator <? super T> comparator)");
		 
			Stream <String> st1 = Stream.of("pelota","casa","lampara","disco");
			//muestra los nombres ordenados por numero de caracteres
			st1.sorted((a,b)->a.length()-b.length())
			.forEach(s->System.out.println(s));
			
			/* Ej. usando un metodo estatico de Comparator
			 
			Stream <Persona> st = Stream.of(new Persona("Marco",25),new Persona("ana",28));
			//muestra los nombres de las personas ordenadas por edad
			st.sorted(Comparator.comparing(p->g.getEdad()))
				.forEach((p->System.out.println(p.getNombre()));
			*/	
			
/* 	 Reduccion			-Metodo Final
 * 	 --------------------------------
 * 
 * 	 Optional <T> reduce (BinaryOperator <T> accumulator)	-Metodo final
 * 
 * 		Realiza una reduccion de los elementos del stream a un unico valor utilizando la funcion proporcionada
 * 
 *   Ejemplo:
 */
			System.out.println("\nOptional <T> reduce (BinaryOperator <T> accumulator)");
			
			Stream <Integer> num3 = Stream.of(20,5,8,3,9);
			//Calcula la suma de todos los elementos del stream
			System.out.println(num3
					.reduce((variableAuxiliar,elementoSiguiente) -> variableAuxiliar+elementoSiguiente)
					.get());// 45
			
/* 	 Revision de conceptos
 * 
 * 	 Escribir el codigo para sumar los 3 numeros pares mas pequeños del siguiente Stream
 */
			System.out.println("\nRevision de conceptos");
			System.out.println("Escribir el codigo para sumar los 3 numeros pares mas pequeños\n");
			Stream <Integer> numeros = Stream.of(11,20,5,8,3,9,4,10,2);
			
			// metodo guardando el stream en una variable
			Optional <Integer> total =												
					numeros
						.filter(f->f%2==0)
						.sorted()
						.limit(3)
						
						.peek(p-> System.out.println("numero a sumar: " + p))
						
						.reduce((a, b)->a+b)
					;																
						
			
			System.out.println("El total da: " + total.get());
			
			// metodo mostrando directame
			System.out.println();
			
			Stream <Integer> numeros_ = Stream.of(11,20,5,8,3,9,4,10,2);
			
			System.out.println(	"El total con el metodo 2 da: " + 													
					numeros_
						.filter(f->f%2==0)
						.sorted()
						.limit(3)
						
						.peek(p-> System.out.println("numero a sumar: " + p))
						
						.reduce((a, b)->a+b)
						.get()														
					);																
			
			
			
 /* 
 * 
 * 		
 */
	}
}
public class V67_MetodosStreamIV {

	public static void main(String[] args) {

		
	}

}
