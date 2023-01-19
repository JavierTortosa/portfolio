package pregunta12;

import java.util.Scanner;

public class Pregunta12 {

	public static void main(String[] args) {

		/*
		Escribe una aplicación con un String que contenga una contraseña
		cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
		intentos. Cuando aciertes ya no pedirá más la contraseña y mostrará un
		mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida
		(3 intentos y si acierta sale, aunque le queden intentos).
		*/
		
		System.out.println("PREGUNTA 12");
		System.out.println("-----------");
		System.out.println("");
		
		String pass="1111";
		
		Scanner textoTeclado = new Scanner(System.in);
		String myPass ="";
		boolean acceso=false;
		
		for (int i=3;i>0; i--) {
			
			System.out.println("Introduzca la constraseña");
			myPass= textoTeclado.next();
			
			if (myPass.compareTo(pass)==0) {
				acceso = true;
				break;
			} else {
				System.out.println("Quedan "+(i-1) + " intentos");
			}
		}
		
		if(acceso)
			System.out.println("Enhorabuena!!!");
		else
			System.out.println("Acceso denegado");
	}
}
