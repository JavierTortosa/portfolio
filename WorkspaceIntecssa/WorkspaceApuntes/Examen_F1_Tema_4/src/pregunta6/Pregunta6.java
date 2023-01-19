package pregunta6;

public class Pregunta6 {

	public static void main(String[] args) {

		/*
		Utilizando StringBuilder dar la vuelta las siguientes cadenas
		a) Steve Martin
		b) Raul Gonzalez
		c) Luis Aragones
		*/
		
		StringBuilder textoA = new StringBuilder("Steve Martin");
		StringBuilder textoB = new StringBuilder("Raul Gonzalez");
		StringBuilder textoC = new StringBuilder("Luis Aragones");
		
		System.out.println("Texto original : "+textoA);
		System.out.println("Texto Invertido: "+textoA.reverse()+"\n");
		
		System.out.println("Texto original : "+textoB);
		System.out.println("Texto Invertido: "+textoB.reverse()+"\n");
		
		System.out.println("Texto original : "+textoC);
		System.out.println("Texto Invertido: "+textoC.reverse()+"\n");
		
	}

}
