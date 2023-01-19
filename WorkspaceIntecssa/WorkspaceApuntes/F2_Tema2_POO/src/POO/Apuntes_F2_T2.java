package POO;

import java.util.Calendar;

/*
 * 	POO
 * 	----
 * 
 * 	Herencia:
 * 	---------
 * 
 * 	Es el mecanismo por el cual una clase permite heredar las características (atributos y métodos) de otra clase
 * pudiendo al mismo tiempo añadir atributos y metodos propios		
 * 
 * 	una clase que se hereda se denomina superclase 	(clase padre). 
 * 	La clase que hereda se llama subclase. 			(clase hija).
 * 	Una subclase es una versión especializada de una superclase. 
 * 	Hereda todas las variables y métodos definidos por la superclase y agrega sus propios elementos únicos.
 * 
 * 	Superclase
 *	La clase cuyas características se heredan (o una clase base o una clase principal). 
 *
 *	Subclase
 *	La clase que hereda (o una clase derivada, clase extendida o clase hija). 
 *	La subclase puede agregar sus propios campos y métodos además de los campos y métodos de la superclase
 *
 *	Reutilización
 *	cuando queremos crear una clase nueva y ya hay una clase que incluye parte del código que queremos, 
 *	podemos derivar nuestra nueva clase de la clase existente. 
 *	Al hacer esto, estamos reutilizando los campos/atributos y métodos de la clase existente.  
 * 
 *	Para heredar una clase se hace con la palabra extends
 * 
 * 	Sintanxis
 * 
 * 		class nombre_clase extends nombre_clase_padre{}
 * 
 * 	Ventajas de la herencia
 * 	-----------------------
 * 		 Evita tener que reescribir metodos definidos en otras clases reutilizandolos
 * 		 A la hora de mantener el codigo, podemos heredar una clase existente para crear nuestros propios metodos
 * 		sin necesidad de modificar la clase previa facilitando el mantenimiento.
 * 		 
 
 * 	Control de acceso
 * 	-----------------
 * 
 * 	Si heredamos una variable declarada como private, no tendremos acceso a ella en la clase hija
 * 	Para tener acceso a la variable privada podemos hacerlo a traves de los getters y setters
 * 
 * 	Ejemplo:
 */

class Padre{
	private int variablePrivada;

	public int getVariablePrivada() {
		return variablePrivada;
	}

	public void setVariablePrivada(int variablePrivada) {
		this.variablePrivada = variablePrivada;
	}
}

class Hija extends Padre{
	
	public Hija() {
		valorVariablePrivada();
		muestraVariablePrivada();
	}
	
	public void valorVariablePrivada() {
		setVariablePrivada(20);
	}
	
	public void muestraVariablePrivada() {
		System.out.println(getVariablePrivada());
	}
}

class PruebaControlDeAcceso{

	public static void main(String[] args) {
		
		Hija hija = new Hija(); // aqui nos muestra el valor por el constructor de la clase
		hija.muestraVariablePrivada(); // aqui nos muestra el valor invocado explicitamente
	}
}
 /* 	
 * 	Polimorfismo
 * 	------------
 * 
 * 	es la capacidad que tiene un objeto de ofrecer diferentes respuestas en funcion de unos parametros.
 * 	La idea es que la clase padre sea mas generica y cada hijo sea mas especifico
 * 
 * 	Ejemplo:
 * 					Transporte
 * 						Automovil
 * 							VehiculosPesados
 * 								Camion
 * 					
 * 	Se trata de sobreescribir un metodo del padre para adaptarlo a cada uno de los hijos.
 * 	Cuando se llama a un objeto de la clase padre pero creado con el constructor de los hijos:
 * 		
 * 		Todos los objetos son del tipo del padre PERO muestran el metodo sobreescrito del hijo
 * 
 * 	Ejemplo:
 * 
 * 		creamos cuatro clases, un padre (Empleado), y los hijos (Operario, Jefe, Supervisor)
 * 		en cada una de las clases sobreescribimos el metodo (rol()) que va a decir quien es
 */ 	

