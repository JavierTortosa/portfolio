package pregunta01;

import java.util.Scanner;

public class Pregunta1 {

	public static void main(String[] args) {

		/*
		Realizar un programa que lea un número entero por teclado y calcule si es
		par o impar.
		
		• Podemos saber si un número es par si el resto de dividir el número
		entre 2 es igual a cero. En caso contrario el número es impar
		• El operador Java que calcula el resto de la división entre dos
		números enteros o no es el operador
		*/
		
		System.out.println("PREGUNTA 1");
		System.out.println("----------");
		System.out.println("");
		
		Scanner numeroTeclado = new Scanner(System.in);
		
		System.out.println("Intoduce un numero");
		int numero = numeroTeclado.nextInt();
		
		String parImpar=((numero % 2 == 0)?"par":"impar");
		
		System.out.println("El numero "+numero+" es "+ parImpar);
	}
}
