package Pregunta_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 	PREGUNTA 4
 * 	----------
 * 
 *	 Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
 */ 

public class Pregunta4 {

	public static void main(String[] args) {
		
		String cadena 		= "Prueba TXT"; 
		
		Pattern patLetras 	= Pattern.compile("[a-zA-Z\\s]{5,10}");
		Matcher matLetras 	= patLetras.matcher(cadena);
		
		if (matLetras.matches()) {
			System.out.println("Cumple con la condicion");
		} else {
			System.out.println("No cumple con la condicion");
		}
		
	}
}

