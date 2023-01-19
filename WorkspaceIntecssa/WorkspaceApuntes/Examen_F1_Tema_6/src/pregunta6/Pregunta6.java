package pregunta6;

import java.util.Scanner;

public class Pregunta6 {

	public static void main(String[] args) {

		/*
		PREGUNTA 6
		
		Realiza un ejercicio que guarda en un array 10 números enteros que se
		leen por teclado. A continuación, se recorre el array y calcula cuántos
		números son positivos, cuántos negativos y cuántos ceros.
		*/
		
		Scanner numeroTeclado = new Scanner(System.in);
		int[] numero = new int[10];
		int pos=0;
		int neg=0;
		int cero=0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Intoduce un numero (Positivo o Negativo o Cero): ");
			numero[i] = numeroTeclado.nextInt();
		}
		
		for (int i=0;i<numero.length;i++) {
			if(numero[i]<0) neg++;
			if(numero[i]>0) pos++;
			if(numero[i]==0) cero++;
		}
		
		System.out.println("Hay "+ pos +" numeros positivos");
		System.out.println("Hay "+ neg +" numeros negativos");
		System.out.println("Hay "+ cero +" ceros");
		
	}

}
