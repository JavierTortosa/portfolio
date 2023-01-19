package tema2_variables;

/*
 * Declaracion de variables multiples
 * 
 * para definir multiples variables en una linea separadas por comas:
 * 
 * 		tipo variable1, variable2....;
 * 
 * para asignar el mismo valor a multiples variables:
 * 
 * 		variable1 = variable2 = .... = valor_de_las_variables;
 * 
 */

public class Main {
	public static void main(String[] args) {
		// declaramos las variables
		String one, two, three; 
		// asignamos el mismo valor a las tres variables		
		one = two = three = "Todas las variables se iniciarán con este string";
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}
