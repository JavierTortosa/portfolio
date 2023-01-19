package seccion7_LambdasStreams;

import java.util.ArrayList;
import java.util.List;

/*	 Expresiones Lambda
 * 	 ------------------
 * 
 * 	 Interfaz funcional
 * 	 ------------------
 * 
 * 	 Es una interfaz que solo proporciona un unico metodo abstracto
 * 	 Es habitual que tengan una anotacion:
 * 
 * 				@FunctionalInterface
 * 
 * 	 Esta anotacion no es obligatoria. 
 * 	 De todas formas, si solo tiene un metodo abstracto es una interfaz funconal
 * 
 * 		public interface Runnable{
 * 			void Run();						//metodo abstracto
 *		}
 * 
 * 		public interface Inter1{
 * 			void met(int data);				//metodo abstracto
 * 			default int res(){return 1;}	//metodo default (esto son 3 lineas)
 * 		}
 * 
 * 		public interface Inter2{			
 * 			boolean process(int n, String pt);//metodo abstracto
 * 			static void print(){}			//metodo estatico vacio
 * 		}
 * 
  
 *	 Que es una expresion Lambda
 *	 ---------------------------
 *
 *	 Es una implementacion de una interfaz funcional
 *	 Nos evita:
 *		Crear una clase con la implementacion de la interfaz
 *		Crear el metodo de la interfaz en la clase
 *		Crear un objeto de dicha clase para por fin poder usar el metodo de la interfaz
 *	 Proporciona el codigo del unico metodo de la interfaz funcional
 *	 Genera un objeto que implementa dicha interfaz:
 *
 *	 	Inter1 i1 = (a) -> System.out.println(a);
 *		
 *			Inter1 								: tipo
 *			i1									: variable del objeto
 *			(a) -> System.out.println(a);		: expresion lambda
 *
 *				(a)								: parametro del metodo de la interfaz
 *				->								: identificador "a partir de aqui esta el codigo del metodo"	
 *				System.out.println(a); 			: codigo del metodo de la interfaz
 *
 *	 Para llamar al objeto del metodo de la interfaz
 *
 *		i1.met(100);
 *
 *			i1 es el objeto que hemos creado
 *			met(100) es el nombre del metodo de la interfaz que necesita un parametro int 
 *
 *		Esta llamada imprimira por consola el numero 100
 *
 *	 Ejemplo:
 */

interface Inter1{
	void met(int data);												//metodo abstracto
	default int res(){return 1;}									//metodo default (esto son 3 lineas)
	static void print(){											//metodo static
		System.out.println("Esto es el metodo estatico");
	}
}

class PruebaLambdaInter1_1 {
	public static void main(String[] args) {
		
		Inter1 i1;
		i1= (a) -> System.out.println(a);							//implementacion de la interfaz
		i1.met(100);
		i1 = (a) -> System.out.println("nueva implementeacion "+a);	// nueva implementacion de la interfaz
		i1.met(150);
		System.out.println(i1.res());								//implementacion del metodo default
		Inter1.print(); 											// implementacion del metodo static 
	}
}

/*	 Sintaxis de una expresion lambda
 * 	 --------------------------------
 * 
 * 	 Una expresion lambda tiene 2 partes
 * 		La lista de parametros del metodo
 * 		La implementacion 
 * 		
 * 				parametros -> implementacion;
 * 
 * 	 Los parametros pueden indicar o no el tipo
 * 	 La lista de parametros se pueden indicar entre parentesis o no
 * 		Si son multiples parametros o se indica el tipo son obligatorios
 * 		Si en un parametro se indica el tipo hay que indicarlo en todos
 * 	 Si la implementacion es una sola instruccion no se ponen llaves
 * 	 Si es mas de 1 instruccion las llaves son obligatorias
 * 	 Despues de las llaves hay que poner ";"
 * 	 En caso de devolver un resultado se puede omitir el return si la implementacion es 1 sola instruccion
 * 	 
 
 *	 Ejemplos de lambdas:
 *	 --------------------
 *
 *				CORRECTAS									INCORRECTAS
 *				---------									-----------
 *
 * 	 1.			() -> 3;									->3
 * 
 * 	 2.			(int a) -> System.out.println("Hola");		(int a) -> System.out.println("Hola");
 * 
 * 	 3.			x -> x*x;									x -> return x*x; //si pones return se ponen llaves
 * 
 * 	 4.			x -> {return x*x;};
 * 
 * 
 * 	 5.			(n1, n2) -> {								n1,n2 -> System.out.println(n1 + n2);
 * 					n1+=20;
 * 					System.out.println(n1 + n2);
 * 				} 
 */ 
  
interface Inter1_2{
	int met(int data);												//metodo abstracto
	default int res(){return 1;}									//metodo default (esto son 3 lineas)
	static void print(){											//metodo static
		System.out.println("Esto es el metodo estatico");
	}
}

