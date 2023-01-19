package Stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*	STREAMS
 * 	-------
 * 
 * 	Son un modelo de datos 
 * 	Nos permite tratar las colecciones como si de etapas de un proceso ETL (“Extract Transform and Load”) 
 * 	Nos permite utilizar las funciones Map y Reduce en la etapa de transformación.
 * 
 *  Operaciones Intermedias
 * 
 * 	map :
 *  
 * 	El método map se utiliza para devolver un flujo que consta de los resultados de aplicar la función dada 
 * a los elementos de este flujo.             
 * 
 * Ejemplo:

List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());

 * 	filter:  
 * 	
 * 	El método de filter se utiliza para seleccionar elementos según el Predicado pasado como argumento.
 * 
 *  Ejemplo:

List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s>s.startsWith("S")).collect(Collectors.toList());

 * 	sorted: 
 * 
 * 	El método ordenado se utiliza para ordenar la secuencia. 
 * 
 * 	Ejemplo:
 
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());

 */

class DemoStream {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Diez");
		map.put(100,  "Cien");
		map.put(1000, "Mil");
		
		map.forEach((k,v) -> System.out.println("Key: " + k + ":\tValue: " + v));
		
		for(Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator(); entries.hasNext(); ) {
			Map.Entry<Integer, String> entry = entries.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
				
 	}
}


/*
 * 	OPERACIONES TERMINALES
 * 	----------------------
 * 
 * 	collect:
 * 	El método collect se utiliza para devolver el resultado de las operaciones intermedias realizadas en el flujo.
 * 
 * 	forEach:
 * 	El método forEach se usa para iterar a través de cada elemento de la secuencia.
 * 
 * 	reduce:
 * 	El método reduce se utiliza para reducir los elementos de un flujo a un solo valor.
 * 	El método reduce toma un BinaryOperator como parámetro.
 * 
 */

class DemoOperacionesTerminales{
	public static void main(String[] args) {
		
		// metodo map
		List<Integer> ladoCuadrado = Arrays.asList(2,3,4,5,6);
		
		List<Integer> areaCuadrado = ladoCuadrado.stream()
				.map (x -> x*x)
				.collect(Collectors.toList());
		
		System.out.println(areaCuadrado);
		
		// metodo filter
		List<String> names = Arrays.asList("Reflexion","Collection","Stream");
		
		List<String> result = names.stream()
				.filter(s->s.startsWith("S"))
				.collect(Collectors.toList());
		System.out.println(result);
		
		// metodo sorted
		List<String> show = names.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(show);
		
	} 
}

/* 	MÉTODOS DE BÚSQUEDA
 * 
 * 	Se utiliza para procesar una colección de objetos. 
 * 	Diferentes fuentes, como matrices o colecciones, pueden crear un stream.
 * 
 * 	Aquí, veremos de cerca los métodos:
 * 
 * 	findFirst()
 * 	findAny()  
 * 
 * 	Stream no altera los datos originales; 
 * 	evalúa los elementos de la corriente utilizando los métodos de canalización.  
 * 	
 * 	Método findFirst()
 * 
 * 	El método Stream API findFirst() es una operación de terminal; 
 *  Termina y devuelve un resultado. 
 * 	Usamos el método findfFirst() cuando necesitamos el primer elemento de la secuencia.
 * 
 * 	Optional
 * 
 * 	Este método devuelve un Optional<T>, que describe el primer elemento de la secuencia. 
 * 	Aquí T es el tipo que es String.
 * 
 * 	Opcional
 * 
 * 	Opcional es un objeto contenedor; puede o no tener un valor no nulo. 
 * 	Si la secuencia está vacía, el Optional devuelto estará vacío.
 * 	
 * 	Listas
 * 
 * 	Ejemplo:
 * 
 * 	Creamos una Lista de frutas y números que contienen datos de tipo String e Integer, respectivamente, 
 * 	usando el método findFirst() en un contexto diferente. 
 * 	Llamamos al .stream() en la lista que devuelve un flujo de elementos de la lista.
 */

class DemoFindFirst{
	public static void main(String[] args) {
		
		//ejemplo con frutas
		List<String> frutas = List.of("Manzana","Naranja","Piña","Kiwi");
		
		Optional<String> first = frutas.stream()
				.findFirst();
		
		if(first.isPresent()) {
			String string = first.get();
			System.out.println("First String is: " + string);
		}else {
			System.out.println("no value");
		}
		
		// ejemplo con numeros
		List<Integer> numeros = List.of(4, 9, 3, 8);
		
		Optional<Integer> firstN = numeros.stream()
				.filter(x -> x > 5)
				.findFirst();
		
		if(firstN.isPresent()) {
			System.out.println("First number: "+ firstN.get());
		}else {
			System.out.println("no value");
		}
	}
}

