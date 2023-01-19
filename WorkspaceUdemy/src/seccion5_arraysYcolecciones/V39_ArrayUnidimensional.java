package seccion5_arraysYcolecciones;

/*	 Arrays unidimensionales
 * 	 -----------------------
 * 
 * 	 Definicion
 * 	 ----------
 * 
 * 	 Un array es un objeto, por lo tanto la variable tiene una referencia a todo el array no a cada elemento
 * 	 Conjunto de datos de un mismo tipo que se accede mediante una unica variable
 * 	 Cada dato tiene asociado un numero de indice empezando por el numero 0
 * 	 Un array es una estructura de datos estatica, una vez definido su tamaño no se puede modificar
 
 *	 Declaracion e instanciacion
 *	 ---------------------------
 *
 *	  - Declaracion
 *	    -----------
 *
 *	 	tipo[] variable; 	// si es atributo se inicializa a null, si es local no se inicializa
 *
 *			Ej:	int[] x;
 *
 *		tipo variable[];	// los corchetes se pueden poner antes o despues de la variable
 *
 *			Ej:	int x[];
 *
 *		tipo variable[3];	// en la inicializacion no se puede establecer el tamaño... ERROR DE COMPILACION
 *
 * 			Ej:	int x[3];
 * 				int[3] x;
 * 
 *	 - Instanciacion
 *	   -------------
 *
 *	 Un array se crea como cualquier objeto a traves del operador new
 *
 *		tipo[] variable = new tipo[tamaño];	//declarado e instanciado
 *
 *			Ej:	int[] x = new int[5];
 *
 *	 Si ha sido declarado previamente
 *
 *		variable = new tipo[tamaño];			//declarado anteriormente, aqui lo instanciamos
 *
 *			Ej:	x= new int[5];
 *
 *	 Cuando instanciamos el array todas las posiciones se inicializan con el valor por defecto
 *	 Si el array es de objetos todas las posiciones si inicializan a null
 
 *	 Acceso a elementos y creacion abreviada
 *	 ---------------------------------------
 *
 *	 - Asignar valor a una posicion
 *	   ----------------------------
 *
 *		variable[posicion] = valor;
 *	
 *			Ej:	x[3] = 25;
 *
 *	 - Declaracion, asignacion e inicializacion
 *	   ----------------------------------------
 *
 *		Declaracion directa:
 *		--------------------
 *
 *		tipo[] variable = new int[]{valores};
 *
 *			Ej:	int[] x= new int[]{2, 25, 314, 8, 15}; // x tiene un tamaño de array 5 (posiciones de 0 a 4)
 *		
 *		EL TAMAÑO SE ESPECIFICA CON LA CANTIDAD DE ELEMENTOS, NO SE ESPECIFICA UN TAMAÑO ENTRE CORCHETES
 *
 *		Declaracion abreviada:
 *		----------------------
 *
 *		tipo[] variable = {elementos}:
 *
 *			Ej:	int x[]= {2, 25, 314, 8, 15};
 *
 *	 - Acceder a un valor de una posicion
 *	   ----------------------------------
 *
 *		variable[posicion];
 *
 *			Ej:	System.out.println (x[1]); // nos da 25
 *				System.out.println (x[0]); // nos da 2
 *				System.out.println (x[5]); // nos da ArrayIndexOutOfBoundsException. ERROR DE EJECUCION
 *
 *		Si accedemos a un valor fuera de los limites se produce una excepcion ArrayIndexOutOfBoundsException
 *
 
 *	 Los arrays son objetos
 *	 ----------------------
 *
 *	 Ejemplo:
 */

class EjObjetoArray{
	
	void metodo() {
		int[] datos = new int[5];		// creamos el array datos
		guardar(datos);					// mandamos el array datos al metodo guardar 
										// realmente se envia la referencia al objeto datos 
		System.out.println(datos[0]);	// imprime 10
		
	}
	
	void guardar(int[] valores) {		//recibimos como parametro un array de int llamado valores
										//valores apunta a la referencia del objeto datos
		valores[0]=10;					//a valores le asignamos el valor 10 a la posicion 0
	}
	
	public static void main(String[] args) {
		EjObjetoArray eoa = new EjObjetoArray();
		eoa.metodo();

	}
}

/*	 Tamaño de un array
 * 	 ------------------
 * 
 * 	 Un array tiene la propiedad length para conocer su tamaño
 * 
 * 		Ej:	int[] nombreArray= new int[10]:
 * 			System.out.println(nombreArray.lenght); // imprime 10
 * 
 * 	 La posicion del ultimo elemento del array siempre sera length-1
 * 
 
 *	 Recorrido de un array
 *	 ---------------------
 *
 *	 Se puede usar un for standard 
 *
 *		int datos[] = new int[10];
 *		for (int i=0; i<datos.length; i++){
 *			datos [i] = i*2;
 *		}
 *
 * 	 O un foreach si es para solo lectura
 * 
 * 		int datos[] = new int[10];
 * 		for(int n : datos){ 		// OJO!!! NO SE PONEN LOS CORCHETES
 * 			System.out.println(n);
 * 		}
 */

public class V39_ArrayUnidimensional {

	int arrayPropiedad[];
	
	V39_ArrayUnidimensional(){
		
	}
	
	V39_ArrayUnidimensional(int x){
		arrayPropiedad= new int[x];
	}
	
	void muestraArrayPropiedad(){
		for (int n : arrayPropiedad) {
			System.out.print(n + ", ");
		}
	}
	
	void muestraArrayPropiedadConPosicion(){
		for (int i=0; i<arrayPropiedad.length; i++) {
			System.out.println("Pos:"+i + " -> " + arrayPropiedad[i]);
		}
	}
	void valoresArrayPropiedad(){
		for (int i=0; i<arrayPropiedad.length; i++) {
			arrayPropiedad[i]=i*2;
		}
	}
	
	public static void main(String[] args) {
		
		/*
		V39_ArrayUnidimensional arr1 = new V39_ArrayUnidimensional();
		
		// El array no tiene dimension e intentamos ver el contenido
		
		arr1.muestraArrayPropiedad(); 
		
		// da un error NullPointerException
		*/
		
		
		V39_ArrayUnidimensional arr2 = new V39_ArrayUnidimensional(10);
		System.out.println("vemos el contenido del array vacio de 10 elementos\n");
		arr2.muestraArrayPropiedad();
		
		System.out.println("\n\nasignamos los 10 valores a los 10 elementos y los mostramos\n");
		arr2.valoresArrayPropiedad();
		arr2.muestraArrayPropiedad();
		System.out.println("\n\nahora mostramos la posicion y su valor\n");
		arr2.muestraArrayPropiedadConPosicion();
	}
}
