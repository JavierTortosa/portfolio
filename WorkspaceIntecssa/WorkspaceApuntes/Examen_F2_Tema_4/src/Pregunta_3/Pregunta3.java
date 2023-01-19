package Pregunta_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 	PREGUNTA 3
 * 	----------
 * 
 * Comprobar si el String cadena empieza por “abc”
 */

public class Pregunta3 {
	public static void main(String[] args) {
	
		String cadena = "abc def ghi jkl mno pqr stu uvw xyz";
		
		// SIN CUANTIFICADORES
		System.out.println("SIN CUANTIFICADORES");
		
		Pattern pattern = Pattern.compile("^abc");
		Matcher matcher = pattern.matcher(cadena);
		
		if (matcher.find()) 
			System.out.println("Empieza con el patron");
		else
			System.out.println("No empieza con el patron");
		
		// CON CUANTIFICADORES
		System.out.println("\nCON CUANTIFICADORES");

		Pattern pat = Pattern.compile("^abc.*");
		Matcher mat = pat.matcher(cadena);
		if (mat.matches())
			System.out.println("Empieza con el patron");
		else
			System.out.println("No empieza con el patron");
	}
}
