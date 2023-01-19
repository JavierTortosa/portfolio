package seccion7_LambdasStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*	 Interfaces java.util.function
 * 	 -----------------------------
 * 
 * 	 Conjunto de interfaces funcionales incorporadas en java 8 dentro del paquete
 * 
 * 			java.util.function
 * 
 * 	 Se utilizan como argumentos en metodos que manipulan datos:
 * 
 * 		Establecimiento de criterios de filtrado
 * 		Operacion sobre elementos
 * 		Transformacion
 * 		etc...
 * 
 * 	 Normalmente se implementan con lambdas
 * 
 
 *	 Interfaz Predicate<T>
 *	 ---------------------
 *
 * 	 Dispone del metodo abstracto test
 * 	 A partir de un objeto realiza una comprobacion y devuelve un boolean
 * 
 * 			boolean test (T t)
 * 
 * 	 Utilizada para la definicion de criterios de filtrado
 * 
 * 	 	Ejemplo:	removeIf() de Collection
 * 
 * 			//elimina elementos que cumplen con la condicion del filtro
 * 		
 * 				boolean removeIf(Predicate <? super T> filtro)
 * 
 * 					<? super T>	: cualquier super tipo de T
 * 								: si el removeIf es de una lista de enteros, el predicate tambien es entero
 * 
 * 			//eliminacion de numeros pares de una coleccion
 * 
 * 				lista.removeIf(n -> n % 2 == 0);
 * 
 * 	 Variante BiPredicate<T,U> con dos parametros:
 * 
 * 			boolean test (T t, U u)
 * 
 
 *	 Interfaz Function<T,R>
 *	 ----------------------
 *
 * 	 Metodo abstracto apply
 * 	 A partir de un objeto realiza una operacion y devuelve el resultado
 * 
 * 			R apply (T t)
 * 
 * 	 Utilizado en operaciones de transformacion de datos
 * 		
 * 		Ejemplo:	map() de Stream
 * 
 * 			//transforma cada elemento del Stream tipo T en otro tipo R
 * 
 * 				Stream<R> map (Function<? super T, ? extends R> mapper)
 * 
 * 					<? super T	:	tipo del parametro dado
 * 					? extends R>:	tipo del resultado
 * 
 *  		//genera un nuevo Stream con la longitud del stream original
 *  
 *   			st.map(cad -> cad.length()); //convierte "String cad" en la longitud de cada "cad"
 *   
 *   Variante BiFunction<T,U,R> con dos parametros
 *   
 *   			R apply (T t, U u)
 * 
 
 *	 Interfaz Consumer<T>
 *	 --------------------
 *
 * 	 Metodo abstracto accept
 * 	 Realiza algun tipo de procesamiento con el objeto
 * 	 
 * 			void accept(T t)
 * 
 * 	 Utilizada en operaciones de procesamiento de datos
 * 	
 * 	 Ejemplo:	forEach() de listas y conjuntos
 * 
 * 		//Aplica las operaciones del metodo a cada elemento de la lista
 * 
 * 			void forEach(Consumer<? super T> action)
 * 
 * 		//Imprime el contenido de la lista
 * 
 * 			lista.forEach(n-> System.out.Println(n));
 * 
 * 	 Variante BiConsumer<T,U) con dos parametros
 * 
 * 			void accept (T t, U u)
 * 
 
 *	 Interfaz Supplier<T>
 *	 --------------------
 *
 * 	 Dispone del metodo abstracto get
 * 	 No recibe ningun parametro y devuelve como resultado un objeto
 * 
 * 			T get()
 * 
 * 	 Utilizada para implementar operaciones de extraccion de datos
 * 
 * 	 Ejemplo:	generate() de Stream
 * 
 * 		//genera una secuencia infinita de elementos proporcionados por llamadas get()
 * 
 * 			static Stream<T> generate(Suuplier<T> s)
 * 
 * 		//devuelve un stream de numeros aleatorios entre 1 y 500
 * 
 * 			Stream.generate(() -> (int)(Math.random()*500+1));
 * 
 
 *	 Interfaz UnaryOperator <T>
 *	 --------------------------
 *
 *	 Subinterfaz de Function donde el tipo de entrada coincide con el de salida
 *
 *			T apply (T t)
 *
 *	 Se emplea en contextos de transformacion de datos
 *
 *	 Ejemplo:	replaceAll() de Collection
 *
 *		//reemplaza cada elemento de la coleccion por otro resultante de la aplicacion de la funcion
 *
 *			void replaceAll(UnaryOperator<? super T> oper)
 *
 *		//sustituye cada elemento de la coleccion por su cuadrado
 *
 *			lista.replaceAll(n->n*n);
 * 
 * 	 Variante BinaryOperator <T> equivalente a BiFunction<T,T,T>
 * 
 
 *	 Resumen:
 *	 --------
 *
	 Interfaz					Metodo						Ejemplo												Metodo Abstracto
	 -------------------------- --------------------------- --------------------------------------------------- -------------------------------------------------------

 Interfaz Predicate<T>			boolean test (T t)			lista.removeIf(n -> n % 2 == 0);					boolean removeIf(Predicate <? super T> filtro)
 Variante BiPredicate<T,U>		boolean test (T t, U u)
	Se utilizan como argumentos en metodos que manipulan datos

 Interfaz Function<T,R>			R apply (T t)				st.map(cad -> cad.length());						Stream<R> map (Function<? super T, ? extends R> mapper)
 Variante BiFunction<T,U,R>		R apply (T t, U u)
	A partir de un objeto realiza una operacion y devuelve el resultado
	
 Interfaz UnaryOperator <T>		T apply (T t)				lista.replaceAll(n->n*n);							void replaceAll(UnaryOperator<? super T> oper)
 Variante BinaryOperator <T>	BiFunction<T, T, T>
 	Subtipo de function que hace lo mismo pero los tipos de parametro y retorno son iguales

 Interfaz Consumer<T>			void accept(T t)			lista.forEach(n-> System.out.Println(n));			void forEach(Consumer<? super T> action)
 Variante BiConsumer<T,U)		void accept (T t, U u)
	Realiza algun tipo de procesamiento con el objeto

 Interfaz Supplier<T>			T get()						Stream.generate(() -> (int)(Math.random()*500+1));	static Stream<T> generate(Suuplier<T> s)
	No recibe ningun parametro y devuelve como resultado un objeto

 *
 
 *	 Revision de conceptos
 *	 ---------------------
 *
 * 	 Indicar que interfaz funcional implementa cada una de estas lambdas
 * 
 * 		a. () -> Math.random()*5;					: Supplier 		: 	no recibe parametros 
 * 																		realiza una operacion
 * 	
 * 		b. (n) -> n.length();						: Function		: 	recibe un parametro de un tipo
 * 																		devuelve un resultado de otro tipo
 * 		
 * 		c. a -> a>10;								: Predicate		:	recibe un parametro
 * 																		hace una comprobacion
 * 																		devuelve un boolean
 * 
 *  	d. (x,y) -> System.out.println(x+":"+y);	: BiConsumer	:	recibe dos parametros
 *  																	no devuelve nada
  
 *	 Interfaces par tipos primitivos:
 *	 -------------------------------- 
 * 
 * 	 Versiones de las interfaces anteriores pero para tipos primitivos ya que las funciones anteriore era
 * 	para cualquier tipo de objeto
 * 
 * 	 			Interfaz				Metodo
 * 				----------------------- ----------------------- 
 * 
 * 				IntPredicate			boolean test(int t)		
 * 				IntFunction<R>			R apply(int t)			
 * 				IntConsumer				void accept(int t)		
 * 				IntSupplier				int getAsInt			
 * 				IntUnaryOperator		int applyAsInt(int t)	
 * 
 * 	 Tambien hay versiones para long y para double
 * 
 
 *	 Revision de Conceptos
 *	 ---------------------
 *
 * 	 Dada la siguiente lista, escribir un codigo que muestre solo los numeros pares ordenados de mayor a menor
 * 
 * 		List<Integer> nums = List.of(10,4,21,3,17,8,20,11);
 * 
 */

class PruebaOrdenacion2{
	public static void main(String[] args) {
		List<Integer> nums = List.of(10,4,21,3,17,8,20,11);
		
		List<Integer> nums1 = new ArrayList<>(nums);
		
		//ordenar la lista
		
		// implementando compare de comparator
		nums1.sort((a,b)->b-a);
		
		//con el metodo estatico reverseOrder()
			//El orden natural para los numeros es de menor a mayor
			//Este metodo va a ordenar la lista en orden inverso al natural, no invierte el orden	
		nums1.sort(Comparator.reverseOrder());	
		
		nums1.removeIf(n-> n%2 !=0); //eliminar los impares
		
		nums1.forEach(n -> System.out.println(n));//mostrar por pantalla
	}
}

public class V60_Interfaces_java_util_function {

	public static void main(String[] args) {
		List<String> numbers=Arrays.asList("one","two","three");
		Consumer<String> cs=s->System.out.print(s);
		Consumer<String> out=cs.andThen(a->System.out.println(":"+a.toUpperCase()));
		numbers.forEach(out);
	}
}
