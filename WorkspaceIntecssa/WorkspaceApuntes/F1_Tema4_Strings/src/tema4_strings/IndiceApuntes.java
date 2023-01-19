package tema4_strings;

/*
 * LA CLASE STRING
 * ********************************************************************************
 * 
 * Es la clase que utiliza java para crear objetos que hacen referencia a cadenas de caracteres
 * 
 * 
 * Metodos de la clase String
 * --------------------------
 * 
 * Para utilizar un metodo se pone 			
 * 
 * 		varible_tipo_strin.metodo();	
 *
 *							********************************************* 
  
 * char char At(int index) 					Devuelve el caracter que esta en esa posicion
  
 * int compareTo(String anotherString) 		compara la variable a con la variable b de dentro del parentesis
 * 											a=b devuelve 0	a>b devuelve 1	a<b devuelve -1
 * 
 * int compareToIgnoreCase(String str)		compara la variable a con la variable b de dentro del parentesis
 * 											ignorando mayusculas
 * 											a=b devuelve 0	a>b devuelve 1	a<b devuelve -1
  
 * boolean contains (charSequence s)		devuelve true si contiene la subcadena

 * boolean endsWith(String suffix)			Devuelve true si la cadena acaba de esa forma. Hay otro equivalente 
 * 											si la cadena empieza de esa forma (startsWith)

 * boolean equals (String str) 				Devuelve verdadero si las dos cadenas son iguales
 * 
 * boolean equalsIgnoreCase(String str)		Devuelve verdadero si las dos cadenas son iguales ignorando mayúsculas 
 * 											y minúsculas.
  
 * int indexOf(String str)					Devuelve un entero con la posición en la que aparece el carácter o la 
 * 											subcadena por primera vez (-1 si no existe).
 * 
 * int indexOf(String str, int ind)			Devuelve un entero con la posición en la que aparece el carácter o la 
 * 											subcadena por primera vez (-1 si no existe) pero empieza a contar desde
 * 											la posicion dada en ind
 * 
 * 					int lastIndexOf()		Hay 2 versiones equivalentes que empiezan de atras hacia delante
  											
 * int length()								Devuelve la longitud de la cadena
  
 * String replace (String , String)			Reemplaza todas las ocurrencias de una subcadena por otra. 
 * 
 * 							replaceAll 		igual pero además de recibir una cadena puede recibir una expresión regular
 * 
 * 							replaceFirst 	también puede recibir expresiones regulares
 * 											solo cambia la primera ocurrencia de la subcadena.

 * String[ ] split (String regex)			separa el string en un array usando lo que se ponga entre parentesis
 * 											como caracter de separacion split(" ") separa por espacios

 * String substring(int beginIndex, 				Devuelve la subcadena que empieza en el índice pasado por 
 * int endIndex)String substring(int beginIndex)	parámetro (incluido), si solo se le da un parámetro devuelve 
 * 													desde el índice hasta el final de la cadena original, 
 * 													si tiene dos devuelve entre los dos índices, con el primero 
 * 													incluido y el segundo excluido
  
 * String toLowerCase()						convierte en minusculas el string
 * 
 * String toUpperCase()						convierte en mayuscualas el string

 * static String valueOf(tipo básico o char [])		Convierte el tipo básico que se le pase a String

 * String trim ()							Elimina espacios antes y después
 
 *							********************************************* 
 * 
 * String format()
 * ---------------
 * 
 * El método string format () en Java devuelve un valor de cadena formateado según la configuración regional,
 * el formato y los argumentos pasados. 
 * Si no especificamos la configuración regional, toma la configuración regional predeterminada de 
 * 		Locale.getDefault ()
 * Los argumentos adicionales se ignorarán si se pasan más argumentos.
 * 
 * Tipos de formato de cadena de Java
 * ----------------------------------
 * 
  
  TIPO DE FORMATO	TIPO DE DATOS	SALIDA
  
		%a			Punto flotante	Valor hexadecimal del número de coma flotante
		%b			Cualquier tipo	"Verdadero" si no es nulo y "Falso" si no es nulo
		%c			Caracter		CaracterUnicode
		%d			Entero			Entero decimal
		%e			Punto flotante	Número decimal en notación científica
		%f			Punto flotante	Número decimal
		%g			Punto flotante	Número decimal en notación científica basado en precisión y valor
		%h			Cualquier tipo	Valor de cadena hexadecimal del método hashCode ()
		%n			Ninguna			Separador de línea especifico de la plataforma
		%o			Entero			Número octal
		
 * Formato de cadena Fecha Hora Tipos
 * ----------------------------------
 * 
 * usamos %t como prefijo para las conversiones de fecha y hora en el método de formato Java String. 
 * Cuando usamos un carácter en mayúsculas junto con %t, obtenemos la salida en mayúsculas. 
 * Cuando usamos caracteres en minúscula junto con %t, obtenemos la salida en minúsculas.
 * 
 	TIPO DE FORMATO		SALIDA
		%tC				Año formateado con 2 dígitos, por ejemplo: 00 a 99
		%tc				Fecha y hora en formato "% ta% tb% td% tT% tZ% tY", 
							por ejemplo: sábado 23 demayo 21:25:46 IST 2020
		%tD				Fecha en el formato "MM / DD / AA”, por ejemplo: 05/23/20 "
		%td				Día del mes en 2 dígitos, Ej..: 01 a 31
		%te				Día del mes sin 0 a la izquierda, Ej..: 1 a 31
		%tF				Fecha formateada en "AAAA-MM-DD
  
 * Comparación de Cadenas
 * ----------------------
 * 
 * Comparacion con ==
 * ------------------
 * 
 * El == no compara las cadenas sino los objetos que contienen las cadenas
 *
 *	Ejemplo 1:
 
				String cadena1 = new String("Hola");
				String cadena2 = new String("Hola");
				if (cadena1 == cadena2)
 *
 *		Esto dara false porque cadena1 y cadena2 son objetos no variables (son 2 new distintos)
 
 * 	Ejemplo 2:
 
				String cadena1 = "Hola";
				String cadena2 = "Hola";
				if (cadena1 == cadena2)
 *
 *		Esto dara true porque el compilador detecta que cadena1 y cadena2 contienen el mismo texto
 *		solo hace 1 new internamente
 *
 * Comparacion con equals()
 * ------------------------
 * 
 * Para comparar realmente las cadenas y no si son o no la misma instancia, se usa el método equals(). 
 * 
 * Ejemplo 1:
 
				String cadena1 = new String("Hola");
				String cadena2 = new String("Hola");
				if (cadena1.equals(cadena2))
 *
 *		dara true porque compara las cadenas de texto
 *
 * Ejemplo 2:
 * 
				String cadena2 = new String("Hola");
				if ("Hola".equals(cadena2))
 *
 *		dara true porque compara las cadenas de texto
 *		Podemos usar directamente una cadena para hacer la comparacion para evitar llamar a null como sigue:
 *
 				String cadena2 = new String("Hola");
				if (cadena2!=null)
				if (cadena2.equals("Hola"))

 *		el null tenemos que intentar evitarlo a toda costa
 *
 *Comparar sin importar mayúsculas (ignore case)
 *----------------------------------------------
 *
 * Para comparar dos cadenas sin importar si los caracteres están en mayúscula o minúscula, 
 * se utiliza el método equalsIgnoreCase() de la clase String.
 *
 * Ejemplo:
 
				String a = "hola";
				String b = "HOLA";
				// son iguales
				if (a.equalsIgnoreCase(b)) {
				 System.out.println("a y b son iguales");
				}
				
 *		da true porque a y b contienen la misma cadena de caracteres si ignoramos las mayusculas
 *
 * Ordenar cadenas con compareTo()
 * -------------------------------
 * 
 * Si lo que queremos es comparar cadenas para ordenarlas, se usa el método compareTo() de la clase String.
 * Devuelve:
 * 		0 si ambas cadenas tienen el mismo contenido, 
 * 		-1 si el String es menor 
 * 		+1 si es mayor.
 *
 *	Ejemplo:
 
				if (cadena1.compareTo(cadena2) == 0)
				 	System.out.println("cadena1 y cadena2 son iguales");

				if (cadena1.compareTo(cadena2) < 0)
			 		System.out.println ("cadena1 va antes que cadena2");
				
				if (cadena1.compareTo(cadena2) > 0)
			 		System.out.println("cadena2 va después que cadena1");
 *
 *	Concatenacion
 *------------------
 *
 *	Concatenar es unir 2 o mas strings en uno solo
 *	Se puede concatenar con el simbolo + o con el metodo concat() de la clase String
 *
 *	Ejemplo:
 
				String a = "String A-";
				String b = "String B-";
				String c = "String C";
				
				System.out.println(a + b + c);
				
				System.out.println(a.concat(b));
 *
 *		La primera devuelve "String A-String B-String C
 *		La segunda devuelve "Strina A-String B
 *
 *	Diferencias entre + y concat()
 *
 *	Concat solo funciona con strings 
 *	Concat da una excepcion si la cadena es nula
 *	Concat solo puede unir 2 cadenas
 *	Concat es mas eficiente a la hora de concatenar
 *
 *	StringBuilder()
 *	-------------------
 *
 *	Una vez creado un objeto String este no puede variar
 *	StringBuilder() 
 *		permite manipular cadenas de forma dinamica
 *		Un objeto StringBuilder() almacena diferentes caracteres especificados por su capacidad
 *		Si se excede la capacidad el objeto se expande para dar cabida a los caracteres adicionales
 *		Tambien se usa para implementar + y += para la concatenacion de objetos String
 *
 *	Si los datos no tienen que cambiar usaremos String
 *	Si se tiene que modificar a menudo las cadenas es mas eficiente usar StringBuilder()
 *	Los objetos StringBuilder no son seguros para los subprocesos. 
 *	Si diferentes subprocesos requieren acceso a la misma información de una cadena dinámica, hay que utilizar 
 *	la clase StringBuffer. 
 *	Ambas clases son idénticas pero esta última es segura para los subprocesos 
 *
 *	Constructores StringBuilder()
 *	-------------------------------
 *
		StringBuilder() 				Construye un StringBuilder vacío con una capacidad por defecto de 16 carácteres.
		StringBuilder(int capacidad) 	Se le pasa la capacidad (número de caracteres) como argumento 	
		StringBuilder(String str)		Construye un StringBuilder en base al String que se le pasa como argumento.
		
 *	Métodos de StringBuilder
 *	---------------------------
 *
 *
 		append(x)				Añade X al final de la cadena. X puede ser de cualquier tipo
 		delete(inicio, fin)		Elimina los caracteres desde la posición inicio hasta fin-1.
 		capacity()				Devuelve la capacidad del objeto StringBuilder
 		charAt(pos)				Devuelve el carácter que se encuentra en la pos indicada.
 		getChars()				Igual que la clase String
 		indexOf(caracter)		Devuelve la posición de la primera aparición de carácter. -1 si no lo encuentra.
 		insert(x)				Inserta X en la posición indicada. X puede ser de cualquier tipo.
 		lastIndexOf(caracter)	Devuelve la posición de la última aparición de carácter. -1 si no lo encuentra.
 		length()				Devuelve el tamaño de la cadena
 		reverse()				Invierte el contenido de la cadena
 		setLength()				Permite ampliar o reducir la capacidad del objeto StringBuilder
 		setCharAt(pos, c)		Recibe un int  y un char y coloca el char el la pos int del String
 		substring(n1,n2)		Devuelve la subcadena (String) comprendida entre las posiciones n1 y n2-1
 								Si no se especifica n2, devuelve desde n1 hasta el final.
 		toString()				Devuelve el String equivalente como con cualquier objeto
 
 *	Ejemplo:		
 */
