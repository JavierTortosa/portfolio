package Pregunta1y2;

import java.util.ArrayList;

/*
 * 	PREGUNTA 1
 * 	----------
 
	public class SeleccionFutbol {
	......
	public SeleccionFutbol() {
	}
	public SeleccionFutbol(int id, String nombre, String apellidos, int
	edad) {
	this.id = id;
	this.Nombre = nombre;
	this.Apellidos = apellidos;
	this.Edad = edad;
	}
	Con la siguiente clase, crear las clases hijas :
	• Futbolista
	• Entrenador
	Usando extends
*/

/* PREGUNTA 2
 * ----------
 
	public static ArrayList<SeleccionFutbol> integrantes = new
			ArrayList<SeleccionFutbol>();
	
	Utlizando un ArrayList, insertar datos en las clases hijas Entrenador y
	Futbolista.

*/

public class Principal {

	public static ArrayList<SeleccionFutbol> integrantes = new
			ArrayList<SeleccionFutbol>();
	
	public static void main(String[] args) {
		
		Entrenador entrenador;
		Futbolista futbolista;
		
		ArrayList <Entrenador> arrayEntrenador = new ArrayList<>();
		ArrayList <Futbolista> arrayFutbolista = new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			entrenador = new Entrenador(i+1, ("Nombre"+i), ("Apellido"+i), i+50, 10+i);
			arrayEntrenador.add(entrenador);
			
			futbolista = new Futbolista(i+1, ("Nombre"+i), ("Apellido"+i), i+20, (2_000+(2_000*(i*2))), "Delantero" );
			arrayFutbolista.add(futbolista);
		}

		System.out.println("\nListado entrenadores\n");
		
		for(Entrenador entrenadores : arrayEntrenador) {
			System.out.println(entrenadores.toString());
		}
		
		System.out.println("\nListado de Futbolistas\n");
		
		for (Futbolista futbolistas : arrayFutbolista) {
			System.out.println(futbolistas.toString());
		}
	}
}
