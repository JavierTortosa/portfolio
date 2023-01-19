package seccion4_poo;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 	 Sobreescritura de metodos
 * 	 -------------------------
 * 
 * 	 Cuando una clase hereda un metodo de otra clase se puede sobreescribir
 * 	 Sobreescribir un metodo es volver a definir un metodo ya definido
 * 	 
 * 	 				class PadreV28 {
 *						public void testV28() {
 *							System.out.println("Test del Padre");
 *						}
 *					}
 *
 *					class HijoV28 extends PadreV28{
 *						public void testV28() {	//					metodo sobreescrito
 *							System.out.println("Test del Hijo");
 *						}
 *					}
 
 * 	 Anotacion @Override
 * 	 -------------------
 * 
 * 	 Indica al compilador que se esta intentando sobreescribir un metodo
 * 	 Su uso no es obligatorio pero si recomendable
 * 	 Hace que el compilador nos avise si cometemos un error
 * 
 * 	 				class PadreV28 {
 *						public void testV28() {
 *							System.out.println("Test del Padre");
 *						}
 *					}
 *
 *					class HijoV28 extends PadreV28{
 *
 *						@Override
 *
 *						// metodo sobreescrito con error... testV28 no es lo mismo que TestV28
 *						// sin el @Override no daria error. Simplemente serian 2 metodos distintos
 * 
 *						public void TestV28() {	
 *							System.out.println("Test del Hijo");
 *						}
 *					}	
 
 * 	 Reglas Sobreescritura
 * 	 ---------------------
 * 
 * 	 A la hora de sobreescribir un metodo se deben seguir las siguientes reglas:
 * 
 * 		- Nombre y lista de parametros debe ser identico
 * 		- El ambito debe ser igual o menos restrictivo (private a public -Bien- al reves -Mal-)
 * 		- El tipo de devolucion debe ser igual o un subtipo del original
 * 		- El nuevo metodo no debe propagar excepciones que no esten definidas en el original
 * 			(esta restriccion no afecta a las excepciones Runtime) 
 
 * 	 Sobreescritura Vs Sobrecarga
 * 	 ----------------------------
 * 
 * 	 La Sobreescritua redefine un metodo ya definido y la sobrecarga crea un nuevo metodo 
 * 
 * 			Sobreescritura	-> 	mismo nombre
 * 							->	mismos parametros
 * 							->	misma devolucion
 * 
 * 			Sobrecarga		->	mismo nombre
 * 							->	DISTINTOS metodos
 * 							-> 	INDIFERENTE devolucion 
 * 
 
 * 	 Ejemplos sobreescritura Correcta
 */

class Clase1_V28 {
//	********************************************************************************* 1
	
	// este metodo devuelve un object
	public Object test() {
		return Object.class;
	}
	
//	********************************************************************************* 2
	// este metodo esta en ambito package o default
	void test2() {}
	
//	********************************************************************************* 3
	// este metodo lanza una excepcion
	void test3() throws IOException{}
	
//	********************************************************************************* 4
	// este metodo no hace nada
	void test4() {}
}

class Clase2_V28 extends Clase1_V28{
	
//	********************************************************************************* 1
	@Override
	// este metodo devuelve un String (String es una clase hija de Object)
	public String test() {
		return toString();
	}
	
//	********************************************************************************* 2
	// este metodo esta en ambito public (es menos restrictivo que default)
	@Override
	public void test2() {}
	
//	********************************************************************************* 3
	// este metodo lanza una excepcion que es un subtipo de IOException
	@Override
	public void test3() throws FileNotFoundException{}
	
//	********************************************************************************* 4	
	// esta metodo lanza una excepcion que al ser de ejecucion y no compilacion no habria problema 
	@Override
	public void test4() throws RuntimeException{} 
}

/* 
 * 
 * 
 */

class PadreV28 {
	public void testV28() {
		System.out.println("Test del Padre");
	}
}

class HijoV28 extends PadreV28{
	
	@Override
	public void testV28() {	//					metodo sobreescrito
		System.out.println("Test del Hijo");
	}
	
	public void testV28(String a) {//				metodo sobrecargado
		System.out.println(a);
	}
}

public class V28_SobreescrituraDeMetodos {

	public static void main(String[] args) {

		HijoV28 hV28 = new HijoV28();
		hV28.testV28();//						imprime test del hijo
		hV28.testV28("esto es un metodo sobrecargado");
	}

}
