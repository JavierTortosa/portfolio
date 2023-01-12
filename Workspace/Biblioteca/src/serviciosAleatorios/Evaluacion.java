package serviciosAleatorios;

public class Evaluacion {

	public String tabulador (String nombre) {
		String tabulador = "";
		
		if(nombre.length()<14 && nombre.length()>=8) { 
			tabulador="\t\t";
		} else if (nombre.length()<=7) {
			tabulador="\t\t\t";
		} else {
			tabulador ="\t";
		}
		
		return tabulador;
	}
}
