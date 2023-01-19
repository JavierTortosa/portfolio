package tema6_arrays;

import javax.swing.JOptionPane;

/*
 * ARRAYS
 * ------
 * 
 * Definicion
 * ----------
 * 
 * En java todas las matrices se asignan dinamicamente
 * Los arrays son objetos
 * Todos los arrays tiene la variable de instancia length que contiene el numero de elementos del array
 * Un array se declara como cualquier otra variable pero con [] despues del tipo de variable
 * El contenido del array esta ordenado por un indice que empieza en el elemento 0
 * El array se puede usar como campo estatico, variable local o parametro de metodo
 * El tamaño del array se debe especificar con un numero int
 * Una vez especificado un tamaño no se puede modificar
 * La unica manera de poder añadir elementos a un array es declararlo mas grande de lo que se necesita 
 * Los elementos no utilizados tienen valor null
 * La superclase directa de un tipo de array es la clase Object
 * Un array puede contener tipos de datos primitivos y objetos de una clase
 * Los datos de tipo primitivos se almacenan en ubicaciones de memoria continua, los objetos en el heap
 * Cada tipo de array implementa las interfaces Cloneable y java.io.Serializable
 * 
 * En un array se pueden almacenar mas de un valor
 * Un array solo puede contener elementos del mismo tipo
 * Hay 2 tipos de arrays:
 * 		Unidimensionales y Multidimensionales
 * Un array de 2 dimensiones se llama matriz
 * 
 * Sintaxis:
 * 
				tipo nombre-array[];
				o
				tipo [] nombre-array;
 * 
 * El tipo determina el tipo de datos que puede contener el array ya sea primitivo o elementos de una clase
 * 
 * 	Inicializacion de Arrays
 * 	------------------------
 * 
 * 			Modo1
 *		   	int[] array1 = new int[] {1,2,3};
 *		
 *			Modo 2
 *		   	int[] array2 = new int [3];
 *				array2[0] = 1;
 *				array2[1] = 2;
 *				array2[2] = 3;
 *
 *			Modo 3
 *			int[] array3 = {1, 2, 3};
 *
 *			Modo 4
 *		   	int[] array4;
 *		   	array4 = new int [9];
 *				array4[0] = 1;
 *				array4[1] = 2;
 *  			array4[2] = 3; 
 *
 * 	Recorriendo Arrays
 * 	------------------
 * 
 * 	A cada elemento del array se accede a traves de su indice
 * 	El indice comienza por 0 y termina en el tamaño total del array-1
 * 	Se puede mostrar el contenido del array accediendo al metodo toString de la clase Arrays
 * 	
 * 	Sintaxis:
 * 
 * 		Arrays.toString(array_a_mostrar);
 * 
 * 	Se puede acceder a todos los elementos del array con el bucle for
 * 	
 * 	Sintaxis:
 * 
 *			  	for (int i = 0; i < arr.length; i++)
 *			  		System.out.println("Elemento en el índice " + i + " : "+ arr{i]);
 * 	
 * Ejemplo:
 */

	class DemoArray
	{
	 public static void main (String[] args)
	 {
	   // declara un array de enteros.
	   int[] arr;

	   // asignando memoria para 5 enteros.
	   arr = new int[5];

	   // inicializa el primer elemento del array
	   arr[0] = 10;

	   // inicializa el segundo elemento del array
	   arr[1] = 20;
	   // y así...
	   arr[2] = 30;
	   arr[3] = 40;
	   arr[4] = 50;

	   // accediendo a los elementos del array
	    for (int i = 0; i < arr.length-1; i++)
	      System.out.println("Elemento en el índice " + i +" : "+ arr[i]);
	   }
	}
	
/*
 * Foreach
 * -------
 * 
 * 	Es una forma de recorrer todo el array
 * 	funciona como el for normal pero no tenemos tanto control sobre lo que esta ocurriendo
 * 	
 * 	Sintaxis:
 * 	---------
 * 
 * 		for (type var : array){ 
 *   		statements using var;
 *		}
 * 
 *	type: tipo de objeto que se va a extraer
 *	var: variable con la que va a interactuar el bucle
 *	array: el array que contiene los elementos
 *
 *	Ninguna de las 3 partes son percindibles
 *
 *	Ejemplo:
 */
	
class BucleFor {
	
	public static void main(String args[]) {
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int 		// Tipo de variable primitiva de la lista que vamos a iterar
		number 			// Nombre de la variable local
		: numbers) { 	// Nombre de la lista que vamos a iterar
			System.out.print(number + " ");
		}
	}
}
	
/*
 * Ejemplo de foreach anidado
 */

class BucleForeachAnidado {
	public static void main(String args[]) {
		int[][][] numbers = {
		{ { 1, 2 }, { 3, 4, 8 }, { 5, 6 } },
		{ { 7, 8, 9, 11 }, { 9, 10 }, { 11, 12, 13 } },
		{ { 1, 2, 3}, {1, 2, 3}, {2, 3, 4, 5} }
		};
		System.out.println("Interaccion");
		
		for(int[][] number2 : numbers) {
			for(int[] number1 : number2) {
				for(int number : number1) {
					System.out.print(number + " ");
				}
			}
		}
	}
}

/*
 * Ejemplo de foreach anidado con etiquetas
 */

