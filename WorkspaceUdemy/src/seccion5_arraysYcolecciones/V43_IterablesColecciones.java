package seccion5_arraysYcolecciones;

/*	 Iterables y Colecciones
 * 	 -----------------------
 * 
 * 	 Iterables
 * 	 ---------
 * 
 * 	 Un iterable es un objeto que puede ser recorrido por un enhaced for
 * 	 Los objetos iterables implementan la interfaz java.lang.Iterable
 * 	 Entre sus metodos se encuentra iterator
 * 	
 * 				Iterator <T> iterator()// devuelve un objeto iterator
 * 
 *   Las listas y los conjuntos son ejemplos de objetos Iterables
    
 *	 	 Interfaz Iterator<E>
 *	 	 --------------------
 *
 *   	 Objeto tipo cursor que permite recorrer el contenido de un Iterable
 *   	 Entre sus metodos destacan:
 *   
 *   		boolean hesNext() 	-> Indica si hay mas elementos que recorrer
 *   		T next()			-> Se desplaza al siguiente elemento y devuelve una referencia al mismo
 *   
 *   			Iterator <Integer> iter = lista.iterator();
 *   			while (iter.hasNext()){
 *   				System.out.println(iter.next());
 *   			}
 * 
 * 	 	 Collection
 * 	 	 ----------
 * 
 * 		 Objeto que contiene una agrupacion de datos
 * 		 La interfaz java.util.Collection representa la interfaz raiz de las colecciones java
 * 		 Hereda Iterable y es heredada por listas y conjuntos
 * 	 	 Proporciona gran parte de los metodos de estas colecciones:
 * 
 * 					add		
 * 					contains
 * 					remove	 
 * 					removeIf 
 * 					size	 
 * 					stream	 
 * 		 
 */

public class V43_IterablesColecciones {

	public static void main(String[] args) {

		
	}

}
