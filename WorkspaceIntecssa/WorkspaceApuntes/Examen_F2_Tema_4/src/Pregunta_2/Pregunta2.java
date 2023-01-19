package Pregunta_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*	PREGUNTA 2
 * 	----------
 * 
 * Comprobar si el String cadena contiene “abc”
 */ 
public class Pregunta2 {

	public static void main(String[] args) {
		
		String cadena = "dej abc def ghi jkl mno pqr stu uvw xyz";
		
		// SIN CUANTIFICADORES
		System.out.println("SIN CUANTIFICADORES");
		
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher(cadena);
		
		if (matcher.find()) 
			System.out.println("Patron coincide");
		else
			System.out.println("Patron no coincide");
			
		// CON CUANTIFICADORES
		System.out.println("\nCON CUANTIFICADORES");
		
		Pattern pat = Pattern.compile(".*abc.*");
	    Matcher mat = pat.matcher(cadena);                                                                           
	    if (mat.matches()) 
	    	System.out.println("Patron coincide");
		else
			System.out.println("Patron no coincide");
	}
}
