package Pregunta_1;


/* 
 *  Primeramente, se define una Clase que será utilizada como el principal objeto en las agrupaciones 
 *  ("Collections") descritas a continuación, esta Clase se encuentra compuesta por dos campos y un constructor 
 *  para la asignación de valores.
 * 
 */

/*	PREGUNTA 1
 * 	----------
 * 
	PASO 1
  	Como primer paso se importan las librerías de java.util.* donde se
	concentran la gran mayoría de las Clases del "Collection
	Framework".
	
	PASO 2
	• Posteriormente se inicia la declaración de la Clase seguido de su
	método principal main.

	PASO 3
	• Se definen 5 instancias de la Clase Producto diseñada
	anteriormente, donde cada instancia recibe sus valores de acuerdo
	a la definición del Constructor.
	
	PASO 4
	• Seguido son agregadas estas instancias al ArrayList mediante el
	método add, para posteriormente imprimir el número de Objetos en
	el "Collection" mediante el método size.
	
	PASO 5
	• Se declara una instancia Iterator la cual facilita la extracción de
	objetos en "Collections", para así extraer los valores del ArrayList e
	imprimirlos a pantalla.
	
	PASO 6
	• Una vez impresos los valores del ArrayList es eliminado el objeto
	con índice número 2, e impreso de nuevo el tamaño del ArrayList
	con el método size.
	
	PASO 7
	• Se define otro ciclo de extracción a través de Iterator para el
	ArrayList, y finalmente se eliminan todos los valores del
	"Collection" mediante el método clear
 */

//PASO 1
import java.util.*;

class Producto{
	Producto(String s, int i){
		nombre = s;
		cantidad = i;
	}
	
	String nombre;
	int cantidad;
}

//PASO 2
public class Pregunta1 {

	public static void main(String[] args) {
		
		//PASO 3
		Producto producto1 = new Producto("producto1", 10);
		Producto producto2 = new Producto("producto2", 20);
		Producto producto3 = new Producto("producto3", 30);
		Producto producto4 = new Producto("producto4", 40);
		Producto producto5 = new Producto("producto5", 50);
		
		//PASO 4
		ArrayList<Producto> listaDeProductos = new ArrayList<>();
		
		listaDeProductos.add(producto1);
		listaDeProductos.add(producto2);
		listaDeProductos.add(producto3);
		listaDeProductos.add(producto4);
		listaDeProductos.add(producto5);
		
		System.out.println("La lista de productos tiene " + listaDeProductos.size() + " productos");
		
		//PASO 5
		Iterator it = listaDeProductos.iterator();
		
		for ( ; it.hasNext() ; ) {
			Producto product = (Producto)it.next();
		    System.out.println(product.nombre + " : " + product.cantidad);
		}
		
		//PASO 6
		listaDeProductos.remove(2);
		
		System.out.println("\nLa lista de productos tiene " + listaDeProductos.size() + " productos");
		
		//PASO 7
		Iterator it2 = listaDeProductos.iterator();
		
		for ( ; it2.hasNext() ; ) {
			Producto product = (Producto)it2.next();
		    System.out.println(product.nombre + " : " + product.cantidad);
		}
		listaDeProductos.clear();
	}
}
