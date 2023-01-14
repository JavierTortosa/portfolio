package serviciosAleatorios;

import java.util.Random;

public class Passwords implements Entorno{

	private String passGenerado;
	private int longitudPass;
	
	/**
	 * @param longitud: longitud de la variable
	 */
	public Passwords(int longitudMax, int longitudMin) {
		this.passGenerado = generaPass(longitudMax, longitudMin);
		this.longitudPass = passGenerado.length();
	}

	/**
	 * constructor Standard
	 */
	public Passwords() {
		
	}
	
	/**
	 * Generador de passwords del tamaño requerido
	 * @return passGenerado
	 */
	public String generaPass(int longitudMin, int longitudMax) {
		
		
		
		String passGen="";
		Random numeroRnd = new Random();
		
		int longitud = 0; 
		
		if (longitudMin <= longitudMax) {
			
		
			if(longitudMin!=0) {
			
				do { // este bucle repara el bug de generacion de la longitud fuera de limites
	
	//				longitud = (int) (Math.random()*longitudMax)+longitudMin;
	
					longitud = numeroRnd.nextInt((longitudMax)+longitudMin);
				}while (!(longitud>=longitudMin && longitud<=longitudMax));
				
			} else {
				longitud = longitudMax;
			}
			
			//System.out.println("longitudMax: "+longitudMax+" longitudMin: "+ longitudMin + " longitud: "+ longitud);
			
			for (int i=0; i<longitud; i++) {
				passGen += generaCaracter(); // a1Dscferft435
			}
		} else {
			passGen = "Error de parametros";
		}
		return passGen;
	}
	
	/**
	 * Genera un caracter aleatorio entre numeros, mayusculas y minusculas
	 * 
	 * @return caracter
	 */
	public char generaCaracter() {
		
		char caracter=' ';
		Random numeroRnd = new Random();
		int rndNumMayMin = numeroRnd.nextInt(3);// 0 numero 1 may 2 min
		int codigoAscii=0;
		
		switch (rndNumMayMin) {
		case NUMEROS:
			// numeros - entre 48 y 57 - 10
			codigoAscii = 48 + numeroRnd.nextInt(10);
			//System.out.println("generado numero:" + codigoAscii);
			break;
			
		case MAYUSCULAS:
			// mayusculas - entre 65 y 90 - 26
			codigoAscii = 65 + numeroRnd.nextInt(26);
			//System.out.println("generada mayuscula:" + codigoAscii);
			break;
			
		case MINUSCULAS:
			// minusculas - entre 97 y 122 - 26
			codigoAscii = 97 + numeroRnd.nextInt(26);
			//System.out.println("generada minuscula:" + codigoAscii);
			break;
		}
		
		caracter = (char) codigoAscii;
		
		return caracter;
	}
	
	/**
	 * controla si la pass generada es segura o debil
	 * @return evaluacionPass
	 */
	public boolean evaluaPass(String pass, int numeros, int minusculas, int mayusculas, boolean muestraEvaluacion) {
		
		// segura si contraseña > +5 numeros && +1 minusculas && +2 mayusculas
		boolean evaluacionPass=false;
		char desglose=' ';
		int asciiDesglose=0;
		int condicionNumero = numeros;
		int condicionMinusculas = minusculas;
		int condicionMayusuculas = mayusculas;
		int may=0;
		int min=0;
		int num=0;
		
		for (int i=0; i<pass.length();i++) {
			desglose = pass.charAt(i);
			desglose = pass.charAt(i);
			//System.out.println("desglose: "+ desglose);
			asciiDesglose = (int)desglose;
			//System.out.println("asciiDesglose: "+asciiDesglose);
			
			if (asciiDesglose>= 48 && asciiDesglose <=57) {
				num++;
				//System.out.println("num: "+num);
				
			}
			if (asciiDesglose>= 65 && asciiDesglose <=90) {
				may++;
				//System.out.println("may: "+may);
				
			}
			if (asciiDesglose>= 97 && asciiDesglose <=122) {
				min++;
				//System.out.println("min: "+min);
			}
		}
		
		
		/*
		if (num>condicionNumero && min >condicionMinusculas && may >condicionMayusuculas) {
			evaluacionPass = true;
		} else {
			evaluacionPass = false;
		}
		*/
		evaluacionPass =(num>condicionNumero && min>condicionMinusculas &&
				may >condicionMayusuculas) ? true : false;
		
		if (muestraEvaluacion) {
			System.out.println("pass: "+pass + "->\t+"+numeros+" num: "+num+"\t+"+mayusculas+" may: "
					+ may+"\t+"+minusculas +" min: "+min	+"\tEvaluacion: "+evaluacionPass);
		}
		return evaluacionPass;
	}
	
	// ****************************************************************************************
	// GETTERS Y SETTERS
	
	public String getPassGenerado() {
		return passGenerado;
	}

	public void setPassGenerado(String passGenerado) {
		this.passGenerado = passGenerado;
	}

	public int getLongitudPass() {
		return longitudPass;
	}

	public void setLongitudPass(int longitudPass) {
		this.longitudPass = longitudPass;
	}


	@Override
	public String toString() {
		return "Passwords [passGenerado=" + passGenerado + ", longitudPass=" + longitudPass + "]";
	}
	
	
	
}
