package Ejemplo2_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Inicio {

	public static void main(String[] args) {

		Set<Persona> hashSetPersona = new HashSet<>();
		
		SortedSet<Persona> treeSetPersona = new TreeSet<>();
			
		Persona p;
		p = new Persona(1, "Marta", 165);
		hashSetPersona.add(p);
		treeSetPersona.add(p);
		
		p = new Persona(3, "Elena", 155);
		hashSetPersona.add(p);
		treeSetPersona.add(p);
		
		p = new Persona(4, "Maria", 140);
		hashSetPersona.add(p);
		treeSetPersona.add(p);
		
		p = new Persona(2, "Pedro", 160);
		hashSetPersona.add(p);
		treeSetPersona.add(p);
		
		System.out.println("Persona en el conjunto: \n" + hashSetPersona);
		System.out.println("Persona en el conjunto Ordenado: \n" + treeSetPersona);
		
		
		
		
	}

}