class StringBuilderCapLen {

	public static void main(String args[]) {

		StringBuilder bufer = new StringBuilder("Hola, cómo estás?");

		System.out.printf("bufer = %s\nlongitud = %d\ncapacitad = %d\n\n", bufer.toString(), bufer.length(),
				bufer.capacity());

		bufer.ensureCapacity(75);
		System.out.printf("Nueva capacitad = %d\n\n", bufer.capacity());

		bufer.setLength(10);
		System.out.printf("Nueva longitud = %d\nbufer = %s\n", bufer.length(), bufer.toString());

		System.out.println("");
		System.out.printf("buffer = %s" + "\nponemos un string = %d" + "\nahora un numero = %d" + "\n\n",
				bufer.toString(), bufer.length(), bufer.capacity());

		// prueba para entender el formato
		String texto = "parametro 1";
		int numEntero = 10;
		double numDouble = 2.5;

		String formato = "primero el %s\tluego el numero entero %d\ty por ultimo el double %f";

		System.out.printf(formato, texto, numEntero, numDouble);

	}
}

/*
 * Ejemplo 2:
 * 
 */

class StringBuilderChars {

	public static void main(String args[]) {

		StringBuilder bufer = new StringBuilder("hola a todos");

		System.out.printf("bufer = %s\n", bufer.toString());
		System.out.printf("Carácter a 0: %s\nCarácter a 3:%s\n\n", bufer.charAt(0), bufer.charAt(3));

		char arrayChars[] = new char[bufer.length()];
		bufer.getChars(0, bufer.length(), arrayChars, 0);

		System.out.println("el arrayChars tiene un tamaño de " + arrayChars.length);
		System.out.print("Los carácteres son: ");

		for (char character : arrayChars) {
			System.out.print(character);
		}

		bufer.setCharAt(0, 'H');
		bufer.setCharAt(7, 'T');
		System.out.printf("\n\nbufer = %s", bufer.toString());

		bufer.reverse();
		System.out.printf("\n\nbufer = %s\n", bufer.toString());
	}
}

