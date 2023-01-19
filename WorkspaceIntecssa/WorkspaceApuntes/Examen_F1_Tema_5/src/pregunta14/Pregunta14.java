package pregunta14;

import java.util.Scanner;

public class Pregunta14 {

	public static void main(String[] args) {

		/*
		Muestra los números primos entre 1 y 100
		
		Un número primo es aquel que solo es divisible entre si mismo y 1. 
		Los números negativos no pueden ser primos
		*/
		System.out.println("PREGUNTA 14");
		System.out.println("-----------");
		System.out.println("");
		
		int numero=100;
		boolean primo = true;
		
		for(int i=1; i<numero; i++) {
			
			for( int j = i-1; j>1; j--) {
				
				if((i % j) == 0) {
					primo=false;
					break;
				}
			}
			
			if(primo) {
				System.out.print(i+" ");
			}
			primo=true;
		}
	}
}
