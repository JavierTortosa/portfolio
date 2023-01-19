package seccion7_LambdasStreams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

class MetodosII{
	public static void main(String[] args) {
		
	
/*	 Metodos Stream II
 * 	 -----------------
 * 
 * 	 Filtrado		-Metodo Intermedio
 * 	 ---------------------------------
 * 
 * 	 Stream <T> filter (Predicate<? super T> predicate)		-Metodo Intermedio
 * 
 * 		Aplica un filtro sobre el stream devolviendo un nuevo stream con los elementos que cumplen el predicado
 * 
 * 	 Ejemplo:
 */
			System.out.println("Stream <T> filter (Predicate<? super T> predicate)");
			Stream <Integer> st1 = Stream.of(7,5,7,3,6,2,3,8,5);
			//cuenta el total de numeros mayores de 3 no duplicados
			System.out.println(st1 //muestra por pantalla el stream st
					.distinct() //de los numeros que sean distintos (que no esten duplicados)
					.filter(s->s>3) //aplica un filtro a los que sean mayores que 3
					.count()); //y suma cuantos hay ----- Total 4
			
/*	 Busquedas		-Metodos Finales
 * 	 -------------------------------
 * 
 *   Optional <T> FindFirst()		-Metodos Finales
 *  
 *  	Devuelve el primer elemento del Stream o un Optional vacio si no hay nada
 *  
 *   Ejemplo:
 */
			System.out.println("\nOptional <T> FindFirst()");
			Stream <Integer> st2 = Stream.of(7,5,7,3,6,2,3,8,5);
			Optional <Integer> op = st2
					.filter(s -> s % 2 == 0)
					.findFirst();
			if (op.isPresent()) {
				System.out.println("El primer par es " + op.get());
			}
			
/* 	 Optional <T> FindAny()			-Metodos Finales
 *  
 *  	Devuelve cualquiera de los elementos del Stream, normalmente el primero
 *  
 *   Ejemplo:
 */
			System.out.println("Optional <T> FindAny()");
			Stream <Integer> st3 = Stream.of(7,5,7,3,6,2,3,8,5);
			Optional <Integer> op2 = st3
					.filter(s -> s % 2 == 0)
					.findAny();
			if (op2.isPresent()) {
				System.out.println("El par es " + op2.get());
			}
			
/* 	 La clase Optional<T>
 * 	 --------------------
 * 
 * 	 Encapsula resultados de una operacion final de un stream
 * 	 Podemos usar los siguientes metodos:
 * 
 * 		T get()					Devuelve el valor encapsulado
 * 								Si no hay ningun valor lanza una NoSuchElementException
 * 		T orElse() (T other)	Devuelve el valor encapsulado
 * 								Si no hay ninguno, devuelve el valor other y asi evitamos la excepcion
 * 		boolean isPresent()		Si tiene algun valor devuelve true
 * 		boolean isEmpty()		Si NO tiene ningun valor devuelve true
 * 		
 * 	 Existen variantes OptionalInt y OptionalDouble que encapsulan tipos primitivos
 *
 
 * 	 Obtencion de extremos		-Metodos finales
 * 	 -------------------------------------------
 * 
 * 	 Optional <T> max(Comparator <? super T> comparator)		-Metodo Final
 * 
 * 		Devuelve el ultimo de los elementos segun el criterio de comparacion del objeto Comparator
 * 
 * 	 Ejemplo:
 */
			System.out.println("\nOptional <T> max(Comparator <? super T> comparator)");
			Stream <Integer> nums = Stream.of(7,5,7,3,6,2,3,8,5);
			Optional <Integer> op3 = nums.max((a,b)->a-b);//orden de menor a mayor y devuelve el utlimo 
			System.out.println("El mayor es " + op3.get());
			
/* 	 Optional <T> min(Comparator <? super T> comparator)		-Metodo Final
 * 
 * 		Devuelve el primero de los elementos segun el criterio de comparacion del objeto Comparator	 
 * 
 * 	 Ejemplo:
 */
			System.out.println("Optional <T> min(Comparator <? super T> comparator)");
			Stream <Integer> nums2 = Stream.of(7,5,7,3,6,2,3,8,5);
			Optional <Integer> op4 = nums2.min((a,b)->a-b);//orden de menor a mayor y devuelve el primero 
			System.out.println("El menor es " + op4.get());
	}
}

public class V64_MetodosStreamII {

	public static void main(String[] args) {

//		Prueba de min y max
		
		//orden de menor a mayor
		System.out.print("max de menor a mayor -> ");
		Stream <Integer> nums = Stream.of(7,5,7,3,6,2,3,8,5);
		Optional <Integer> op3 = nums.max((a,b)->a-b);//		establecemos el orden 
		System.out.println("El ultimo elemento es " + op3.get());

		//orden de mayor a menor
		System.out.print("max de mayor a menor -> ");
		Stream <Integer> nums_ = Stream.of(7,5,7,3,6,2,3,8,5);
		Optional <Integer> op3_ = nums_.max((a,b)->b-a);//		establecemos el orden 
		System.out.println("El ultimo elemento es " + op3_.get());
		
		
		//orden de menor a mayor
		System.out.print("\nmin de menor a mayor -> ");
		Stream <Integer> nums2 = Stream.of(7,5,7,3,6,2,3,8,5);
		Optional <Integer> op4 = nums2.min((a,b)->a-b);//		establecemos el orden 
		System.out.println("El primer elemento es " + op4.get());
		
		//orden de mayor a menor
		System.out.print("min de mayor a menor -> ");
		Stream <Integer> nums2_ = Stream.of(7,5,7,3,6,2,3,8,5);
		Optional <Integer> op4_ = nums2_.min((a,b)->b-a);//		establecemos el orden 
		System.out.println("El primer elemento es " + op4_.get());
		
//		Revision de conceptos
		
//		Que se mostrara al ejecutar este codigo?
		System.out.println("\n\nRevision de conceptos");
		
		Stream <Integer> num = Stream.of(15,-3,21,7,9,-4,7);
		System.out.println(num
				.filter(n -> n<0)
				.max((a,b)->a-b)
				.get()
				); //Resultado : -3
		
		//si no se llama al get()
		
		Stream <Integer> num_ = Stream.of(15,-3,21,7,9,-4,7);
		System.out.println(num_
				.filter(n -> n<0)
				.max((a,b)->a-b)
				); //Resultado : Optional[-3]
	}
}
