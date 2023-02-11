package sp.fjto.generadores;

import java.security.SecureRandom;
import java.util.Iterator;
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
public class Generator extends SudokuGenerator {
	private Iterator<?> iterator;
//	private int[][] sudoku;
//	private int[][] blankSudoku;
//	private int borde;

	/** Constructor general
	 * 
	 */
	public Generator() {
	}

	/** Constructor que recibe una lambda como parametro
	 * @param lambda 
	 * Lambda que queremos generar
	 */
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
	 * @return Devuelve el nuevo iterador
	 */
	public String next() {

		return iterator.next() + "";
	}


	/**
	 * Imprime por consola el elemento recibido por parametro
	 * 
	 * @param generator elemento a mostrar por consola
	 */
	public void printNumber(Generator generator) {

		System.out.println(generator.next());
	}


	/**
	 * genera un nuevo numero
	 * 
	 * @param generator Objeto de Generator que queremos un muebo numero 
	 * @return  Devuelve el numero generado
	 */
	public String genNumber(Generator generator) {
		return generator.next();
	}


	/**
	 * Genera un StringBuilder con la secuencia de caracteres aleatorios del tamaño
	 * indicado por el parametro
	 * 
	 * @param len Longitud deseada del StingBuilder
	 * @return Devuelve el StringBuilder generado
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
}
