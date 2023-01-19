package seccion4_poo;

/*	 NOVEDADES EN INTERFACES
 * 	 -----------------------
 * 
 * 	 Metodos default
 * 	 ---------------
 * 
 * 	 Proporciona una implementacion por defecto
 * 	 Puede ser usada por las clases que implementan la interfaz
 * 	 Se definen con la palabra default
 * 
 * 	Ejemplo:
 */ 

interface OperacionesMetodoDefault {
	default void girar(int grados) {
		System.out.println("gira " + grados + " grados");
	}

	int invertir();
}

class TestMetodoDefault implements OperacionesMetodoDefault {

	// solo se tiene que implementar el abstracto
	// si se quiere tambien se puede sobreescribir el default

	public int invertir() {
		return 0;
	}

}

class PruebaMetodoDefault {

	public static void main(String[] args) {

		TestMetodoDefault ts = new TestMetodoDefault();
		
		// utiliza la implementacion por defecto
		ts.girar(30); // muestra -> gira 30 grados
	}
}
  
/*	 Problema de herencia multiple
 *	 -----------------------------
 *
 * 	 Si una clase implementa dos interfaces con el mismo metodo default, esta obligada a sobreescribirlo
 * 
 * 	 Ejemplo:
 */ 
interface InterAHerMul {
	default void m() {
		System.out.println("default InterA");
	}
}

interface InterBHerMul {
	default void m() {
		System.out.println("default InterB");
	}
}

class TestHerMul implements InterAHerMul, InterBHerMul {

	// estamos obligados a sobreescribir el metodo default si no da error de
	// complacion

	public void m() {
		System.out.println("Implementacion de Test");
	}
}

class PruebaHerMul {
	public static void main(String[] args) {
		TestHerMul ts = new TestHerMul();
		// utiliza la implementacion de la clase Test
		ts.m(); // muestra "Implementacion de Test"
	}
}
 
/* 	 Metodos estaticos
 * 	 -----------------
 * 
 * 	 Desde java 8 las interfaces pueden tener metodos estaticos igual que las clases
 * 	 El metodo esta asociado a la interfaz 
 * 	 Para llamar al metodo estatico solo se puede hacer desde la propia interfaz:
 * 
 * 			nombreInterfaz.metodo;
 * 
 * 	 NO se heredan por las clases que la implementan
 * 
 * 		interface InterA{
 * 			static void m(){
 * 				System.out.println("estatico en InterA");
 * 			}
 * 		}
 * 		
 * 		public class Test implements InterA{}
 * 
 * 		public class Prueba{
 * 			 public static void main(String[] args) {
 * 				Test ts = new Test();
 * 				ts.m();		// ERROR DE COMPILACION
 * 				Test.m();	// ERROR DE COMPILACION
 * 				InterA.m():	// correcto, muestra "estatico en InterA"
 * 			}
 * 		}
 
 *	 Metodos privados
 *	 ----------------
 *
 *	 Desde java 9 se pueden incluir metodos privados
 *	 Son utilizados desde los metodos default
 *	 Un metodo privado tambien puede ser static, para poder llamarlo dentro de un metodo static
 *
 *	 Ejemplo:
 */

interface InterMetodoPrivado{
	//uso interno en la interfaz
	private int mayor (int a, int b){
		return (a>b)?a:b;
	}

	private int menor (int a, int b){
		return (a<b)?a:b;
	}

	default int suma (int a, int b){
		int s=0;
		//llamada a metodos privados
		for (int i = menor(a,b);i<mayor(a,b);i++){
			s+=i;
			System.out.println(a + " : " + b + " : " + s);
		}
		return s;
	}
}

class TestMetodoPrivado implements InterMetodoPrivado{
	public static void main(String[] args) {
		
		TestMetodoPrivado tmp = new TestMetodoPrivado();
		int x = tmp.suma(5, 10);
		
		
		
		System.out.println(x);
	}
}

/*	 Revision de conceptos
 * 	 ---------------------
 * 
 * 	 Indicar por que la siguiente interfaz no complilaria
 * 	
 * 	 public interface MyInterfaz{
 * 		protected void m();			// fail. los metodos a implementar deben ser public abstract
 * 		default int m1(){ return 10;}	// ok. metodo default
 * 		static void m2();			// fail. metodo static debe tener codigo, no se puede implementar 
 * 		abstract void m3(){}		// fail. todos los metodos son abstract pero solo se pueden implementar
 *	}
 *				
 * 	 los metodos m, m2 y m3 son incorrectos
 * 
 * 			
 * 	
 * 
 */

public class V33_Interfaces_J8_J9 {
	
	public static void main(String[] args) {

		
	}
}