class Empleado{
	public void rol() {
		System.out.println("soy un empleado");
	}
}

class Operario extends Empleado{
	public void rol() {
		System.out.println("soy un operario");
	}
}

class Jefe extends Empleado{
	public void rol() {
		System.out.println("soy un jefe");
	}
}

class Supervisor extends Empleado{
	public void rol() {
		System.out.println("soy un Supervisor");
	}
}

class pruebaPolimorfismo{
	public static void main(String[] args) {
		
		// con el polimorfismo creamos los objetos partiendo de la clase padre (Empleado)
		// usando el constructor de los hijos 
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Operario();
		Empleado empleado3 = new Jefe();
		Empleado empleado4 = new Supervisor();
				
		//llamamos al mismo metodo comun entre el padre y los hijos
		empleado1.rol();  
		empleado2.rol();  
		empleado3.rol();  
		empleado4.rol();  
	}
}

/* 
 * 	Tipos de polimorfismo
 * 	---------------------
 * 
 * 	Sobrecarga
 * 	----------
 * 	El más conocido
 * 	se aplica cuando existen funciones con el mismo nombre en clases que son completamente independientes 
 * 	El ejemplo anterior es de sobrecarga
 * 
 * 	Parametrico
 * 	-----------
 * 	Existen funciones con el mismo nombre pero se usan diferentes parámetros (nombre o tipo). 
 * 	La conversion automatica solo se lleva a cabo si no hay coincidencias directas
 * 	Se selecciona el método dependiendo del tipo de datos que se envíe. 
 * 	Este tipo de polimorfismo tambien se conoce como polimorfismo en tiempo de compilacion
 * 	El ejemplo tipico son los constructores... Se aplica igual a los metodos
 * 
 * 	Ejemplo:
 */

class Parametrico{
	
	void demo(int a) {
		System.out.println("int a= " + a);
	}
	
	void demo(double a) {
		System.out.println("double a= " + a);
	}
	
	void demo(int a, int b) {
		System.out.println("int a= " + a +" y int b= " + b);
	}
}

class PolimorfismoParametrico{
	public static void main(String[] args) {
		
		Parametrico objeto = new Parametrico();
		
		// se selecciona el metodo a utilizar en funcion de los parametros dados
		objeto.demo(25.5);
		objeto.demo(250);
		objeto.demo(2, 8);
		
	}
}

/* 
 * 	Inclusion
 * 	Es cuando se puede llamar a un método sin tener que conocer su tipo
 * 	no se toma en cuenta los detalles de las clases especializadas, utilizando una interfaz común. 
 * 	
  
 * 	Interfaces
 * 	----------
 * 
 * 	Una interfaz (interface) es sintácticamente similar a una clase abstracta
 *	se pueden especificar uno o más métodos que no tienen cuerpo ({}). 
 *	Esos métodos deben ser implementados por una clase para que se definan sus acciones.
 *	Las variables son public final static siempre
 *	 
 * 	
 * 	La principal diferencia entre interface y abstract es que un interface proporciona un mecanismo de encapsulación 
 * de los protocolos de los métodos sin forzar al usuario a utilizar la herencia.
 * 	
 * 	Ventajas
 *
 *	El uso de las interfaces Java proporciona las siguientes ventajas:
 * 
 *		Organizar la programación.
 *		permiten declarar constantes que van a estar disponibles para todas las clases implementando esa interfaz
 *		Obligar a que ciertas clases utilicen los mismos métodos (nombres y parámetros).
 *		Establecer relaciones entre clases que no estén relacionadas.
 * 
 * 	Para trabajar con las interfaces necesitamos primero declararlas y luego implementarlas en un clase
 * 
 * 	Sintaxis de creacion
 * 
 * 			modificador_acceso interface nombre_interface {
 * 
 * 				metodo_a_implementar();
 * 
 * 			}
 * 
 * 	Sintaxis implementacion
 * 
 * 			modificador_acceso class nombre_clase implements nombre_interface{}
 * 
 * 	Ejemplo:
 * 	--------
 */