class PruebaLambdaInter1_2 {
	public static void main(String[] args) {  	
		Inter1_2 i2 = (int a) -> {return a*a;};
		System.out.println(i2.met(10));
		i2 = a -> {
			a = a*2;
			System.out.println("esta es una implementacion");
			return a*a;
		};
		System.out.println(i2.met(10));
	}
}

interface Inter1_3{
	void met3();														//metodo abstracto
}

class PruebaLambdaInter1_3 {
	public static void main(String[] args) {
		Inter1_3 i3;
		i3 = () -> System.out.println("hago lo que me da la gana");
		i3.met3();
	}
}

/*	 Revision de conceptos
 * 	 ---------------------
 * 
 * 		Relaciona las interfaces de la izquierda con su lambda de la derecha
 * 
 * 		1. interface I1 {int m1(String a);}					3. ()-> System.out.println("Hello");
 * 
 * 		2. interface I2 {int m2(int a, int b);}				1. x -> x.length();
 * 
 * 		3. interface I3 {void m3();}						4. s -> s + "by";
 * 
 * 		4. interface I4 {String m4 (Integer x);}			2. (x,y) -> x+y;
 * 
 
 *	 Inferencia de tipos
 *	 -------------------
 *
 * 	 Es posible inferir el tipo en los parametros de las expresiones lambda
 * 
 * 				(var a) -> System.out.println(a);
 * 
 * 	 Aunque no se puede combinar inferencia de tipos y tipos especificos en una misma expresion
 * 
 * 				(var a, int c) -> a+c;	//ERROR de compilacion
 * 
 * 	 Que utilidad tiene si ya es posible no indicar el tipo en los parametros?
 * 
 * 				(@NotNull var c) -> ...	// OK
 * 				(@NotNull c) -> ...		// ERROR de compilacion
 * 
 
 *	 Comparator con lambdas
 *	 ----------------------
 *
 * 	 Interfaz utilizada para la ordenacion de colecciones y arrays
 * 	 Al ser funcional, se puede implementar con lambdas
 * 
 * 	 Ejemplo:
 */

class PruebaLambdaComparator{
	public static void main(String[] args) {
		List<String> texto = new ArrayList<>();
		texto.add("Mi texto"); texto.add("Texto"); texto.add ("Texto mas largo");
		//ordenacion de lis lista de textos por longitud
		texto.sort((a,b) -> a.length()-b.length());
		
		/*	 La clase List tiene el metodo sort que utiliza la interfaz comparator
		 * 
		 * 			sort​(Comparator<? super E> c)
		 * 
		 *   La interfaz Comparator tiene el metodo compare que recibe 2 parametros para la ordenacion
		 *  		
		 *   Con esta lambda pasamos los 2 parametros al metodo compare de comparator y haciendo la resta
		 *  definimos el orden
		 *  
		 *  		texto.sort((a,b) -> a.length()-b.length());
		 *  
		 *   En un ejemplo anterior hicimos lo mismo pero creando una clase que implementaba comparator
		 */
		
		//recorrido y presentacion de datos
		for (String s:texto) {
			System.out.println(s);
		}
	}
}

/* 	 Revision de conceptos
 * 	 ---------------------
 * 
 * 	 Dada la siguiente lista, mostrar los nombres de las personas ordenadas por edad
 * 
 * 		List <Persona> personas = new ArrayList<> (List.of(new Persona("marco",34),
 *				new Persona("ana", 28),
 *				new Persona("bea",41)));
 */

class Persona {
	private String nombre;
	private int edad;
	private int dni;
	private String mail;
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public Persona(String nombre, int edad, int dni) {
		this.nombre=nombre;
		this.edad = edad;
		this.dni=dni;
	}
	
	public Persona(String nombre, int edad, String mail) {
		this.nombre=nombre;
		this.edad = edad;
		this.mail=mail;
	}
	
	public Persona(String nombre, int edad, int dni, String mail) {
		this.nombre=nombre;
		this.edad = edad;
		this.dni = dni;
		this.mail=mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	@Override
	public String toString() {
		return "" + nombre + ", edad=" + edad + ", dni=" + dni + ", mail=" + mail + "";
	}


	
	
}

class PruebaOrdenacion {
	public static void main(String[] args) {
		List <Persona> personas = new ArrayList<> (List.of(new Persona("marco",34),
				new Persona("ana", 28),
				new Persona("bea",41)));
		
		personas.sort((a,b) -> a.getEdad()-b.getEdad());
		
		for (Persona p:personas) {
			System.out.println(p.getNombre() + " " + p.getEdad());
		}
		
		System.out.println("\n---------------- \n");
		
		personas.sort((a,b) -> a.getNombre().compareTo(b.getNombre()));
		
		for (Persona p:personas) {
			System.out.println(p.getNombre() + " " + p.getEdad());
		}
	}
}

public class V59_Lambdas {

	public static void main(String[] args) {
		
	}
}
