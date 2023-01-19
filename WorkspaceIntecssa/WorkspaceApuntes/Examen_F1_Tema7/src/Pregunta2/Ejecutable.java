package Pregunta2;

import java.util.Scanner;

/*
 		PREGUNTA 2
 		----------
		Haz una clase llamada Password que siga las siguientes condiciones:
		• Que tenga los atributos longitud y contraseña . Por defecto, la
		longitud sera de 8.
		• Los constructores serán los siguiente:
		• Un constructor por defecto.
		• Un constructor con la longitud que nosotros le pasemos. Generara
		una contraseña aleatoria con esa longitud.
		Los métodos que implementa serán:
		• esFuerte(): devuelve un booleano si es fuerte o no, para que sea
		fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas
		de 5 números.
		• generarPassword(): genera la contraseña del objeto con la longitud
		que tenga.
		• Método get para contraseña y longitud.
		• Método set para longitud.
		
		Ahora, crea una clase clase ejecutable:
		• Crea un array de Passwords con el tamaño que tu le indiques por
		teclado.
		• Crea un bucle que cree un objeto para cada posición del array.
		• Indica también por teclado la longitud de los Passwords (antes de
		bucle).
		• Crea otro array de booleanos donde se almacene si el password del
		array de Password es o no fuerte (usa el bucle anterior).
		• Al final, muestra la contraseña y si es o no fuerte (usa el bucle
		anterior). Usa este simple formato:
		contraseña1 valor_booleano1
		contraseña2 valor_bololeano2
*/

public class Ejecutable {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int cantidadDePass = 0;
		int longitud =0;
		Password [] listaPass;
		boolean [] fuertesSiNo;
		
		System.out.println("Introduce numero de pass a construir: ");
		cantidadDePass = teclado.nextInt();
		
		System.out.println("Introduce el tamaño de los passwords a generar");
		longitud = teclado.nextInt();
		
		listaPass 	= new Password[cantidadDePass];
		fuertesSiNo = new boolean[cantidadDePass];
		
		System.out.println();
		for (int i = 0; i<cantidadDePass; i++) {
			
			listaPass [i] = new Password(longitud);
			fuertesSiNo[i] = listaPass[i].esFuerte(listaPass[i].getContraseña());
			System.out.println((listaPass[i].getContraseña()) + " "  + fuertesSiNo[i]);
		}
	}
}