interface Series{	//creamos la interface
	//si implementamos esta interface debemos incluir estos metodos
	//OJO! ABAN CON PUNTO Y COMA(;), NO TIENEN CUERPO
	int getSiguiente();	
	void reiniciar();
	void setComenzar(int x);
}

class EjemploInterface implements Series{
	
	int iniciar;
	int valor;
	
	public EjemploInterface() {
		iniciar = 0;
		valor =	0;
	}

	public EjemploInterface(int iniciar, int valor) {
		this.iniciar = iniciar;
		this.valor = valor;
	}

	// METODOS CREADOS POR IMPLEMENTAR LA INTERFACE
	@Override
	public int getSiguiente() {
		valor =+2;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
	}
}

 /* 
 * 	ENUMS
 * 	-----
 * 
 * 	Es una clase especial que limita la creacion de objetos a los especificados en la clase
 * 	Si tiene un constructor debe ser privado para no poder crear objetos de esta clase
 * 	
 * 	Ejemplo:
 * 		podemos crear una clase enum con la demarcacion de los jugadores en un equipo de futbol
 */

enum Demarcacion{
			PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
// ordinal:		0		1			2				3
// esto en realidad es un array de objetos... cada elemento tiene su posicion ordinal
			
}

class EjemploEnum{
	public static void main(String[] args) {
		Demarcacion del = Demarcacion.DELANTERO;
		del.name();
		del.toString();
		del.ordinal();
		Demarcacion.values();
		
		Demarcacion defensa = Demarcacion.CENTROCAMPISTA;
		
		System.out.println("delantero name: "+ del.name());
		System.out.println("defensa.toString()= "+defensa.toString());
		System.out.println("delantero.ordinal = " + del.ordinal());
		
		
		System.out.println("delantero compareTo("+defensa.toString()+") = " + del.compareTo(defensa));
		//devuelve el resultado 2 que es la diferencia entre la posicion 1(DEFENSA) y la 3 (DELANTERO)
		// compareTo devuelve la cantidad de posiciones que hay de diferencia entre el objeto y lo que comparamos
		
	}
}

 /* 
 * 	Clases Abstractas
 * 	-----------------
 * 
 * 	Clases abstractas son aquellas que Puede declarar la existencia de metodos pero no la implementacion ( {...} )
 * 	Una clase abstracta funciona como una clase normal con algunas diferencias:
 * 		No se permite la creación de objetos. 
 * 		Se debe utiliza la palabra clave abstract.
 * 		Si una clase hija hereda de una clase abstracta debe implementar los metodos del padre 
 * 		Si no se da funcionalidad a los metodos heredado tambien debe ser abstracta
 * 	
 * 	Una superclase permite unificar campos y métodos de las subclases
 * 	Evita la repetición de código y unificando procesos. 
 * 	Si una clase solo sirve para unificar datos u operaciones de subclases, puede declararse como clase abstracta. 
 * 
 * 	Sintaxis:
 * 				public abstract class NombreDeLaClase { … }
 * 
 * 	Declarar una clase abstracta es distinto a tener una clase de la que no se crean objetos. 
 * 		En una clase abstracta, no existe la posibilidad. 
 * 		En una clase normal, existe la posibilidad de crearlos aunque no lo hagamos.
 * 	Si una clase no se declara usando abstract se cataloga como “clase concreta”.
 * 	
 * 	Las clases abstractas suelen contener métodos abstractos
 * 		Para que un método se considere abstracto ha de incluir en su signatura la palabra clave abstract. 
 * 		Además un método abstracto tiene estas peculiaridades:
 * 			 No tiene cuerpo (llaves): sólo consta de signatura con paréntesis.
 *			 Su signatura termina con un punto y coma. 
 *			 Sólo puede existir dentro de una clase abstracta. 
 *			 De esta forma se evita que haya métodos que no se puedan ejecutar dentro de clases concretas. 
 *			 si una clase incluye un método abstracto, forzosamente la clase será una clase abstracta. 
 *			 Los métodos abstractos forzosamente habrán de estar sobreescritos en las subclases. 
 *			 Si una subclase no implementa un método abstracto de la superclase, se tendra que declarar 
 *			abstracta tambien
 *			 Para que la subclase sea concreta habrá de implementar métodos sobreescritos para todos los 
 *			métodos abstractos de sus superclases.
 * 
 * 	Metodos Abstractos
 * 	------------------
 * 
 * 	Un metodo abstracto nunca sera ejecutado porque no tiene cuerpo
 * 	¿Qué utilidad tiene un método abstracto? 
 * 		Podemos ver un método abstracto como una palanca que fuerza dos cosas: 
 * 			la primera, que no se puedan crear objetos de una clase. 
 * 			La segunda, que todas las subclases sobrescriban el método declarado como abstracto.
 * 
 * 	Ejemplo de Clases y metodos Abstractos
 * 
 * 		vamos a crear 4 clases:
 * 
 * 		Persona
 * 		abstract Profesor extends persona
 * 			dentro de Profesor creamos un metodo abstracto importeNomina() que se debera sobreescribir en los hijos
 * 		ProfesorTitular extends Profesor
 * 		ProfesorInterino extends Profesor
 * 
 */

