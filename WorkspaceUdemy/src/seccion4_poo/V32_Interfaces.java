package seccion4_poo;

/*	 INTERFACES
 * 	 ----------
 * 
 * 	 Definicion
 * 	 ----------
 * 
 * 	 Una interfaz es un conjunto de metodos abstractos
 * 	 Su objetivo es definir el formato de ciertos metodos que luego las clases deberan implementar
 * 	 Tambien puede incluir constantes que seran publicas y estaticas
 * 	 No pueden tener constructores ni variables de instancia
 	 
 *	 Creacion de una interfaz
 *	 ------------------------ 
 * 
 * 	 Una interfaz se crea como una clase, en un archivo .java
 * 	 Se define con la palabra interface
 * 
 * 			public interface Operaciones{	//definimos la interfaz Operaciones
 * 
 * 				int k=10;					//esto es una constante
 * 											//se omiten las palabras : public, final y static
 * 
 * 				void girar(int grados);		//esto implementa un metodo que habra que definir
 * 											//se omiten las palabras : abstract y public
 * 
 * 				int invertir();				//esto implementa un metodo que habra que definir
 * 			}
 
 *	 Implementacion de una interfaz
 *	 ------------------------------
 *
 * 	 Una clase que implementa una interfaz esta obligada a sobreescribir todos los metodos de dicha interfaz
 * 	 La implementacion se hace con la palabra implements
 * 
 * 			public class Test implements Operaciones{
 * 
 * 				//al implementar el metodo de una interfaz es obligatorio que sea public
 * 
 * 				public void girar (int grados){						// implementacion y definicion del metodo
 * 
 * 					System.out.println("Implementado y definido el metodo girar");
 * 				}
 * 
 * 				public int invertir(){
 * 					System.out.println("Implementado y definido el metodo girar");
 * 				}
 * 			}
 * 
 
 *	 Flexibilidad de las interfaces
 *	 ------------------------------
 *
 * 	 Una clase puede implementar varias interfaces
 * 	 
 * 				public class Test implements Operaciones, OtraInterfaz{}
 * 
 * 	 Una clase puede heredar de otra clase e implementar una o varias interfaces
 * 
 *   			public class Circulo extends Figura implements Operaciones, OtraInterfaz{}
 *   
 
 *	 Herencia multiple en interfaces
 *	 -------------------------------
 *
 *	 Una interfaz puede heredar una o varias interfaces
 *
 *	Ejemplo:
 *
				interface Operaciones{							// interfaz 1
					void girar(int grados);
					int invertir();
				}
				
				interface Inter1{								// interfaz 2
					int miMetodo();
				}
				
				interface InterFin extends Operaciones,Inter1{	// interfaz 3. hereda interfaces 1 y 2
					void nuevoMetodo();
				}
				
				class Prueba implements InterFin{
				//										definicion de los metodos por parte de Operaciones
					public void girar(int grados) {...}
					public int invertir() {...}
					
				//										definicion de los metodos por parte de Inter1 	
					public int miMetodo() {...}
					
				//										definicion de los metodos por parte de InterFin
					public void nuevoMetodo(){...};
				}
 
 *	 Revision de conceptos
 *	 ---------------------
 *
 *	 Si I1 e I2 son interfaces y C1 es una clase cual de las siguietes definiciones son correctas:
 *
 *		a: 	class C2 implements I1, I2 {}				ok
 *		b:	class C3 extends C1 implements I1,I2{}		ok
 *		c:	interface I3 implements I1, I2{}			fail // las interfaces heredan no implementan
 *		d:	interface I4 extends I1 implements C1{}		fail // una interface no puede implementar una clase
 *		e:	interface I5 extends I1,I2{}				ok
 
 *	 Polimorfismo con interfaces
 *	 ---------------------------
 *
 *	 Mediante una interfaz se puede hacer referencia a un objeto que la implementa
 *	 Con esta referencia se podria llamar a las implementaciones de los metodos declarados en la de la 
 *	interfaz, pudiendo llever a cabo el polimorfismo a traves de interfaces
 *
 *	 En una variable interfaz podemos almacenar referencias a objetos de clases que implementan la interfaz
 *	 Despues con estas referencias podriamos llamar a las implementaciones de los metodos de la propia
 *	interfaz se han hecho dentro de la clase.
 *	 Esto nos permite aplicar el polimorfismo de la misma forma que lo podemos aplicar con clases
 *	 
 *		interface Test{
 *			int CONV = 8;						//Constante
 *			void metodo1(int x);				//Metodo a implementar
 *			int metodo2 (String s);				//Metodo a implementar
 *		}
 *
 *		class ClasePrueba implements Test{
 *			public void metodo1(int x){}		//implementacion de Test
 *			public int metodo2(String s){}		//implementacion de Test
 *			public void metodoPropio(){}		//Metodo nuevo
 *		}
 *
 *		class Prueba 
 *			public static void main(String[] args) {
 *		
 *				Test ts = new ClasePrueba();	//variable ts de tipo Test que contiene un objeto tipo ClasePrueba
 *				ts.metodo1(10);
 *				ts.metodo2("Hola");
 *				ts.metodoPropio();			//Error de compilacion.. este metodo no viene de la interfaz Test
 *
 *				//a las constantes se les puede llamar desde la interfaz o desde la clase que la implementa
 *				Test.CONV:					//llamada a la constante a partir de la interfaz
 *				ClasePrueba.CONV;			//llamada a la constante a partir de la clase ClasePrueba
 *				ts.CONV;					//llamada a la constante a partir de la variable 
 *												//esto seria valido pero no es lo mas habitual
 *
 */
public class V32_Interfaces {

	public static void main(String[] args) {

	}

}
