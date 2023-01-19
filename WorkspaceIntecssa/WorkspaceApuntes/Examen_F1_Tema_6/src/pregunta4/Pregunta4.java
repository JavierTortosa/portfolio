package pregunta4;

import java.util.Scanner;

public class Pregunta4 {

	public static void main(String[] args) {

		/*
		PREGUNTA 4:
		
		Realiza un programa que lee por teclado la nota de los alumnos de
		una clase y calcula la nota media del grupo. También muestra los
		alumnos con notas superiores a la media. El número de alumnos se
		lee por teclado. Este programa utiliza un array de elementos de tipo
		double que contendrá las notas de los alumnos. El tamaño del array
		será el número de alumnos de la clase, por lo tanto primero se
		pedirá por teclado el número de alumnos y a continuación se creará
		el array.
		
		Se realizan 3 recorridos sobre el array, el primero para asignar a
		cada elemento las notas introducidas por teclado, el segundo para
		sumarlas y calcular la media y el tercero para mostrar los alumnos
		con notas superiores a la media.
		*/
		
		Scanner numeroTeclado = new Scanner(System.in);
		
		int numAlumnos;
		double mediaGrupo =0;
		double acumuladoGrupo =0;
		double[] notas;
		
		// cantidad de alumnos
		
		System.out.println("*** ASIGNANDO CANTIDAD DE ALUMNOS ***\n");
		
		System.out.println("Introduza la cantidad de alumnos");
		numAlumnos = numeroTeclado.nextInt();
		notas=new double[numAlumnos];
		
		// asignando las notas al array

		System.out.println("\n*** ASIGNANDO LAS NOTAS ***\n");
		
		for(int i=0; i<numAlumnos; i++) {
			System.out.println("introduzca la nota del alumno " + (i+1));
			notas[i]=numeroTeclado.nextDouble();
		}
		
		System.out.println("\n*** CALCULANDO LA MEDIA DEL GRUPO ***\n");
		
		// calculando la media del grupo
		for (int i = 0; i<notas.length;i++) {
			acumuladoGrupo += notas[i];
		}
		mediaGrupo = acumuladoGrupo / numAlumnos;
		System.out.println("La media del grupo es : "+mediaGrupo);
		
		System.out.println("\n*** MOSTRANDO ALUMNOS QUE SUPERAN LA MEDIA ***\n");
		
		// mostrando alumnos que pasan de la media
		for (int i = 0; i<notas.length;i++) {
			if (notas[i]>mediaGrupo) {
				System.out.println("El alumno "+(i+1) + " supera la media");
			}
		}
	}
}
