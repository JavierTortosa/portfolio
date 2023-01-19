package seccion5_arraysYcolecciones;

/*	 Colecciones tipo Conjunto
 * 	 -------------------------
 * 
 * 	 Los elementos no tienen posicion ni clave asociada
 * 	 Los elementos son unicos y no se pueden repetir
 * 	 Emplea internamente los metodos equals y hashCode para determinar la igualdad de objetos
 * 	 Los conjuntos implementan la interfaz Set que es de tipo generico
 * 	 La principal clase de conjuntos es hashSet
 
 *	 Clases e Interfaces de conjuntos
 *	 --------------------------------
 *
 *		Inteface:					Iterable
 *	
 *		Inteface:					Collection
 *	
 *		Inteface:					Set
 *
 * 		Clases	:			HashSet				TreeSet	 
 * 	 
 * 			HashSet los elementos estan sin ordenar
 * 			En un TreeSet los elementos estan ordenados segun el tipo de elemento
 * 				String -> orden alfabetico
 * 				Integer -> de menor a mayor
 
 *	 Creacion de Conjuntos
 *	 ---------------------
 *
 * 	 Como instanciar objetos de HashSet:
 * 
 * 	 Normal:
 * 
 * 			Set <String> nombres = new HashSet<>();
 * 
 * 	 Mediante metodo de factoria Set:
 * 	
 * 			Set <String> nombres = set.of("Maria", "Luis", "Pedro");
 * 
 *				ofEntries() es INMUTABLE
 *				No admiten la insercion, modificacion o eliminacion de elementos
 *				NO ADMITEN CLAVES NI VALORES NULL
 *
 * 	 Mediante el metodo copyOf de Set:
 *
 * 			Set <String> nuevos = Set.copyOf(nombres);
 * 
 *				ofEntries() es INMUTABLE
 *				No admiten la insercion, modificacion o eliminacion de elementos
 *				NO ADMITEN CLAVES NI VALORES NULL
  
 *	 Metodos de HashSet
 *	 ------------------
 *
 * 	 boolean add (T dato)
 * 
 * 		 Añade el dato a la coleccion si no esta presente
 * 	 	 Devuelve true si lo ha podido añadir y false si no
 * 
 * 				HashSet <String> dias = new HashSet<>();
 * 				dias.add("Lunes");
 * 				dias.add("Martes");
 * 				dias.add("Lunes"); // no lo añade
 * 
 * 	 boolean remove (T dato)
 * 
 * 		 Elimina el elemento si se encuentra en la coleccion
 * 
 * 	 int size()
 * 
 * 		 Devuelve el tamaño de la coleccion
 * 
 * 	 boolean contains(Object ob)
 * 
 * 		 Devuelve true si el dato esta en la coleccion
  
 * 	 Recorrido de un conjunto
 * 	 ------------------------
 * 
 * 	 Puede ser recorrido con un for each
 * 
 * 			for(String s: dias){
 * 				System.out.println(s);
 * 			}
 * 
 * 	 Tambien dispone del metodo forEach que estudiaremos con las lambdas
 * 
 */

public class V47_ColeccionesTipoConjunto_Set {

	public static void main(String[] args) {

		
	}

}
