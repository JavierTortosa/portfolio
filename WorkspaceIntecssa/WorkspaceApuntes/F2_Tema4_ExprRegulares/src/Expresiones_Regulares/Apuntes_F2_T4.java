package Expresiones_Regulares;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 	Expresiones Regulares
 * 	---------------------
 * 
 * 	// web de ejemplos
 *  // https://puntocomnoesunlenguaje.blogspot.com/2013/07/ejemplos-expresiones-regulares-java-split.html
 * 
 * 	Una expresión regular define un patrón de búsqueda para cadenas de caracteres. 
 * 	La podemos utilizar para comprobar si una cadena contiene o coincide con el patrón. 
 * 	El contenido de la cadena de caracteres puede coincidir con el patrón 0, 1 o más veces.
 * 
 * 	Algunos ejemplos de uso de expresiones regulares pueden ser : 
 * 
 * 	-Para comprobar que la fecha leída cumple el patrón dd/mm/aaaa.
 *	-Para comprobar que un NIF está formado por 8 cifras, un guión y una letra.
 *	-Para comprobar que una dirección de correo electrónico es una dirección válida.
 *	-Para comprobar que una contraseña cumple unas determinadas condiciones.
 *	-Para comprobar que una URL es válida.    
 *	-Para comprobar cuántas veces se repite dentro de la cadena una secuencia de caracteres determinada.
 *
 *	El patrón se busca en el String de izquierda a derecha. 
 *	Cuando se determina que un carácter cumple con el patrón este carácter ya no vuelve a intervenir en la 
 * comprobación.
 * 
  
 * 	Símbolos comunes en expresiones regulares
 * 	-----------------------------------------
  
	  	Expresión	Descripción
	  	----------	-----------------------------------------------------------------------------------------
			.		Un punto indica cualquier carácter 
		^expresión 	El símbolo ^ indica el principio del String. 
					En este caso el String debe contener la expresión al principio. 
		expresión$	El símbolo $ indica el final del String. 
					En este caso el String debe contener la expresión al final.
		[abc]		Los corchetes representan una definición de conjunto. 
					En este ejemplo el String debe contener las letras a ó b ó c.
		[abc][12]	El String debe contener las letras a ó b ó c seguidas de 1 ó 2
		[^abc]		El símbolo ^ dentro de los corchetes indica negación. 
					En este caso el String debe contener cualquier carácter excepto a ó b ó c.
		[a-z1-9]	Rango. Indica las letras minúsculas desde la a hasta la z (ambas incluidas) y los dígitos 
					desde el 1 hasta el 9 (ambos incluidos)
		A|B			El carácter | es un OR.  A ó B
		AB			Concatenación. A seguida de B 
		
 * 	Metacaracteres
 * 	--------------
 		
	  	Expresión	Descripción	
	  	---------	----------------------------------------------------------------------------------
		\d 			Dígito. Equivale a [0-9] 
		\D 			No dígito. Equivale a [^0-9]
		\s			Espacio en blanco. Equivale a [ \t\n\x0b\r\f] 
		\S			No espacio en blanco. Equivale a [^\s]
		\w			Una letra mayúscula o minúscula, un dígito o el carácter _Equivale a  [a-zA-Z0-9_]
		\W			Equivale a [^\w]
		\b			Límite de una palabra.
  
 * 	Cuantificadores
 * 	---------------
 
	Expresión	Descripción
	{X}			Indica que lo que va justo antes de las llaves se repite X veces
	{X,Y}		Indica que lo que va justo antes de las llaves se repite mínimo X veces y máximo Y veces. También podemos poner {X,} indicando que se repite un mínimo de X veces sin límite máximo.
 	*			Indica 0 ó más veces. Equivale a {0,}
	+			Indica 1 ó más veces. Equivale a {1,}
	?			Indica 0 ó 1 veces. Equivale a {0,1}
  
 * 
 * En Java debemos usar una doble barra invertida \\Por ejemplo para utilizar  "\w" tendremos que escribir "\\w". 
 * Si queremos indicar que la barra invertida en un carácter de la expresión regular tendremos que escribir  "\\\\".
 * 
 * Ejemplo:
 */


