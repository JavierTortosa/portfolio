package Ejemplo1_Pila;

/*
 * 	Ejemplo1 - Pila:
 * 		En el código siguiente vemos la declaración de una clase genérica Pila. 
 * 		El nombre de la declaración de la clase genérica va seguido de una sección de parámetros de tipo.
 *  
 *  	En este caso, el parámetro de tipo E, que será el que manipulará la pila. 
 *  	La sección de parámetros de tipo puede tener uno o más parámetros separados por comas. 
 *  	El parámetro de tipo E se utiliza en la declaración de la clase Pila para representar el tipo del elemento.
 */

class Pila<E> {

	// propiedades
	private final int tamaño;
	private int superior;
	private E[] elementos; // declaramos el array que contendra elementos tipo E

	// constructores
	public Pila() {
		this(10);
	}

	public Pila(int s) {
		tamaño = s > 0 ? s : 10; // nos aseguramos de que el tamaño del array sea mayor que 0 si no sera 10
		superior = -1;
		elementos = (E[]) new Object[tamaño]; // creamos el array del tamaño que corresponda
	}

	// metodos
	public void apilar(E valor) throws ExcepcionPilaLlena {
		if (superior == tamaño - 1) {
			throw new ExcepcionPilaLlena(String.format("La pila esta llena, no se puede apilar %s", valor));
		}
		elementos[++superior] = valor;
//			System.out.println("elemento "+ elementos[superior]+ " apilado");
	}

	public E desapilar() throws ExcepcionPilaVacia {
		if (superior == -1) {
			throw new ExcepcionPilaVacia("La Pila esta vacia, no se puede desapilar");
		}

//			System.out.println("elemento "+ elementos[superior]+ " desapilado");
		return elementos[superior--];
	}

	public E[] getElementos() {
		return elementos;
	}

	public void setElementos(E[] elementos) {
		this.elementos = elementos;
	}
	
	public static void main(String[] args) {
		int pp$=0;
	}
}

class ExcepcionPilaLlena extends Exception {

	public ExcepcionPilaLlena() {
		this("La pila esta llena");
	}

	public ExcepcionPilaLlena(String excepcion) {
		super(excepcion);
	}
}

class ExcepcionPilaVacia extends Exception {

	public ExcepcionPilaVacia() {
		this("La pila esta vacia");
	}

	public ExcepcionPilaVacia(String excepcion) {
		super(excepcion);
	}
}

class DemoPila {
	public static void main(String[] args) {
		Pila pila = new Pila<>(2);

		try {
			pila.apilar("100W7");
			pila.apilar("200");
			pila.apilar("300");
		} catch (ExcepcionPilaLlena e) {
			e.printStackTrace();
		}

		try {
			pila.desapilar();
			pila.desapilar();
			pila.desapilar();

		} catch (ExcepcionPilaVacia e) {
			e.printStackTrace();
		}

		System.out.println(pila.getElementos()[0]);
	}
}
	
	
/*
 * 	La clase Pila declara la variable elementos como un array de tipo E. 
 * 	Quisiéramos crear un array de tipo E para guardar los elementos 
 * 	El mecanismo de los genéricos no permite parámetros de tipo en las expresiones para crear arrays
 * dado a que el parámetro de tipo no está disponible en tiempo de ejecución. 
 *
 *	Para poder hacerlo se crea como un array de tipo Object y se convierte la referencia vuelta para new al tipo E[].
 * 	Cualquier objeto podría almacenarse en un array Object, 
 * el mecanismo de comprobación de tipos del compilador asegura que sólo puedan asignarse al array objetos del 
 * tipo declarado de la variable, a través de cualquier expresión de acceso que utilice la variable elementos.
 */
	
class PruebaPila {
	private double[] elementsDouble = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
	private int[] elementsInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
	private Pila<Double> pilaDouble;
	private Pila<Integer> pilaInteger;

	public void probarPilas() {
		pilaDouble = new Pila<Double>(5);
		pilaInteger = new Pila<Integer>(10);
		pruebaApilarDouble();
		pruebaDesapilarDouble();
		pruebaApilarInteger();
		pruebaDesapilarInteger();
	}

