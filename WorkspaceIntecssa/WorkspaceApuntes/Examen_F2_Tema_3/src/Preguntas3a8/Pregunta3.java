package Preguntas3a8;

import java.util.InputMismatchException;
import java.util.Scanner;

/* PREGUNTA 3
 * ----------
 * ¿En qué consiste el manejo de Excepciones en java?
 * 
 *  El manejo de excepciones es el manejo de errores al permitir que tu programa defina un bloque de código, 
 * llamado manejador de excepción, que se ejecuta automáticamente cuando ocurre un error.
 * 
 * PREGUNTA 4
 * ----------
 * Indique las características más comunes de las excepciones.
 * 
 * -Tratar de convertir a entero un String que no contiene valores numéricos.
 * -Tratar de dividir por cero.
 * -Abrir un archivo de texto inexistente o que se encuentra bloqueado por otra aplicación.
 * -Conectar con un servidor de bases de datos que no se encuentra activo.
 * -Acceder a subíndices de vectores y matrices fuera de rango.
 * 
 * PREGUNTA 5 Y 6
 * --------------
 * Indique la sintaxis del bloque Try Catch Finally
 * 
 *  	try{
 * 			 codigo que puede dar error
 * 		}
 * 
 * 		catch (Nombre_de_la_excepcion e){
 * 			 codigo de lo que hacer en caso de ocurrir la excepcion
 * 			 los nombres de las excepciones son clases  y la "e" es el objeto de dicha clase
 * 		}
 * 		
 * 		finally{
 * 			 bloque de codigo que se ejecuta al finalizar el bloque try-catch independientemente de si ha saltado la 
 * 			excepcion o no
 * 		}
 * 
 * PREGUNTA 7
 * --------------
 * Indique la sintaxis del bloque Try Catch Anidados
 * 
 *  	try{
 * 			 PRIMER codigo que puede dar error
 * 		
 * 			try{
 * 			 	 SEGUNDO codigo que puede dar error
 * 
 * 			} catch (Nombre_de_la_excepcion e){
 * 				 codigo de lo que hacer en caso de ocurrir la excepcion DEL SEGUNDO CODIGO
 * 			}
 * 
 * 		} catch (Nombre_de_la_excepcion e){
 * 			 codigo de lo que hacer en caso de ocurrir la excepcion DEL PRIMER CODIGO
 * 
 * 		}
 * 
 * PREGUNTA 8
 * ----------
 * Realizar un ejemplo usando la excepción throw
 */

/* RESUMEN:
 * ----------
 * ***************************************************************************************************************
 * Como las preguntas 5 y 6 son la misma pongo este resumen de lo que yo entiendo con las excepciones
 * En respuesta a la pregunta 8 y a este resumen he realizado un ejemplo que engloba un poco todo el tema
 * *************************************************************************************************************** 
 * 
 * Para manejar las excepciones se utilizan 5 palabras clave con sus bloques de codigo correspondiente:
 * 
 * 	try{
 * 		 codigo que puede dar error
 * 		 podemos incorporar los bloques try-catch anidados que queramos
 * 	}
 * 
 * 	catch (Nombre_de_la_excepcion e){
 * 		 codigo de lo que hacer en caso de ocurrir la excepcion
 * 		 los nombres de las excepciones son clases  y la "e" es el objeto de dicha clase
 * 		 Podemos colocar varias sentencias catch para controlar varias excepciones a un mismo try
 * 	}
 * 		
 * 	finally{
 * 		 bloque de codigo que se ejecuta al finalizar el bloque try-catch independientemente de si ha saltado la 
 * 		excepcion o no
 * 	}
 * 
 * 	throw
 * 		 se usa para lanzar una excepción en tiempo de ejecución junto a una instancia de la excepción que 
 * 		queremos lanzar
 * 
 * 	throws
 * 		 Cuando un metodo es capaz de provocar una excepcion que no trata directamente debemos usar 
 * 		throws para indicar a cualquier metodo que llame a este que tiene que controlar dicha excepcion
 * 
 *   A parte del bloque try-catch-finally normal hay otra version que es el try with resources que no se ha
 *  visto en el temario
 *   Se usa sobre todo para cerrar los recursos de forma automatica si la variable cuya clase implementa la 
 *  interfaz AutoCloseable.
 *   La mayoria de clases relacionadas con entrada y salida incorporan la interfaz AutoCloseable
 */

