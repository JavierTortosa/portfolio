package pregunta03;

import java.util.Scanner;

public class Pregunta3 {

	public static void main(String[] args) {

		/*
		Realizar un programa que lea dos caracteres y compruebe si son
		diferentes.
		*/
		
		System.out.println("PREGUNTA 3");
		System.out.println("----------");
		System.out.println("");
		
		Scanner caracterTeclado = new Scanner(System.in);
		
		System.out.println("Intoduce el caracter 1");
		char caracter1 = caracterTeclado.next().charAt(0);
		
		System.out.println("Intoduce el caracter 2");
		char caracter2 = caracterTeclado.next().charAt(0);
		
		System.out.println("");
		
		if (caracter1 == caracter2) { //los char no necesitan compareTo()
			System.out.println(caracter1 + " y " + caracter2 + " son iguales");
		} else {
			System.out.println(caracter1 + " y " + caracter2 + " son diferentes");
		}
	}

}
