package Apuntes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * 	TEMA 6 CLASES GENERICAS Y COLECCIONES
 * 	-------------------------------------
 * 
 * 	Las clases genéricas encapsulan operaciones que no son específicas de un tipo de datos 
 * determinado como int o string...
 * 
 * 	El uso más común es con colecciones como listas vinculadas, tablas hash, pilas, colas y árboles, entre otros.
 * 
 * 	La adición y eliminación de elementos de la colección se realizan independientemente del tipo de datos.
 * 
 * https://www.pcresumen.com/menu-software/35-lenguajes-de-programacion/java/84-clases-genericas-en-java
 */

/*
 * 	LA INTERFACE LIST
 * 	-----------------
 * 
 * 	Esta interface es la encargada de agrupar una colección de elementos en forma de lista
 * 	En una lista los elementos pueden ser accedidos por un índice que indica la posición del elemento en la colección
 * 	puede implementar uno o más métodos default, pero deberá tener forzosamente un único método abstracto	
 *  cobran su importancia al utilizar expresiones lambda
 * 	
 * 	Esta interfaz también conocida como “secuencia” normalmente acepta elementos repetidos o duplicados
 * 	El primer elemento esta en la posicion 0
 * 	
 * 	Esta interfaz proporciona (la interfaz Iterator e Iterable) llamada ListIterator. 
 * 	Este iterador permite (hasNext, next y remove) métodos para inserción de elementos y reemplazo, 
 * acceso bidireccional para recorrer la lista y un método proporcionado para obtener un iterador empezando en una 
 * posición específica de la lista.
 * 
 * 	Debido a la gran variedad y tipo de listas que puede haber con distintas características como permitir que 
 * contengan o no elementos null, o que tengan restricciones en los tipos de sus elementos, hay una gran cantidad 
 * de clases que implementan esta interfaz.
 */

/*
 * 	ARRAYLIST
 * 	---------
 * 
 * 	ArrayList como su nombre indica basa la implementación de la lista en un array. 
 * 	Es un array dinámico en tamaño pudiendo agrandarse el número de elementos o disminuirse. 
 * 	Implementa todos los métodos de la interfaz List y permite incluir elementos null.
 * 
 * 	Beneficios
 * 	----------
 * 
 * 	Las operaciones de acceso a elementos, capacidad y saber si es vacía o no se realizan de forma eficiente y rápida.
 * 	Todo arraylist tiene una propiedad de capacidad, 
 * 	Cuando se añade un elemento esta capacidad puede incrementarse. 
 * 	Java amplía automáticamente la capacidad de un arraylist a medida que va resultando necesario. 
 * 
 * 	Podemos incrementar la capacidad del arraylist antes de que este llegue a llenarse usando el método 
 * 
 * 			ensureCapacity
 * 
 *  Esta clase no es sincronizada 
 *  	 Si hay varios procesos concurrentes sobre un objeto de este tipo y en dos de ellos se modifica la estructura 
 *  	del objeto se pueden producir errores.
 * 
 * Ejemplo:
 */

class Persona {

	private int idPersona;
	private String nombre;
	private int altura;

	public Persona(int idPersona, String nombre, int altura) {

		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}

	public int getAltura() {
		return altura;
	} // Omitimos otros métodos get y set para simplificar
	
	public void setAltura (int altura) {
		this.altura=altura;
	}

	@Override

	public String toString() {
		return "Persona-> ID: " + idPersona + " Nombre: " + nombre + " Altura: " + altura + "\n";
	}

}

class DemoArraylist {
	public static void main(String[] args) {
		List<Persona> lp = new ArrayList<>();
		Random	r = new Random();
		Persona temp = null;
		int sumaAltura = 0;
		
		for (int i =0; i<20; i++) {
			lp.add(new Persona (i, "Persona"+i, r.nextInt(100)+100));
		}
		
		Iterator<Persona> it = lp.iterator();
		
		while (it.hasNext()) {
			temp = it.next();
			System.out.println(temp);
			sumaAltura += temp.getAltura();
		}
		
		System.out.println("La media de altura es: "+ sumaAltura/lp.size());
		
	}
}

