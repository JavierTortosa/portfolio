package sp.fjto.generadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/** Generador de sudokus
 * 
 * @author Parabellum
 *
 */
public class SudokuGenerator {

	private int[][] sudoku;
	private int[][] blankSudoku;
	private int borde;

	/** Genera un sudoku y su solucion y lo muestra por consola o no
	 * 
	 * @param visible
	 * 0: oculto, 1: solucion, 2: sudoku, 3: solucion y sudoku
	 * 
	 * @param level
	 * Nivel de dificultad
	 * 
	 * @param borde
	 * 1: borde simple, 2: borde doble
	 * 

	 */

	public void genSudoku(int visible, int level, int borde) {

		boolean seguimos = procesoSudoku(visible, level, borde);

		if (seguimos) {
			this.borde=borde;
			switch (visible) {
	
			case 1:
				//System.out.println("sudoku visible");
				muestraSudoku(this.sudoku);
				break;
			case 2:
				//System.out.println("sudoku oculto");
				muestraSudoku(this.blankSudoku);
				break;
			case 3:
				//System.out.println("sudoku visible");
				muestraSudoku(this.sudoku);
				System.out.println();
				//System.out.println("sudoku oculto");
				muestraSudoku(this.blankSudoku);
				break;
			}
		} else {
		System.out.println("ERROR. No se ha podido generar el sudoku");
		}
	}
	

	/* Comprueba que los parametros son correctos e inicia el proceso de creacion del sudoku y su solucion
	 *  <p>Comprueba que la opcion de visualizacion es correcta
	 * visible	: valores validos 0, 1, 2 
	 * level	: nivel de dificultad de 0 a 10
	 * borde	: 1 o 2 para simple o doble
	 */
	private boolean procesoSudoku(int visible, int level, int borde) {

		System.out.println("Proceso sudoku\n--------------\n");

		if (visible < 0 || visible > 3) {
			System.out.println("ERROR! Opciones de visibilidad entre 0 y 3");
			return false;
		} else if (level <0 || level >10) {
			System.out.println("ERROR! El nivel de dificultad debe ser entre 0 y 10");
			return false;
		} else if (borde <1 || borde >2){
			System.out.println("ERROR! El borde puede ser 1 para simple o 2 para doble");
			return false;
		} else {
			this.sudoku = creaSudoku();
			this.blankSudoku = ocultaSudoku(copyArray(this.sudoku), level);
			return true;
		}
		
	}

	/** Clona un array multidimensional
	 * 
	 * @param arrayOriginal Array que queremos duplicar
	 * 
	 * @return Nuevo array clonado
	 */
	public int[][] copyArray(int[][] arrayOriginal) {
		if (arrayOriginal == null) {
			return null;
		}

		return Arrays.stream(arrayOriginal).map(int[]::clone).toArray(int[][]::new);
	}

	/*	Recorremos el sudoku ocultando numeros al azar segun el nivel 
	 * 
	 * sudo : sudoku solucionado para ocultar algunos numeros segun dificultad
	 * level: nivel de dificultad 0 facil 10 dificil
	 *      : devuelve el sudoku oculto 
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
	
	// Genera el marco del sudoku 
	// borde = 1 borde simple // borde = 2 borde doble
	private String[] generaMarco(int borde) {
		
		/* Genera un array con los marcos a partir de codigos unicode 
		*/
		
		String miMarco[]=new String [4];
		String temp = "";
		int marco[][] = null;
		
		int marco1[][] = {
				{9484,9472,9472,9472,9472,9472,9472,9472,9516,9472,9472,9472,9472
					,9472,9472,9472,9516,9472,9472,9472,9472,9472,9472,9472,9488}, 
				{9500,9472,9472,9472,9472,9472,9472,9472,9532,9472,9472,9472,9472
					,9472,9472,9472,9532,9472,9472,9472,9472,9472,9472,9472,9508}, 
				{9492,9472,9472,9472,9472,9472,9472,9472,9524,9472,9472,9472,9472
					,9472,9472,9472,9524,9472,9472,9472,9472,9472,9472,9472,9496}, 
				{9474}
			};
	
		int marco2[][] ={ 
				{9556,9552,9552,9552,9552,9552,9552,9552,9574,9552,9552,9552,9552
					,9552,9552,9552,9574,9552,9552,9552,9552,9552,9552,9552,9559},
				{9568,9552,9552,9552,9552,9552,9552,9552,9580,9552,9552,9552,9552
					,9552,9552,9552,9580,9552,9552,9552,9552,9552,9552,9552,9571},
				{9562,9552,9552,9552,9552,9552,9552,9552,9577,9552,9552,9552,9552
					,9552,9552,9552,9577,9552,9552,9552,9552,9552,9552,9552,9565},
				{9553}
			};
	
		if (borde == 1) marco=marco1;
		if (borde == 2) marco=marco2;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<marco[i].length;j++){
				String miCaracter = Character.toString(marco[i][j]);
				temp = temp + miCaracter;
			}
			miMarco[i] = temp;
			temp="";
		}
		return miMarco;
	}
	
	/**	Mostramos el sudoku por consola
	 * 
	 * @param sudo Sudoku que queremos mostrar
	 */
	public void muestraSudoku(int[][] sudo) {
		
		String[] miMarco = generaMarco(this.borde);
		
		String mArriba 	= miMarco[0];
		String mCentro 	= miMarco[1];
		String mAbajo 	= miMarco[2];
		String mLado 	= miMarco[3];
		
		if (sudo != null) {
			System.out.println(mArriba);
			
			for (int i = 0; i < 9; i++) {
				if (i == 3 || i == 6) {
					System.out.print(mCentro+"\n");
					System.out.print(mLado);
				} else {
					System.out.print(mLado);
				}
	
				for (int j = 0; j < 9; j++) {
					if (j == 3 || j == 6) {
						System.out.print(" "+mLado+" ");
					} else {
						System.out.print(" ");
					}
	
					if (sudo[i][j] != 0) {
						System.out.print(sudo[i][j]);
					} else {
						System.out.print("_");
					}
				}
				System.out.println(" "+mLado);
			}
			System.out.println(mAbajo);
		}
	}

	// Proceso de creacion del sudoku
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
	

	// Proceso de creacion y mezclado de la linea del sudoku
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
	

	// Comprobacion de todo el sudoku
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
	
	// comprueba que no haya numeros duplicados de la fila
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
	
	/** Getter de la solucion del sudoku
	 * @return Solucion del sudoku
	 */
	public int[][] getSudoku() {
		return sudoku;
	}

	/** Setter de la solucion del sudoku
	 * 
	 * @param sudoku Sudoku que queremos guardar
	 */
	public void setSudoku(int[][] sudoku) {
		this.sudoku = sudoku;
	}

	/** Getter del sudoku para solucionar
	 * @return blankSudoku Sudoku para solucionar
	 */
	public int[][] getBlankSudoku() {
		return blankSudoku;
	}

	/** Setter del sudoku para solucionar
	 * 
	 * @param blankSudoku Sudoku para solucionar que queremos guardar
	 */
	public void setBlankSudoku(int[][] blankSudoku) {
		this.blankSudoku = blankSudoku;
	}
}