class Persona{
	private String nombre;
	private String apellido;
	private int edad;
	
	// Constructores

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Persona() {
		this.nombre="";
		this.apellido="";
		this.edad=0;
	}

	// Getters y Setters 
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// toString() 
	
	@Override
	public String toString() {
		//return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
		Integer DatoEdad = edad;
		return "Nombre: ".concat(nombre).concat(" -Apellidos: ").concat(apellido).concat(" -Edad: ".concat(DatoEdad.toString()));
	}
}

abstract class Profesor extends Persona{
	
	private String idProfesor;
	
	// Constructores
	
	protected Profesor() {
		super();
		idProfesor = "Desconocido";
	}
	
	protected Profesor(String nombre, String apellido, int edad, String idProfesor) {
		super(nombre, apellido, edad);
		this.idProfesor=idProfesor;
	}

	// Getters y Setters 
	
	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public void mostrarDatos() {
		System.out.println("Datos Profesor. Profesor de Nombre: "+ getNombre()+" "+
				getApellido()+" "+" con id de profesor: "+getIdProfesor());
	}

	// toString() 
	
	@Override
	public String toString() {
		
		return  super.toString().concat(" -IdProfesor: ").concat(idProfesor);
	}
	
	// declaracion del metodo abstracto
	
	abstract public float importeNomina();
}

// clase Profesor Titular

class ProfesorTitular extends Profesor{
	
	public ProfesorTitular(String nombre, String apellido, int edad, String idProfesor) {
		super(nombre, apellido, edad, idProfesor);
	}

	// importeNomina
	
	@Override
	public float importeNomina() {
		
		return 30f*43.20f;
	}
}

class ProfesorInterino extends Profesor{
	
	private String fechaComienzoInterinidad;
	
	// Constructores
	
	public ProfesorInterino(String fechaComienzoInterinidad) {
		super();
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}

	public ProfesorInterino(String nombre, String apellido, int edad, String idProfesor, String fechaComienzoInterinidad) {
		super(nombre, apellido, edad, idProfesor);
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}

	// Getters y Setters
	
	public String getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	}

	public void setFechaComienzoInterinidad(String fechaComienzoInterinidad) {
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}

	// toString
	
	@Override
	public String toString() {
		return super.toString().concat(" Fecha Comienzo Interinidad: " + fechaComienzoInterinidad.toString());
	}

	// importeNomina
	
	@Override
	public float importeNomina() {
		return 35f*35.60f;
	}
}

class EjemploClasesAbstractas {

