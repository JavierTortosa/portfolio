package tema7_ClasesYObjetos;

/*
 * CLASES Y OBJETOS
 * ****************
 * 
 * 	La OOP es un modelo de programacion que organiza se en torno a datos u objetos, en lugar de funciones y lógica
 *  Un objeto se puede definir como un campo de datos que tiene atributos y comportamiento únicos.
 *  Este enfoque es adecuado para programas que son grandes, complejos y se actualizan o mantienen activamente. 
 * 	Tambien es beneficioso para el desarrollo colaborativo, donde los proyectos se dividen en grupos.
  
 * Principios de la POO
 * --------------------
 * 
 * 	Encapsulacion
 * 	-------------
 * 		El estado de cada objeto se mantienen de forma privada dentro de un límite definido o clase
 * 		Otros objetos no tienen acceso a esta clase o la autoridad para realizar cambios
 * 		Se pueden llamar a una lista de funciones o métodos públicos
 * 		Esta característica de ocultación de datos proporciona una mayor seguridad
 * 
 * 	Abstraccion
 * 	-----------
 * 
 * 		Los objetos solo revelan mecanismos internos que son relevantes para el uso de otros objetos
 * 		Este concepto ayuda a realizar cambios y adiciones más fácilmente a lo largo del tiempo. 
 * 
 * 	Herencia
 * 	--------
 * 
 * 		Se pueden asignar relaciones y subclases entre objetos
 * 		Permite reutilizar una lógica común sin dejar de mantener una jerarquía única
 * 		Esta propiedad de OOP obliga a:
 * 			un análisis de datos más completo
 * 			reduce el tiempo de desarrollo 
 * 			asegura un mayor nivel de precisión.
 * 		Los hijos heredan metodos y propiedades de los padres evitando repetir escribir codigo
 * 
 * 	Polimorfismo
 * 	------------
 * 
 * 		Los objetos pueden adoptar más de una forma según el contexto
 * 		El programa determinará qué significado o uso es necesario para cada ejecución de ese objeto
 * 		Reduce la necesidad de duplicar código
  
 * 	Beneficios de la POO
 * 	--------------------
 * 
 * 		Podemos crear los programas a partir de módulos de trabajo estándar que se comunican entre sí
 * 		permite dividir el programa en problemas que se pueden resolver fácilmente (un objeto a la vez). 
 * 		La nueva tecnología promete 
 * 			una mayor productividad del programador
 * 			una mejor calidad del software 
 * 			y un menor costo de mantenimiento. 
 * 		Es posible que múltiples instancias de objetos coexistan sin ninguna interferencia
 * 		Es muy fácil dividir el trabajo en un proyecto basado en objetos. 
 * 		Es posible mapear los objetos en el dominio del problema con los del programa. 
 * 		La ocultación de datos ayuda a crear programas seguros que no pueden ser invadidos por el código 
 * 	  en otras partes del programa. 
 * 		Con el uso de la herencia, podemos eliminar el código redundante y ampliar el uso de las clases existentes.
 * 		El diseño centrado en datos nos permite capturar más detalles del modelo en una forma implementable. 
  
 * 	Clases y Objetos
 * 	----------------
 * 
 * 	Una clase es 
 * 		una entidad que determina cómo se comportará un objeto y qué contendrá el objeto
 * 		define las variables(propiedades) y metodos (funciones) correspondientes a todos los objetos de esa clase
 * 	
 * 	Sintaxis:
 * 
 * 			class <class_name>{
 * 				field; 	// propiedad
 *				method;	// metodo
 *			}
 
 * 	¿Qué es un objeto?  
 * 	------------------
 * 
 * 	Un objeto es un componente que consiste en métodos y propiedades para hacer útil un tipo particular de datos
 * 	El objeto determina el comportamiento de la clase
 * 	Cuando envía un mensaje a un objeto, le pide al objeto que invoque o ejecute uno de sus métodos
 * 	un objeto puede ser una estructura de datos, una variable o una función
 * 	Tiene una ubicación de memoria asignada
 * 	El objeto está diseñado como jerarquías de clase.
 * 
 * 	Para instanciar un objeto:
 * 
 * 		nombre_clase referencia_variable = new nombre_clase();
 * 
 
 * 	Metodos de instancia
 *  --------------------
 *  
 *  Un metodo de instancia es un metodo que necesita un objeto para ser llamado
 *  Un metodo de clase no necesita dicho objeto
 *  	se define agregando la palabra static antes del tipo cuando se crea el metodo
 *  	no pueden acceder a campos de instancia porque los campos van asociados a un objeto
 *  	no pueden invocar un metodo de instancia de la misma clase porque tambien van asociados a un objeto
  
 *	Como llamar a un metodo de clase
 * 	--------------------------------
 * 
 * 	Los metodos son comportamientos de los objetos de la clase
 * 	Se pueden llamar de 2 maneras usando el . 
 * 
 * 		NombreDeLaClase.nombreDelMétodo (parámetros si los hay);
 *		NombreDelObjeto.nombreDelMétodo (parámetros si los hay);
  
 * 	Como crear un objeto
 * 	--------------------
 * 
 * 	Se crean usando el constructor de clase
 * 	Toda clase tiene un constructor por defecto sin parametros
 * 	Ademas de crear el objeto, el constructor hace una copia unica de cada propiedad de clase para ese objeto
 * 
 * 	Sintaxis de constructor:
 * 
 * 		class myClass{
 * 
 * 			myClass(){	//este es el constructor
 * 				...
 * 			}	
 * 		}
 *  
 * 	Sintaxis:
 * 
 * 		ReferenceVariable  ClassName  = new ClassName();
  
 * 	Parametros
 * 	----------
 * 
 * 	Los parámetros o argumentos son una forma de intercambiar información con el método
 * 	Pueden servir para introducir datos para ejecutar el método (entrada)
 * 	Pueden servir para obtener o modificar datos tras su ejecución (salida)
 * 
 * 	Declaración de parámetros
 * 	-------------------------
 * 
 * 	Ejemplos de sintaxis
 * 
 * 			// Sin parametros
 *			public double devuelve(){
 * 				return ...;
 *			}
 *	
 *			// Un parametro, x de tipo double 
 *			public void asigna(double x) {
 *	 			...
 *			}
 *	
 *			// Dos parametros, a y b de tipo int
 *			public int elMayor(int a, int b) {
 *	 			...
 *			}
 *	
 *			// Un parametro, v, array real
 *			public static double sumatorio (double [] v) {
 *	 			...
 *			}
 *		
 *			// Un parámetro de la clase Fecha
 *			public boolean caducado (Fecha fechaLimite) {
 *				...
 *			}
 * 
 * 	El nombre del parámetro se emplea sólo dentro del método para hacer referencia al argumento correspondiente 
 * 	puede coincidir con el de un atributo de la misma clase. 
 * 	Si coincide se dice que oculta a la variable miembro. 
 * 	Esta técnica suele emplearse en los constructores para inicializar una instancia 
 * 
 * 		Ejemplo:
 * 
 * 			class Circulo{
 * 		
 * 				int x;
 * 				int y;
 * 				int radio;
 * 
 * 			public Circulo(int x, int y, int radio){
 * 
 * 				this.x = x;
 * 				this.y = y;
 * 				this.radio = radio;
 * 		
 * 			}
 * 
 * 		En el constructor le pasamos 3 variables: x, y, radio que corresponden con los parametros de la clase
 * 		para referirnos a los parametros de la clase necesitamos usar la palabra: this
 
 * This
 * ----
 * 
 * 	Cuando se llama a un método, se pasa automáticamente un argumento implícito que es una referencia al 
 * objeto invocado (es decir, el objeto sobre el que se llama el método). Esta referencia se llama this. 
 * 
 * 	Se puede usar para:
 *		hacer referencia a una variable de instancia de la clase actual
 *		invocar o iniciar el constructor de la clase actual
 *		se puede pasar como un argumento cuando se llama al metodo
 *		se puede pasar como argumento de la llamada del constructor
 *		se puede usar para devolver la instancia de clase actual
 *
 *	
 *		 
 *
 * 
 * 		Ejemplo:
 */

