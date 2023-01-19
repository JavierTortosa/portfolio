package seccion2_tiposDeDatos;

/*
 * 	Operadores 
 * 	----------
 * 
 * 	Aritmeticos
 * 	-----------
 * 	
 * 		Se emplean con tipos numericos primitivos para realizar operaciones aritmeticas en un programa
 * 
 *			+, -, *, /, %, ++, --
 *
 * 		OJO! si dividimos con variables int el resultado tambien es un int
 * 
 * 			int x=6, y=10;
 * 			int z = y/x => resultado da 1
 * 
 * 		Los operadores ++ y -- pueden ir delante o detras de la variable con efectos diferentes
 * 	
 * 			int a = 6,b,c;
 * 			b = ++a;	a=7 b=7
 * 			c = a++;	a=6 c=7
 * 	
 * 	Asignacion
 * 	----------
 * 
 * 		El operador = asigna un valor a una variable
 * 		Los operadores += -= *= /= %= realizan la operacion y la guardan en la variable
 * 
 *  		int a=3;
 *  		a+=10 // equivale a a= a+10;
 *  		byte b=3;
 *  OJO!	b+=10; // equivale a b=(byte)(b+10); 	// si no se hace el casteo da error
 *  		b=b+10;//ERROR							// no se puede sumar un byte con un int	
 * 	
 * 	Condicionales
 * 	-------------
 * 
 * 		Evaluan dos operandos y da como resultado un boolean
 * 
 * 			< > <= >= == !=
 * 
 * 		== es el unico que puede usarse con objetos
 * 		todos los demas solo se pueden usar con tipos primitivos y que sean compatibles;
 * 
 *  Logicos
 *  -------
 *  
 *  	Evaluan expresiones tipo boolean
 *  
 *  		&& || !
 *  
 *  		exp a	Y	exp b	resultado
 *  		------	---	------	---------
 *  		true 	&& 	true	true
 *  		true	&& 	false	false
 *  		false	&& 	true	false
 *  		false	&& 	false	false 
 *  
 *  		exp a	OR	exp b	resultado
 *  		------	---	------	---------
 *  		true 	|| 	true	true
 *  		true	|| 	false	true
 *  		false	||	true	true
 *  		false	|| 	false	false
 *  
 *   		! es el NOT, si la evaluacion es true devuelve false y al reves
 *   
 *   	Los operadores && y || funcionan en modo cortocircuito
 *   	Si la primera expresion no se cumple la segunda no se evalua
 *   
 *  Otros operadores
 *  ----------------
 *  
 *    	El operador new es pra crear objetos a partir de la clase
 *    
 *    		ArrayList lista = new ArrayList();
 *    
 *    	El operador instanceof comprueba si un objeto el del tipo dado
 *    
 *    		String s="Hello";
 *    		System.out.println(s instanceof String);
 *    		// devuelve true porque s es del tipo String
 *    
 *    		
 *    		
 *   
 *    
 */

public class V09_Operadores {

	public static void main(String[] args) {
		
		System.out.println("\n***********************************************	 variable++ Ó ++variable\n");
		
		int a = 5,b,c;
		
		a++;
		System.out.println("a=5 -> a++ -> a=a+1 -> "+a);
		b = ++a;
		System.out.println("b = ++a -> a=" + a + " b="+b +" -> primero suma y luego asigna");
		c = a++;
		System.out.println("c = a++ -> a=" + a + " c="+c +" -> primero asigna y luego suma");
		
		
		System.out.println("\n***********************************************	+=\n");
		
		int x=5;
		x += 5;	//esto es lo mismo que x=x+5;
		System.out.println("x += 5 -> " + x);
		x=x+5;
		System.out.println("x = x + 5 -> " +x);

		//OJO CON EL TIPO DE LA VARIABLE!!!!
		byte y=5;
		y+=5;//esto no es lo mismo que y=y+5;
		System.out.println("y += 5 => " + y);
//		y=y+5; //esto da error porque estamos sumando un byte con un int
		y=(byte)(y+5);//esta seria la forma correcta
		
		
		System.out.println("\n***********************************************	&& ||\n");
		
		int v1=3, v2=9, v3=0;
		boolean valor=(v1<v3 && v1<v2++);
		System.out.println("v1="+ v1 + " v2="+ v2 + " v3="+v3);
		System.out.println("si v1<v3=("+ (v1<v3) + ") && " + "v1<v2++ =("+(v1<v2++)+")");
		System.out.println("v1="+ v1 + " v2="+ v2 + " v3="+v3+" "
				+ "no se cumple la primera expresion y no hay incremento");
		
		System.out.println();
		
		v1=3; v2=9; v3=5;
		System.out.println("v1="+ v1 + " v2="+ v2 + " v3="+v3);
		valor=(v1<v3 && v1<v2++);
		System.out.println("si v1<v3=("+ (v1<v3) + ") && " + "v1<v2++ =("+(v1<v2++)+")");
		System.out.println("v1="+ v1 + " v2="+ v2 + " v3="+v3+" "
				+ "se cumplen las 2 expresiones se produce el incremento");
		
		
		System.out.println("\n***********************************************	instanceof\n");
		
		String s="Hello";
		System.out.println("s instanceof String = " + (s instanceof String));
		
	}
}
