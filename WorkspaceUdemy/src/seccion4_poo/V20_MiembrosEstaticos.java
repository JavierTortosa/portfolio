package seccion4_poo;

/*
 * 	 Miembros Estaticos
 * 	 ------------------
 * 
 * 	 Metodos Estaticos
 * 	 -----------------
 * 
 * 	 Son metodos que no estan asociados a ningun objeto particular de la clase
 * 	 Se declaran con la palabra static
 * 
 * 			class Calc{
 * 				public static int cuadrado (int a){
 * 					return a*a;
 *				}
 *			}
 *
 * 	No es necesario crear ningun objeto para llamar a estos metodos
 * 	No usa atributos de la clase salvo que sean static
 * 	Para llamar un metodo static se usa el nombre de la clase.metodo
 * 	
 * 			int r = Calc.cuadrado(3);
 * 
 * 	Tambien se les puede llamar con cualquier instancia de clase objeto.metodo
 *  
   
 *  Consideraciones metodos estaticos
 *  ---------------------------------
 *  
 *  solo pueden llamar a otros miembros de su misma clase que tambien sean estaticos
 *  no se puede utilizar en el bloque de un metodo estatico ni this ni super
 *  
 *  		class Test{
 *  			int a=2;
 *  			static int b=5;
 *  			
 *  			public static int metodo(){
 *  				int c=a*3; 				//	ERROR!!!
 *  				int n=b+1;				//	OK
 *  				imprime (n);			//	ok
 *  				muestra (n);			// 	ERROR!!!
 *  				return n;
 *  			}
 *  
 *  			static void imprime(int s){...}	// metodo imprime static
 *  			
 *  			void muestra (int s){...}		// metodo muestra NO static
 * 
  	
 * 	 Atributos estaticos
 * 	 -------------------
 * 
 * 	 Son compartidos por todos los objetos de la clase 
 * 	 Se definen con la palabra static
 * 
 * 	 Ejemplo en el main
 * 
 
 *	 Bloques estaticos
 *	 -----------------
 *
 * 	 Se ejecutan 1 sola vez en toda la vida de la clase
 * 	 Solo pueden acceder otros miembros estaticos
 * 
 *  
 *  
 *  
 *  
 */

public class V20_MiembrosEstaticos {

	int a = 2;
	static int b = 5;

	public static int metodo() {
//		int c=a*3; 				//	ERROR!!! change a to static
		int n = b + 1; // OK
		imprime(n); // ok
//		muestra (n);			// 	ERROR!!! change muestra() to static
		return n;
	}

	static void imprime(int s) {
		System.out.println(s);
	}

	void muestra(int s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		System.out.println("Valor de la variable estatica z= " +TestStatic.z);
		
		TestStatic t1 = new TestStatic();
		t1.inc();
		TestStatic t2 = new TestStatic();
		t2.inc();
		System.out.println("Valor de t1.getN()= "+t1.getN()); //da 2
		System.out.println("Valor de t2.getN()= "+t2.getN()); //da 2
		
	}

}

class TestStatic{
	
	static int n=0;
	static int z;
	int j=0;
	
	// bloque estatico
	
		static {
			System.out.println("Esto solo se va a ejecutar 1 vez en toda la vida de la clase");
			z++;
//			j++; // dentro de un metodo static solo puede trabajar con variables static
			System.out.println("Inicializamos z = 0\nLuego hemos hecho un z++\n");
		}
	
	// fin bloque estatico 
	
		
		
	public void inc() {
		n++;
	}
	
	public int getN() {return n;}
	
	public int getZ() {return z;}
	

	

}