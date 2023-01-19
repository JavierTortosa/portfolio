package pregunta1y2;

public class Pregunta1_Y_2 {

	public static void main(String[] args) {

		
		/*
		 * PREGUNTA 1
		 * Elimina los caracteres 3 y 7 de las siguientes cadenas: 
		 * a) Hola Mundo 
		 * b) Copa Mundial Qatar 2022 
		 * c) Unión Europea
		 */
		System.out.println("Pregunta 1\n**********\n");
		
		StringBuilder textoA = new StringBuilder("Hola Mundo");

		textoA.deleteCharAt(3);
		textoA.deleteCharAt(7);
		System.out.println(textoA.toString());

		StringBuilder textoB = new StringBuilder("Copa Mundial Qatar 2022 ");

		textoB.deleteCharAt(3);
		textoB.deleteCharAt(7);
		System.out.println(textoB.toString());
		
		StringBuilder textoC = new StringBuilder("Unión Europea");

		textoC.deleteCharAt(3);
		textoC.deleteCharAt(7);
		System.out.println(textoC.toString());
		
		//PREGUNTA 2
		
//		Mostrar el tamaño y la capacidad de las anteriores cadenas
		System.out.println("\nPregunta 2\n**********\n");
		
		System.out.println("El tamaño del texto a es :"+textoA.length());
		System.out.println("La capacidad de textoA :"+textoA.capacity());
		
		
		System.out.println("El tamaño del texto b es :"+textoB.length());
		System.out.println("La capacidad de textoB :"+textoB.capacity());
		
		System.out.println("El tamaño del texto c es :"+textoC.length());
		System.out.println("La capacidad de textoC :"+textoC.capacity());

	}

}