class EjemploExpresionRegular {
	
	public static void main(String[] args) {
		
		String cadena = "abc";
		
		Pattern pat = Pattern.compile("abc");
		
		Matcher mat = pat.matcher(cadena);
		
		if (mat.matches()) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
	}
}

/* 
 *  Pattern
 *  -------
 * 
 * 	Java no tiene expresiones regulares pero tiene el paquete java.util.reggex
 * 	El paquete incluye las siguientes clases:
 * 
 * 		PatternClass - Define un patrón (para ser usado en una búsqueda).
 * 		MatcherClass: se utiliza para buscar el patrón.
 * 		PatternSyntaxException Class: indica un error de sintaxis en un patrón de expresión regular
 *
 * 	La clase de patrón pertenece a java.util.regex (paquete) y el paquete pertenece a java.base (módulo).
 * 	La clase de patrón no define ningún constructor. 
 * 	El patrón se crea utilizando el método de fábrica compile() . 
 * 
 * 		static Pattern compile (String pattern)
 * 
 * 	Aquí, el patrón en el método de compilación es un String. 
 * 	Esta cadena (patrón) se convierte luego en pattern que ahora puede usarse para la coincidencia de patrones 
 * por parte de la clase Matcher. 
 * 	Una vez que el patrón coincide, devuelve un objeto Pattern que contiene el patrón. 
 * 	El objeto Pattern creado aquí ahora se usará para crear un Matcher . 
 * 	El Matcher se crea llamando al método matcher() definido por Pattern .
 * 
 * 		Matcher matcher (CharSequence x)
 * 
 * 	Aquí, x es la secuencia de caracteres con la que se comparará el patrón. 
 * 	Dado que esta es la entrada que está tomando, también se denomina secuencia de entrada. 
 * 	CharSequence es una interfaz que proporciona acceso de solo lectura al conjunto de caracteres.  
 * 
 * 	Ejemplo:
 */

class PatternEjemplo{
	
	public static void main(String[] args) {
		
		//CREA EL PATTERN
		Pattern pattern = Pattern.compile("Intecssa");
		
		//CREA EL MATCHER PARA LA ENTRADA
		Matcher matcher = pattern.matcher("Intecssa");
		
		//BUSCANDO COINCIDENCIA
		//usando el metodo matches()
		boolean letsCheck = matcher.matches();
		
		//MOSTRAR EL MENSAJE
		System.out.println("vamos a comprobar si el patron coincide o no: ");
		
		//CONDICIONAL SI COINCIDE O NO
		if (letsCheck) 
			//MATCHED
			System.out.println("Patron coincide");
		else
			System.out.println("Patron no coincide");
	}
}

/*
 * Ejemplo 2:
 */

