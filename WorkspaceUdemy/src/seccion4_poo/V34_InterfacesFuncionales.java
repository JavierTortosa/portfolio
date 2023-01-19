package seccion4_poo;

/*	 INTERFACES FUNCIONALES
 * 	 ----------------------
 * 
 * 	 Concepto introducido en java 8 para denominar un tipo concreto de interfaz
 * 	 Son interfaces con un solo metodo abstracto
 * 	 Puede tener metodos default o static de forma normal
 * 	 Se pueden crear implementaciones de estas expresiones a traves de expresiones lambda
 * 	 Si la interfaz no es funcional NO SE PUEDE IMPLEMENTAR EN EXPRESIONES LAMBDA
 * 	 Pueden estar definidas con la anotacion @FunctionalInterface
 * 
 
 * 	 Como se define una interfaz funcional
 * 	 -------------------------------------
 * 
 * 	 Son interfaces normales, solo tienen que cumplir lo siguiente:
 * 	 	Pueden llevar o no la anotacion @FunctionalInterface
 * 	 	Solo tienen que tener un metodo abstracto 
 * 	 
 * 	 Ejemplo Funcional y no funcional:
 */

// 	esta interfaz solo tiene un metodo abstracto 
//------------------------------------------------------------------------------------------------ Funcional
interface InterAFuncional {
	default void m() {
		System.out.println("default InterA");
	}
	
	default void p() {
		System.out.println("metodo default p");
	}
	
	static void s1() {
		System.out.println("Metodo static s1");
	}
	
	static void s2() {
		System.out.println("Metodo static s2");
	}
	
	int metodo();	//metodo abstracto
	
}

// 	esta interfaz implementa el metodo heredado y añade un metodo static 
//------------------------------------------------------------------------------------------------ Funcional
interface InterBFuncional extends InterAFuncional{
	static void print() {
		System.out.println("static InterB");
	}
}

// 	esta interfaz implementa 2 metodos pero uno de ellos coincide con metodos de la clase object 
// ------------------------------------------------------------------------------------------------ Funcional 
@FunctionalInterface
interface InterCFuncional{
	void m();
	String toString();	//los metodos abstractos que coincidan con algun metodo de Object
						//no se tiene en cuenta de cara a caracteristicas de ser funcional
}

// 	esta interfaz hereda metodo() y para ser funcional no puede haber 2 metodos aunque sea sobrecarga
// -------------------------------------------------------------------------------------------- NO Funcional
interface InterDFuncional extends InterAFuncional{
	int metodo (int p);
}

// 	esta interfaz define el metodo implementado en InterAFuncional pero luego no tiene ningun metodo abstracto
//-------------------------------------------------------------------------------------------- NO Funcional
interface InterEFuncional extends InterAFuncional{
	default int metodo() {
		return 10;
	}
}

/*	 Revision de conceptos
 * 	 ---------------------
 * 
 *   Indica si la interfaz I2 es o no funcional
 *   
 *   public interface I1{				// Creamos la interfaz I1
 *   	default int m1(){return 10:}	// definimos un metodo default
 *   	static void m2(){}				// definimos un metodo static
 *   	boolean equals (Object ob);		// implementamos un metodo de Object
 *   }
 *   
 *   public interface I2 extends I1{	// creamos la interfaz I2
 *   	int print();					// implementamos el primer metodo normal
 *   }
 * 
 * 	Si es funcional porque tiene un unico metodo implementado a pesar de que realmente tiene 2:
 * equals y print
 */

public class V34_InterfacesFuncionales {

	public static void main(String[] args) {
		
		
	}
}
