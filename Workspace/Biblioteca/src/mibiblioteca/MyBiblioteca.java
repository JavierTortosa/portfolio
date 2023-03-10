package mibiblioteca;

import serviciosAleatorios.Algoritmos;
import serviciosAleatorios.NumerosRandom;
import serviciosAleatorios.Passwords;
import serviciosAleatorios.PersonaRandom;
import serviciosAleatorios.Entorno;

/**
 * @author F. Javier Tortosa
 * 
 * Biblioteca de metodos para generar actividades recursivas
 * @implSpec 
 * getLetraDNI(String numeroDNI): calcula la letra de un dni dado partiendo de un string
 * @implSpec
 * getLetraDNI(Int numeroDNI): calcula la letra de un dni dado partiendo de un int
 * @implSpec
 * getRandomNumber(): calcula un numero random
 * @implSpec
 * getRandomNumber(int desde, int hasta): calcula un numero entre desde y hasta
 * @implSpec
 * getRandomString(String formato): genera un string con el formato 9: numero x:minuscula X:mayuscula resto: se mantiene
 * @implSpec
 * getRandomPassword(int longitudMinima, int longitudMaxima: genera un pass aleatorio de una longitud entre longitudMaxima y longitudMinima
 * @implSpec
 * getEvaluaPassword(String password): comprueba si el password tiene mas de 5 numeros, mas de  
 * 
 */
public class MyBiblioteca implements Entorno{

	Algoritmos algoritmos 			= new Algoritmos();
	//Evaluacion evaluacion 		= new Evaluacion();
	NumerosRandom numerosRandom 	= new NumerosRandom();
	Passwords passwords 			= new Passwords();
	PersonaRandom personaRandom 	= new PersonaRandom();
		
	public MyBiblioteca() {
	}
	
	public char getLetraDNI(String numeroDNI) {
		int dni =0;
		
		try {
			dni=Integer.valueOf(numeroDNI);
		} catch (Exception e) {
			System.out.println("Solo el numero, sin letras ni puntos");
			dni=0;
		}
		
		if (dni != 0) {
			return getLetraDNI(dni);
		} else {
			return '-';
		}
	}
	
	public char getLetraDNI(int numeroDNI) {
		return algoritmos.letraDNI(numeroDNI);
	}
	
	public int getRandomNumber () {
		return numerosRandom.numeroRandom();
	}
	
	public int getRandomNumber (int desde, int hasta) {
		return numerosRandom.numeroRandom(desde, hasta);
	}
	
	public String getRandomString (String formato) {
		return numerosRandom.caracterRandom(formato);
	}
	
	public String getRandomPassword (int longitudMinima, int longitudMaxima) {
		return passwords.generaPass(longitudMinima, longitudMaxima);
	}
	
	public boolean getEvaluaPassword (String password) {
		// segura si contrase??a > +5 numeros && +1 minusculas && +2 mayusculas
		return passwords.evaluaPass(password, 5, 1, 2, false);
	}
	
	public boolean getEvaluaPassword(String password, int numeros, int minusculas, int mayusculas, 
			boolean muestraEvaluacion) {
		return passwords.evaluaPass(password, numeros, minusculas, mayusculas, muestraEvaluacion);
	}
	
	public String getRandomNombre (int hombreOMujer) {
		return personaRandom.generaNombre(hombreOMujer);
	}
	
	public int getRandomEdad (int desde, int hasta) {
		return personaRandom.generaEdad(desde, hasta);
	}
	
	public int getRandomAltura (int desde, int hasta) {
		return personaRandom.generaAltura(desde, hasta);
	}
}
