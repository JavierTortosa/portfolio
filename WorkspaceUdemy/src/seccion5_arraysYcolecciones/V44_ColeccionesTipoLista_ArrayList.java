package seccion5_arraysYcolecciones;

import java.util.ArrayList;
import java.util.List;

/*	 COLECCIONES TIPO LISTA
 * 	 ----------------------
 * 
 * 	 Introduccion
 * 	 ------------
 * 
 * 	 Una coleccion es una agrupacion de objetos sin tamaño fijo
 * 	 Se pueden añadir o eliminar elementos dinamicamente
 * 	 Para gestionar colecciones disponemos de clases e interfaces especificas en java.util
 * 	 Tipos:
 * 		Listas
 * 		Tablas
 * 		Conjuntos
 
 * 	 Listas
 * 	 ------
 * 
 * 	 Cada elemento de la lista tiene una posicion asociada a partir del orden de llegada
 * 	 La primera posicion es 0
 * 	 Las listas implementan la interfaz List que a su vez implementa la interfaz Collection
 * 	 Son colecciones de tipo generico (preparadas para admitir cualquier objeto java)
 * 	 La principal clase es ArrayList
  	 
 *	 Clases e interfaces de listas
 *	 -----------------------------
 *
 *	 Las clases Arraylist, Vector y LinkedList implementan List que a su vez implementa Collection que
 *	implementa la interfaz Iterable:
 *
 *		Interface:						Iterable
 *
 *	 	Interface:						Collection
 *
 *		Interface:						List
 *
 *		Clases   :		Arraylist		Vector		LinkedList
 
 *	 Creacion de listas
 *	 ------------------
 *
 *	 Instanciar un ArrayList:
 *
 *		-Normal:
 *	
 *			List <Integer> enteros = new ArrayList<>();
 *			List <Integer> enteros = new Vector<>();
 *			List <Integer> enteros = new LinkedList<>();
 *
 *	 	-A partir del metodo asList de Arrays:
 *
 *				List <Integer> enteros = Arrays.asList(6, 2, 5, 10); 	
 *
 *			- Lista de tamaño fijo
 *			- No admiten insercion ni eliminacion
 *
 * 		-Mediante el metodo de factoria de List:
 * 
 *	 			List <Integer> enteros = List.of(40,29,25,30);			
 * 			
 * 			- Es INMUTABLE
 * 			- No admite insercion, eliminacion o modificacion de elementos
 * 			- No admite elementos NULL
 * 			- No se pueden modificar para nada, ni para ordenar
 *  
 * 		-Mediante el metodo copyOf de List:
 * 
 * 				List <Integer> enteros = List.copyOf(enteros);
 * 
 * 			- Es INMUTABLE
 * 			- No admite insercion, eliminacion o modificacion de elementos
 * 			- No admite elementos NULL
 *			- No se pueden modificar para nada, ni para ordenar 
 *
 *	 ArrayList como tal tiene 3 constructores:
 *
 *		ArrayList() : 
 *			crea un ArrayList VACIO, con una capacidad inicial de 10
 *
 *		ArrayList(int initialCapacity) : 
 *			crea un ArrayList VACIO, con una capacidad inicial de initialCapacity
 *
 *		ArrayList(Collection <? extends E> c):
 *			Crea un ArrayList partiendo de una coleccion 
 *				Ej:	List <Integer> nums = ArrayList(List.of(6,11,22,31,10,5,7));
 
 *	 Principales Metodos para listas
 *	 -------------------------------
 *
 * 	 boolean add (T dato);
 * 
 * 		 Añade el dato a la coleccion y lo coloca al final
 * 		 T representa el tipo indicado al crear el objeto de coleccion
 * 
 *  		ArrayList <String> nombre = new ArrayList<>();
 *  		nombres.add("Maria");	//elemento en posicion 0
 *  		nombres.add("Angel");	//elemento en posicion 1
 *  
 *   boolean add(int pos, T dato);
 *  
 *  	 Añade el dato a la posicion indicada y desplaza todos los elementos hacia el final de la lista
 *  	 
 *  		nombres.add(1, "Luis");	//elemento en posicion 1, angel pasaria a la posicion 2
 *  
 *   T set(int pos, T dato);
 *  
 *  	 Sustituye el elemento existente por dato en la posicion pos
 *  	 Devuelve el valor del elemento sustituido 
 *  
 * 			nombres.set(1, "Laura"); // en la pos 1 pone Laura pero devuelve Luis, no Laura
 * 
 * 	 int size();
 * 
 * 		Devuelve el total de elementos de la coleccion
 * 
 * 	 T get(int pos);
 * 
 * 		Devuelve el elemento que ocupa la posicion pos
 * 		Si pos es menor que 0 o mayor que size se producira una excepcion
 * 
 * 	 T remove (int pos);
 * 
 * 		Borra el elemento contenido en pos y lo devuelve
 * 		Los elementos posteriores se recolocan
 * 		Si pos es menor que 0 o mayor que size se producira una excepcion
 * 	
 * 	 boolean remove (Object ob);
 * 
 * 		Elimina el objeto indicado en caso de que exista
 * 		Devuelve true si dicho elemento estaba presente en la coleccion
 * 		Si hay mas de 1 elemento elimina el primer elemento
 *  
 	 	
 *	 Recorrido de una lista
 *	 ----------------------
 *
 * 	 Mediante un for standard:	
 * 
 * 		for (int i =0 ; i<size(); i++){
 * 			System.out.println(nombres.get(i));
 * 		}
 * 
 * 	 Mediante un for each:
 * 
 * 		for (String n : nombres){
 * 			System.out.println(n);
 * 		} 
 * 			
 * 	 Mediante el metod forEach que se estudia en lambdas
 * 
 
 *	 Revision de Conceptos
 *	 ---------------------
 *
 * 	 Indicar que se mostrara al ejecutar el siguiente codigo
 * 
  		List <Integer> nums = ArrayList(List.of(6,11,22,31,10,5,7)); //1
  		for (int k=0;k<nums.size();k++){
  			if (nums.get(k)%2==0){
  				nums.remove(k);	//2
  			}
  		}
  		
  		System.out.println(nums);
  		
  		a. Error de compilacion linea 1
  		b. Excepcion linea 2
  		c. [11,31,5,7]
  				
  		Respuesta: c. 	 -La primera instruccion compila bien
  						 -Es posible crear un ArrayList a partir de un Collection
  						 -nums es una coleccion ArrayList a pesar de donde vienen 
  						los elementos de la coleccion
  						 -ArrayList es mutable por lo que nums se puede modificar 
  						a pesar de que List.of no es mutable.
*/  						 

public class V44_ColeccionesTipoLista_ArrayList {

	public static void main(String[] args) {

		ArrayList <String> nombres = new ArrayList<>();
		nombres.add("Maria");
		nombres.add("Angel");
		
		nombres.add(1,"Luis");
		
		System.out.println("sustituimos pos 1 (" + nombres.set(1, "Laura")+")");//sustituye Luis por Laura
																				//OJO!!! imprime Luis
		for (String n : nombres)
			System.out.println(n);
		
		System.out.println("size= " + nombres.size());
		System.out.println("El valor de la pos 1= " +  nombres.get(1));
		
		//******************************************************************** Revision de conceptos
		
		List <Integer> nums = new ArrayList(List.of(6,11,22,31,10,5,7)); //1
  		for (int k=0;k<nums.size();k++){
  			if (nums.get(k)%2==0){
  				nums.remove(k);	//2
  			}
  		}
  		
  		System.out.println(nums);
	}

}
