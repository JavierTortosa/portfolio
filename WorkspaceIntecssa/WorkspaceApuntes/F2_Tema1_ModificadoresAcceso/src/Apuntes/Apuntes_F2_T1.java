package Apuntes;

/*
 * 	Palabras Reservadas
 * 	-------------------
 * 
 * 	Java tiene 57 palabras reservadas que tienen un significado predefinido en el lenguaje
 * 	No se pueden usar ninguna de ellas como nombre para ningun identificador
 * 	de las 57 palabras hay 2 que no se usan
 * 
 *  abstract 	case 		default 	exports 	for 		int 		new 		requires 	super
 *	assert 		catch 		do 			extends 	if 			interface 	package 	return 		switch
 *	boolean		char 		double 		final 		implements 	long 		private 	short 		synchronized
 *	break 		class 		else 		finally 	import 		module 		protected 	static 		this
 *	byte 		continue 	enum 		float		instanceof 	native 		public 		strictfp 	throw
 *	throws 		transient 	try 		void 		volatile 	while 		true 		null 		false
 *	var 		const 		goto
 *  
 *  Modificadores de Acceso
 *  -----------------------
 *  
 *  public		cualquier clase - cualquier paquete
 *  default		cualuier clase - mismo paquete
 *  protected	clase donde se crea e hijas
 *  private		solo clase donde se crea
 *  
 *  Encapsulamiento
 *  ---------------
 *  
 *  Ocultar atributos para que solo se puedan modificar con metodos especificos
 *  los atributos deben tener visibilidad private
 *  para acceder a los atributos creamos los getters y setters
 *  
 *  El termino DELEGACION es poder modificar los atributos de una clase dentro de otra.
 *  
 *  Ejemplo:
 */

class ClaseA {
	
	private int parametro1;

	public int getParametro1() {
		return parametro1;
	}

	public void setParametro1(int parametro1) {
		this.parametro1 = parametro1;
	}
}

class ClaseB {

	private int parametroClaseB;
	private ClaseA claseA;		// creamos un objeto de la clase A
	
	public int getParametroClaseB() {
		return parametroClaseB;
	}

	public void setParametroClaseB(int parametroClaseB) {
		this.parametroClaseB = parametroClaseB;
	}
	
	// getters y setters de parametro1 de la ClaseA - DELEGACION
	public int getParametro1() {
		return claseA.getParametro1();
	}

	public void setParametro1(int parametro1) {
		this.claseA.setParametro1(parametro1);
	}
}

 /*  
 *	Constructores
 *	-------------
 *
 *	Un constructor es un método que se ejecuta automáticamente cuando se crea un objeto de una clase
 *	Sirve para inicializar los miembros de una clase.
 *	Todas las clases tienen un constructor por defecto sin parametros aunque no se cree
 *
 *	Reglas:
 *		El constructor tiene el mismo nombre que la clase. 
 *		Cuando se define no se puede especificar un valor de retorno, nunca devuelve un valor. 
 *		Puede tomar cualquier numero de argumentos.
 *  	
 *  Precaucion
 *  	Si creamos un constructor con parametros el constructor por defecto desaparece
 *  
 *  	si no queremos que se puedan crear objetos sin parametros esto puede ser una buena opcion
 *  	otra opcion seria hacer el constructor sin parametros private	
 *  
 *  Atributos o Variables Miembro o Variables de instancia
 *  ------------------------------------------------------
 *  
 *  Los atributos, también se llaman datos o variables miembro o variables de instancia
 *  son porciones de información que un objeto posee o conoce de sí mismo. 
 *  Una clase puede tener cualquier número de atributos o no tener ninguno 
 *  Se declaran con un identificador y el tipo de dato correspondiente.
 *  
 *  Tienen los mismos modificadores de visibilidad que las clases
 *  
 *  	public				visibilidad publica
 *  	protected			solo para misma clase o herencia
 *  	default (package)	mismo package
 *  	private				solo clase en la que se creo
 *  
 *  Variables Estaticas
 *  -------------------
 *  
 *  La variable estática en Java es una variable que pertenece a la clase 
 *  se inicializa solo una vez al inicio de la ejecución.
 *  
 *  Es una variable que pertenece a la clase y no al objeto (instancia)
 *	Las variables estáticas se inicializan solo una vez, al inicio de la ejecución. 
 *	Estas variables se inicializarán primero, antes de la inicialización de cualquier variable de instancia.
 *	Una sola copia para ser compartida por todas las instancias de la clase
 *	Se puede acceder directamente a una variable estática por el nombre de clase y no necesita ningún objeto.
 *  
 *  		<class-name>. <variable-name>
 *  
 *  Metodo Estatico
 *  ---------------
 *  
 *  Es un método que pertenece a la clase y no al objeto (instancia)
 * 	Solo puede acceder a datos estáticos. 
 *  No puede acceder a datos no estáticos (variables de instancia)
 *	Puede llamar solo a otros métodos estáticos y no puede invocar un método no estático a partir de él.
 *	No puede hacer referencia a “this” o “super” palabras clave de todos modo
 *  Se puede acceder al metodo directamente por el nombre de la clase y no necesita ningún objeto
 *  
 *  		<class-name>. <method-name>
 *  
 *  Se puede crear un bloque static 
 *  
 *  Ejemplo:
 */

public class Apuntes_F2_T1 {

	static int a;
	static int b;
	
	static {
		a=10;
		b=20;
	}
	
	public static void main(String[] args) {
		System.out.println("valor de a "+ a);
		System.out.println("valor de b "+ b);
	}
}	

