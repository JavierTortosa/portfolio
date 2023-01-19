package pregunta8;

import java.util.Scanner;

public class Pregunta8 {

	public static void main(String[] args) {

		/*
		PREGUNTA 8
		
		Realizar un ejercicio que lea el nombre y el sueldo de 20 empleados y
		muestre el nombre y el sueldo del empleado que más gana.
		Para hacerlo utilizaremos dos arrays:
		• Un array de String para los nombres de los empleados
		• Un array de tipo double para los sueldos de cada empleado.
		Al mismo tiempo que leemos los datos de los empleados iremos
		comprobando cuál es el que tiene el mayor sueldo. Para ello tomamos el
		sueldo del primer empleado que se lee como mayor sueldo y después
		vamos comprobando el resto de sueldos. Cuando encontramos alguno
		mayor que el mayor actual este sueldo se convierte en el nuevo mayor.
		En general para calcular el mayor de una serie de números tomamos el
		primero como mayor y después comparamos el resto de números.
		*/
		
		String [] nombre = new String[20];
		double [] sueldo = new double[nombre.length];
		
		double sueldoMayor=0;
		String nombreSueldoMayor="";
		
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < nombre.length; i++) {
			System.out.println("introduzca el nombre del empleado " + (i + 1));
			nombre[i] = teclado.next();
			
			System.out.println("introduzca el sueldo del empleado " + (i + 1));
			sueldo[i] = teclado.nextDouble();
			
			if(sueldoMayor < sueldo[i]) {
				sueldoMayor = sueldo[i];
				nombreSueldoMayor = nombre[i];
			}
			
			System.out.println();
			
		}
		
		System.out.println("El empleado que mas gana es: "+nombreSueldoMayor + " y gana : "+sueldoMayor);
	}

}
