package Pregunta2;

import java.util.Random;

public class Password {
	
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud=8;
		this.contraseña=generarPassword(longitud);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña=generarPassword(longitud);
	}

	public String generarPassword(int longitud) {
		
		String passGen = "";
		
		for (int i =0;i<longitud; i++) {
			passGen+= generaCaracter();
		}
		return passGen;
	}
	
	private char generaCaracter() {
		
		Random numeroRnd = new Random();
		char caracter=' ';
		int codigoAscii=0;
		int rndNumMayMin = numeroRnd.nextInt(3);// 0 numero 1 may 2 min
		
		switch (rndNumMayMin) {
		case 0:
			// numeros - caracter ascii entre 48 y 57 - debe buscar un numero aleatorio entre 10
			codigoAscii = 48 + numeroRnd.nextInt(10);
			break;
			
		case 1:
			// mayusculas - caracter ascii entre 65 y 90 - debe buscar un numero aleatorio entre 26
			codigoAscii = 65 + numeroRnd.nextInt(26);
			break;
			
		case 2:
			// minusculas - caracter ascii entre 97 y 122 - debe buscar un numero aleatorio entre 26
			codigoAscii = 97 + numeroRnd.nextInt(26);
			break;
		}
		
		caracter = (char) codigoAscii;
		
		return caracter;
	}
	
	public boolean esFuerte(String pass) {
		boolean evaluacionPass=false;
		char desglose=' ';
		
		int condicionNumero = 5; 		// mas de 5 numeros
		int condicionMinusculas = 1; 	// mas de 1 minusculas
		int condicionMayusuculas = 2; 	// mas de 2 mayuscualas
		
		int mayusculasEnClave=0;
		int minusculasEnClave=0;
		int numerosEnClave=0;
		
		// evaluamos cada caracter
		for (int i=0; i<pass.length();i++) {
			
			desglose = pass.charAt(i);
			
			//contamos los numeros, mayusculas y minusculas que hay en cada contraseña
			if (Character.isDigit(desglose)) {
				numerosEnClave++;
			}
			
			if (Character.isUpperCase(desglose)){
				mayusculasEnClave++;
			}
			
			if(Character.isLowerCase(desglose)) {
				minusculasEnClave++;
			}
		}
		
		// evaluamos la contraseña
		evaluacionPass = 
				(numerosEnClave>condicionNumero 			//mas de 5 numeros 
				&& minusculasEnClave>condicionMinusculas 	//mas de 1 minuscula
				&& mayusculasEnClave >condicionMayusuculas) //mas de 2 mayusculas
				? true : false; 

		// ****************************************************************************
		// DESCOMENTANDO ESTA LINEA TENEMOS LA EVALUACION INDIVIDUAL DE CADA CONTRASEÑA
		// ****************************************************************************
		// System.out.println("\npass: " + pass + "\t+5 num: " + numerosEnClave + "\t+2 may: " + mayusculasEnClave + "\t+1 min: " + minusculasEnClave + "" + "\tEvaluacion: " + evaluacionPass+"\n");
		
		return evaluacionPass;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
}
