package serviciosAleatorios;

public class Algoritmos {
	
	public char letraDNI (int numero) {

		int dni1=0;
		
		try	{
			dni1=Integer.valueOf(numero);
		} catch (Exception e) {
			System.out.println("El numero de dni debe ser solo el numero, sin letras ni puntos");
			dni1=0;
		}
		
		if (dni1!=0) {
//			return getLetraDNI(dni);
			char letraDNI = ' ';
			DNI dni = new DNI(numero);
			letraDNI = dni.obtenerLetra();
			return letraDNI;
		} else {
			return '-';
		}
		
		
		
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