class BucleForeachConEtiquetas {
	
	public static void main(String args[]) {

		int[][][] numbers = {
			{ { 1, 2 }, { 3, 4, 8 }, { 5, 6 } },
			{ { 7, 8, 9, 11 }, { 9, 10 }, { 11, 12, 13 } }
		};
	primero:

		for (int[][] number2 : numbers) {

	segundo:

			for (int[] number1 : number2) {
				if (number1[0] == 11) {
					System.out.println("vamos a etiqueta primero");
					break primero; // Salida de los bucles.
				}	
				
				for (int number : number1) {
					if (number == 8) {
						System.out.println("vamos a etiqueta segundo");
						continue segundo; // Fuerza que el segundo bucle pase al siguiente elemento.
					}	
					System.out.print(number + " ");
				}
			}
		}
	}
}

/* 
 * Array de Strings
 * ----------------
 * 
 * Un Array de Strings funciona como un array normal lo que almacena cadenas de caracteres (strings)
 * 
 * Iniciar un Array de Strings
 * 
 * Sintaxis:
 * 	
 * 		Modo 1
 * 		String[] strAr1= new  String[] { "Ani" ,  "Sam" ,  "Joe" }; // inicialización en línea  
 * 
 * 		Modo 2
 * 		String[] strAr2 = { "Ani" ,  "Sam" ,  "Joe" };  
 * 
 * 		Modo 3
 * 		String[] strAr3=  new  String[ 3 ]; //Inicialización después de la declaración con tamaño específico  
 *		   		strAr3[ 0 ]=  "Ani" ;  
 *		   		strAr3[ 1 ]=  "Samuel";  
 *		   		strAr3[ 2 ]=  "Joe" ;  
 * 
 * 
 * 	Arrays Bidimensionales (matrices)
 * -----------------------------------
 * 
 * 	Son arrays de dos dimensiones 
 * 	Tienen una cantidad de filas y columnas
 * 
 *	Sintaxis:
 * 
 * 			tipo [filas ] [columnas ] nombre_array
 * 
 * 		El termino filas columnas es orientativo 
 * 		Realmente esta creando un array unidimensional por fila con tantos elementos como indica columnas
 * 
 * 	Para asignar los valores se hace como en un array normal
 * 
 * 		nombre_array[fila][columna]=valor;
 * 
 * 	Recorrido de Arrays Bidimensionales (Matrices)
 * ----------------------------------------------
 *  
 *  Se recorren de la misma manera que las matrices normales, pero necesitamos un bucle anidado
 *  Con un for recorremos las filas y con el otro recorremos las columnas
 * 
 * 	Ejemplo:
 * 
 * 			int lim_0 = notas.length ;
 * 			int lim_1 = notas[ 0 ].length ;
 *
 *			for ( int k = 0; k < lim_0 ; k++ ) {
 * 				for( int l = 0 ; l < lim_1 ; l++ ){
 *  				notas [ k ][ l ] = l; 
 * 				}
 *			}
 * 
 * 	Ejemplo:
*/
	
class Triangulo {
	public static void main(String[] args) {
		int tam = 5;
		char[][] triangulo = new char [tam] [tam];
		
		// fila del triangulo
		for (int f=0; f<tam; f++) {
			
			// espacios
			for (int c =0; c<f; c++) {
				//triangulo[f][c]='';
			}
			
			// asteriscos
			for (int c=f; c<tam; c++) {
				triangulo[f][c]='*';
			}
		}
		
		for (int i = 0; i<triangulo.length; i++) {
			
			for (int j = 0; j<triangulo[0].length;j++) {
				System.out.print(triangulo[i][j]);
			}
			System.out.println("");
		}
	}
}

/*
 * 	Arrays Multidimensionales
 * ---------------------------
 * 
 * Sintaxis:
 * 
 * 		tipo [][][] ... nombre_variable = int [valor][valor][valor];
 * 
 * 			cada vez que ponemos un juego de [] es una dimension mas que añadimos al array
 * 
 * Para asignar los valores se hace como siempre
 * 
 * 		nombre_variable [pos][pos][pos] = valor;
 * 
 * 			cada pos de dentro de un corchete corresponde a la posicion deseada del elemento dentro del array
 * 
 * Ejercicio 1:
 */

class Array2{
	public static void main(String[] args) {

	String paises[] = { "ar", "co", "ch", "mx" }, 
			CiudadAr[] = { "e", "f", "g" }, 
			CiudadCo[] = { "h", "i", "j" },
			CiudadCh[] = { "k", "l", "m" }, 
			CiudadMx[] = { "n", "o", "p" };

	String ax = "";

	for (int i = 0; i < paises.length; i++) {
		ax += "\n" + paises[i] + "          ";
		for (int j = 0; j < 3; j++) {
			switch (i) {
			case 0:
				ax += "          " + CiudadAr[j] + "          ";
				break;
			case 1:
				ax += "          " + CiudadCo[j] + "          ";
				break;
			case 2:
				ax += "          " + CiudadCh[j] + "          ";
				break;
			case 3:
				ax += "          " + CiudadMx[j] + "          ";
				break;
			}

		}

	}

	JOptionPane.showMessageDialog(null, ax);
	
	}
}

/*
 * 
 */

public class IndiceApuntes {

	public static void main(String[] args) {
		
	}
}
