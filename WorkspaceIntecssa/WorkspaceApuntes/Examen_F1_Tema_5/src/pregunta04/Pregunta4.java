package pregunta04;

import java.util.Scanner;

public class Pregunta4 {

	public static void main(String[] args) {

		/*
		Calcular el mayor de cuatro números enteros en Java.
		El programa lee por teclado cuatro números enteros y calcula y
		muestra el mayor de los cuatro.
		*/
		
		System.out.println("PREGUNTA 4");
		System.out.println("----------");
		System.out.println("");
		
		Scanner numeroTeclado = new Scanner(System.in);
		int n1, n2, n3, n4, mayor;
		
		
		System.out.println("Intoduce numero 1");
		n1 = numeroTeclado.nextInt();
		

		System.out.println("Intoduce numero 2");
		n2 = numeroTeclado.nextInt();
		

		System.out.println("Intoduce numero 3");
		n3 = numeroTeclado.nextInt();
		

		System.out.println("Intoduce numero 4");
		n4 = numeroTeclado.nextInt();
		
		mayor = n1;
		if (mayor < n2) mayor=n2;
		if (mayor < n3) mayor=n3;
		if (mayor < n4) mayor=n4;
		
		System.out.println("\nEl numero mayor es : "+mayor);
		
		
	}

}