class PatternEjemplo2{
	public static void main(String[] args) {
		
		// https://www.arteco-consulting.com/post/tutorial-java-regexp
		
		Pattern pat = Pattern.compile("hola");
		
		String input = "La caracola dice hola a la palomasupercalifragilisticoespialidoso";
		
		Matcher matcher = pat.matcher(input);
		
		if (matcher.find()) {
			System.out.println("regex encontrado");
		} else {
			System.err.println("regex no encontrado");
		}
		
		String regex = "La (\\w+) dice hola a la (\\w+)";
		Pattern pat1 = Pattern.compile(regex);
		Matcher mat = pat1.matcher(input);
		if (mat.find()) {
		    System.out.println("Sujeto activo :"+mat.group(1));
		    System.out.println("Sujeto pasivo :"+mat.group(2));
		} else {
		    System.err.println("regex NO encontrada");
		}
	}
}

 /* 
 * 	Matcher
 * 	-------
 * 
 * 	Matcher es una clase implementada por la interfaz MatchResult
 * 	Realiza operaciones de coincidencia en una secuencia de caracteres interpretando un Patrón.
 * 	
 * 		public final class Matcher extends Object implements MatchResult
 * 
 * 	Al invocar el método de comparación del patrón, se crea un comparador a partir de un patrón. 
 * 	Si se crea un comparador, podemos realizar tres tipos diferentes de operaciones de coincidencia en él: 
 * 	
 *  -matches() : intenta hacer coincidir la secuencia de entrada total con el patrón.
 *  -lookingAt() : intente hacer coincidir la secuencia de entrada, con el patrón, comenzando desde el principio.
 *  -find() : Esto escanea la secuencia de entrada y busca la siguiente subsecuencia que coincida con el patrón.
 *
 
 *  Metodos de la clase Matcher:
 *  ----------------------------
 *  
 *  Metodos de indice:
 *  ------------------
 *  Proporciona valores de índice útiles. 
 *  Muestra con precisión si la coincidencia se encontró en la cadena de entrada o no.
 *  
 *  -public int start()	
 *  Este método devuelve el índice de inicio de la coincidencia anterior. 
 *
 *	-public int start(int group)	
 *	Este método devuelve el índice de inicio de la subsecuencia capturada por el grupo dado durante la operación 
 *	de coincidencia anterior.
 *
 *	-public int end()	
 *	Este método devuelve el desplazamiento después de que coincida el último carácter.
 *	
 *	-public int end(int group)	
 *	Este método devuelve el desplazamiento después del último carácter de la subsecuencia capturada por el grupo 
 *	dado durante la operación de coincidencia anterior.
 * 
 * 	Metodos de estudio
 *  ------------------
 *  Revisa la cadena de entrada y devuelve un valor booleano que indica si se encuentra el patrón o no.
 *
 *	-public boolean lookingAt()	
 *	Este método tiene como objetivo hacer coincidir la secuencia de entrada, comenzando al principio de la región, 
 *	con el patrón. 
 *
 *	-public boolean find()	
 *	Este método tiene como objetivo encontrar la siguiente subsecuencia de la secuencia de entrada que coincida 
 *	con el patrón. 
 *
 *	-public boolean find(int start)	
 *	Restablece este comparador y luego intenta encontrar la siguiente subsecuencia de la secuencia de entrada que 
 *	coincida con el patrón, comenzando en el índice especificado. 
 *
 *	-public boolean matches()	
 *	Este método tiene como objetivo hacer coincidir toda la región con el patrón. 
 *  
 *  Metodos de Reemplazo
 *  --------------------
 *  Estos son métodos útiles para reemplazar texto en una cadena de entrada: 
 *
 *	-public Matcher appendReplacement(StringBuffer sb, String replacement)	
 *	Este método implementa un paso de agregar y reemplazar no terminal.
 *
 *	-public StringBuffer appendTail(StringBuffer sb)	
 *	Este método implementa un paso de agregar y reemplazar terminal.
 *
 *	-public String replaceAll(String replacement)	
 *	Este método reemplaza cada subsecuencia de la secuencia de entrada que coincida con el patrón con la cadena 
 *	de reemplazo dada.
 *
 *	-public String replaceFirst(String replacement)	
 *	Este método reemplaza la primera subsecuencia de la secuencia de entrada que coincide con el patrón con la 
 *	cadena de reemplazo dada.
 *
 *	-public static String quoteReplacement(String s)	
 *	Este método devuelve una cadena de reemplazo literal para la cadena especificada, este método también produce 
 *	una cadena que funcionará en el método appendReplacement como un reemplazo literal de la clase Matcher.
 *  
 *  Ejemplo
 */

class DemoMatcher1{
		
	private static final String REGEX = "\\bintecssa\\b";
	private static final String INPUT = "intecssa intecssa intecssa ";
	
