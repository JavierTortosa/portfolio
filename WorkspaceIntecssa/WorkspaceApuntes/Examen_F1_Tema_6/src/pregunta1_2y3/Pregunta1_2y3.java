package pregunta1_2y3;

import java.util.Scanner;

public class Pregunta1_2y3 {

	public static void main(String[] args) {

//		************************************************************************************ PREGUNTA 1
		
		/*
		 * PREGUNTA 1
		 * 
		 * Calcular la media de una serie de números que se leen por teclado.
		 * 
		 * Realiza un programa que lea por teclado 10 números enteros y los guarde en un
		 * array.
		 */

		int[] numero = new int[10];
		double media = 0;
		double acumulado = 0;

		Scanner numeroTeclado = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Intoduce un numero (Positivo o Negativo): ");
			numero[i] = numeroTeclado.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			acumulado += numero[i];
		}
		media = acumulado / 10;

		System.out.println("La suma del array es: "+acumulado + "\nLa media es: " + media);
		
		
//		************************************************************************************ PREGUNTA 2
		/*
		PREGUNTA 2
		
		Sobre la base del anterior ejercicio, calcula y muestra por separado la
		media de los valores positivos y la de los valores negativos.
		*/
		
		System.out.println();
		System.out.println("**********");
		System.out.println("PREGUNTA 2");
		System.out.println("**********");
		System.out.println();
		
		double acumuladoPos=0;
		double acumuladoNeg=0;
		double mediaPos=0;
		double mediaNeg=0;
		
		for (int i = 0; i < 10; i++) {
			
			if(numero[i]<0)	
				acumuladoNeg += numero[i];
			else 
				acumuladoPos+=numero[i];
		}
		
		mediaPos = acumuladoPos / 10;
		mediaNeg = acumuladoNeg / 10;
		
		System.out.println("La suma del array de los numeros positivos "
				+ "es: "+acumuladoPos + "\nLa media es: " + mediaPos);
		
		System.out.println("La suma del array de los numeros negativos "
				+ "es: "+acumuladoNeg + "\nLa media es: " + mediaNeg);
		
//		************************************************************************************ PREGUNTA 3
				
		/*
		PREGUNTA 3
		
		Realiza un programa que lea 10 números enteros por teclado y los guarde
		en un array. Calcula y muestra la media de los números que estén en las
		posiciones pares del array.
		Considera la primera posición del array (posición 0) como par.
		*/
		
		System.out.println();
		System.out.println("**********");
		System.out.println("PREGUNTA 3");
		System.out.println("**********");
		System.out.println();
		
		double acumuladoPares=0;
		double mediaPares=0;
		int contador=0;
		
		
		for (int i = 0; i < 10; i++) {

			//acumuladoPares += numero[i];
			//contador++;

			if ((i % 2) == 0) {

				acumuladoPares += numero[i];
				contador++;
			}

		}
		
		mediaPares = acumuladoPares / 10;
		
		System.out.println("La suma del array de los numeros en posicion par "
				+ "es: "+acumuladoPares + "\nLa media es: " + mediaPares);
	}
	
}