//Un ejemplo del uso de this
class Potencia {
	double b;
	int e;
	double valor;

	Potencia(double base, int exp) {
		b = base;
		e = exp;
		valor = 1;
		if (exp == 0)
			return;
		for (; exp > 0; exp--)
			valor = valor * base;
	}

	double get_potencia() {
		return valor;
	}
}

class DemoPotencia {
	
	public static void main(String[] args) {
		
		Potencia x = new Potencia(4.0, 2);
		Potencia y = new Potencia(2.5, 1);
		Potencia z = new Potencia(2.7, 2);
		System.out.println(x.b + " elevado a la potencia de " + x.e + ", es igual a: " + x.get_potencia());
		System.out.println(y.b + " elevado a la potencia de " + y.e + ", es igual a: " + y.get_potencia());
		System.out.println(z.b + " elevado a la potencia de " + z.e + ", es igual a: " + z.get_potencia());
	}
}

/*
 * 	Retorno de Valores
 * 	------------------
 * 
 * 	La sentencia return se emplea para salir de la secuencia de ejecución de las sentencias de un método 
 * 	Opcionalmente puede devolver un valor. 
 * 	Tras la salida del método se vuelve al lugar de llamada de dicho método. 
 *
 *		Sintaxis:
 *
 *			return expresion;
 * 
 * 	Ejemplo:
 */

