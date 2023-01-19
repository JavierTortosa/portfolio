package pregunta3;

public class Pregunta3 {

	public static void main(String[] args) {

		/*
		PREGUNTA 3
		Divide la cadena de texto “Simón José Antonio de la Santísima Trinidad Bolívar y Ponte Palacios y Blanco” 
		en dos partes “Simón José Antonio de la Santísima Trinidad” y “Bolívar y Ponte Palacios y Blanco”. 
		Para posteriormente concaténalas y mostrarlas de nuevo. R. 
		*/
		System.out.println("\nPregunta 3\n**********\n");
		
		StringBuffer texto = new StringBuffer
				("Simón José Antonio de la Santísima Trinidad Bolívar y Ponte Palacios y Blanco");
		StringBuffer textoDividido1 = new StringBuffer();
		StringBuffer textoDividido2 = new StringBuffer();
		StringBuffer textoReunido = new StringBuffer();
		
		
		textoDividido1.append(texto.substring(0,43));
		textoDividido2.append(texto.substring(44)); // en el enunciado se han comido el espacio... yo tambien
		
		System.out.println(texto);
		System.out.println("Division 1: " + textoDividido1);
		System.out.println("Division 2: " + textoDividido2);
		
		System.out.println("");
		
		System.out.println("Texto original: "+texto);
		textoReunido.insert(0, textoDividido1);
		textoReunido.insert(43, " ");     
		textoReunido.insert(44,textoDividido2);
		System.out.println("Texto unido   : "+ textoReunido);
	
	}

}
