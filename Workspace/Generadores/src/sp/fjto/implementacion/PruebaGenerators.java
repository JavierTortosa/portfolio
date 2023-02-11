package sp.fjto.implementacion;

import java.util.concurrent.atomic.AtomicInteger;
import sp.fjto.generadores.Generator;

/** Implementacion de los metodos de la clase Generator
 * 
 * @author F. Javier Tortosa
 * 
 * 
 * <p>Ejercicios de problemas de generadores encontrados por diferentes webs
 */
public class PruebaGenerators {

	/**
	 * Main de pruebas de implementacion
	 * 
	 * @param args Parametro del sistema
	 */
	public static void main(String[] args) {
		
	//genera numeros de 0 a 100
		numeros_0a100();
		
	// genera numeros entre 50 y 100
		numeros_50a100();
		
	// Generador de secuencia básica de 0 a 9
		secuencia_0a9();
		
	// Generador de Strings aleatorios
		randomString();
		
	// Generador de sudokus 
		generaSudokus();
		
	}

	/** Implementacion del generador de sudokus
	 * 
	 * @apiNote
	 * 
	 * 	parametro 1	: visible 															
	 *	<br>-----------																
	 *	<br>0: no muestra nada				
	 *	<br>1: solucion																		
	 *	<br>2: sudoku para resolver
	 *	<br>3: solucion + sudoku
	 *
	 * 	<p>parametro 2 : level
	 * 	<br>-----------
	 * 	<br> int nivel de dificultad de 0 a 10 (10 mas dificil)
	 * 
	 * 	<p>parametro 3 : borde
	 * 	<br>-----------
	 * 	<br>1: borde simple
	 * 	<br>2: borde doble
	 */
	private static void generaSudokus() {
		System.out.println("\nGenerador de sudokus\n");
		Generator sudo = new Generator();
		
		sudo.genSudoku(3,5,2);
		
		System.out.println("mostramos la solucion");
		sudo.muestraSudoku(sudo.getSudoku());
		System.out.println("mostramos el sudoku para solucionar");
		sudo.muestraSudoku(sudo.getBlankSudoku());
	}

	
	/** Implementacion del generador de Strings aleatorios
	 * 
	 * @apiNote
	 * 
	 * pasamos por parametro un int con el tamaño del string
	 */
	private static void randomString() {
		
		System.out.println("\nGenerador de Strings aleatorios\n");
		
		int size = 35;
		Generator txt = new Generator();

		String texto = txt.genString(size);
		System.out.println(texto);
	}

	/** Implementacion del Generador de secuencias básicas
	 * 
	 * @apiNote
	 * prueba de atomicInteger
	 */
	private static void secuencia_0a9() {
		
		System.out.println("\nGenerador de secuencia básica de 0 a 9\n");
		Generator incremento = new Generator(new AtomicInteger()::getAndIncrement);
		for (int i = 0; i<10; i++)
		incremento.printNumber(incremento);
	}

	/** Implementacion del Generador de numeros aleatorios entre 50 y 100
	 * 
	 * @apiNote
	 * Constructor de Generator en el que pasamos una expresion lambda como parametro
	 */
	private static void numeros_50a100() {

		System.out.println("\nGenera numeros entre 50 y 100\n");
		int numMin = 50;
		int numMax = 100;
		Generator generator2 = new Generator( () -> (int) (Math.random() * (numMin - numMax) + numMax) );
		generator2.printNumber(generator2);
	}

	/** Implementacion del Generador de numeros aleatorios entre 0 y 100 
	 * 
	 * @apiNote
	 * Constructor de Generator en el que pasamos una expresion lambda como parametro
	 */
	private static void numeros_0a100() {
		
		System.out.println("genera numeros de 0 a 100\n");
		Generator generator = new Generator( () -> (int) (Math.random() * 100) );
		generator.printNumber(generator);
	}
}
