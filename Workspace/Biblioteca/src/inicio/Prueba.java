package inicio;

import serviciosAleatorios.Algoritmos;
import serviciosAleatorios.Evaluacion;
import serviciosAleatorios.NumerosRandom;
import serviciosAleatorios.Passwords;
import serviciosAleatorios.PersonaRandom;
import serviciosAleatorios.Entorno;

public class Prueba implements Entorno{

	public static void main(String[] args) {

		Evaluacion evaluacion 		= new Evaluacion();
		PersonaRandom personaRandom = new PersonaRandom();
		NumerosRandom numerosRandom = new NumerosRandom();
		Passwords passwords			= new Passwords();
		Algoritmos algoritmos		= new Algoritmos();

		String numeroDniRandom		= "";
		char   letraDniRandom		= ' ';
		String dniRandom			= "";
		String telefonoRandom 		= "";
		String nombre 				= "";
		String txtRandom			= "";
		String tabulador			= "";
		String password				= "";
		int edad					= 0;
		int altura					= 0;

		for(int i=0; i<25; i++) {
			nombre 					= personaRandom.generaNombre(MIXTO);
			edad 					= personaRandom.generaEdad(20, 50);
			altura 					= personaRandom.generaAltura(150, 215);
			telefonoRandom			= numerosRandom.caracterRandom("+(999)-999.999.999");
			numeroDniRandom			= numerosRandom.caracterRandom("99999999");
			letraDniRandom			= algoritmos.letraDNI(Integer.valueOf(numeroDniRandom));
			dniRandom				= String.valueOf(numeroDniRandom+"-"+letraDniRandom);
			txtRandom 				= numerosRandom.caracterRandom("Prueba de Texto 99");
			password				= passwords.generaPass(25, 25); 

			tabulador = evaluacion.tabulador(nombre);
			
			System.out.println((i+1)+"\t" + nombre + tabulador + edad + "\t" + altura + "\t"
					+ "" + telefonoRandom + "\t" + "" + dniRandom + "\t" + txtRandom+ "\t" + password);
		}
	}
}
