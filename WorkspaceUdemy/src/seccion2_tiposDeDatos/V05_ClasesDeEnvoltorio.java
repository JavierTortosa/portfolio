package seccion2_tiposDeDatos;

/*	--------------------
 * 	CLASES DE ENVOLTORIO
 * 	--------------------
 * 
 * 	Son clases que se encuentran en el paquete java.lang
 * 	sirven para representar como objetos los tipos primitivos
 * 	Las clases envoltorio son:
 * 
 * 				CLASE	 		PRIMITIVA
 * 				----------		---------
 * 				Boolean			boolean
 * 				Byte			byte
 * 				Short			short
 * 				Integer			int
 * 				Long			long
 * 				Float			float
 * 				Double			double
 * 				Character		char
 * 
 * 	METODOS ESTATICOS DE LAS CLASES ENVOLTORIO
 * 	------------------------------------------
 * 
 * 	Las clases envoltorio son necesarias porque hay muchas operaciones que solo se pueden hacer con objetos
 * 	Sin el envoltorio no podriamos tratar objetos de tipo primitivo 
 * 	Para crear una variable primitiva con la clase envoltorio seria:
 * 
 * 		Integer integ = new Integer(200); 	// creamos un objeto integ que tiene una referencia al valor 200
 * 		int k = integ.intValue()			// k tiene el valor 200 del objeto gracias al metodo intValue()
 * 		Integer num = Integer.valueOf("100011",2); nos convierte un texto en un objeto integer
 * 
 * 	AUTOBOXIN / UNBOXING
 * 	--------------------
 * 
 * 	Desde Java 5 podemos asignar un valor de tipo primitivo a una variable tipo objeto de clase envoltorio
 * 	
 * 		Integer integ=200;	//Autoboxing
 * 
 * 	Se puede recuperar el tipo primitivo de una variable objeto a una variable primitiva
 * 
 * 		int n = integ;		//Unboxing
 * 		Integer k = 30;		//Autoboxing
 * 		k++;				//unboxing + autoboxing		
 * 	
 *  Inmutabilidad de objetos
 *  ------------------------
 *  
 * 	Los objetos de las clases envoltoiro no se pueden modificar
 * 	Lo que ocurre esque se crea un objeto con el nuevo valor y el valor anterior se marca para recoleccion
 * 	
 *  
 * 
 *  
 * 		
 * 
 * 
 */

public class V05_ClasesDeEnvoltorio {

}
