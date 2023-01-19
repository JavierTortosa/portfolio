package pregunta8;

public class Pregunta8 {

	public static void main(String[] args) {

		/*
		Reemplaza todas las a del String “La vida es una lenteja” por una e.
		*/
		
		String texto = "La vida es una lenteja";
		
		System.out.println("texto original: "+texto);
		System.out.println("texto con e: " + texto.replace('a', 'e'));
	}

}
