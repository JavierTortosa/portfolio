package seccion7_LambdasStreams;

/*	--------------	METODOS INTERMEDIOS --------------

Stream <T> distinct ()						 Devuelve un stream eliminando elementos duplicados segun 
											aplicacion de equals
Stream <T> limit (long n)					 Devuelve un nuevo stream con los n primeros elementos del mismo
Stream <T> skip (long n)					 Devuelve un nuevo stream saltandose los n primeros elementos 
											del mismo
Stream <T> filter 
	(Predicate<? super T> predicate)	 	 Aplica un filtro sobre el stream devolviendo un nuevo stream 
											con los elementos que cumplen el predicado
Stream <R> map 
	(Function <? super T, ? extends R> mapper)	 Transforma cada elemento del Stream en otro segun el criterio 
												definido por Function
IntStream mapToInt 
	(ToIntFunction <? super T> mapper)		 Aplica una funcion a cada elemento del stream que genera un int de 
											cada elemento. Devuelve un IntStream con el resultado
DoubleStream mapToDouble 
	(ToDoubleFunction <? super T> mapper)	 Aplica una funcion a cada elemento del stream que genera un 
											double de cada elemento. Devuelve un DoubleStream con el resultado
LongStream mapToLong 
	(ToLongFunction <? super T> mapper)		 Aplica una funcion a cada elemento del stream que genera un long 
											de cada elemento. Devuelve un LongStream con el resultado
Stream <R> flatMap 
	(Function <T, Stream<R>> mapper)		 Devuelve un nuevo Stream resultante de unir los Streams generado
											por la aplicacion de una funcion sobre cada elemento
Stream <T> peek 
	(Consumer <? super T> proceso)			 Aplica el proceso a cada elemento y devuelve un stream identico
											para continuar con la manipulacion de los elementos
Stream <T> sorted()							 Devuelve un stream ordenado segun el orden natural de los mismos
Stream <T> sorted
	(Comparator <? super T> comparator)		 Devuelve un stream ordenado segun el criterio de ordenacion 
											especificado






 */

public class Resumen_Metodos_Intermedios {

}