/* 
 * 	findAny()
 * 
 * 	El método findAny() devuelve una instancia Optional que describe cualquier elemento del flujo. 
 * 	Tenemos una lista de elementos de tipo Integer en el programa a continuación.
 * 
 * 	Ejemplo:
 * 
 * 	Creamos un flujo de la lista y filtramos ese flujo para devolver números que tengan un valor inferior a 5. 
 * 	Luego llamamos a findAny() para obtener cualquier número de ese flujo filtrado.
 * 
 * 	En la mayoría de los casos, devolverá el primer elemento. 
 * 	Si la instancia Opcional firstN no está vacía, imprimimos el valor de la instancia usando el método get().
 * 
 */

class DemoFindAny{
	public static void main(String[] args) {

		List<Integer> numeros = List.of(8, 5, 3, 8);
		
		Optional<Integer> firstN = numeros.stream()
				.filter(x -> x < 5)
				.findAny();
		
		if(firstN.isPresent()) {
			System.out.println("numbers less then 5: "+ firstN.get());
		}else {
			System.out.println("no value");
		}
		
	}
}	

/* 	MÉTODOS DE ORDENACIÓN
 * 
 * 	Tenemos múltiples métodos para ordenar objetos en ArrayList por fecha en Java. 
 * 	Esta clasificación se puede realizar en función de la fecha o cualquier otra condición.
 * 
 * 	Métodos
 * 
 *  Método comparable<> 		para ordenar objetos en ArrayList por fechas en Java
 *  Método collections.sort() 	para ordenar objetos en ArrayList por fecha en Java
 *  Método list.sort() 			para ordenar objetos en ArrayList por fecha en Java
 *  
 *  
 *  comparable
 *  
 *  El primer método funciona haciendo el objeto comparable <> 
 * junto con el uso de las clases compareTo(), compare() y collections.sort(). 
 *  Crearemos una nueva clase de objeto DateItem e implementaremos la interfaz Comparator<DateItem> para ordenar 
 * el array.
 *  
 *  Ejemplo:
 */

class DemoComparable {
	public static void main(String[] args) {
		List<String> dateArray = new ArrayList<>();
		dateArray.add("2020-03-25");
		dateArray.add("2019-01-27");
		dateArray.add("2020-03-26");
		dateArray.add("2020-02-26");
		
		System.out.println("Antes de ordenar " + dateArray);
		
		// TODO LINEA CON EL COMANDO "comparable"
		//Comparable<String> ;
		
		System.out.println("Despues de ordenar " + dateArray);
	}
}


/* Collections.Sort
 * 
 * El método collections.sort() podría realizar la clasificación por fecha en una ArrayList.
 */

class DemoCollectionsSort {
	public static void main(String[] args) {
		List<String> dateArray = new ArrayList<>();
		dateArray.add("2020-03-25");
		dateArray.add("2019-01-27");
		dateArray.add("2020-03-26");
		dateArray.add("2020-02-26");
		
		System.out.println("Antes de ordenar " + dateArray);
		
		Collections.sort(dateArray);
		
		System.out.println("Despues de ordenar " + dateArray);
	}
}

/* List.sort
 * 
 * El método list.sort() se combina con una expresión lambda para realizar la ordenación por date en una ArrayList.
 */

class DemoListSort {
	
	public static void main(String[] args) {
		List<String> dateArray = new ArrayList<>();
		dateArray.add("2020-03-25");
		dateArray.add("2019-01-27");
		dateArray.add("2020-03-26");
		dateArray.add("2020-02-26");
		
		System.out.println("Antes de ordenar " + dateArray);
		
		dateArray.sort((d1,d2) -> d1.compareTo(d2));
		
		System.out.println("Despues de ordenar " + dateArray);
	}
}

/*  FlatMap
 * 
 * 	Es una operación/función en el flujo que se utiliza para obtener un nuevo flujo después de realizar alguna tarea funcional
 * 
 * 	Esta operación es una extensión de la operación map(). 
 * 	Esta función se aplica a cada elemento de flujo y genera un flujo de nuevos valores.
 *  Los elementos generados de estos nuevos flujos se copian luego en un flujo que sirve como valor de retorno del método.	
 *  FlatMap es una operación intermedia. 
 *  Las operaciones intermedias son operaciones perezosas y se invocan en una instancia de Stream
 *  Después de que finalizan su procesamiento, devuelven una instancia de Stream.
 *  
 *  La operación flatMap() es una combinación de las operaciones map() y flat(). 
 *  Primero aplica la operación map() y luego aplana el resultado.
 *  Este método toma un mapeador, una función que se aplicará a cada elemento del Stream entrante.
 *  
 *  Sintaxis:
 *  
 *  	<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
 *  
 */

/*	Flattening en Java
 * 
 * 	Aplanar una lista convierte dos o más listas de nivel en una lista de un solo nivel.
 * 
 * 		Ejemplo de lista 	: [["I"], ["Love"], ["Delft", "Stack"]]
 * 		Flattening 			: ["I", "Love", "Delft", "Stack"] 
 *
 *  Flattening de una lista
 *  
 *  Es necesario aplanar una lista porque tratar con varios niveles de Stream puede ser difícil y propenso a errores.
 *  Podemos usar la operación Stream.flatMap() para convertir los dos niveles de Stream en un Stream de un solo nivel. 
 *
 *	Ejemplo:
 *
 *	
 */

