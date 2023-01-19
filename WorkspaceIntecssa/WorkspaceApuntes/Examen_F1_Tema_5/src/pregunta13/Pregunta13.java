package pregunta13;

import java.util.Scanner;

public class Pregunta13 {

	public static void main(String[] args) {

		/*
		Crea una aplicación que nos pida un día de la semana y que nos diga si
		es un día laboral o no. Usa un switch para ello.
		*/
		
		System.out.println("PREGUNTA 13");
		System.out.println("-----------");
		System.out.println("");
		
		Scanner numeroTeclado = new Scanner(System.in);
		
		int dia=0;
		
		System.out.println("Introduce el numero dia de la semana: ");
		dia = numeroTeclado.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIERCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default:
			if(dia<1 || dia>12)
				System.out.println("\n"+dia +" no es un numero valido");
		}
		
		switch (dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Dia laboral");
			break;
		case 6:
		case 7:
			System.out.println("Fin de semana");
		}
	}
}