	public static void main(String[] args) {
		
		Pattern pat = Pattern.compile(REGEX);
		Matcher mat = pat.matcher(INPUT);
		
		int cont = 0;
		
		while (mat.find()){
			cont++;
			System.out.println("Match numero: " + cont);
			System.out.println("Start(): " + mat.start());
			System.out.println("end(): " + mat.end());
		}
	}
}

/*
 * PatternSyntaxException
 * ----------------------
 * 
 *  Para identificar y arrojar cualquier error sintáctico en el patrón, se usa la clase PatternSyntaxException 
 *  Esta es una excepción no verificada disponible en el paquete java.util.regex de la versión java 1.4. 
 *  
 *  Sintaxis:
 *  
 *  		public class PatternSyntaxException extends IllegalArgumentException
 *  
 *  Constructores:
 *  
 *  		PatternSyntaxException(String desc, String regex, int index)
 *  
 *  Métodos de clase
 *  
 *  String getDescription() 
 *  Recupera la descripción del error. 
 * 	
 * 	int getIndex()
 *	Recupera el índice de error. 
 *	
 *	String getMessage()
 *	Devuelve una cadena de varias líneas que contiene la descripción del error de sintaxis y su índice
 *	el patrón de expresión regular errónea y una indicación visual del índice de error dentro del patrón. 
 *
 *	String getPattern()
 *	Recupera el patrón de expresión regular erróneo. 
 *  
 *  Ejemplo:
 */

class EjemploPatternException {
	public static void main(String[] args) {
		String regex = "[";
		Pattern pat = Pattern.compile(regex);
	}
}

/*
 * 	StreamTokenizer
 * 	---------------
 * 
 * 	La clase StreamTokenizer toma un flujo de entrada y lo analiza en "tokens"
 * 	lo que permite que los tokens se lean uno a la vez. 
 * 	El proceso de análisis se controla mediante una tabla y una serie de indicadores que se pueden establecer en varios estados. 
 * 	El tokenizador de flujo puede reconocer identificadores, números, cadenas entre comillas y varios comentarios.
 * 
 *	Una instancia tiene cuatro banderas. Estas banderas indican:
 *
 *	 - Si los terminadores de línea deben ser devueltos como fichas o tratados como un espacio en blanco que 
 *	simplemente separa las fichas.
 * 	 - Si los comentarios del estilo C deben ser reconocidos y omitidos.
 * 	 - Si los comentarios de estilo C++deben ser reconocidos y omitidos.
 * 	 - Si los caracteres de los identificadores se convierten en minúsculas.
 * 
 * 	Sintaxis:
 * 
 * 		public class StreamTokenizer extends Object
 * 
 * 	Constructor
 * 		StreamTokenizer(Reader arg)
 * 
 * 		 Crea un tokenizador que analiza el flujo de caracteres dado
 * 
 * 	Metodo:	java.io.StreamTokenizer.commentChar(int arg) 
 * 
 * 		 Ignora todos los caracteres desde el carácter de comentario de una sola línea hasta el final de la línea 
 * 		por este StreamTokenizer.
 * 
 * Ejemplo:	
 */

class DemoComentChar{
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException{
		
		FileReader reader = new FileReader("ABC.txt");
		BufferedReader bufferRead = new BufferedReader (reader);
		StreamTokenizer token = new StreamTokenizer(bufferRead);
		
		token.commentChar('a');
		int t;
		while ((t = token.nextToken()) != StreamTokenizer.TT_EOF) {
			switch (t) {
			
			case StreamTokenizer.TT_NUMBER:
				System.out.println("Number: "+ token.nval);
				break;
			case StreamTokenizer.TT_WORD:
				System.out.println("Word: "+ token.sval);
				break;
			}
		}
	}
}

/*
 * 	Metodo: java.io.StreamTokenizer.lineno() 
 * 
 * 	devuelve el número de línea actual de este StreamTokenizer.
 * 
 * 	Ejemplo: 
 */

