package pregunta02;

import java.util.Scanner;

public class Pregunta2 {

	public static void main(String[] args) {

		/*
		Realizar un programa que lea un número entero y muestre si el número es
		múltiplo de 11.
		Podemos comprobar si un número entero es múltiplo de 11 si al dividirlo
		por 11 el resto de esta división es cero.
		*/
		
		System.out.println("PREGUNTA 2");
		System.out.println("----------");
		System.out.println("");
		
		Scanner numeroTeclado = new Scanner(System.in);
		
		System.out.println("Intoduce un numero");
		int numero = numeroTeclado.nextInt();
		
		String multiplo=((numero % 11 == 0)?" es multiplo de 11":" no es multiplo de 11");
		
		System.out.println("\nEl numero "+numero+ multiplo);
	}

}
