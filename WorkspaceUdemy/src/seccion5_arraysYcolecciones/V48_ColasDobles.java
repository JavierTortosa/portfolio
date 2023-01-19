package seccion5_arraysYcolecciones;

/*	 Colas Dobles
 * 	 ------------
 * 
 * 	 Son un tipo de coleccion especial que puede funcionar como cola o como pila
 * 	 Permite añadir elementos por ambos extremos
 *	 Implementa la interfaz Deque, que a su vez hereda Queue
 *	 Como el resto de colecciones es de tipo generico
 *	 La principal clase de Deque es ArrayDeque
 
 * 	 Clases e interfaces
 * 	 -------------------
 * 
 * 		Interfaz:					Iterable
 * 
 * 		Interfaz:					Collection
 * 
 * 		Interfaz:					Queue
 * 
 * 		Interfaz:					Deque
 * 	
 * 		Clases	:		ArrayDeque			LinkedList	
 * 
 
 *	 Creacion de Deque
 *	 -----------------
 *
 * 	 Se crearan como instancias de ArrayDeque o de cualquiera de las otras clases que implementa la interfaz
 * 
 * 			Deque <String> nombres = new ArrayDeque<>();
 * 
 * 			Deque <Integer> numeros = new LinkedList<>();
 * 
 
 *	 Metodos Deque
 *	 -------------
 *
 * 	 boolean add (T dato)
 * 
 * 		Añade el dato al final del Deque comportandose como una cola
 * 
 * 			Deque <Integer> cola = new LinkedList<>();
 * 			cola.add(1);
 * 			cola.add(2);
 *  		cola.add(3);
 *  		cola.add(4);
 * 
 * 		Obtendremos un Deque de esta forma -> 1, 2, 3, 4
 * 
 * 	 boolean push (T dato)
 * 
 * 		Añade el dato a la cabecera del Deque comportandose como una pila
 * 
 *  		Deque <Integer> pila = new LinkedList<>();
 * 			pila.push(1);
 * 			pila.push(2);
 *  		pila.push(3);
 *  		pila.push(4);
 * 
 * 		Obtendremos un Deque de esta forma -> 4, 3, 2, 1
 * 
 * 	 E poll()
 * 
 * 		Extrae y elimina el elemento de la cabecera
 * 		Devuelve el elemento extraido
 * 
 * 			System.out.println (cola.poll()); // esto elimina el 1
 * 			System.out.println (pila.poll()); // esto elimina el 4
 * 
 * 	 E remove()
 * 
 * 		Extrae y elimina el elemento de la cabecera (funciona igual que poll)
 * 
 * 	 E peek() y E element()
 * 
 * 		Devuelven el elemento de cabecera pero sin eliminarlo
 * 
 * 	 int size()
 * 
 * 		Devuelve el tamaño del Deque
 * 
 
 *	 Recorrido de un Deque
 *	 ---------------------
 *
 * 	 Se puede recorrer con un for each
 * 	 Recupera cada elemento desde la cabecera hacia el final
 * 	 
 * 			for (String s: pila){
 * 				System.out.println(s);
 * 			}
 * 
 * 	 Tambien dispone del metodo forEach que estudiaremos en lambdas
 */

public class V48_ColasDobles {

	public static void main(String[] args) {

	}

}
