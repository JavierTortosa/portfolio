package Pregunta_3;

/*
 * PREGUNTA 3
 * 
 * Con la función Collections.sort(), ordenar una lista cualquiera
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Persona implements Comparable<Persona>{
	private String nombre="";
	private int edad=0;
	private int altura =0;
	
	public Persona(String nombre, int edad, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "\tedad=" + edad + "\taltura=" + altura + "]\n";
	}

	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}
}

public class Pregunta_3 {
	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<>();

		personas.add(new Persona("Remedios"		, 21, 167));
		personas.add(new Persona("Buenaventura"	, 48, 158));
		personas.add(new Persona("Teófilo"		, 35, 188));
		personas.add(new Persona("Abdón"		, 34, 195));
		personas.add(new Persona("Xiomara"		, 20, 153));
		personas.add(new Persona("Guadalupe"	, 42, 177));
		personas.add(new Persona("Eir"			, 40, 156));
		personas.add(new Persona("Alicia"		, 33, 160));
		personas.add(new Persona("Matilde"		, 34, 165));
		personas.add(new Persona("Andrea"		, 38, 193));
		personas.add(new Persona("Isaac"		, 45, 211));
		personas.add(new Persona("Emilia"		, 48, 187));
		personas.add(new Persona("Indalecio"	, 41, 153));
		personas.add(new Persona("Victoria"		, 41, 175));
		personas.add(new Persona("Fermín"		, 36, 166));
		personas.add(new Persona("Marc"			, 23, 200));
		personas.add(new Persona("Beata"		, 46, 169));
		personas.add(new Persona("Julián"		, 28, 194));
		personas.add(new Persona("Aroa"			, 49, 173));
		personas.add(new Persona("Polonio"		, 37, 158));
		personas.add(new Persona("Julen"		, 21, 150));
		personas.add(new Persona("Eira"			, 45, 186));
		personas.add(new Persona("Leonor"		, 38, 186));
		personas.add(new Persona("Rosalía"		, 48, 162));
		personas.add(new Persona("Adela"		, 26, 190));
		
		System.out.println("Lista sin ordenar\n");
		listaArrayList(personas);
		
		System.out.println("\nLista ordenado con Comparable - por nombre\n");
		Collections.sort(personas);
		listaArrayList(personas);
		
		System.out.println("\nLista ordenado por Comparator - por edad\n");
		Collections.sort(personas, new OrdenPorEdad());
		listaArrayList(personas);
	}

	private static void listaArrayList(ArrayList<Persona> personas) {
		String tab="";
		
		for(Persona listado: personas) {
			tab = regulaTabulador(listado.getNombre());
			System.out.println(listado.getNombre() + tab + listado.getEdad() + "\t" + listado.getAltura());
		}
	}
	
	private static String regulaTabulador (String nombre) {
		String tabulador ="";
		
		if(nombre.length()<14 && nombre.length()>=8) { 
			tabulador="\t\t";
		} else if (nombre.length()<=7) {
			tabulador="\t\t\t";
		} else {
			tabulador ="\t";
		}
		return tabulador;
	}
}

class OrdenPorEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getEdad() - o2.getEdad();
	}
}




