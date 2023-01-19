package seccion7_LambdasStreams;

/*	--------------	METODOS FINALES --------------

long count()								 Devuelve el numero de elementos de un Stream
void forEach (Consumer<? super T>action)	 Realiza una operacion para cada elemento del stream
boolean anyMatch
	(Predicate<= super T> predicate)		 Devuelve true si algun elemento del Stream cumple con la 
											condicion del predicado (cortocircuito)
boolean allMatch
	(Predicate <? super T> predicate)		 Devuelve true si todos los elementos del Stream cumplen con la 
											condicion del predicado (cortocircuito)
boolean noneMatch
	(Predicate <? super T> predicate)		 Devuelve true si ningun elemento del Stream cumple con la 
											condicion del predicado (cortocircuito)
Optional <T> FindFirst()					 Devuelve el primer elemento del Stream o un Optional vacio si  
											no hay nada
Optional <T> FindAny()						 Devuelve cualquiera de los elementos del Stream, normalmente 
											el primero
Optional <T> max
	(Comparator <? super T> comparator)		 Devuelve el ultimo de los elementos segun el criterio de 
											comparacion	del objeto Comparator
Optional <T> min
	(Comparator <? super T> comparator)		 Devuelve el primero de los elementos segun el criterio de 
											comparacion	del objeto Comparator																			
Optional <T> reduce 
	(BinaryOperator <T> accumulator)		 Realiza una reduccion de los elementos del stream a un unico valor 
											utilizando la funcion proporcionada
R collect 
	(Collector<? super T, A, R> collector)	 Devuelve un List, Map o Set con los datos del Stream en funcion de 
											la implementacion de Collector











 */

public class Resumen_Metodos_Finales {

}
