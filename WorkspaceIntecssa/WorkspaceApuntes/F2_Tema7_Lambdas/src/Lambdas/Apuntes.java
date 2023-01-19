package Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* 	EXPRESIONES LAMBDAS
 * 	-------------------
 * 
 * 	Las funciones lambdas es un término adoptado de la programación funcional 
 *  Corresponden con funciones de Java que normalmente son anónimas y se escriben en línea allí donde se usan. 
 * 
 * 	Como cualquier función recibe cero o más argumentos 
 *  Devuelven uno o ningún valor de retorno. 
 *  Puede consumir métodos de otras clases y objetos.
 * 
 * 	Al declararse al mismo tiempo en donde se usa, 
 * 		puede acceder a las variables locales del ámbito al que pertenece, 
 * 		sólo podrá usar estos como valores de sólo lectura, 
 * 
 * 	Existen a partir de la versión Java 8, por lo que no es posible usar su sintaxis en versiones anteriores. 
 * 	Sus entidades principales están contenidas en el package java.util.funcional
 * 	simplemente es una manera más compacta de escribir código Java. 
 * 	Se puede decir de manera resumida que una función lambda es como una clase con un único método público. 
 * 
 * 	java.util.functional
 * 	--------------------
 * 
 * 	entidades básicas que componen esta manera de programar:
 * 	interfaces con un único método que debe implementar el programador 
 * 	estas implementaciones pueden hacerse llegar como argumentos de métodos de otras muchas clases del API de Java.
 * 	
 * 	Las interfaces funcionales más importantes contenidas en java.util.functional son:
 * 
 * 	Supplier<T>: 
 * 	esta función se debe utilizar cuando se necesiten generar objetos sin requerir argumentos. 
 * 	Por ejemplo para realizar una inicialización perezosa.
 * 
 * 	Consumer<T> 
 * 	esta en cambio es el opuesto de Supplier ya que consume, 
 * 	acepta como argumento el tipo T sin devolver ningún valor de retorno.
 *
 * 	Function<T,R> 
 * 	esta interfaz permite definir una función que acepta un parámetro de tipo T y devuelve un resultado del tipo R 
 * pudiendo aplicarle alguna transformación u operación.
 * 
 * 	BiFunction<T,R,S> 
 * 	esta interfaz permite definir una función que acepta dos parámetros de tipo T y R, 
 * 	devolviendo un resultado del tipo S. 
 * 	Normalmente serán operaciones de agregación u operadores binarios como la suma, resta, etc..
 * 
 * 	Predicate<T> 
 * 	la interfaz predicado debe devolver forzosamente un boolean dado un objeto de tipo T, 
 * normalmente utilizado para filtrar elementos de una colección.
 * 
 * 	El paquete incluye más interfaces pero estas son las más básicas.
 * 
 * 	La sintaxis cambia un poco respecto a Java tradicional, 
 *  Se intentan no escribir los tipos de las variables siempre y cuando no se cree alguna ambigüedad
 *  
 *  Ejemplo:
 * 
  		Function<String,Integer> sizeOf = (String s) -> {
    	return s.length();
		};


		Function<String,Integer> sizeOf =  s -> s.length();
		
 * 	En ambos casos se está definiendo una función que dado un String devolverá la longitud de la cadena de caracteres 
 * que almacene. 
 * 	Fíjese que el tipo de la variable de s se infiere automáticamente de los tipos utilizados en sizeOf 
 * y que la palabra reservada return no es necesaria, siempre y cuando no haya más de una sentencia en la función.
 * 
 * 	Ejemplo de funcion lambda y como reutilizarla
 */
 
class Persona{
	String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}
}

class DemoLambda {
	
	public static void main(String[] args) {
		
		List <Persona> personas = new ArrayList<>();
		personas.add(new Persona("pepe"));
		personas.add(new Persona("paco"));

		
		//personas.sort((t,r) -> t.nombre.compareTo(r.nombre)); // esta instruccion se puede reutilizar guardandola 
		Comparator<Persona> com = (t,r) -> t.nombre.compareTo(r.nombre); // en una variable
		
		personas.sort(com);
	}
}

 /* 	
 *	INTERFACES FUNCIONALES
 *	----------------------
 *
 *	Se le conoce como interface funcional a toda aquella interface que tenga solamente un método abstracto. 
 *	Puede implementar uno o más métodos default, pero deberá tener forzosamente un único método abstracto.	 
 *	cobran su importancia al utilizar expresiones lambda (λ).
 *	Otra forma de asegurarnos de definir correctamente una interface funcional, es anotarla con @FunctionalInterface
 *
 *	Ejemplo:
 */
