package seccion5_arraysYcolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*	 Interfaz Comparator
 * 	 -------------------
 * 
 * 	 Se utiliza para poder definir el orden natural para los tipos de objetos que cuyas clases no 
 * 	implementan comparable
 * 	 Se encuentra en java.util
 * 	 
 * 				interface Comparator <T>{				si obj1	> obj2 		resultado >0	+1
 * 					int compare(T obj1, T obj2);		si obj1	== obj2		resultado =0	0
 * 				}										si obj1	< obj2 		resultado <0	-1
 * 	
 * 	 Se utiliza en los siguientes metodos:
 * 
 * 		Ordenacion de arrays:
 * 
 * 					Arrays.sort(T[]datos, Comparator <T> comp)
 * 
 * 			Se mandan los parametros de:
 * 				un array de objetos(T[]datos) 
 * 				y se implementa Comparator 
 * 
 * 		Ordenacion de colecciones (metodo list):
 * 
 * 					sort (Comparator <T> comp)
 * 
 * 			La propia lista ya tiene un metodo sort
 * 			Implementamos el interfaz comparator donde establecemos el criterio de ordenacion
 *
  
 * 	 Ejemplo de ordenacion con Comparator:
 * 	 -------------------------------------
 * 
 *	 Creamos la lista que queremos ordenar y lo haremos por numero de caracteres de menor a mayor
 *
 *			List<String> textos = new ArrayList<>();
 *			textos.add("mi texto");
 *			textos.add("texto");
 *			textos.add("mi texto mas largo");
 *
 *	 Para ordenar usamos el metodo sort que tiene el objeto de List
 *
 *			textos.sort (new Criterio());
 * 
 * 	 Creamos una clase llamada Criterio que implementa comparator y el criterio de ordenacion
 * 
 * 			public class Criterio implements Comparator<String>{	//creamos la clase con Comparator
 * 				public int compare (String ob1, String ob2){		//creamos el metodo compare
 * 					return ob1.length()-ob2.length();				//establecemos el criterio de ordenacion
 * 				}
 * 			}
 * 
  
 *	 Revision de Conceptos
 *	 ---------------------
 *
 * 		 Tenemos una lista de objetos Curso, donde cada curso esta caracterizado por un nombre, 
 * 		duracion y precio.
 * 		 Si la coleccion esta referenciada por la variable cursos, escribe las instrucciones para
 * 		ordenar la coleccion de menor a mayor duracion.
 */

class Curso {
	String nombre;
	int duracion;
	int precio;

	public Curso() {}
	
	public Curso(String nombre, int duracion, int precio) {
		this.nombre = nombre;
		this.duracion=duracion;
		this.precio=precio;
	}

	
	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio + "]";
	}
}

class CursoPruebaComparator{
	public static void main(String[] args) {
		List <Curso> cursos = new ArrayList<>();
		for (int i =9; i>0; i--) {
			String nom="curso"+i;
			int dur = i*100;
			int pvp = ((50*i)*100);
			cursos.add(new Curso(nom, dur, pvp));
		}
		
		for (Curso c: cursos) {
			System.out.println(c);
		}
		
		System.out.println();
		
		cursos.sort(new Comparator <Curso>() {			//llamamos al metodo sort 
														//creamos una clase anonima para implementar Comparator 
			public int compare(Curso c1, Curso c2) {	//creamos el metodo compare que obliga la interfaz
				return c1.getDuracion()-c2.getDuracion();//establecemos el criterio
//				return c1.getDuracion().compareto(c2.getDuracion());//establecemos el criterio
			}
		});
		
		for (Curso c: cursos) {
			System.out.println(c);
		}
	}
}