/*
 * Metodos append para StringBuilder() 
 * ------------------------------------
 * 
 * Es una forma de sustituir el + del string normal
 * 
 * 		String cadena1= "hola"; 
 * 		String cadena2= "BC"; 
 * 		int valor = 22;
 * 
 * La instrucción: 
 * 		String s = cadena1 + cadena2 + valor;
 * 
 * Se realiza de la siguiente forma: new
 * 		StringBuilder().append("hola").append("BC").append(22).toString();
 *
 * Métodos de inserción y eliminación 
 * ----------------------------------
 * 
 * Cada uno de los métodos toma el segundo argumento, lo convierte en cadena y
 * lo inserta justo antes del índice especificado por el primer argumento. 
 * El primer argumento debe ser mayor o igual a 0 y menor que la longitud del objeto. 
 * También se proporcionan métodos delete y deleteCharAt para eliminar caracteres en cualquier posición. 
 * El método delete recibe dos argumentos: 
 * 		el índice inicial y 
 * 		el índice que se encuentra una posición más allá del último de los caracteres que se deben eliminar. 
 * El método deleteCharAt recibe el índice del carácter a eliminar.
 *
 *
 * Ejemplo de eficiencia entre String StringBuilder y StringBuilder optimizado
 *
 */

class String3 {
	
