package seccion4_poo;

/*
 * 	 TIPO DE OBJETO Y TIPO DE REFERENCIA
 * 	 -----------------------------------
 * 
 * 	 Fundamentos
 * 	 -----------
 * 	 
 * 	 En java se puede asignar una referencia a un objeto de un tipo en una variable del tipo de su superclase
 * 	o lo que es lo mismo: Alamcecnar un objeto en una variable de su superclase
 * 
 * 				tipo_objeto variable_objeto = new tipo_subclase_tipo_bjeto
 * 
 * 	 			Object ob = new String("hola");
 * 
 * 	 El tipo de la referencia Object es superclase del tipo del objeto (String)
 *	 Se aplica a varios niveles:
 *
 *	 Ejemplo:
 *				class Clase2 extends Clase1{}
 *												------->	Clase1 c= new Clase3();
 *				class Clase3 extends Clase2{}
 *
 *				En Clase1 c podemos almacenar objetos de tipo Clase1 Clase2 o Clase3
 *
 
 *	 Llamadas a metodos
 *	 ------------------
 *
 *	 Para que sirve este tipo de asignacion:
 *
 *	 	- Se pueden llamar a metodos del objeto (solo si han sido heredados o sobreescritos)
 * 
 * 	Ejemplo:
 * 
 * 	Object ob = new String("hola");		//ob es una variable tipo Object que contiene un objeto String
 *  
 * 	System.out.println(ob.toString());	//llama al metodo toString que esta sobreescrito en la clase String
 * 	if(ob.equals("hola")){}				//llama al metodo equals que esta sobreescrito en la clase String
 * 	System.out.println(ob.length());	//length es un metodo de String no de object y daria error
 * 
 
 *	 Casting entr tipos de objetos
 *	 -----------------------------
 *
 * 	 Para obtener una referencia al tipo original del objeto podemos efectuar un casting
 * 
 * 		String s = (String) ob;
 * 
 * 	 El compilador permite hacer casting de una referencia de un tipo a cualquier tipo de sus subclases
 * 	 Si el objeto no es de ese tipo se producira un error de ejecucios ClassCastException
 * 
 * 		Integer i= (Integer) ob;
 * 
 * 		(el tipo referenciado por ob es String no Integer)
 * 
 * 	 
 * 
 * 
 */

public class V30_TipoDeObjetoReferencia {

	public static void main(String[] args) {

		
		
	}

}
