package pregunta15;

public class Pregunta15 {

	public static void main(String[] args) {

		/*
		Del siguiente String “Pero que pasa chavales, todo bien, todo correcto y
		yo que alegro” cuenta cuantas vocales hay en total (recorre el String con
		charAt).
		*/
		
		System.out.println("PREGUNTA 15");
		System.out.println("-----------");
		System.out.println("");
		
		
		String texto = "Pero que pasa chavales, todo bien, todo correcto y yo que alegro";
		int contador =0;
		
		for (int i=0; i<texto.length();i++) {
			if(texto.charAt(i)=='a' || 
					texto.charAt(i)=='e' ||
					texto.charAt(i)=='i' ||
					texto.charAt(i)=='o' ||
					texto.charAt(i)=='u') {
				contador++;
			}
		}
		
		System.out.println("hay "+contador+" vocales");
	}

}
