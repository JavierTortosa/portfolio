package seccion2_tiposDeDatos;



/*
 * -----------------------
 * AMBITO DE LAS VARIABLES
 * -----------------------
 * 
 * Las variables se pueden definir a nivel de clase o a nivel de metodo
 * si se definen a nivel de clase se llaman atributos de clase 
 * si se definen a nivel de metodo son variables locales
 * 
 * 		public class MiClase{
 * 			int var1; //variable de clase / atributo / propiedad / campo 
 * 
 * 			public static void main(String[] args]{
 * 				int var; // variable local
 * 				int var1; // variable local con el mismo nombre que variable de clase
 * 				var1 = 10 // inicializamos la variable local a 10;
 * 				this.var1 = 10; // con this. accedemos a la variable de clase 
 * 
 * --------------------------
 * INICIALIZACION POR DEFECTO
 * --------------------------
 * 
 * las variables locales hay que inicializarlas manualmente
 * si no las inicializamos asignandole un valor no se pueden utilizar y da error de compilacion
 * 
 * las variables de clase si se inicializan por defecto segun el tipo
 * 
 * 		Enteros = 0 	// int, short, byte...
 * 		Decimales = 0.0	// float, double
 * 		boolean = false
 * 		char = '\u0000' //caracter nulo
 * 		Objeto = null
 * 
 * --------------------------------------
 * VARIABLES OBJETO Y DE TIPOS PRIMITIVOS
 * --------------------------------------
 * 
 * si la variable es de tipo primitivo (int, char, boolean...), la propia variable contiene el valor
 * 	int n=200; //n vale 200
 * 
 * si la variable es un objeto, en lugar del valor, contiene la direccion de referencia del objeto en memoria
 *  Object ob = new Object();
 * 		//ob vale 13FD (por ej) que es la direccion de memoria donde esta el objeto
 * 
 * --------------------------------------
 * DIFERENCIAS ENTRE OBJETOS Y PRIMITIVOS
 * --------------------------------------
 * 
 * las variables contienen sus valores 
 * 	int n=200; 	//n vale 200
 * 	int r=n;	//creamos una copia de n en r. por lo tanto r vale 200
 * 
 * los objetos contienen la direccion del objeto 
 * por lo tanto cuando igualamos 2 objetos solo tenemos 1 referencia
 * 
 *  Object ob = new Object();	//referencia 13FD
 *  Object cp = ob;				//referencia 13FD
 *  
 */

public class V02_Variables2 {
	
}
