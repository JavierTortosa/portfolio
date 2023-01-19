package Pregunta2;

/* PREGUNTA 2
 * ----------
 * 
 * Arrojar manualmente una ArithmeticException:
 */

public class Pregunta2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if (a<b) {
			throw new ArithmeticException("el numero a(" + a + ") debe ser mayor que el numero b("+ b+")");
		} else {
			System.out.println("el numero a vale " + a + " y es mayor que el numero b que vale "+ b);
		}
	}
}