/* --------------------------------------------------------------------------------------------------------
 * 											EJEMPLO:
 * --------------------------------------------------------------------------------------------------------
 * 
 * 		para el ejemplo establecemos que mi numero sera el "3";
 * 
 * 		pedimos por teclado un numero 
 * 		comprobamos que hemos introducido un numero si no java dispara una InputMismatchException
 * 
 * 		Si introducimos:
 * 		- el numero 0:  llamamos a un metodo que solo cambia el mensaje pero no trata la excepcion
 * 		- el numero "3": nos dira que hemos acertado si no que no lo hemos hecho
 * 		- un numero de 0 a 5: comprueba si es mayor o menor que mi numero
 * 			-nos indicara si el numero introducido es mayor o menor que mi numero
 * 
 * 		Para el tratamiento del numero que hemos introducido lanzamos MiPropiaExcepcion con 2 constructores
 * 		
 * 		Constructor1 - MiPropiaExcepcion (string) -- establece el mensaje si introducimos 0 o un numero negativo
 * 
 * 		Constructor2 - MiPropiaExcepcion (string, numero) -- trata el mensaje si el numero esta entre 0 y 5
 * 			
 * 		
 */

public class Pregunta3 {

	public static void main(String[] args) {
		int numero = -1;
		
		System.out.println("Las excepciones se activan cuando: (ejemplo entre parentesis)"
				+ "\n\n -Introducimos algo que no es un numero (una letra)"
				+ "\n\nLa excepcion que he creado MiPropiaExcepcion reacciona y cambia de mensaje cuando:"
				+ "\n\n -Introducimos un numero negativo (-3)"
				+ "\n -Introducimos el numero cero (0)"
				+ "\n -Introducimos un numero positivo (10)"
				+ "\n\nAdemas si el numero introducido es entre 1 y 5 cambia el constructor de la excepcion"
				+ "\n\n - comprueba si el numero es menor que 3 (2)"
				+ "\n - comprueba si el numero es mayor que 3 (4)"
				+ "\n - comprueba si el numero es 3 (3)\n\n");
		
		try (Scanner sc = new Scanner(System.in)) { //try with resources para cerrar la variable sc

			System.out.println("Introduce mi numero (del 1 en adelante):");

			try {									// try anidado
				
				numero = sc.nextInt(); 				// esta instruccion es la que puede dar error
				//System.out.println("");
				
				// si es un numero lanzamos nuestra excepcion
				if (numero < 0) { 					// si es negativo 
					throw new MiPropiaExcepcion("debes introducir un numero positivo"); // usamos el primer constructor
				}

				if (numero <= 5 && numero > 0) { 	// y si el numero es entre 1 y 5 usamos el segundo constructor
					throw new MiPropiaExcepcion("Comprobando tu numero", numero); 
				}
				
				if (numero == 0) {					// si el numero es 0 llamamos al metodo introducidoCero()
					introducidoCero();
				}

			// ejemplo multi-catch
			} catch (InputMismatchException e1) { 	// si se ha introducido algo que no es un numero 
				
				System.out.println("\n\nTexto de la excepcion InputMismatchException "
						+"\n***************************************************************************\n");
				
				System.out.println("Solo se aceptan numeros y que sean positivos");

			} catch (MiPropiaExcepcion e2) { 		// capturamos nuestra excepcion y mostramos el mensaje

				System.out.println("\n\nTexto de MiPropiaExcepcion "
						+"\n***************************************************************************\n");
				
				System.out.println(e2.getMensaje());

			} finally {

				System.out.println("\n\nTexto del bloque finally "
						+"\n***************************************************************************\n");
				
				// comprobamos si el numero introducido es 3 para felicitar al usuario o no
				if (numero != 3) {

					System.out.println("Mi numero es el 3. No has acertado");

				} else {

					System.out.println("Perfecto! Has acertado!!!");

				}
			}
		}
	}

	// este metodo no controla la excepcion pero si lanza una excepcion con trhow por eso tiene el trhows
	private static void introducidoCero() throws MiPropiaExcepcion {
		throw new MiPropiaExcepcion("no puede ser el numero 0"); //lanza MiPropiaExcepcion con el primer constructor
	}
}


// esta clase va a tratar las excepciones por eso tiene el extends Exception
// si no tiene el extends no puede tratar excepciones

class MiPropiaExcepcion extends Exception{

	String mensaje; 
	
	public MiPropiaExcepcion(String string) {				//constructor 1 establece el mensaje
		
		mensaje = string;
	}
	
	public MiPropiaExcepcion(String string, int numero){ 	// constructor 2 establece el mensaje segun el numero
		
		System.out.println(string);
		
		//establece el mensaje a mostrar segun el valor de numero
		if (numero>3) {
			mensaje = "el numero introducido es mayor que mi numero";
		}
		if (numero<3){
			mensaje = "El numero introducido es menor que mi numero";
		}
		if (numero ==3) {
			mensaje="Creo que has dado en el clavo!";
		}
	}
	
	public String getMensaje() {
		return mensaje;
	}
}