class PruebaCubo {
  public static void main (String [] args){
     System.out.println("El cubo de 7.5 es: " + cubo(7.5)); // llamada
 }

 public static double cubo (double x) {
   // declaracion
   return x*x*x;
  }
}

 /* 
 * 
 * 	Return y void
 *	-------------
 *
 *	En algunas ocasiones, no es necesario que el método tenga que devolver un valor al finalizar su ejecución. 
 *	En este caso, el tipo de dato que debe indicar en la cabecera de declaración del método es el tipo void 
 *	La sentencia return no viene seguida de ninguna expresión. 
 *
 * 		Sintaxis:
 * 
 * 			public void nombre_metodo(){
 * 				codigo
 * 			}
 * 	
 
 * 	Modificadores de Acceso
 * 	-----------------------
 * 
 * 	Uno de los principios básicos de los lenguajes orientados a objetos es la encapsulación
 * 	mediante la encapsulacion se controla el acceso a las propiedades y metodos de una clase
 * 	El acceso a las clases, propiedades y métodos se determina mediante los modificadores de acceso
 * 	En java hay 4 (de mas restrictivo a menos):
 * 
 * 		private		: únicamente la clase 
 * 		por defecto	: solo las clases en el mismo paquete (tambien se llama PACKAGE PRIVATE)
 * 		protected	: las clases del mismo paquete y que heredan de la clase
 * 		public		: es accesible desde cualquier metodo de otra clase
 * 		
 * 	Los modificadores de acceso son una palabra reservada del lenguaje 
 * 	se colocan delante de la propiedad o método
 * 	el modificador de acceso package private (por defecto) no tiene palabra reservada 
 * 	se aplica en caso de que no se especifique un modificador de acceso explícitamente.
 * 
 
 * 	Getters y Setters
 * 	-----------------
 * 
 * 	En Java, los getters y setters son dos métodos tradicionales para recuperar y actualizar valores de variables.
 * 	Su modificador de acceso siempre es public
 * 	
 * 
 * 	Ejemplo de Sintaxis:
 * 
 *			public class SimpleGetterAndSetter {
 *			    private int number;
 *
 *				// esto es un getter
 *			    public int getNumber() {
 *			        return this.number;
 *			    }
 *
 *				// esto es un setter
 *			    public void setNumber(int num) {
 *        			this.number = num;
 *    			}
 *			} 
 *
 * 		Esta clase declara una variable privada Number. 
 * 		Dado que Number es privado, el código fuera de esta clase no puede acceder directamente a las variables.
 * 		Se debe llamar al getter, getNumber () para recibir la informacion de number
 * 		setNumber () para establecer y actualizar variables
 * 
 * 	Para llamar a los getters y setter se debe hacer desde el objeto de clase
 * 
 * 	Ejemplo de sintaxis:
 * 
 * 			SimpleGetterAndSetter obj = new SimpleGetterAndSetter();
 *			obj.setNumber(10);  // OK 
 *			int num = obj.getNumber();  // fine
 *
 *	El esquema de nomenclatura de setter y getter debe seguir las convenciones de nomenclatura de Javabean 
 *	
 *			getXxx() y setXxx (), donde Xxx es el nombre de la variable Xxx. 
 *
 
 *	Constructores
 *	-------------
 *
 *	Un constructor es un elemento de una clase cuyo nombre coincide con el nombre de la clase 
 *	Tiene por objetivo obligar y controlar cómo se inicializa una instancia de una determinada clase
 *	Java no permite que las variables miembro de una nueva instancia queden sin inicializar.
 *	Por defecto toda clase tiene un constructor sin parámetros 
 *	Este constructor por defecto inicializa 
 *		los atributos de tipo primitivo 0 o false, 
 *		mientras que los atributos de tipo objeto (referencia) se inicializan a null.
 *	
 *	Ejemplo:
 *
 *		public class PruebaPrecio {
 *			public static void main(String [] args) {
 *				Precio p;           // Crea una referencia de la clase Precio
 *				p = new Precio();   // Crea el objeto de la clase Precio y realiza
 *		                    		// una llamada al metodo constructor
 *			}
 *		}
 *
 *	Declaracion de un Constructor
 *	-----------------------------
 *
 *	Un constructor debe tener el mismo nombre de la clase
 *	No puede contener un tipo de valor de retorno
 *	La existencia o no de parámetros es opcional. 
 *	
 
 *	Sobrecarga de constructores
 *	---------------------------
 *
 *	Algunas veces hay una necesidad de inicializar un objeto de diferentes maneras. 
 *	Esto se puede hacer usando la sobrecarga de constructor. 
 *	Hacerlo le permite construir objetos de varias maneras.
 *	
 *	La sobrecarga consiste en crear varios constructores con diferentes parametros
 *	El constructor apropiado se llama en función de los parámetros especificados cuando se ejecuta
 *	Al sobrecargar el constructor de una clase conseguimos flexibilidad para construir los objetos. 
 *
 	
 *	Usando this() en sobrecarga de constructores
 *	--------------------------------------------
 *
 * 	La referencia this() se puede utilizar durante la sobrecarga del constructor 
 * para llamar al constructor predeterminado desde el constructor con parametros. 
 * 	Tenga en cuenta que debe ser la primera declaración dentro de un constructor. 
 *
 *	Ejemplo:
 */

	class DemoSCT {
		double largo, ancho, alto;
		int numero;

		// Constructor utilizado cuando todas las dimensiones
		// se especifican
		DemoSCT(double w, double h, double d, int num) {
			largo = w;
			ancho = h;
			alto = d;
			numero = num;
		}

		// Constructor utilizado cuando no se especificaron dimensiones (constructor predeterminado)
		DemoSCT() {
			// Vacio
			largo = ancho = alto = 3;
			System.out.println("estamos en el constructor predeterminado");
		}

		// Constructor utilizado cuando solo se especifica numero
		DemoSCT(int num) {
			//this() se utiliza para llamar al constructor predeterminado
			//desde el constructor con parámetros
			this();
			System.out.println("estamos en el constructor con el parametro int");
			numero = num;
		}

		@Override
		public String toString() {
			return "DemoSCT [largo=" + largo + ", ancho=" + ancho + ", alto=" + alto + ", numero=" + numero + "]";
		}

		public static void main(String[] args) {

			// crear DemoSCT usando solo numero
			DemoSCT DemoSCT1 = new DemoSCT(5);
			
			// obteniendo el valor inicial de largo en DemoSCT1
			System.out.println(DemoSCT1.toString());
		}
	}

