package pregunta11;

import java.util.Scanner;

public class Pregunta11 {

	public static void main(String[] args) {

		/*
		Realizar un ejercicio que pida que se introduzcan dos números enteros A
		y B por teclado y muestre los números pares que hay entre A y B. A debe
		ser menor que B. Si no es así se mostrará un mensaje indicándolo y se
		vuelven a introducir.
		Solución
		
		Para resolver este ejercicio seguiremos los siguientes pasos:
		1. Introducir los dos números por teclado. Como A debe ser menor que
		B se utilizará una estructura repetitiva do .. while para repetir la lectura
		mientras A sea mayor o igual que B.
		2. Mostrar los números pares desde A hasta B. Para ello utilizaremos la
		estructura repetitiva for.
		*/
		
		System.out.println("PREGUNTA 11");
		System.out.println("-----------");
		System.out.println("");
		
		Scanner numeroTeclado = new Scanner(System.in);
		boolean ok=false;
		int numero1=0;
		int numero2=0;
		
		do {
			System.out.println("Intoduce un numero");
			numero1 = numeroTeclado.nextInt();
			
			System.out.println("Intoduce un numero mayor que "+numero1);
			numero2 = numeroTeclado.nextInt();
			
			if (numero1 <numero2) {
				ok=true;
			} else {
				System.out.println("Numeros no validos. El primero debe ser menor que el segundo");
			}
			
		}while(!ok);
		
		System.out.println("");
		for (int i=numero1; i<=numero2; i++) {
			if (i % 2 == 0) {
				System.out.println("el numero "+i+" es par");
			}
		}
	}
}
