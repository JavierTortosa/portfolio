package seccion2_tiposDeDatos;

/*
 * ----------------------------
 * TIPOS DE DATOS - TIPO OBJETO
 * ----------------------------
 * 
 * ---------------------
 * Creacion de un Objeto
 * ---------------------
 * 
 * Se crean con el operador new seguido del nombre de la clase
 * Se devuelve una referencia al objeto que se guarda en una variable de la clase
 * los objetos se crean para poder hacer uso de los metodos de una clase
 * 
 * ej.
 * 		Clase1 c 	= new Clase1();			// Crea un objeto llamado c de tipo Clase1
 * 		String s 	= new String("Hola");	// Crea un objeto llamado s de tipo String y que vale "Hola"
 * 		Object ob 	= new Object();			// Crea un objeto llamado ob de tipo Object
 * 
 * la parte de la derecha despues del new es el constructor -> "Clase1()"
 * un constructor es un bloque de codigo que se ejecuta cuando se crea el objeto
 * el constructor se llama igual que el nombre de la clase
 * 
 * Sintaxis del constructor: 
 * 
 * 		public nombre_de_la_clase(parametros){
 * 			//codigo constructor
 * 		}
 * 
 * todas las clases tienen un constructor vacio por defecto
 * nosotros podemos crear nuestros propios constructores
 * dentro de los parentesis del constructor van los parametros
 * si creamos un constructor el constructor por defecto desaparece
 * podemos crear varios constructores en funcion de los parametros que mandamos, esto es la sobrecarga
 * 
 * ej.
 * 	
 * 	class MiClase{
 * 		public MiClase(){				// este es el constructor
 * 			//codigo del constructor	// aqui pondremos el codigo propio del constructor
 * 		}
 * 	
 *  	public MiClase(int i){			// sobrecarga del constructor. aqui le pasamos el parametro int i
 *  		//codigo del constructor
 *  	}
 * }
 * 
 * 	public static void main (String [] args){	
 * 		MiClase mc;						// aqui instanciamos el objeto	
 * 		mc = new MiClase(); 			// aqui creamos el objeto y llamamos al constructor
 * 		MiClase mc1 = new MiClase(25); 	//aqui creamos el objeto llamando al constructor con un parametro int
 * 	}
 *  
 * los constructores se veran mas adelante en profundidad
 * 
  
 * ------------------------
 * Destruccion de un Objeto
 * ------------------------
 * 
 * La gestion de la memoria no la gestionamos nosotros. 
 * Uno de los procesos de gestion de memoria es destruir objetos 
 * Los objetos son destruidos de la memoria por el Garbage Collector
 * El Garbage Collector es un proceso de la Maquina Virtual de Java (JVM)
 * El Garbage Collector es un metodo que no podemos controlar.
 * Durante la vida del objeto es marcado para recoleccion (destruccion)
 * Un objeto es elegido para recoleccion cuando no hay referencias al mismo
 * Cuando un objeto es llamado para recoleccion la JVM llama al metodo finalize() del objeto.
 * EL METODO FINALIZE SE PUEDE LLAMAR 1 O NINGUNA VEZ DURANTE LA VIDA DEL OBJETO. NUNCA MAS DE 1.
  
 * ----------------------------------------------------------
 * Marcado de objetos para recoleccion(destruccion) - Ejemplo
 * ----------------------------------------------------------
 *
 * 1. public void metodo(){
 * 2. 	Object ob1 = new Object(); // objeto1
 * 3.	Object ob2 = new Object(); // objeto2
 * 4.	ob1 = ob2; //objeto1 a recoleccion
 * 5.	ob2 = null;
 * 6. } // objeto2 a recoleccion
 * 
 * 
 * 
 * 
 */

public class V04_TiposDeDatosObjeto {

}
