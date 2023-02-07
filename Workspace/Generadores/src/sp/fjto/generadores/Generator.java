package sp.fjto.generadores;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * @author Javier Tortosa
 *
 * @version 1.0
 * 
 *          Metodos de generacion de numeros
 * 
 *          <p>Genera un iterador que desarrolla una expresion lambda que se pasa
 *          por parametro
 * 
 */
public class Generator {
	private Iterator<?> iterator;
	private int[][] sudoku;
	private int[][] blankSudoku;

	public Generator() {

	}

	public Generator(IntSupplier lambda) {

		suplier(lambda);
	}

	/**
	 * Devuelve un elemento generado por la lambda que recibe por parametro
	 * 
	 * @param lambda
	 */
	private void suplier(IntSupplier lambda) {
		IntStream i = IntStream.generate(lambda);
		iterator = i.iterator();
	}

	/**
	 * Genera un nuevo elemento del suplier
	 * 
	 * @return
	 */
	public String next() {
		return iterator.next() + "";
	}

	/**
	 * Imprime por pantalla el elemento recibido por parametro
	 * 
	 * @param generator
	 */
	public void printNumber(Generator generator) {

		System.out.println(generator.next());
	}

	/**
	 * genera un nuevo numero
	 * 
	 * @param generator
	 * @return
	 */
	public String genNumber(Generator generator) {
		return generator.next();
	}

	/**
	 * Genera un StringBuilder con la secuencia de caracteres aleatorios del tamaño
	 * indicado por el parametro
	 * 
	 * @param len
	 * @return
	 */
	public String genString(int len) {
		String AB = "0123456789abcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		}
		return sb.toString();
	}

	// ***************************************************************************************** sudoku

	/**
	 * Genera un sudoku y su solucion y lo muestra por consola o no
	 * 
	 * @param visible
	 * 
	 * @param level
	 * <br> 
	 * 
	 * @implNote 
	 * 
	 * <br>visible: Genera y muestra o no el sudoku
	 * 	<p>0: no muestra nada 
	 * 	<br>1: solucion
	 * 	<br>2: sudoku 
	 * 	<br>3: solucion y sudoku
	 * 
	 * 	<p>level: Nivel de dificultad de 0 a 10. (10 mas dificil)
	 */
	public void genSudoku(int visible, int level) {

		boolean seguimos = procesoSudoku(visible, level);

		if (seguimos) {
			switch (visible) {
	
			case 3:
				System.out.println("sudoku visible");
				muestraSudoku(this.sudoku);
				System.out.println();
				System.out.println("sudoku oculto");
				muestraSudoku(this.blankSudoku);
				break;
			case 1:
				System.out.println("sudoku visible");
				muestraSudoku(this.sudoku);
				break;
			case 2:
				System.out.println("sudoku oculto");
				muestraSudoku(this.blankSudoku);
				break;
			}
		} else {
		System.out.println("no se ha podido generar el sudoku");
		}
	}

	/** Inicia el proceso de creacion del sudoku y su solucion
	 *  <p>Comprueba que la opcion de visualizacion es correcta
	 * @param visible
	 * @param level
	 */
	private boolean procesoSudoku(int visible, int level) {

		System.out.println("Proceso sudoku\n--------------\n");

		if (visible < 0 || visible > 3) {
			System.out.println("ERROR! Opciones de visibilidad entre 0 y 3");
			return false;
		} else {
			this.sudoku = creaSudoku();
			this.blankSudoku = ocultaSudoku(copySudoku(this.sudoku), level);
			return true;
		}
		
	}

	/**
	 * Clona un array multidimensional
	 * 
	 * @param arrayOriginal
	 * 
	 * 
	 * @return Nuevo array clonado
	 */
	private int[][] copySudoku(int[][] arrayOriginal) {
		if (arrayOriginal == null) {
			return null;
		}

		return Arrays.stream(arrayOriginal).map(int[]::clone).toArray(int[][]::new);
	}