@FunctionalInterface
interface IStrategy {

	public String sayHelloTo(String name); // metodo sin abstracto (sin cuerpo)
   
	public default String sayHelloWord(){
  		return "Hello word";
	}
}
 
/*	INTERFACES FUNCIONALES CON EXPRESIONES LAMBDA
 *	---------------------------------------------
 *	//sacado de la web: https://www.oscarblancarteblog.com/2016/12/08/java-8-interfaces-funcionales/
 *
 *	Ejemplo:
 */

class DemoLambda2 {
    public static void main(String[] args) {
        IStrategy strategy = (name) -> "Hello " + name;
        
        System.out.println(strategy.sayHelloTo("Cosme Fulanito"));
        System.out.println(strategy.sayHelloWord());
        
    }
}

/*	PREDICATE	
 * 	---------
 * 
 *	//sacado de la web : https://javautodidacta.es/lambda-predicate-en-java/
 *
 * 	Una lambda Predicate en Java sirve para comprobar si una condición dada es verdadera o falsa.
 * 
 * 	Ejemplo:
 */

interface Predicate<T> {
    boolean test(T t);
}

 /*	
 *	A diferencia de las interfaces habituales, una clase no implementa una interfaz funcional. 
 *	Cuando creas una referencia a una lambda Predicate, lo que haces es implementar el método test en una línea
 * a la que le asignas una referencia. 
 *
 *	Puedes pasar esta referencia de un lado a otro, como cualquier otra referencia o variable. 
 *	Esta lambda es un método portátil, por así decirlo.
 */

class DemoPredicate {
    public static void main(String[] args) {
        Predicate<String> checker = a -> a.startsWith("M");
        System.out.println(checker.test("Miguel"));
    }
}

/*
 *	El codigo anterior vendria a ser algo similar a esto:
 */

class DemoPredicateTradicional implements Predicate<String> {
    public static void main(String[] args) {
    	DemoPredicateTradicional p = new DemoPredicateTradicional();
        System.out.println(p.test("Miguel"));
    }
    
    public boolean test(String str) {
        return str.startsWith("M");
    }
}

/*
 * 	Consumer
 * 	--------
 * 
 * 	Representa una función que toma un argumento y produce un resultado. 
 * 	Sin embargo, este tipo de funciones no devuelven ningún valor.
 * 
 *  De ahí esta interfaz funcional que incluye un genérico a saber:
 *  
 *  	T : denota el tipo de argumento de entrada a la operación
 *  
 *  La expresión lambda asignada a un objeto de tipo Consumer se usa para definir su accept() 
 * que finalmente aplica la operación dada en su argumento. 
 * 	Los consumidores son útiles cuando no es necesario devolver ningún valor
 * 	Se espera que operen a través de efectos secundarios.
 * 
 * 	La interfaz del consumidor consta de las dos funciones siguientes:
 * 
 * 	 accept
 *	 Este método acepta un valor y realiza la operación en el argumento dado.
 * 
 * 	 and then
 *	 Devuelve un Comsumer compuesto en el que el Consumer parametrizado se ejecutará después del primero. 
 *	Si la evaluación de las funciones arroja un error, se transmite al llamador de la operación compuesta.
 *
 * 		Ejemplo ACCEPT:
 */

class DemoConsumer{
	public static void main(String[] args) {
		
		Consumer<Integer> display = a -> System.out.println(a);
		display.accept(10);
		
		Consumer<List<Integer>> modify = list ->
			{
				for(int i =0; i< list.size(); i++) {
					list.set(i, 2 * list.get(i));
				}
			};
		
		Consumer<List<Integer>> 
		dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
		
		List <Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);
		
		modify.accept(list);
		
		dispList.accept(list);
	}
}

/* 
 * 		Ejemplo andThen
 */

class DemoConsumer2{
	public static void main(String[] args) {
	
		Consumer<List<Integer>> modify = list ->
			{
				for(int i =0; i< list.size(); i++) {
					list.set(i, 2 * list.get(i));
				}
			};
			
			Consumer<List<Integer>> 
			dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
			
			List <Integer> list = new ArrayList<>();
			list.add(2);
			list.add(1);
			list.add(3);
			
			modify.andThen(dispList).accept(list);
	} 
}

/*
 * 	Ejemplo de nullPointerException
 */

