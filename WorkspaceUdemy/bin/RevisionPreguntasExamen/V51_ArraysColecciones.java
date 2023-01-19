package RevisionPreguntasExamen;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class V51_ArraysColecciones {

	public static void main(String[] args) {

//		Pregunta 1
		
		Collection<Number> col = new HashSet<>();
		col.add(1);
		var list1 = List.of(col); //1	// esta linea hace que list1 apunte a la referencia de col
										// list1 contiene una lista de colecciones cuyo primer elemento
										//es la lista a la que se refiene col
		col.add(2); //2
		var list2 = List.copyOf(col); //3
		System.out.println(list1+", "+list2); //list1 contiene todo lo que tenga col
	}

}