	public static void main(String[] args) {
	
		String s = "cadena";
		long t1, t2;
		int n = 100000;

		System.out.print("Concatenar " + n + " cadenas con String: ");
		t1 = System.currentTimeMillis();
		concatenar(s, n);
		t2 = System.currentTimeMillis();
		System.out.println((t2 - t1) + " milisegundos");

		System.out.print("Concatenar " + n + " cadenas con StringBuilder: ");
		t1 = System.currentTimeMillis();
		concatenar1(s, n);
		t2 = System.currentTimeMillis();
		System.out.println((t2 - t1) + " milisegundos");

		System.out.print("Concatenar " + n + " cadenas con StringBuilder Optimizado: ");
		t1 = System.currentTimeMillis();
		concatenar2(s, n);
		t2 = System.currentTimeMillis();
		System.out.println((t2 - t1) + " milisegundos");
	}

	// método que concatena n cadenas usando la clase String
	public static String concatenar(String s, int n) {
		String resultado = s;
		for (int i = 1; i < n; i++) {
			resultado = resultado + s;
		}
		return resultado;
	}

	// método que concatena n cadenas usando la clase StringBuilder
	public static String concatenar1(String s, int n) {
		StringBuilder resultado = new StringBuilder(s);
		for (int i = 1; i < n; i++) {
			resultado.append(s);
		}
		return resultado.toString();
	}

