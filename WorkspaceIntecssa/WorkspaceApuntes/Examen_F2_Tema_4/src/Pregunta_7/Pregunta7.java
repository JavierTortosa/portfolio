package Pregunta_7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*	PREGUNTA 7
 * 	----------
 * 
 * 	Realizar una expresión regular para comprobar si un email es válido
 */

public class Pregunta7 {

    public static void main(String[] args) {                                                                      
    	 
        Scanner sc = new Scanner(System.in);
        String email;
        System.out.print("Introduce email: ");
        email = sc.nextLine();
        
        Pattern pattern = Pattern.compile(""
        		+ "[\\w-]"				// a-z mayusculas o minusculas o 0-9 o _
        		+ "+"					// el+ es porque debe aparecer mas de 1 caracter
        		+ "(\\.[\\w-]+)"		// hace se pueda poner un punto y mas caracteres
        		+ "*"					// el* hace que el bloque anterior sea opcional
        		+ "@"					// debe aparecer una @
        		+ "[A-Za-z0-9]+"		// deben aparecer mas de 1 caracter de los de dentro del corchete
        		+ "(\\.[A-Za-z0-9]+)*"	// opcionalmente, puede contener un . y mas de un caracter de dentro del corchete
        		+ "(\\."				// debe contener un .
        		+ "[A-Za-z]{2,})"		// y al menos 2 caracteres de los que hay entre corchetes
        		+ "");					//
        
        
		Matcher matcher = pattern.matcher(email);

		if (matcher.find()) {
			System.out.println("Correo Válido");
		} else {
			System.out.println("Correo No Válido");
		}
	}
}