class DemoLineno{
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException{
		
		FileReader reader = new FileReader("ABC.txt");
		BufferedReader bufferRead = new BufferedReader (reader);
		StreamTokenizer token = new StreamTokenizer(bufferRead);
		
		token.eolIsSignificant(true);
		
		//Uso del metodo lineno()
		//para obtener el numero de linea 
		
		System.out.println("Numero de linea: " + token.lineno());
		
		token.commentChar('a');
		int t;
		
		while ((t = token.nextToken()) != StreamTokenizer.TT_EOF) {
			switch (t) {
			
			case StreamTokenizer.TT_EOL:
				System.out.println();
				System.out.println("numero de linea: " + token.lineno());
				break;
			case StreamTokenizer.TT_NUMBER:
				System.out.println("Numero: " + token.nval);
				break;
			case StreamTokenizer.TT_WORD:
				System.out.println("Palabra: " + token.sval);
				break;
			}
		}
	}
}

/*
 * Ejemplo StreamTokenizer:
 */

class DemoStreamTokenizer {

	public static void main(String[] args) throws IOException {

		Reader reader = new StringReader("Este es un mensaje para dar ejemplo de este video");

		StreamTokenizer token = new StreamTokenizer(reader);

		while (token.nextToken() != StreamTokenizer.TT_EOF) {
			System.out.println(token.sval);
		}
	}
}

/*
 * 	String Tokenizer
 * 	----------------
 * 
 * 	La clase java.util.StringTokenizer le permite dividir una cadena en tokens.
 * 
 * 	No proporciona la posibilidad de diferenciar números, cadenas entrecomilladas, identificadores, etc.
 * 	Los delimitadores se pueden proporcionar en el momento de la creación o uno por uno a los tokens.
 * 
 * 	Constructores
 * 
 *	StringTokenizer(Cadena de cadena) 	
 *		Crea StringTokenizer con una cadena especificada. 
 *
 *	StringTokenizer(String str, String delim) 	
 *		Crea StringTokenizer con una cadena y un delimitador especificados. 
 *
 *	StringTokenizer(String str, String delim, boolean returnValue)
 *		Crea StringTokenizer con una cadena, un delimitador y un valor de retorno especificados. 
 *		Si el valor devuelto es verdadero, los caracteres delimitadores se consideran tokens. 
 *		Si es falso, los caracteres delimitadores sirven para separar tokens.
 *
 * 	Metodos:
 * 
 * boolean hasMoreTokens()  	
 * 	Comprueba si hay más tokens disponibles. 
 * 
 * String nextToken() 	
 * 	Devuelve el siguiente token del objeto StringTokenizer. 
 * 
 * String nextToken(String delim)
 *	Devuelve el siguiente token basado en el delimitador.
 *
 * boolean hasMoreElements()
 * 	Es lo mismo que el método hasMoreTokens().
 * 
 * Object nextElement()
 * 	Es lo mismo que nextToken() pero su tipo de devolución es Object.
 * 
 * int countTokens()
 * 	Devuelve el número total de tokens.
 * 
 * Ejemplo:
 */

class DemoStringTokenizer{
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("My name is khan"," ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}

/*
 * Ejemplo 1
 */

class DemoStringTokenizer1{
	public static void main(String[] args) {
		String nombre = "Juan Perez Zepita";
		StringTokenizer st = new StringTokenizer(nombre);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}

/*
 * Ejemplo 2
 */

class DemoStringTokenizer2{
	public static void main(String[] args) {
		String strDatos = "6.3\n6.2\n6.4\n6.2";

		StringTokenizer tokens = new StringTokenizer(strDatos, "\n");
		
		int nDatos = tokens.countTokens();
		
		double[] datos = new double[nDatos];
		
		for (int i = 0; tokens.hasMoreTokens(); i++) {
			
			String str = tokens.nextToken();
			datos[i]=Double.valueOf(str).doubleValue();
			
			System.out.println(datos[i]);
		}
	}
}

public class Apuntes_F2_T4 {
	
	public static void main(String[] args) {
		
	}

}