class DemoConsumer3{
	public static void main(String[] args) {
		
		Consumer<List<Integer>> modify = list ->
		{
			for (int i=0; i<list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
		};
		
		Consumer<List<Integer>>
		dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
		
		List <Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);
		
		try {
			modify.andThen(null).accept(list);
		} catch (Exception e) {
			System.out.println("Excepcion " + e);
		}
	}
}

/*
 * 	Function
 * 
 *  La interfaz funcional Function es la más genérica. 
 *  Tiene la definición más básica de función: recibe algo y devuelve algo.
 *  
 *  Sintaxis:
 *  
 *  		@FunctionalInterface
				public interface Function<T , R>
      			R apply(T var1);
 *
 * 	Aquí podemos ver que el método aplicado recibe una variable genérica y devolverá otra variable genérica.
 * 
 * 	Una cosa importante aquí es que incluso si las palabras genéricas son diferentes, T y R, 
 * no significa que el método apply() no pueda recibir y devolver el mismo tipo.
 * 
 * 	Ejemplo: 
 */

class DemoFunctionalInterface{
	
	public static void main(String[] args) {
		
		/*Sintaxis:
		 * 		default <V> Function <T, V>
		 * 		andThen(Function<? super R, ? extends V> after)
		 * 
		 * 		V: tipo de salida
		 */
		
		Function<Integer, Double> half = a -> a/2.0;
		
		half = half.andThen(a -> 3 * a);
		
		System.out.println(half.apply(10));
		
		try {
			half = half.andThen(null);
		} catch (Exception e) {
			System.out.println("Exception thrown "
					+ "while passing null: "
					+ e);
		}
		
	}
}


/*
 * 	Patron factoria
 * 	---------------
 * 
 * 	El patrón Factoría es uno de los más usados en el diseño y construcción de software y frameworks. 
 * 	En este patrón, creamos un objeto sin exponer la lógica de creación 
 * 	Nos refereimos al objeto nuevo mediante una interfaz común.
 * 
 * 	Ejemplo:
 */

abstract class Animal{
	
	public abstract int patas();
	
}

class Perro extends Animal{

	private int patas;
	
	public Perro() {
		this(4);
	}
	
	public Perro(int patas) {
		super();
		this.patas=patas;
	}
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public int patas() {

		return patas;
	}
}

class Gato extends Animal{
	private int patas;
	
	public Gato() {
		this(4);
	}
	
	public Gato(int patas) {
		super();
		this.patas=patas;
	}
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public int patas() {

		return patas;
	}
}

class Avestruz extends Animal{
	private int patas;
	
	public Avestruz() {
		this(2);
	}
	
	public Avestruz(int patas) {
		super();
		this.patas=patas;
	}
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public int patas() {

		return patas;
	}
}

class FactoriaAnimales{
	
	public static Animal obtenerPatasAnimal(String tipo) {
		if (tipo.equalsIgnoreCase("Avestruz")) {
			return new Avestruz();
		}
		else if (tipo.equalsIgnoreCase("Perro")) {
			return new Perro();
		}
		else return new Gato();
	}
}

class DemoFactoriaAnimales{
	
	public static void main(String[] args) {
		Animal animal = FactoriaAnimales.obtenerPatasAnimal("avestruz");
		System.out.println(animal.patas());
	}
}

/* 
 * 	Interfaz Java Supplier
 * 	----------------------
 * 
 * 	Representa una función a la cual no se le pasa ningún argumento y devuelve un valor genérico T.
 * 
 * 	Para utilizarlo se invoca al método get para producir un valor de la expresión lambda asignada a un objeto.
 */


class FactoriaSupplier {
	
	private static final String PERRO 		="perro";
	private static final String GATO 		="gato";
	private static final String AVESTRUZ 	="avestruz";
	
	private static HashMap<String, Supplier<Animal>> animalMap = new HashMap<>();
	
	static {
		animalMap.put(AVESTRUZ, Avestruz::new);
		animalMap.put(GATO, Gato::new);
		animalMap.put(PERRO, Perro::new);
	}
	
	public static Animal getAnimal(String tipo) {
		if (animalMap.get(tipo)!=null) {
			return animalMap.get(tipo).get();		
		}
		throw new IllegalArgumentException();	
	}
}

class DemoFactoriaAnimales2{
	
	public static void main(String[] args) {
		Animal animal = FactoriaAnimales.obtenerPatasAnimal("avestruz");
		System.out.println(animal.patas());
		
		Animal animalSupplier = FactoriaSupplier.getAnimal("avestruz");
		System.out.println(animalSupplier.patas());
	}
}

/*
 * 
 */

public class Apuntes {

	public static void main(String[] args) {
		
	}
}
