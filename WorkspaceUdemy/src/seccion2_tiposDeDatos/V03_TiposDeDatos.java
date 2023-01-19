package seccion2_tiposDeDatos;


/*
 * --------------
 * TIPOS DE DATOS
 * --------------
 
 * -------------
 * Clasificacion
 * -------------
  
 * -----------
 * Tipo objeto
 * -----------
 * 
 * 	Cualquier objeto de java. 
 *  Es la base de la programacion en java y se vera en proximos capitulos
 *  
 *   ej.
 * 		new Object(); 	// Object es la clase principal de la que derivan todos los objetos.
 * 		String 			// String es una clase y por lo tanto tiene sus propios metodos. no es un primitivo
  
 * ---------------- 
 * Tipos primitivos
 * ---------------- 
 * 
 * 	hay 8 tipos: 
 * 
 * 	TIPO		VALORES						EJEMPLO
 * 	----		-------						-------
 *	boolean		true o false				false
 *  byte		Entero 8 bits				39
 *  short		Entero 16 bits				780
 *  int			Entero 32 bits				59400
 *  long		Entero 64 bits				2000000
 *  float		Decimal 32 bits				45.6f
 *  double		Decimal 64 bits				80.4
 *  char		codigo unicode de 16bits	'c'
   
 *  ---------  
 *  Literales
 *  ---------
 * 
 *  Son numeros fijos.
 *  los literales se pueden representar en:
 *  
 *  Binario		0b100011	// empiezan por 0b 	digitos 0 y 1
 *  Decimal		289			// numero normal 	digitos de 0 a 9
 *  Octal		0453		// empiezan por 0	digitos de 0 a 7
 *  Exadecimal	0xAF7		// empiezan por 0x	digitos de 0 a 8 + letras A B C D E F
  
 *  -----------------------------------
 *  simbolo de _ en literales numericos
 *  -----------------------------------
 *  
 *  se puede usar el simbolo _ para facilitar la lectura de los numeros
 *  solo se puede poner entre numeros, nunca al principio / final
 *  no se puede poner al lado del punto decimal ni al lado de los sufijos L, F o D
 *  
 *  int n = 2_345;
 *  double d = 45.6_9;
 *  
 
 *  --------------------------------
 *  Consideraciones de los literales
 *  --------------------------------
 *  
 *  si un literal es un numero entero, se considera como int 
 *  si queremos que sea long tenemos que añadir al final el sufijo "l"
 *  
 *  		345 	-> es un int
 *  		345l 	-> es un long
 *  
 *  un literal decimal se considera double
 *  si queremos que se considere float tenemos que añadir al final el sufijo "f"
 * 
 * 			4.7 	-> es un double
 * 			4.7f	-> es un float
 * 
 * 	float f = 4.7;	-> da error porque asignamos un valor double a una variable float 
 * 	float f = 4.7f;	-> hay que añadir el sufijo "f" para que sea float
 * 

 * ---------------------
 * Conversiones de Tipos
 * ---------------------
 * 
 * Todos los tipos primitivos son convertibles entre si menos los boolean
 * Pueden ser conversiones implicitas o explicitas
 * 
 * 	Implicita (la hace la JVM)
 * 		int x=45;
 * 		double n=x;	//el valor de x que empezo siendo int ahora es double
 * 
 * 	Explicita
 * 		double r=45f; //se puede asignar un float a un double y se hace la conversion implicita
 * 		int x = (int) r; 
 * 
 * ---------------------------------
 * Reglas de conversiones implícitas
 * ---------------------------------
 * 
 *  El tipo destino tiene que ser de igual o mayor tamaño que el de origen
 *  
 *  Excepciones:
 *  	- el origen es numerico de cualquier tipo y el destino es char
 *  				(byte-short-int-long -> char = error)
 * 
 *  		-- numero a char -- ERROR
 *  
 *  			byte b=5;
 *  			char n=b; // ERROR PRIMERA EXCEPCION
 *  
 *  	- El destino es entero y el origen es decimal
 * 					(float - double -> int = error)
 * 
 * 			-- decimal a entero -- ERROR
 * 
 * 				float r=3.4f;
 * 				long l=r;// ERROR SEGUNDA EXCEPCION
 * 	
 * ej. conversiones implicitas
 * 	
 * 		int x=45;	//x es un entero que vale 45
 * 		double d=x; //d es un double que vale 45
 * 
  
 * ---------------------------------
 * Reglas de conversiones explícitas
 * ---------------------------------
 * 
 * Cuando no se puedan hacer conversiones implicitas se debera hacer conversiones explicitas.
 * 
 * 				char n = (char)b; //esto arregla el error de la primera excepcion
 * 				long l = (long)r; //esto arregla el error de la segunda excepcion
 * 
 * Si el origen es decimal y el destino es entero, la parte decimal se elimina.
 * 
 * ej. conversiones explicitas
 * 
 * 		double r = 4.5f;
 * 		int x =(int)r; //casting
 * 
 
 * --------------
 * El Tipo objeto
 * --------------
 *
 * Cualquier objeto de java
 * Se manejan a traves de variables de su tipo (clase)
 * La variable obtiene una referencia al objeto
 * Mediante la variable se accede a los metodos del objeto
 * 
 * 		String s = new String("Hola"); //creamos el objeto s de tipo String
 * 		s.length();	//accedemos al metodo length() del objeto s.
 * 
 * No se puede hacer conversiones ni implicitas ni explicitas entre tipos primitivos y objetos
 * 
 * 		String s = new String("27");
 * 		int n = (int)s; // ERROR de compilador
 */

