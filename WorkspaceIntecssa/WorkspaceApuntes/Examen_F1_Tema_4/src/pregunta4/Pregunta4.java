package pregunta4;

public class Pregunta4 {

	public static void main(String[] args) {

		/*
		Transforma la cadena de texto “juegos olímpicos” a mayúsculas.
		Guarda el valor en la variable y posteriormente conviértela
		nuevamente a minúsculas.
		*/
		
		String texto = "juegos olímpicos";
		
		System.out.println("Texto original: " + texto);
		texto = texto.toUpperCase();
		System.out.println("Texto a mayusculas: " + texto);
		texto = texto.toLowerCase();
		System.out.println("Texto a minusculas: " + texto);
	}

}