	public void pruebaApilarDouble() {
		try {
			System.out.println("\nApilando elementos a pilaDouble");
			for (double elemento : elementsDouble) {
				System.out.printf("%.1f ", elemento);
				pilaDouble.apilar(elemento);
			}
		} catch (ExcepcionPilaLlena excepcioPilaLlena) {
			System.err.println();
			excepcioPilaLlena.printStackTrace();
		}
	}

	public void pruebaApilarInteger() {
		try {
			System.out.println("\n Apilando elementos a pilaInteger");
			for (int elemento : elementsInteger) {
				System.out.printf("%d ", elemento);
				pilaInteger.apilar(elemento);
			}
		} catch (ExcepcionPilaLlena excepcioPilaLlena) {
			System.err.println();
			excepcioPilaLlena.printStackTrace();
		}
	}

	public void pruebaDesapilarDouble() {
		try {
			System.out.println("\n Desapilando elementos de pilaDouble");
			double valorAQuitar;
			while (true) {
				valorAQuitar = pilaDouble.desapilar();
				System.out.printf("%.1f ", valorAQuitar);
			}
		} catch (ExcepcionPilaVacia excepcioPilaVacia) {
			System.err.println();
			excepcioPilaVacia.printStackTrace();
		}
	}

	public void pruebaDesapilarInteger() {
		try {
			System.out.println("\n Desapilando elementos de pilaInteger");
			int valorAQuitar;
			while (true) {
				valorAQuitar = pilaInteger.desapilar();
				System.out.printf("%d ", valorAQuitar);
			}
		} catch (ExcepcionPilaVacia excepcioPilaVacia) {
			System.err.println();
			excepcioPilaVacia.printStackTrace();
		}
	}

	public static void main(String args[]) {
		PruebaPila aplicacion = new PruebaPila();
		aplicacion.probarPilas();
	}
}

 /* 
 * 
 * 
 * 
 * 
 */

	class PruebaPila2 {
		private Double[] elementsDouble = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
		private Integer[] elementsInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		private Pila<Double> pilaDouble;
		private Pila<Integer> pilaInteger;

		public void probarPilas() {
			pilaDouble = new Pila<Double>(5);
			pilaInteger = new Pila<Integer>(10);
			probarApilar("pilaDouble", pilaDouble, elementsDouble);
			probarDesapilar("pilaDouble", pilaDouble);
			probarApilar("pilaInteger", pilaInteger, elementsInteger);
			probarDesapilar("pilaInteger", pilaInteger);
		}

		public <T> void probarApilar(String nombre, Pila<T> pila, T[] elementos) {
			try {
				System.out.printf("\nApilando elementos en %s\n", nombre);
				for (T elemento : elementos) {
					System.out.printf("%s" + " ", elemento);
					pila.apilar(elemento);
				}
			} catch (ExcepcionPilaLlena excepcioPilaLlena) {
				System.out.println();
				excepcioPilaLlena.printStackTrace();
			}
		}

		public <T> void probarDesapilar(String nombre, Pila<T> pila) {
			try {
				System.out.printf("\nDesapilando elementos de %s\n", nombre);
				T valorAQuitar;
				while (true) {
					valorAQuitar = pila.desapilar();
					System.out.printf("%s" + " ", valorAQuitar);
				}
			} catch (ExcepcionPilaVacia excepcioPilaVacia) {
				System.out.println();
				excepcioPilaVacia.printStackTrace();
			}
		}

		public static void main(String args[]) {
			PruebaPila2 aplicacion = new PruebaPila2();
			aplicacion.probarPilas();
		}
	}
	
/*
 * El método genérico recibe tres argumentos: 
 * 	una cadena que representa el nombre del objeto, 
 * 	una referencia a un objeto de tipo Pila <T> 
 * 	y una tabla de tipo T.
 * 
 * El método genérico pruebaDesapilar recibe dos argumentos: 
 * 	una cadena que representa el nombre de el objeto 
 * 	y una referencia a un objeto de tipo Pila <T>.
 */
	

