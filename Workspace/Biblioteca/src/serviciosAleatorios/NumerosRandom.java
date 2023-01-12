package serviciosAleatorios;

import java.util.Random;

public class NumerosRandom implements VariablesDeEntorno{
	
	String numeroString="";
	int numeroInt = 0;
	
	public NumerosRandom() {
	}
	
	public NumerosRandom(String formato) {
		this.numeroString = caracterRandom(formato);
	}

	public int numeroRandom() {
		Random rnd = new Random();
		return rnd.nextInt();
	}

	public int numeroRandom(int desde, int hasta) {
		Random rnd = new Random();
		int numero = rnd.nextInt(desde, hasta);
		return numero;
	}
	
	public String caracterRandom(String formato) {
		Random rnd = new Random();
		char[] formatoDesglosado = formato.toCharArray();
		int codigoAscii =0;
		String textoResultante ="";
		
		for (int i =0; i<formatoDesglosado.length; i++) {
			
			if (Character.isDigit(formatoDesglosado[i])) {
				// numeros - entre 48 y 57 - 10
				codigoAscii = 48 + rnd.nextInt(10);
			}
			if (Character.isLowerCase(formatoDesglosado[i])) {
				// minusculas - entre 97 y 122 - 26
				codigoAscii = 97 + rnd.nextInt(26);
			}
			if (Character.isUpperCase(formatoDesglosado[i])) {
				// mayusculas - entre 65 y 90 - 26
				codigoAscii = 65 + rnd.nextInt(26);
			}
			if ((!(Character.isDigit(formatoDesglosado[i]))) &&	
				(!(Character.isLowerCase(formatoDesglosado[i]))) &&
				(!(Character.isUpperCase(formatoDesglosado[i])))
				){
				codigoAscii = (char) formatoDesglosado[i];
			}
			textoResultante += (char) codigoAscii;
		}
		return textoResultante;
	}
	
	public String getNumeroString() {
		return numeroString;
	}

	public void setNumeroString(String numeroString) {
		this.numeroString = numeroString;
	}

	public int getNumeroInt() {
		return numeroInt;
	}

	public void setNumeroInt(int numeroInt) {
		this.numeroInt = numeroInt;
	}
}