/*
 * 	SETS
 * 	----
 * 
 * 	La interfaz set está presente en el paquete java.util y amplía la interfaz Collection, 
 * 	Es una colección desordenada de objetos en los que no se pueden almacenar valores duplicados. 
 * 	Es una interfaz que implementa el conjunto matemático. 
 * 
 * 	Esta interfaz contiene los métodos heredados de la interfaz Collection 
 * 	Agrega una función que restringe la inserción de elementos duplicados.
 * 
 * 	
 * 	OTROS INTERFACES
 * 	----------------
 * 
 * 	SET
 * 
 * 	La interface SET es la encargada del tratamiento de conjuntos en el api de Java. 
 * 	Un conjunto en Java es una colección de elementos que no permite elementos duplicados dentro de ella 
 * 	No tiene orden entre sus elementos. 
 * 	Más formalmente, no permite elementos e1, e2 tales que: e1.equals(e2) sea true. 
 * 	Además nos obliga a implementar determinados métodos, por ejemplo el método hashCode() entre otros.
 * 
 * 	SORTEDSET
 * 
 * 	Esta interfaz es muy similar a la interface SET. 
 * 	La diferencia en que permite que los elementos dentro del conjunto de la colección estén ordenados totalmente
 *  facilita por tanto su acceso en búsquedas y haciendo más rápido su consulta.
 * 	
 * 	Los elementos son ordenados usando su orden natural, o bien usando un Comparator. 
 * 	El concepto de orden natural y Comparator los hemos estudiado en apartados anteriores del curso.
 * 
 * 	HASHSET
 * 
 * 	HashSet es la clase que vamos a utilizar para implementar la interfaz SET 
 * 	es quizás la más usada para implementar esta interface. 
 * 	Esta clase implementa la interface SET basada en una tabla hash 
 * 	Una tabla hash será una tabla que se construye en base a claves que permiten localizar objetos
 * 	Por ejemplo un DNI podría ser la clave para localizar a una persona. 
 * 	En esta clase la clave da la posición del objeto en la tabla, permitiendo un acceso directo al elemento. 
 * 	esta clase Es ideal para búsqueda, inserción y borrado de elementos en base a una clave o llave. 
 * 	No hay garantía de orden 
 * 	Por ejemplo:
 * 		Si hacemos un recorrido de los objetos dentro de un HashSet no siempre los obtendremos en igual orden
 * 	Se permite el uso de elementos nulos. 
 * 
 * 	
 * 	TREESET
 * 
 * 	TreeSet es la clase que vamos a utilizar como implementación de la interface SORTEDSET. 
 * 	Esta implementación está basada en el uso de una estructura de árbol 
 * 	Los elementos estan ordenados bien por orden natural o bien por orden total definido por un Comparator. 
 * 
 * 	Esto hace muy rápidas las búsquedas, inserciones y borrados de sus elementos. 
 * 	A efectos prácticos, la diferencia principal de esta clase con HashSet es que sus elementos están ordenados. 
 * 	Otra diferencia es la estructura de datos que sirve para almacenar datos: 
 * 		Una tabla 
 * 		Un árbol
 * 
 * Ejemplo 2: 
 * 
 */

/*
 * 	MAP
 * 
 * 	Nos permite representar una estructura de datos para almacenar pares "clave/valor"
 * 	Para una clave solamente tenemos un valor. 
 * 
 * 	nombreMap.size(); Devuelve el numero de elementos del Map
 * 	nombreMap.isEmpty(); Devuelve true si no hay elementos en el Map y false si si los hay
 * 	nombreMap.put(K clave, V valor); Añade un elemento al Map
 * 	nombreMap.get(K clave); Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
 * 	nombreMap.clear();  Borra todos los componentes del Map
 * 	nombreMap.remove(K clave); Borra el par clave/valor de la clave que se le pasa como parámetro
 * 	nombreMap.containsKey(K clave); Devuelve true si en el map hay una clave que coincide con K
 * 	nombreMap.containsValue(V valor); Devuelve true si en el map hay un Valor que coincide con V
 * 	nombreMap.values(); Devuelve una "Collection" con los valores del Map
 * 
 * 	Otro elemento importante a la hora de trabajar con los Maps son los "Iteradores" (Iterator). 
 * 	Los Iteradores sirven para recorrer los Map y poder trabajar con ellos.
 * 	Solo tienen tres métodos que son:
 * 
 *  	“hasNext()” para comprobar que siguen quedando elementos en el iterador
 *  	“next()”  para que nos de el siguiente elemento del iterador
 *  	“remove()” que sirve para eliminar el elemento del Iterador.
 * 
 * 	TIPOS DE MAPS
 * 
 * 	HASHMAP
 * 
 * 	No tienen un orden especifico
 * 	No aceptan claves duplicadas
 * 	No aceptan valores nulos
 * 
 * 	TREEMAP
 * 
 * 	Se ordena de forma natural
 * 	
 * 	LINKEDHASHMAP
 * 
 * 	Mantiene el orden de los elementos por el que se han introducido
 * 	La busqueda es mas lenta
 */

/*
 *	COMPARABLE
 *
 *	Comparable es uno de los conceptos más fundamentales en cuando a manejo de las APIS básicas
 *	el interface Comparable para comparar objetos entre sí y poderlos ordenar.
 *
 * 	Ejemplo:
 *
 
 public class Persona implements Comparable<Persona>{  // implementamos el interface Comparable
         public int dni, edad;
          public Persona( int d, int e){
          this.dni = d;
          this.edad = e;
   }

    public int compareTo(Persona o) {							// nos obliga a implementar el metodo compareTo
        int resultado=0;
        if (this.edad<o.edad) {   resultado = -1;      }		// con un condicional debemos devolver 
        else if (this.edad>o.edad) {    resultado = 1;      }	// un valor 1 ó -1 para establecer el orden 
        else {
            if (this.dni<o.dni) {  resultado = -1;    }
            else if (this.dni>o.dni) {   resultado = 1;   }
            else {   resultado = 0;   }
        }
        return resultado;
    }

}
*/

/*
 *	COMPARATOR
 *
 * 	El objeto Comparator se utiliza para comparar dos objetos diferentes en la misma clase o dos clases diferentes 
 * con la ayuda de la implementación de la interfaz java.lang.Comparator.
 * 
 * 	Usamos comparadores cuando hay más de una forma de comparar los dos objetos. 
 * 	Para utilizar la interfaz Comparator, la clase debe implementar el método compare(). 
 * 	Puede usarse para comparar dos objetos de una manera que podría no alinearse con el orden natural del objeto.
 * 
 *	
 *
 * 
 */


public class Apuntes_F2_T6 {

	public static void main(String[] args) {
		
	}
}