class Programmer{
	
	private String name;
	private Set<String> languages_known;
	
	public Programmer(String name) {
		this.name = name;
		this.languages_known = new HashSet<>();
	}
	
	public void addLanguage(String lang) {
		this.languages_known.add(lang);
	}
	
	public Set<String> getLanguages(){
		return languages_known;
	}
}

class DemoFlatMap{
	
	public static void main(String[] args) {
		
		Programmer raj = new Programmer("Raj");
		raj.addLanguage("Java");
		raj.addLanguage("Dart");
		raj.addLanguage("Go");
		raj.addLanguage("Groovy");
		
		Programmer karan = new Programmer ("Karan");
		karan.addLanguage("Java");
		karan.addLanguage("Python");
		karan.addLanguage("go");
		
		Programmer chahal = new Programmer ("Chahal");
		chahal.addLanguage("Dart");
		chahal.addLanguage("JavaScript");
		
		/*En este ejempUso del método flatMap()
		 * lo, primero creamos una secuencia de objetos a partir de una Lista 
		 */
		
		List<Programmer> team = new ArrayList<>();
		team.add(raj);
		team.add(karan);
		team.add(chahal);
		
		System.out.println("Todos los lenguajes");
		
		/*	utilizando el método stream() 
		 * 
		 * Cada objeto es un programador en una empresa.
		 * 
		 * Ahora inicializaremos los objetos y crearemos una lista de listas que contengan todos los lenguajes 
		 * conocidos por los programadores en toda la empresa. 
		 * 
		 * Luego aplanaremos esa lista para conocer todos los idiomas del equipo.
		 */
		
		//listado de lenguajes con duplicados
		List<String> languages = team.stream()
				.map(Programmer::getLanguages)
				.flatMap(Collection :: stream)
				.collect(Collectors.toList());
				
		System.out.println(languages);
		
		//listado de lenguajes sin duplicados
		List<String> languages2 = team.stream()
				.map(Programmer::getLanguages)
				.flatMap(Collection :: stream)
				.distinct()						//elimina los duplicados
				.collect(Collectors.toList());
		
		System.out.println(languages2);
		
		//listado de lenguajes filtrado (eliminando "Java")
		List<String> languages3 = team.stream()
				.map(Programmer::getLanguages)
				.flatMap(Collection :: stream)
				.filter(x -> !x.equals("Java"))
				.distinct()						//elimina los duplicados
				.collect(Collectors.toList());
		
		System.out.println(languages3);
		
		
	}
}

/*
 * 	 Tipo primitivo
 * 
 * 	 Java Stream API también proporciona operaciones separadas como flatMapto{primitive type} para tipos de datos 
 * 	primitivos como int, float, long para aplanar el Stream de tipo primitivo.
 * 
 */

class DemoStremTipoPrimitivo{
	public static void main(String[] args) {
		
		int[] jeArray = {3, 5, 2, 35, 85, 32, 23, 43, 12};
		Stream<int[]> JEStreamArray = Stream.of(jeArray);
		IntStream JEIntStream = JEStreamArray.flatMapToInt(x->Arrays.stream(x));
		
		JEIntStream.forEach(x->System.out.println(x));
		
	}
}

/*
 * 	COLLECTORS
 * 	----------
 * 
 * 	Cuanto más usamos los streams más usamos los diferentes Java Stream Collectors para transformar estos
 * 	
 * 	Ejemplo:
 * 
 * 	vamos a crear la clase Libro y usarla en diferentes ejemplos:
 */

class Libro {
	
	private String titulo;
	private int paginas;
	
	public Libro(String titulo, int paginas) {
		this.titulo = titulo;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
}

class DemoCollectors{
	
	public static void main(String[] args) {
		Libro l1 = new Libro("El señor de los anillos", 1000);
		Libro l2 = new Libro("La fundacion",500);
		Libro l3 = new Libro("El caliz de fuego",600);
		
		Stream<Libro> streamLibros = Stream.of(l1, l2, l3);
		//streamLibros.forEach(libros -> System.out.println(libros.getTitulo()+", "+libros.getPaginas()+" paginas"));
		
		//convertimos un stream en array
		Libro[] arrayLibro = streamLibros.toArray(Libro[]::new);
		for(int i =0; i<arrayLibro.length;i++) {
			System.out.println(arrayLibro[i].getPaginas());
		}
		
	}
}

/*	 FILTER 
 * 	 ------
 * 
 * 	 Ejemplo:
 */

class DemoFilter{
	public static void main(String[] args) {
		List<String> colorCars = Arrays.asList("blue", "red", "green");
		
		List<String> colorBlue = colorCars.stream()
				.filter(color ->"blue".equals(color))
				.collect(Collectors.toList());
		
		colorBlue.forEach(color -> System.out.println(color));
		
	}
}

public class Apuntes {

	public static void main(String[] args) {
		
	}
}