	// método optimizado que concatena n cadenas usando la clase StringBuilder
	// se crea un StringBuilder inicial con el tamaño total del String resultante
	public static String concatenar2(String s, int n) {
		StringBuilder resultado = new StringBuilder(s.length() * n);
		for (int i = 0; i < n; i++) {
			resultado.append(s);
		}
		return resultado.toString();
	}
}

/*
 * La Clase StringBuffer 
 * ---------------------
 *
 *	StringBuffer y StringBuilder funcionan igual con la diferencia que StringBuffer se usa para varios hilos
 * 
 * 		Usaremos String si los datos no van a cambiar 
 * 		Usaremos StringBuffer si los datos van a cambiar y solo tenemos un hilo de ejecucion 
 * 		Usaremos StringBuffer si la cadena de caracteres puede cambiar y tenemos varios hilos de ejecución.
 *	
 *	Diferencias entre String, StringBuilder Y StringBuffer
 *--------------------------------------------------------
 *
 *	String es inmutable. Cada vez que modificamos el String se crea un objeto nuevo y se destruye el anterior
 *	Los objetos String se almacenan en el Constant String Pool que es un repositorio de cadenas de String
 *	Es se haca para que si creamos otro string con el mismo valor no se cree un objeto nuevo sino una referencia
 *al objeto ya creado
 *	StringBuffer y StringBuilder se almacenan en el heap que es una memoria reservada para el tiempo de ejecucion
 *	La implementacion de StringBuffer es synchronized (sincronizada) StringBuilder no
 *	El operador de concatenacion (+) es implementado internamente usando StringBuilder
 *	
 *	Caracteristicas StringBuffer
 *	----------------------------
 *
 *	La clase StringBuffer es mutable. 
 * 	StringBuffer es rápido y consume menos memoria cuando concatena cadenas. 
 *	La clase StringBuffer no anula el método equals () de la clase Object. 
 *
 *	Métodos de StringBuffer
 * ------------------------
 * 
 * 		length()				Devuelve el tamaño de la cadena 
 *		capacity()				Devuelve la capacidad del objeto StringBuilder  
 *		append(x)				Añade X al final de la cadena. X puede ser de cualquier tipo
 *		insert()				Inserta X en la posición indicada. X puede ser de cualquier tipo.
 *		reverse()				Invierte el contenido de la cadena
 *		delete(inicio, fin)		Elimina los caracteres desde la posición inicio hasta fin-1.
 *		replace(ini, fin, txt)	Reemplaza desde ini hasta fin con txt
 *						
 *
 *
 *
 *
 *
 */
public class IndiceApuntes {

	public static void main(String[] args) {
		// COMPROBACION DE EFICIENCIA STRING VS STRINGBUILDER

		// Concatenamos el valor de i del for con la variable texto 100_000 veces...

		String texto = "";

		long initTime = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			texto = texto + i;
		}
		long endTime = System.currentTimeMillis();

		System.out.println("El metodo string ha tardado " + (endTime - initTime));

		StringBuilder texto1 = new StringBuilder("");

		initTime = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			texto1.append(i);
		}
		endTime = System.currentTimeMillis();

		System.out.println("El metodo StringBuilder ha tardado " + (endTime - initTime));

	}
}
