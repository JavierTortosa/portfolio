package pregunta7;

import java.util.Scanner;

public class Pregunta7 {

	public static void main(String[] args) {
		
		/*
		PREGUNTA 7
		
		Realizar un programa para leer la altura de N personas y calcular la altura
		media. Calcular cuántas personas tienen una altura superior a la media y
		cuántas tienen una altura inferior a la media. El valor de N se pide por
		teclado y debe ser entero positivo.
		*/
		
		Scanner numeroTeclado = new Scanner(System.in);
		int nPersonas = 0;
		double[] alturas;
		double acumuladoGrupo = 0;
		double mediaGrupo = 0;
		
		do {
			System.out.println("Introduza la cantidad de personas");
			nPersonas = numeroTeclado.nextInt();
			
			if(nPersonas<0) System.out.println("\nNo puede ser un numero negativo\n");
			
		}while (!(nPersonas>0));
		
		alturas = new double[nPersonas];
		
		System.out.println();
		
		for (int i = 0; i < nPersonas; i++) {
			System.out.println("introduzca la altura de la persona " + (i + 1));
			alturas[i] = numeroTeclado.nextDouble();
		}

		System.out.println();
		
		// calculando la media del grupo
		for (int i = 0; i < alturas.length; i++) {
			acumuladoGrupo += alturas[i];
		}
		mediaGrupo = acumuladoGrupo / nPersonas;
		System.out.println("La media de altura del grupo es : " + mediaGrupo);
		System.out.println();
		
		// calculando por encima y por debajo de la media
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i]>mediaGrupo) 
				System.out.println("La persona "+(i+1)+" tiene una altura por encima de la media");
			if (alturas[i]<mediaGrupo) 
				System.out.println("La persona "+(i+1)+" tiene una altura por debajo de la media");
		}
	}
}