public class V03_TiposDeDatos {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("REPRESENTACION DEL NUMERO 2807");
		System.out.println("----------------------------------------------------\n");
		
		// representacion del numero 2807
		int bin	= 0b101011110111;	//empiezan por 0b 	
		int dec	= 2807;				//numero normal		
		int oct = 05367;			//empiezan por 0	
		int hex = 0xAF7;			//empiezan por 0x	
		
		System.out.println("int bin	= 0b101011110111 = "+bin);
		System.out.println("int dec	= 2807		 = "+dec);
		System.out.println("int oct = 05367		 = "+oct);
		System.out.println("int hex = 0xAF7		 = "+hex);
		System.out.println("");
		
		// EJEMPLO DE USO DEL _ EN NUMEROS 
		System.out.println("----------------------------------------------------");
		System.out.println("EJEMPLO DE USO DEL _ EN NUMEROS");
		System.out.println("----------------------------------------------------\n");
		
		int n = 2_345;
		double d = 45.6_9;
		int z = 3_47;
		
		System.out.println("int n = 2_345 \t\t = "+n);
		System.out.println("double d = 45.6_9\t = "+d);
		System.out.println("int z = 3_47\t\t = "+z);
		
		System.out.println("");
		System.out.println("Sumamos 1 a n, d y z\n");
		n++;
		d++;
		z++;
		System.out.println("int n = 2_345 \t\t = "+n);
		System.out.println("double d = 45.6_9\t = "+d);
		System.out.println("int z = 3_47\t\t = "+z);
		System.out.println("");
		
		
		System.out.println("Para asignar un float hay que poner el sufijo f "
				+ "si no lo toma como double y da error\n");
		
		float f = 4.7f; 
		System.out.println("float f = 4.7f --> f = "+ f);
		System.out.println("");

		// EJEMPLOS DE CONVERSIONES CORRECTAS
		
		System.out.println("----------------------------------------------------");
		System.out.println("EJEMPLO DE CONVERSIONES");
		System.out.println("----------------------------------------------------\n");
		
		char c='A';
		int p=c;
		System.out.println("char c='A'-> "+c + "\t//\t"+"int p=c-> "+ p + "(corresponde al codigo ASCII)"); 

		int num = 3450;
		byte r=(byte)num;
		System.out.println("int num="+num + "\t//\t"+"byte r="+r);
		
		c=(char)35.5;
		System.out.println("c1= "+c);
		
		// EJEMPLOS DE CONVERSIONES INCORRECTAS
		char c1='@';
//		byte p1=c1;//ERROR

		boolean b1=false;
//		int n=(int)b1;//ERROR
		
		//pr

		
	}
}