	public static void main(String[] args) {

		ProfesorInterino pi = new ProfesorInterino("pepe", "carmona", 25, "1", "25/01/2020");
		ProfesorTitular pt = new ProfesorTitular("paco", "pill", 30, "2");
		
		Profesor ppi = new ProfesorInterino("fidel", "castro", 40, "3", "25/01/2010");
		Profesor ppt = new ProfesorTitular("antonio", "abbot", 28, "4");
		
		System.out.println(pi +" " + pi.importeNomina());
		System.out.println(pt +" " + pt.importeNomina());
		System.out.println(ppi+" " + ppi.importeNomina());
		System.out.println(ppt+" " + ppt.importeNomina());
		
	}
}

/*
 * 	Sobreescritura de Metodos
 * 	-------------------------
 * 
 * 	La sobreescritura de métodos constituye la base de uno de los conceptos más potentes de Java: 
 * 		la selección dinámica de métodos, 
 * 			la llamada a un método sobrescrito se resuelve durante el tiempo de ejecución y no en el de compilación. 
 * 	
 * 	Cuando se llama a un método sobrescrito a través de una referencia a una superclase, 
 * Java determina qué versión de este método debe ejecutarse en función del tipo de objeto al que se hace referencia
 * en el momento de hacerse la llamada.
 * 
 * 	Cuando se hace referencia a diferentes tipos de objetos, se llama a diferentes versiones del método sobrescrito. 
 * 	Lo que determina la versión del método que será ejecutado es el tipo de objeto al que se hace referencia 
 * y no el tipo de variable de referencia. 
 * 	Si una superclase contiene un método sobrescrito por una subclase, cuando se haga referencia a diferentes 
 * tipos de objetos mediante una variable de referencia de una superclase, se ejecutarán diferentes versiones 
 * del método.
 * 	
 * 	Ejemplo:
 * 
 * 		Creamos 3 clases:
 * 			Figura
 * 			Rectangulo extends Figura
 * 			Triangulo extends Figura
 * 
 * 		en Figura creamos el metodo area, que como no sabemos que figura es nos devuelve area =0;
 * 		en triangulo y rectangulo sobreescribimos el metodo area()
 * 
 * 		En el main creamos un objeto de cada clase (Figura, Rectangulo y Triangulo)
 * 		Ademas creamos un objeto de la clase figura (figref) que igualaremos a los objetos que hemos creado
 * 		segun el objeto al que hace referencia figref se ejecuta un metodo area u otro.
 */

class Figura{
	double dim1;
	double dim2;
	
	public Figura(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	double area() {
		System.out.println("Area de figura indefinida.");
		return 0;
	}
}

class Rectangulo extends Figura{
	
	Rectangulo (double a, double b){
		super(a,b);
	}
	
	double area() {
		System.out.println("Del rectangulo ");
		return dim1 * dim2;
	}
}

class Triangulo extends Figura{
	
	Triangulo (double a, double b){
		super(a,b);
	}
	
	double area() {
		System.out.println("Del triangulo ");
		return (dim1 * dim2)/2;
	}
}

class EjemploSobreescritura{
	public static void main(String[] args) {
		// creamos los objetos
		Figura 		miFigura 		= new Figura(12,12);
		Rectangulo 	miRectangulo 	= new Rectangulo (12,12);
		Triangulo 	miTriangulo 	= new Triangulo (12,12);
		
		// instanciamos figref
		Figura figref;
		
		// igualamos figref al objeto de Figura 
		figref = miFigura;
		System.out.println("El area es = "+ figref.area()); // se ejecuta area de Figura
		
		// igualamos figref al objeto de Rectangulo 
		figref = miRectangulo;
		System.out.println("El area es = "+ figref.area()); // se ejecuta area de Rectangulo
		
		// igualamos figref al objeto de Triangulo
		figref = miTriangulo;	
		System.out.println("El area es = "+ figref.area()); // se ejecuta area de Triangulo
	}
}

public class Apuntes_F2_T2 {

	public static void main(String[] args) {
	}
}