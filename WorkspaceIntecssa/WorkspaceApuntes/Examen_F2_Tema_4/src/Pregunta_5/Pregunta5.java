package Pregunta_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 	PREGUNTA 5
 * 	----------
 * 
 * 	Comprobar si el String cadena no empieza por un dígito
 */

public class Pregunta5 {

	public static void main(String[] args) {
		
		String cadena = "5abc 0def ghi jkl mno pqr stu uvw xyz";
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(cadena);
		
		if (matcher.lookingAt()) 
			System.out.println("Empieza con un digito");
		else
			System.out.println("No empieza con un digito");
	}
}
