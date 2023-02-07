package sp.fjto.implementacion;

import java.util.concurrent.atomic.AtomicInteger;

import sp.fjto.generadores.Generator;

public class PruebaGenerators {

	public static void main(String[] args) {
		
	//genera numeros de 0 a 100
	// Constructor de Generator en el que pasamos una expresion lambda como parametro
		
		System.out.println("genera numeros de 0 a 100\n");
		Generator generator = new Generator( () -> (int) (Math.random() * 100) );
		generator.printNumber(generator);
		
	// genera numeros entre 50 y 100
		
		System.out.println("\ngenera numeros entre 50 y 100\n");
		int numMin = 50;
		int numMax = 100;
		Generator generator2 = new Generator( () -> (int) (Math.random() * (numMin - numMax) + numMax) );
		generator2.printNumber(generator2);
		
	// Generador de secuencia básica de 0 a 9
	// prueba de atomicInteger
		System.out.println("\nGenerador de secuencia básica de 0 a 9\n");
		Generator incremento = new Generator(new AtomicInteger()::getAndIncrement);
		for (int i = 0; i<10; i++)
		incremento.printNumber(incremento);
		
		
	// Generador de Strings aleatorios
	// pasamos por parametro un int con el tamaño del string
		
		System.out.println("\nGenerador de Strings aleatorios\n");
		
		int size = 35;
		Generator txt = new Generator();

		String texto = txt.genString(size);
		System.out.println(texto);
		
	//Generador de sudokus 
	
	// parametro 1					parametro 2
	// -----------					-----------
	// 0: no muestra nada			int nivel de dificultad de 0 a 10 (10 mas dificil)
	// 1: solucion
	// 2: sudoku
	// 3: solucion + sudoku
		
		System.out.println("\nGenerador de sudokus\n");
		Generator sudo = new Generator();
		
		sudo.genSudoku(3,5);
		
		System.out.println("mostramos la solucion");
		sudo.muestraSudoku(sudo.getSudoku());
		System.out.println("mostramos el sudoku para solucionar");
		sudo.muestraSudoku(sudo.getBlankSudoku());
		
	}
}
