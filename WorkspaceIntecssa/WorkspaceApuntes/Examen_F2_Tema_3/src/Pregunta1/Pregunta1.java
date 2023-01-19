package Pregunta1;

/* PREGUNTA 1
 * ----------
 * 
 * Utilizar la excepción ArrayIndexOutOfBoundsException
*/
public class Pregunta1 {

	public static void main(String[] args) {
		String[] myArray = new String[5];
		
		try {
			
			myArray[6] = "Prueba";
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ha introducido un elemento fuera de los limites del array");
			
		}
	}
}
