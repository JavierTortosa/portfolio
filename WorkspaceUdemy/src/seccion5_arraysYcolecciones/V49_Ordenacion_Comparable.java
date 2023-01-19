package seccion5_arraysYcolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*	 Ordenacion de Arrys y Listas
 * 	 ----------------------------
 * 
 * 	 Arrays y listas pueden ser ordenados segun el orden natural de los objetos
 * 	 El orden natural se define a traves de la interfaz Comparable
 * 	 La interfaz Comparable debera ser implementada por los objetos a ordenar
 * 	 Si las clases no implementan Comparable, se debera definir el orden natural con la interfaz Comparator
 * 
 
 *	 Implementacion de la Interfaz Comparable
 *	 ----------------------------------------
 *
 * 	 Se encuentra en el paquete java.lang
 * 	 Es implementada por clases de envoltorio y String
 * 	 Para poder ordenar listas y arrays de otro tipo de objetos sus clases deberan implementar esta interfaz
 * 	 La interfaz Comparable solo tiene un metodo: compareTo
 * 
 * 			interface Comparable <T>{			si objeto 	> obj 	resultado >0	+1
 * 				int compareTo(T obj);			si objeto 	== obj 	resultado =0	0
 * 			}									si objeto 	< obj 	resultado <0	-1
 
 * 	 Ejemplo:
 */

class PersonaComparable implements Comparable <PersonaComparable>{
	private String nombre;
	private int edad;
	//constructores... getters... setters....
	
	public PersonaComparable() {
	}
	
	public PersonaComparable(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public int compareTo(PersonaComparable p) {	//metodo que hay que implementar por la interfaz Comparable

		if (this.nombre.compareTo(p.getNombre()) ==0) {	//comprueba si this.nombre es igual a p.getNombre	
														//si lo es, compareTo devuelve 0 
			
			return ((Integer) this.edad).compareTo(p.getEdad());//entonces ordena por la edad
		}else {
			return this.nombre.compareTo(p.getNombre());//si no da 0 los nombres no son iguales y 
														// ordena por nombre
		}
	}
}

/* 	 Ordenacion de arrays
 * 	 --------------------
 * 
 * 	 Para ordenar los arrays se emplea el metodo sort(T datos) de la clase Arrays
 * 
 * 					int [] numeros = {7, 2 ,34, 11, 6};
 * 					Arrays sort(numeros);
 * 					for (int n: numeros){
 * 						System.out.println(n); //imprime 2, 7, 6, 11, 34  
 * 					}
 * 
 
 * 	 Ordenacion de listas
 * 	 --------------------
 * 
 *   Se emplea el metodo sort(List <T> datos) de Collections
 *   
 *   				List <Integer> nums = new ArrayList<>();
 *   				nums.add(23); nums.add(8); nums.add(13);
 *   				Collections.sort(nums);
 * 					for (int n: numeros){
 * 						System.out.println(n);	// imprime 8,13,23
 * 					}   				
 * 	 
 
 *	 Revision de Conceptos
 *	 ---------------------
 *
 *		Indica que se mostrara al ejecutar el siguiente codigo
 *
 *	 		List <Integer> enteros = List.of(6, 1, 4, 0);
 *	 		List <Integer> enteros2 = List.copyOf(enteros);
 *
 *	 		Collections.sort(enteros);
 *	 		System.out.println(enteros2);
 *
 *		a.	[6,1,4,0]
 *		b.	[0,1,4,6]
 *		c.	Excepcion
 *		d.	Error de compilacion
 * 
 * 		Respuesta: c. excepcion. no podemos ordenar la lista enteros porque es inmutable (List.of) 
 * 
 * 
 */

public class V49_Ordenacion_Comparable {

	public static void main(String[] args) {
		
		//Ordenacion de Arrays
		PersonaComparable [] personas = {new PersonaComparable("Ana",25),
				new PersonaComparable("Ramon",15),
				new PersonaComparable("Ana",15)};
		Arrays.sort(personas);
		for (PersonaComparable p: personas) {
			System.out.println(p.getNombre() + "-" + p.getEdad());
		}
		
		//Ordenacion de listas
		System.out.println("\n\nOrdenacion de Listas\n");
		List <PersonaComparable> personasL = new ArrayList<> ();
		personasL.add (new PersonaComparable("Ana",35));
		personasL.add (new PersonaComparable("Ramon",25));
		personasL.add (new PersonaComparable("Ana",25));
		Collections.sort(personasL);
		for (PersonaComparable p: personasL) {
			System.out.println(p.getNombre() + "-" + p.getEdad());
		}
	}
}
