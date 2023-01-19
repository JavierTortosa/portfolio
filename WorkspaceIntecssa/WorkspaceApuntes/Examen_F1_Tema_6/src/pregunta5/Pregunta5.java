package pregunta5;

public class Pregunta5 {

	public static void main(String[] args) {

		/*
		PREGUNTA 5:
		
		Realiza un programa que crea un array de 20 elementos llamado
		Pares y guarde los 20 primeros números pares. Mostrar por pantalla
		el contenido del array creado.
		*/
		
		int [] pares = new int[20];
		
		for (int i=0; i<pares.length; i++)
			pares[i]=i*2;
		
		for (int i=0; i<pares.length; i++) {
			System.out.println ("Elemento : " + i+ " Valor: "+pares[i]+" ");
		}
	}
}
