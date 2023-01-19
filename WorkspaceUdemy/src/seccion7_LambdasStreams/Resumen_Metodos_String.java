package seccion7_LambdasStreams;
/*
char			charAt(int index)			Devuelve el charvalor en el índice especificado.
String			concat(String str)			Concatena la cadena especificada al final de esta cadena.
boolean			contains(CharSequence s)	Devuelve verdadero si y solo si esta cadena contiene la secuencia especificada de valores de caracteres.
int				compareTo(String anotherString)		Compara dos cadenas lexicográficamente.
int				compareToIgnoreCase(String str)		Compara dos cadenas lexicográficamente, ignorando las diferencias entre mayúsculas y minúsculas.
boolean			endsWith(String suffix)		Comprueba si esta cadena termina con el sufijo especificado.
boolean			equals(Object anObject)		Compara esta cadena con el objeto especificado.
boolean			equalsIgnoreCase(String anotherString)		Compara esto Stringcon otro String, ignorando las consideraciones del caso.
static String	format(String format, Object... args)		Devuelve una cadena con formato utilizando la cadena de formato y los argumentos especificados.
static String	format(Locale l, String format, Object... args)		Devuelve una cadena con formato utilizando la configuración regional, la cadena de formato y los argumentos especificados.
int				indexOf(int ch)		Devuelve el índice dentro de esta cadena de la primera aparición del carácter especificado.
int				indexOf(int ch, int fromIndex)		Devuelve el índice dentro de esta cadena de la primera aparición del carácter especificado, comenzando la búsqueda en el índice especificado.
int				indexOf(String str)		Devuelve el índice dentro de esta cadena de la primera aparición de la subcadena especificada.
int				indexOf(String str, int fromIndex)		Devuelve el índice dentro de esta cadena de la primera aparición de la subcadena especificada, comenzando en el índice especificado.
boolean			isBlank()		Devuelve truesi la cadena está vacía o contiene solo puntos de código de espacios en blanco ; de lo contrario, false.
boolean			isEmpty()		Devuelve truesi, y solo si, length()es 0.
int				lastIndexOf(int ch)		Devuelve el índice dentro de esta cadena de la última aparición del carácter especificado.
int				lastIndexOf(int ch, int fromIndex)		Devuelve el índice dentro de esta cadena de la última aparición del carácter especificado, buscando hacia atrás a partir del índice especificado.
int				lastIndexOf(String str)			Devuelve el índice dentro de esta cadena de la última aparición de la subcadena especificada.
int				lastIndexOf(String str, int fromIndex)		Devuelve el índice dentro de esta cadena de la última aparición de la subcadena especificada, buscando hacia atrás a partir del índice especificado.
int				length()		Devuelve la longitud de esta cadena.
boolean			matches(String regex)		Indica si esta cadena coincide o no con la expresión regular dada .
String			replace(char oldChar, char newChar)		Devuelve una cadena resultante de reemplazar todas las apariciones de oldCharen esta cadena con newChar.
String			replace(CharSequence target, CharSequence replacement)		Reemplaza cada subcadena de esta cadena que coincida con la secuencia de destino literal con la secuencia de reemplazo literal especificada.
String			replaceAll(String regex, String replacement)		Reemplaza cada subcadena de esta cadena que coincida con la expresión regular dada con el reemplazo dado.
String			replaceFirst(String regex, String replacement)		Reemplaza la primera subcadena de esta cadena que coincide con la expresión regular dada con el reemplazo dado.
String[]		split(String regex)		Divide esta cadena en torno a las coincidencias de la expresión regular dada .
String[]		split(String regex, int limit)		Divide esta cadena en torno a las coincidencias de la expresión regular dada .
boolean			startsWith(String prefix, int toffset)		Comprueba si la subcadena de esta cadena que comienza en el índice especificado comienza con el prefijo especificado.
boolean			startsWith(String prefix)	Comprueba si esta cadena comienza con el prefijo especificado.
String			strip()		Devuelve una cadena cuyo valor es esta cadena, con todos los espacios en blanco iniciales y finales eliminados.
String			substring(int beginIndex)		Devuelve una cadena que es una subcadena de esta cadena.
String			substring(int beginIndex, int endIndex)		Devuelve una cadena que es una subcadena de esta cadena.
char[]			toCharArray()		Convierte esta cadena en una nueva matriz de caracteres.
String			toLowerCase()		Convierte todos los caracteres de este Stringa minúsculas utilizando las reglas de la configuración regional predeterminada.
String			toLowerCase(Locale locale)		Convierte todos los caracteres de this Stringa minúsculas usando las reglas del Locale.
String			toString()		Este objeto (¡que ya es una cadena!)
String			toUpperCase()		Convierte todos los caracteres de este Stringa mayúsculas utilizando las reglas de la configuración regional predeterminada.
String			toUpperCase(Locale locale)		Convierte todos los caracteres de this Stringa mayúsculas usando las reglas del Locale.
String			trim()			Devuelve una cadena cuyo valor es esta cadena, con todos los espacios iniciales y finales eliminados, donde el espacio se define como cualquier carácter cuyo punto de código es menor o igual que 'U+0020'(el carácter de espacio).
static String	valueOf(boolean b)		Devuelve la representación de cadena del booleanargumento.
static String	valueOf(char c)		Devuelve la representación de cadena del char argumento.
static String	valueOf(char[] data)		Devuelve la representación de cadena del charargumento de matriz.
static String	valueOf(char[] data, int offset, int count)		Devuelve la representación de cadena de un subarreglo específico del charargumento del arreglo.
static String	valueOf(double d)		Devuelve la representación de cadena del doubleargumento.
static String	valueOf(float f)		Devuelve la representación de cadena del floatargumento.
static String	valueOf(int i)			Devuelve la representación de cadena del intargumento.
static String	valueOf(long l)			Devuelve la representación de cadena del longargumento.
static String	valueOf(Object obj)		Devuelve la representación de cadena del Objectargumento.





IntStream		chars()						Devuelve un flujo de intcero que extiende los charvalores de esta secuencia.
int				codePointAt(int index)		Devuelve el carácter (punto de código Unicode) en el índice especificado.
int				codePointBefore(int index)	Devuelve el carácter (punto de código Unicode) antes del índice especificado.
int				codePointCount(int beginIndex, int endIndex)	Devuelve el número de puntos de código Unicode en el rango de texto especificado de este archivo String.
IntStream		codePoints()				Devuelve una secuencia de valores de punto de código de esta secuencia.
boolean			contentEquals(CharSequence cs)		Compara esta cadena con la especificada CharSequence.
boolean			contentEquals(StringBuffer sb)		Compara esta cadena con la especificada StringBuffer.
static String	copyValueOf(char[] data)			equivalente a valueOf(char[]).
static String	copyValueOf(char[] data, int offset, int count)		equivalente a valueOf(char[], int, int).
Optional<String>	describeConstable()		Devuelve un Optionalque contiene el descriptor nominal de esta instancia, que es la instancia misma.
String			formatted(Object... args)			Formatea usando esta cadena como la cadena de formato y los argumentos proporcionados.
byte[]			getBytes()			Codifica esto Stringen una secuencia de bytes usando el conjunto de caracteres predeterminado de la plataforma, almacenando el resultado en una nueva matriz de bytes.
void			getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)	Obsoleto.Este método no convierte correctamente los caracteres en bytes.
byte[]			getBytes(String charsetName)	Codifica esto Stringen una secuencia de bytes usando el juego de caracteres nombrado, almacenando el resultado en una nueva matriz de bytes.
byte[]			getBytes(Charset charset)		Codifica esto Stringen una secuencia de bytes usando el conjunto de caracteres dado , almacenando el resultado en una nueva matriz de bytes.
void			getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)	Copia caracteres de esta cadena en la matriz de caracteres de destino.
int				hashCode()		Devuelve un código hash para esta cadena.
String			indent(int n)		Ajusta la sangría de cada línea de esta cadena según el valor de ny normaliza los caracteres de terminación de línea.
String			intern()		Devuelve una representación canónica para el objeto de cadena.
static String	join(CharSequence delimiter, CharSequence... elements)		Devuelve un nuevo String compuesto por copias del CharSequence elementsunido junto con una copia del especificado delimiter.
static String	join(CharSequence delimiter, Iterable<? extends CharSequence> elements)		Devuelve un nuevo Stringcompuesto por copias del CharSequence elementsunido junto con una copia del especificado delimiter.
Stream<String>	lines()			Devuelve un flujo de líneas extraídas de esta cadena, separadas por terminadores de línea.
int				offsetByCodePoints(int index, int codePointOffset)		Devuelve el índice dentro de este Stringque está desplazado del dado indexpor los codePointOffsetpuntos de código.
boolean			regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)		Comprueba si dos regiones de cadena son iguales.
boolean			regionMatches(int toffset, String other, int ooffset, int len)Comprueba si dos regiones de cadena son iguales.
String			repeat(int count)		Devuelve una cadena cuyo valor es la concatenación de esta cadena repetidas countveces.
String			resolveConstantDesc(MethodHandles.Lookup lookup)		Resuelve esta instancia como un ConstantDesc, cuyo resultado es la instancia misma.
String			stripIndent()		Devuelve una cadena cuyo valor es esta cadena, con los espacios en blanco incidentales eliminados al principio y al final de cada línea.
String			stripLeading()		Devuelve una cadena cuyo valor es esta cadena, con todos los espacios en blanco iniciales eliminados.
String			stripTrailing()		Devuelve una cadena cuyo valor es esta cadena, con todos los espacios en blanco finales eliminados.
CharSequence	subSequence(int beginIndex, int endIndex)		Devuelve una secuencia de caracteres que es una subsecuencia de esta secuencia.
<R> R			transform(Function<? super String,? extends R> f)		Este método permite la aplicación de una función a una this cadena.
String			translateEscapes()		Devuelve una cadena cuyo valor es esta cadena, con secuencias de escape traducidas como si fuera un literal de cadena.
 * 
 */

public class Resumen_Metodos_String {

}
