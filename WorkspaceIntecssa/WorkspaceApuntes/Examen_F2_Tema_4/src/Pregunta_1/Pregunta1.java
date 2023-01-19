package Pregunta_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*	PREGUNTA 1
 * 	----------
 *  
 * Comprobar si el String cadena contiene exactamente el patrón (matches) “abc”
 */

public class Pregunta1 {

	public static void main(String[] args) {

		String cadena = "abc";

		Pattern pat = Pattern.compile("abc");

		Matcher mat = pat.matcher(cadena);

		if (mat.matches()) {
			System.out.println("Si contiene exactamente el patrón “abc”");
		} else {
			System.out.println("No contiene exactamente el patrón “abc”");
		}
	}
}
