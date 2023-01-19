package pregunta7;

public class Pregutna7 {

	public static void main(String[] args) {

		/*
		Utilizando StringBuffer, insertar su nombre a la siguiente cadena:
			“Mi nombre es”
		*/	
			
		StringBuffer texto = new StringBuffer("Mi nombre es");
		texto.insert(12, " Javier");
			
		System.out.println(texto);	
	}

}
