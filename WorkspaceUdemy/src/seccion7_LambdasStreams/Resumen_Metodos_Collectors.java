package seccion7_LambdasStreams;

/*	--------------	METODOS DE COLLECTORS --------------

	Sintaxis:
	
		Partimos de collect:
		
				<R,​A> R collect​(Collector<? super T,​A,​R> collector)
				
				R -> el tipo del resultado
				A -> el tipo de acumulación intermedia del Colector
				T -> el tipo del stream
				
		Como Collector no es una interfaz funcional utilizamos los metodos de Collectors
		
				nombre_stream.collect(Collectors.metodo)

 	Metodos:
 	
 toList()		public static <T> Collector<T,​?,​List<T>> toList()		Convierte el Stream en un arrayList
 
 toSet()		public static <T> Collector<T,​?,​Set<T>> toSet()			Convierte el Stream en un set
 
 toMap()		public static <T,​K,​U> Collector<T,​?,​Map<K,​U>> toMap​(	Convierte el Stream en un map
 					Function<? super T,​? extends K> keyMapper, 				funcion para conseguir la key
 					Function<? super T,​? extends U> valueMapper)			funcion para conseguir el value
 
 
 
 
 
 
 
 
 
 
 
 */




public class Resumen_Metodos_Collectors {

}
