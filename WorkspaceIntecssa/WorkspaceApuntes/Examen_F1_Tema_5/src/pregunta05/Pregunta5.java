package pregunta05;

import java.util.Scanner;

public class Pregunta5 {

	public static void main(String[] args) {

		/*
		Realizar un programa que lea por teclado tres números enteros H,
		M, S correspondientes a hora, minutos y segundos
		respectivamente, y comprueba si la hora que indican es una hora
		válida.
		
		• Supondremos que se leemos una hora en modo 12 Horas, es
		decir, el valor válido para las horas será mayor o igual que
		cero y menor que 12.
		• El valor válido para los minutos y segundos estará
		comprendido entre 0 y 59 ambos incluidos
		*/
		
		System.out.println("PREGUNTA 5");
		System.out.println("----------");
		System.out.println("");
		
		Scanner numeroTeclado = new Scanner(System.in);
		boolean ok=false;
		int horas,minutos,segundos;
		horas = minutos = segundos = -1;
		
		do {
			System.out.println("Intoduce Horas (H:0-12)");
			horas = numeroTeclado.nextInt();
			
			//LAS HORAS DEBERIAN SER DE 1 A 12 NO DE 0 A 12
			
			if (horas <=12 && horas>=0) {
				ok=true;
			} else {
				System.out.println("hora no valida (0-12)");
			}
			
		}while(!ok);
			
		ok=false;
		do {
			System.out.println("Intoduce Minutos(M:0-59)");
			minutos = numeroTeclado.nextInt();
			
			if (minutos <=59 && minutos>=0) {
				ok=true;
			} else {
				System.out.println("minutos no validos (0-59)");
			}
			
		}while(!ok);
		
		ok=false;
		do {
			System.out.println("Intoduce Segundos (S:0-59)");
			segundos = numeroTeclado.nextInt();
			
			if (segundos <=59 && segundos>=0) {
				ok=true;
			} else {
				System.out.println("segundos no validos (0-59)");
			}
			
		}while(!ok);
		
		System.out.println("\nLa hora introducida es: "+ horas+"h:"+minutos+"m:"+segundos+"s");
	}

}
