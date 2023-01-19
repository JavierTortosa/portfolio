
public class Saludos {

	public void Saludos (String ... nombres) {
		String saludo = "Hola ";
		
		for (String nombre : nombres) {
			saludo += nombre + ", ";
		}
		
		System.out.println(saludo.substring(0, saludo.length()));
		
	}
}
