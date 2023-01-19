package Pregunta3;

/*	PREGUNTA 3
 * 	----------
  
El método correr de la clase Persona es un método abstracto y no tiene implementación. 
Por el contrario, los métodos de las clases hijas tienen sobrecargado el método correr. 
El deportista correrá a 7 hm/hora y el informatico a 2km/h. 
Vamos a ver el código 

• Crear las clases hijas : Deportista e Ingeniero
• Sobreescribir el método correr en cada clase.
*/


public class Principal {

	public static void main(String[] args) {
		
		Deportista deportista = new Deportista ("Andres");
		Ingeniero ingeniero = new Ingeniero("Francisco"); // supongo que el ingeniero es el informatico
		Persona persona;
		
		persona = deportista;
		System.out.println("En un dia recorrera "+ persona.correr()*24 + "kms");
		System.out.println();
		
		
		persona = ingeniero;
		System.out.println("En un dia recorrera "+ persona.correr()*24 + "kms");
		
		
	}
}
