package seccion5_arraysYcolecciones;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*	 Colecciones tipo Tabla
 * 	 ----------------------
 * 
 * 	 Es una coleccion donde cada elemento tiene asociado una clave unica
 * 	 No tiene orden ni posicion
 * 	 Las tablas implementan la interfaz Map
 * 	 Tanto el tipo clave como el valor son genericos
 * 	 La principal clase de coleccions es HashMap
 * 
  
 *	 Clases e interfaces de tablas
 *	 -----------------------------
 *
 *	 Las clases HashMap, HashTable y TreeMap tienen implementada la interfaz Map
 * 	
 * 		Interface	:					Map
 * 
 * 		Clases		:		HashMap		HashTable		TreeMap
 * 
 * 		Hashmap: es la mas utilizada y no tiene orden
 * 		Hashtable: se recomienda poco su uso porque es antigua
 * 		TreeMap: es la excepcion de las tablas porque si tiene orden
 * 
 
 *	 Creacion de Tablas
 *	 ------------------
 *
 *	 Como instanciar HashMap:
 *
 *		Normal:
 *
 *			Map <Integer, String> contactos = new HashMap<>();
 *
 *		Mediante metodo de factoria de Map:
 *
 *			Map <Integer, String> contactos = Map.ofEntries(
 *											Map.Entry(123, "Luis"),
 *											Map.Entry(300, "Ana"),
 *											Map.Entry(500, "Maria"));
 *
 *				ofEntries() es INMUTABLE
 *				No admiten la insercion, modificacion o eliminacion de elementos
 *				NO ADMITEN CLAVES NI VALORES NULL
 *
 *		Mediante el metodo copyOf de Map:
 *
 *			Map <Integer, String> nuevos = Map.copyOf(contactos);
 *
 *				ofEntries() es INMUTABLE
 *				No admiten la insercion, modificacion o eliminacion de elementos
 *				NO ADMITEN CLAVES NI VALORES NULL
 *
 
 *	 Metodos HashMap
 *	 ---------------
 *
 * 	 T put(K clave, T dato);
 * 
 * 		Añade el dato a la coleccion y le asocia la clave indicada
 * 		Si existe la clave dada, el valor existente sera sustituido por el nuevo valor
 * 
 * 				HashMap <Integer, String> tabla = new HashMap<>();
 * 				tabla.put(200,"dato1");
 * 				tabla.put(400,"dato2");
 * 				tabla.put(200,"dato3"); // dato1 sera sustituido por dato3
 * 
 * 	 T putIfAbsent(K clave, T dato);
 * 
 * 		Añade la entrada en caso de que la clave no exista o no tenga asociado un valor NULL
 * 
 * 	 T get(K clave);
 * 
 * 		Devuelve el dato que tenga asociada dicha clave.
 * 		Si no existe la clave devolvera NULL
 * 
 *	 int size();
 *
 *		Devuelve el tamaño de la coleccion
 *
 *	 T remove(Object clave);
 *
 *		Elimina el dato que tenga dicha clave asociada y devuelve el objeto eliminado
 *		
 * 	 			System.out.println(tabla.remove(400)); // imprime dato2
 * 
 * 	 boolean containsKey (K clave);
 * 
 * 		Indica si hay algun elemento en la coleccion con dicha clave
 * 
 * 	 boolean containsValue (T valor)
 * 
 * 		Indica si hay algun elemento en la coleccion con dicho valor
 * 
 
 *	 Recorrido de una tabla
 *	 ----------------------
 *
 * 	 Collection <T> values()
 * 
 * 		 Devuelve una coleccion solo con los valores.
 * 		 Puede utilizarse para recorrer el conjunto de valores con un for each
 * 
 * 				Collection <String> datos = tabla.values();
 * 				for (String d: datos){
 * 					System.out.println(d); // muestra el valor de cada elemento
 * 				}
 * 
 * 	 Set <K> keySet()
 * 
 * 		 Devuelve el conjunto de claves de la tabla
 * 		 Se puede recorrer con un for each
 * 
 * 	 Metodo forEach() (se estudia en lambdas)
 * 
  			
 *	 Revision de conceptos
 *	 ---------------------
 *
 * 	 Indica cual es la linea que falta en la linea 1
 * 
		 		// linea 1
				for (List <String> lt: datos.values()) {
					for(String s: lt) {
						System.out.println(s);
					}
				}
				
		Respuesta: Map <String, List<String>> datos = new HashMap<>();
 * 
 * 
 * 
 */

public class V45_ColeccionesTipoTabla_Map {

	public static void main(String[] args) {

		HashMap <Integer, String> tabla = new HashMap<>();
		tabla.put(25,"Hello");
		tabla.put(null, "By");
		tabla.put(null, "Yo"); //sustituye el valor "By"
		
		System.out.println(tabla.get(null));
		
		// prueba de Map
		System.out.println("\n\nPrueba map\n\n");
		Map <Integer, String> datos = new HashMap<>();
		for (int i =0; i<10; i++) {
			datos.put(i*i, "dato"+i);
		}
		
		Collection <String> datosValores = datos.values(); 
		for (String d: datosValores) {
			System.out.println(d);
		}
		
		Set <Integer> datosClave = datos.keySet();
		for (Integer c:datosClave) {
			System.out.println(c);
		}
		for (Integer c:datosClave) {
			System.out.println("clave: " + c + "\tValor: " + datos.get(c) );
		}
		
		// prueba de TreeMap
		System.out.println("\n\nPrueba treemap\n\n");
		TreeMap <Integer, String> datosTM = new TreeMap<>();
		for (int i =0; i<10; i++) {
			datosTM.put(i*i, "dato"+i);
		}
		
		System.out.println("Los valores estan ordenados por las claves");
		Collection <String> datosTMValores = datosTM.values(); 
		for (String d: datosTMValores) {
			System.out.println(d);
		}
		
		Set <Integer> datosTMClave = datos.keySet();
		for (Integer c:datosTMClave) {
			System.out.println(c);
		}
		for (Integer c:datosTMClave) {
			System.out.println("clave: " + c + "\tValor: " + datosTM.get(c) );
		}
		
		//****************************************************************
		//				Revision de conceptos
		
 		// linea 1
		Map <String, List<String>> datos1 = new HashMap<>();
		// 
		for (List <String> lt: datos1.values()) {
			for(String s: lt) {
				System.out.println(s);
			}
		}
		
		List s1 = new ArrayList();
		
		s1.add("a");
		s1.add("c");
		s1.add("a");
		
		System.out.println(s1.remove("a")+" "+ s1.remove("x"));
		
		//*************************************************
		String[] p = {"1","2","3"};
		List<?> list2 = new ArrayList<>(Arrays.asList(p));
	}
}
