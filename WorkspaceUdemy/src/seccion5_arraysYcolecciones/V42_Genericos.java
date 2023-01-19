package seccion5_arraysYcolecciones;

/*	 Genericos
 * 	 ---------
 * 
 * 	 Permiten que una clase java pueda operar con culquier tipo de objeto (no pueden ser primitivos)
 * 	 En la definicion de la clase se emplea una letra para hacer referencia de forma generica al tipo
 * 
 * 			class MyClass <T>{}
 * 
 * 	 Al crear un objeto de la clase se debe especificar el tipo concreto con el que se va a trabajar
 * 
 * 			MyClass <String> mc = new MyClass <> ();
 * 
 *	 Ejemplo: 
 */

class Bean <T>{
	
	private T dato;
	
	public Bean(T dato) {
		this.dato = dato;
	}
	
	public void setDato(T dato) {
		this.dato=dato;
	}
	
	public T getDato() {
		return dato;
	}
	
	public void print(Bean<?> bean) {
		System.out.println(bean.getDato());
	}
	
	
}

/*	 Tipo generico como parametro
 * 	 ----------------------------
 * 
 * 	 A la hora de definir un parametro de tipo generico debemos unsar el operador comodin "?"
 * 	 
 * 			public void print (Bean <?> bean){	//recibe como parametro un objeto bean ? (?=de cualquier tipo)
 * 				System.out.println(bean.getDato());
 *			}
 *
 * 	 El metodo podra ser llamado con un objeto bean de cualquier tipo
 * 
 * 			Bean <String> b1 = new Bean <> ("Hello");
 * 			Bean <Integer> b2= new Bean <> (30);
 * 			b1.print(b1);
 * 			b2.print(b2);
 * 	 
  
 *	 Restricciones de tipo
 *	 ---------------------
 *
 *	 Se puede definir una clase que solo admita objetos de un determinado subtipo:
 *
 *			class MyClass <T extends Number>{}	//cualquier subclase de Number
 *
 *	 Tambien se puede usar tanto extends como super para establecer restricciones en los metodos
 *
 *	 Ejemplo con extends:
 *
 *		Recibimos un parametro tipo Bean que sea de cualquier subclase(hija) de Number
 *
 *			public void print (Bean <? extends Number> bean){
 *				System.out.println(bean.getDato());
 *			}
 * 
 * 						........
 * 
 * 			print(new Bean <String> ("Hello"));	// Error de compilacion... no es subclase de Number
 * 			print(new Bean <Integer> (30));	// OK
 * 
 *	 Ejemplo con super: 
 *
 *		Recibimos un parametro tipo Bean que sea de cualquier superclase(padre) de JButton
 *
 *  		public void print (Bean <? super JButton> bean){
 *				System.out.println(bean.getDato());
 *			}
 * 
 *  						........
 *  
 * 			print(new Bean <String> ("Hello"));	// Error de compilacion... no es subclase de JButton
 * 			print(new Bean <Container> (new Container()));	// OK  
 *  
 
 *	 Revision de conceptos
 *	 ---------------------
 *
 *   	Dada la siguiente clase:
 *   
 *   		class MyClass <T extends Number>{
 *   			...
 *   		}
 *   
 *   	Que expresiones son correctas:
 *   
 *   		a. MyClass <Number> m1 = new MyClass <Integer>();
 *   		b. MyClass <Number> m2 = new MyClass <> ();		
 *   		c. MyClass <?> m3 = new MyClass <Integer>();	 
 *   														
 *   		a. Incorrecta
 *   			 El hecho de que Integer sea subclase de Number no significa que MyClass de Integer
 *   			sea subtipo de Myclass de Number
 *   		b. Correcta
 *   		c. Correcta
 *   			 Al indicar que m3 es de tipo MyClass de cualquier tipo "<?>", el objeto puede ser 
 *   			de cualquier subtipo de Number
    
 *	 Metodos Genericos
 *	 -----------------
 *
 *   Una clase no generica puede contener metodos que utilicen un tipogenerico en parametros o resultados
 *   Se incluira la expresion <T> en la definicion del metodo
 *   
 *   		public <T> void m1(T dato){...}					//standar 
 *   		public <T extends Number> void m2(T dato){...}	//con restriccion de sublclases de Number
 *   		public <T> T m3 (){...}							//con devolucion de tipo T
 *   
 *   Ejemplo:
 */
	
class MetodosGenericos {
	public <T> String tipo (T dato) {
		return dato.getClass().getName();
	}
	
	public <T> void m1(T dato) {
		System.out.println(dato);
	}
	
	public <T extends Number> void m2(T dato) {
		System.out.println(dato);
	}
	
	public <T> T m3() {
		return null;
		
	}
}

public class V42_Genericos {

	public static void main(String[] args) {

		Bean<String> b1=new Bean<>("Hello");
		System.out.println(b1.getDato());
		Bean<Integer> b2= new Bean<>(30);
		System.out.println(b2.getDato());
		b1.print (b1);
		b2.print (b2);
		
		//METODOS GENERICOS
		
		System.out.println("\nMetodos Genericos\n-----------------\n");
		MetodosGenericos mg = new MetodosGenericos();
		System.out.println(mg.tipo("Hello"));
		System.out.println(mg.tipo(50));
		System.out.println(mg.tipo(3.25));
		mg.m1("Hello");
		mg.m1(15);
//		mg.m2("Hello"); // error String no es subclase de Number
		mg.m2(25);
		mg.m3();
	}
}
