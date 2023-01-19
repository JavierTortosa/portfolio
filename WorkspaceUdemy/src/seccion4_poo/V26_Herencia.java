package seccion4_poo;

/*
 * 	 Herencia
 * 	 --------
 * 
 * 	 La herencia es una caraqcteristica que nos permite crear claeses nuevas a partir de clases existentes
 * 	 La nueva clase adquiere (hereda) los miembros de la clase ya existente
 * 	 La clase padre se le conoce como Superclase
 * 	 La clase hija se le conoce como subclase
 * 	 La principal ventaja de la herencia es la reutilizacion de codigo
 * 	 Para heredar una clase se utiliza la palabra extends
 * 
 * 			Class Padre {
 * 				public void metodo(){}
 * 			}
 * 
 * 			Class Hija ezxtends Padre{
 * 				//automaticamente adquiere metodo()
 * 			}
  
 * 	 Consideraciones
 * 	 ---------------
 * 
 * 	 Una clase solo puede heredar otra clase, no hay herencia multiple
 * 	 Una superclase puede a su vez heredar de otra y asi n veces
 * 	 Varias clases pueden heredar de la misma clase
 * 	 Los miembros privados de la superclase no son accesibles desde la subclase
 * 	 Si queremos que una clase no se pueda heredar se usa la palabra final
 * 
  * 			final Class Padre {
 * 				public void metodo(){}
 * 			}
 * 
 * 			Class Hija ezxtends Padre{				// ERROR DE COMPILACION
 * 			}
  
 *	 Relacion "Es un"
 *	 ----------------
 *
 * 	 Entre la subclase y la superclase hay una relacion "Es un@"
 * 	 Esta relacion es la relacion logica para entender que una clase herede de otra pero java no entiende
 * si existe esa relacion, por lo tanto no da error de ningun tipo.
 * 	 Un objeto de la subclase "es un" objeto del tipo de la superclase
 * 
 * 			Subclase		es un		Superclase	 
 * 	 		
 * 			Coche			es un		Vehiculo
 * 			Circulo			es una		Figura
 * 			Linea			NO ES UN	Punto		esto no es herencia aunque no genera error
 * 
 		
 * 	 Herencia de Object
 * 	 ------------------
 * 
 * 	 Todas las clases heredan de la clase Object
 * 	 Si una clase no hereda explicitamente de otra clase con extends, si lo hace implicitamente de Objetc
 * 
 * 			class Test{	// esto equivale a -->	class Test extends Object{
 * 			}	 
 * 	 
 * 	 Todas las clases disponen de los metodos de Object, entre ellos:
 * 
 * 			toString()
 * 			equals()
 * 			hashCode()
 * 
 
 *	  
 * 
 */

public class V26_Herencia {

	public static void main(String[] args) {

		V26_Herencia v26_1 = new V26_Herencia();
		V26_Herencia v26_2 = new V26_Herencia();
		
		
		System.out.println("Herencia de Object\n------------------\n");
		
		System.out.println("hashCode = " + v26_1.hashCode());
		System.out.println("toString = " + v26_1.toString());
		System.out.println("getClass = " + v26_1.getClass());
		System.out.println("equals() = " + v26_1.equals(v26_2));
		
	}
}