/* 	 Busqueda binaria en Arrays
 * 	 --------------------------
 * 
 * 	 La clase Arrays tiene el siguiente metodo para buscar dentro de un array:
 * 
 * 		int binarySearch(tipo[] array, tipo valor)
 * 
 * 		Devuelve la posicion del valor dentro del array que previamente debe estar ordenado
 * 
 * 	 Consideraciones sobre el metodo binarySearch
 * 	 --------------------------------------------
 * 
 * 	 Si el array no esta ordenado el resultado sera impredecible
 * 	 Si el array esta ordenado y el elemento no se encuentra devuelve -pIns-1 
 * 			-pIns-1 ---> (menos la posicion que corresponderia(pIns) menos 1)
 * 	 pIns es la posicion donde deberia estar el elemento
 * 
  
 *	 Comparacion de arrays
 *	 ---------------------
 *
 * 	 La clase Arrays incorpora en java 11 un metodo para hacer una comparacion de 2 arrays
 * 	 
 * 			int compare (tipo[] array1, tipo[] array2)
 * 
 * 		Devuelve el resultado de la comparacion lexicografica de 2 arrays
 * 
 * 	 El resultado sera:
 * 
 *  		1	si array1 > array2
 *  		0 	si array1 = array2
 *  		-1	si array1 < array2
 *  
 *  	Primero comprueba elemento por elemento y el numero mas alto automaticamente es el mayor
 *  	en caso de igualdad el array con mas elementos es mayor
 *  
 *  Ejemplo:
 */

class ComparaArrays {
	public static void main(String[] args) {
		int [] arr1 = {1,4,8};
		int [] arr2 = {1,4,5};
		int [] arr3 = {1,4,5,1};
		
		System.out.println("arr1, arr2 = " + Arrays.compare(arr1, arr2)); //1
		System.out.println("arr1, arr3 = " + Arrays.compare(arr1, arr3)); //1
		System.out.println("arr2, arr3 = " + Arrays.compare(arr2, arr3)); //-1
		
	}
}

/* 	 Comparacion de Arrays II
 * 	 ------------------------
 * 
 *   Arrays incorpora en java 9 un metodo para saber las discrepancias entre arrays
 *   
 *   		int mismatch(tipo[] array1, tipo[] array2)
 *   
 *   	Devuelve la posicion de la primera discrepancia o -1 si no las hay
 * 
 * 		Primero examina elemento por elemento y en caso de no haber discrepancia mira el numero de elementos
 * 
 * 	 Ejemplo:
 */

class DiscrepanciaArrays{
	public static void main(String[] args) {
		int [] arr1 = {1,4,6};
		int [] arr2 = {1,4,5,1};
		int [] arr3 = {1,4,5,1};
		
		System.out.println("arr1, arr2 = " + Arrays.mismatch(arr1, arr2)); //2
		System.out.println("arr2, arr3 = " + Arrays.mismatch(arr2, arr3)); //-1
	}
}

/* 	 Revision de conceptos
 * 	 ---------------------
 * 
 * 	 Indica que se mostrara al ejecutar el siguiente codigo:
 */

class RevisionV50{
	public static void main(String[] args) {
		
		int [] a1 = {9,5,7,1,4}; 	
		int [] a2 = {4,5,7,9,6,1};	
		Arrays.sort(a1);	// 1 4 5 7 9
		Arrays.sort(a2);	// 1 4 5 6 7 9
		System.out.println(Arrays.mismatch(a1, a2));
	}
}
/*		a. 3	ok
 * 		b. 0
 * 		c. 2
 * 		d. -1
 */

/* 
 * 
 * 
 */


public class V50_Ordenacion_Comparator {

	public static void main(String[] args) {
		//prueba binarySearch
		int [] a1= {3,5,7,9,15,20};
		System.out.println(Arrays.binarySearch(a1, 9)); // 3
		System.out.println(Arrays.binarySearch(a1, 10)); // -5 
			//10 deberia estar en la posicion 4, como no esta, nos devuelve 
			//		-pIns= -4 		le resta 1 		-pIns-1=-5
	}
}