	/**	Recorremos el sudoku ocultando numeros al azar segun el nivel 
	 * 
	 * @param sudo
	 * @param level
	 * @return
	 */
	private int[][] ocultaSudoku(int[][] sudo, int level) {

		int[][] blSudoku = sudo;
		level = level * 8;

		Random rnd = new Random(2);
		int onoff;
		int i, j;
		int n = 0;

		do {
			onoff = rnd.nextInt(2);
			i = rnd.nextInt(9);
			j = rnd.nextInt(9);

			if (onoff == 0) {
				if (blSudoku[i][j] != 0) {
					blSudoku[i][j] = 0;
					n++;
				}
			}

		} while (n < level);

		return blSudoku;
	}

	/**	Mostramos el sudoku por consola
	 * 
	 * @param sudo
	 */
	public void muestraSudoku(int[][] sudo) { 

		if (sudo != null) {
			System.out.println("╔═══════╦═══════╦═══════╗");
	
			for (int i = 0; i < 9; i++) {
				if (i == 3 || i == 6) {
					System.out.print("╠═══════╬═══════╬═══════╣\n");
					System.out.print("║");
				} else {
					System.out.print("║");
				}
	
				for (int j = 0; j < 9; j++) {
					if (j == 3 || j == 6) {
						System.out.print(" ║ ");
					} else {
						System.out.print(" ");
					}
	
					if (sudo[i][j] != 0) {
						System.out.print(sudo[i][j]);
					} else {
						System.out.print("_");
					}
				}
				System.out.println(" ║");
			}
			System.out.println("╚═══════╩═══════╩═══════╝");
		}
	}

	/**	Proceso de creacion del sudoku
	 * @return
	 */
	private int[][] creaSudoku() {
		int[][] sudokuCompleto = new int[9][9];

		for (int i = 0; i < sudokuCompleto.length; i++) {
			int[] rand;
			do {
				rand = creaLinea();
				System.arraycopy(rand, 0, sudokuCompleto[i], 0, rand.length);
			} while (!testSudokuCompleto(sudokuCompleto));
		}
		return sudokuCompleto;
	}

	/**	Proceso de creacion y mezclado de la linea del sudoku
	 * @return
	 */
	private int[] creaLinea() {
		int[] lineaSudoku = new int[9];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 9; i++) {
			list.add(i);
		}

		Collections.shuffle(list);
		for (int i = 0; i < 9; i++) {
			lineaSudoku[i] = list.get(i).intValue();
		}
		
		return lineaSudoku;
	}

	/**	Comprobacion de todo el sudoku
	 * @param sudoCompleto
	 * @return
	 */
	private boolean testSudokuCompleto(int[][] sudoCompleto) {
		for (int i = 0; i < sudoCompleto.length; i++) {
			if (!testNoDuplicados(sudoCompleto[i])) {
				return false;
			}
		}

		for (int i = 0; i < 9; i++) {
			int[] temp = new int[9];
			for (int j = 0; j < 9; j++) {
				temp[j] = sudoCompleto[j][i];
			}
			if (!testNoDuplicados(temp)) {
				return false;
			}
		}

		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				int[] temp = new int[9];
				int h = 0;
				for (int k = 0; k < 3; k++) {
					for (int g = 0; g < 3; g++) {
						temp[h] = sudoCompleto[i + k][j + g];
						h++;
					}
				}
				if (!testNoDuplicados(temp)) {
					return false;
				}
			}
		}
		return true;
	}

	/**	Comprobacion de duplicados
	 * @param lineaSudo
	 * @return
	 */
	private boolean testNoDuplicados(int[] lineaSudo) {
		int[] temp = new int[9];
		for (int i = 0; i < lineaSudo.length; i++) {
			if (lineaSudo[i] != 0) {
				for (int j : temp) {
					if (j == lineaSudo[i]) {
						return false;
					}
				}
				temp[i] = lineaSudo[i];
			}
		}
		return true;
	}

	// GETTERS Y SETTERS
	
	public int[][] getSudoku() {
		return sudoku;
	}

	public void setSudoku(int[][] sudoku) {
		this.sudoku = sudoku;
	}

	public int[][] getBlankSudoku() {
		return blankSudoku;
	}

	public void setBlankSudoku(int[][] blankSudoku) {
		this.blankSudoku = blankSudoku;
	}
}