/*
 *	Sobrecarga de Métodos
 *	---------------------
 *
 *	Se pueden tener varios metodos con el mismo nombre si tienen diferentes parametros
 *  Esto resulta util cuando se desea llevar a cabo la misma tarea en difererente número o tipos de variables. 
 *  La sobrecarga (overloading) de los métodos puede resultar muy útil al efectuar llamadas a un método, 
 * ya que en lugar de tener que recordar identificadores de métodos distintos, basta con recordar uno sólo. 
 *  El compilador se encarga de averiguar cuál de los métodos que comparten identificador debe ejecutar.
 * 
 * 	Ejemplo:
 */
	
class PruebaSobrecargaMetodo {
	public static void main(String[] args) {
		int a = 34;
		int b = 12;
		int c = 56;
		
		System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		
		// El primer método
		System.out.println("El mayor de a y b es: " + mayor(a, b));
		
		// El segundo método
		System.out.println("El mayor de a, b y c es: " + mayor(a, b, c));
	}

	// Definicion de mayor de dos numeros enteros
	public static int mayor(int x, int y) {
		return x > y ? x : y;
	}

	// Definicion de mayor de tres numeros enteros
	public static int mayor(int x, int y, int z) {
		return mayor(mayor(x, y), z); 				// aqui llamamos al metodo mayor(int x, int y) 2 veces
	}
}
	
/* 
 * 
 * 
 */




public class IndiceApuntes {

	public static void main(String[] args) {

	}

}
