package Pregunta_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 	PREGUNTA 6
 * 	----------
 * 
 * 	Comprobar si el String cadena no acaba con un dígito
 */

//https://puntocomnoesunlenguaje.blogspot.com/2013/07/ejemplos-expresiones-regulares-java-split.html

public class Pregunta6 {

	public static void main(String[] args) {
		
		String cadena = "053456345 abc 0def ghi jkl mno pqr stu uvw xyz2";
		
		Pattern pattern = Pattern.compile(".*[\\d]$");
		Matcher matcher = pattern.matcher(cadena);
		
		if (matcher.matches()) 
			System.out.println("acaba con un digito");
		else
			System.out.println("No acaba con un digito");
	}
}
