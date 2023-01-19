package seccion2_tiposDeDatos;

/*
 * 	Inferencia de tipos
 * 	-------------------
 *
 * 	Consiste en declarar las variables locales sin indicar explicitamente el tipo
 * 	Se emplea la palabra var
 * 
 *  	var num = 0;							//entero
 * 		var datos = new ArrayList<Integer>();	//ArrayList de enteros
 * 
 * 	El tipo de la variable lo establece el compilador en funcion del valor asignado a la variable
 * 	Simplemente simplifica la escritura del codigo.
 * 
 * 	Unicamente puede usarse con variables locales
 * 
 * 		public class MyClase{
 * 			var numero = 100; // ERROR
 * 
 * 	Es obligatorio asignar un valor que no sea null
 * 
 * 		var n = null; // ERROR
 * 
 * 	No se puede usar con asignacion multiple de variables
 * 
 * 		var a,c=100; //ERROR
 * 		var b=5,x=30;//ERROR
 * 
 * 	Se puede usar en bucles tipo for
 * 		
 * 		for (var i=0;i<10;i++){}	//	CORRECTO!
 * 		for (var s:datos){}			//	CORRECTO!
 * 
 * 	no se puede usar con el metodo abreviado de declarscion de arrays
 * 
 * 		var s={5,9,10};				//	ERROR
 * 		var d=new int[]{5,1,10};	//	CORRECTO!
 * 
 * 
 */



public class V07_InferenciaDeTipos {

	public static void main(String[] args) {
		
		int i 	 = 5;
		var f 	 = 5.5f;
		double d = 3.8;
		var c	 ='a';
		
		
		if (i==f)c++;
		System.out.println(c);
		System.out.println((int)(f+d));//9
		System.out.println((int)f + (int)d);//8
		
		if( ((int)(f+d)) == ( (int)f + (int)d) ) c+=2;
		
		System.out.println(c);
		

		
	}

}
