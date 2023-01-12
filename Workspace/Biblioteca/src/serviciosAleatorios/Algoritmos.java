package serviciosAleatorios;

public class Algoritmos {
	
	public char letraDNI (int numero) {

		char letraDNI = ' ';
		DNI dni = new DNI(numero);
		letraDNI = dni.obtenerLetra();
		return letraDNI;
	}
}

class DNI {
    private int numeroDNI;
    private final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q',
    		'V','H','L','C','K','E'};
   
    public DNI(){
        numeroDNI = 0;
    }
    public DNI(int num){
        this.numeroDNI = num;
    }
    public void setNumeroDNI(int nuevoNum){
        this.numeroDNI = nuevoNum;
    }
    public int getNumeroDNI(){
        return numeroDNI;
    }
    public char obtenerLetra(){
        int resto;
        resto = numeroDNI % 23;
        return letras[resto];
    }
}