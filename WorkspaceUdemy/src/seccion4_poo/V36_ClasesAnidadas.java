package seccion4_poo;

/*	 CLASES ANIDADAS (NESTED CLASS)
 * 	 ------------------------------
 * 
 * 	 Se trata de clases definidas dentro de otras clases (clase interna dentro de una externa)
 * 	 Nos podemos encontrar 4 situaciones:
 * 
 * 		
 * 		- Clases Standards			clase interna definida como atributo dentro de una externa
 * 	 	- Clases Estaticas			clase interna definida como atributo static de una externa 
 * 		- Clases locales a Metodo	clase definida dentro de un metodo
 * 		- Clases anonimas			clase interna sin nombre
 * 
 
 *	 Clases Estandares
 *	 -----------------
 *
 * 	 Se definen como un miembro mas de la clase externa
 * 
 * 			class Externa{
 * 				class Interna{
 * 					// metodos y atributos
 * 				}
 * 			}
 * 
 * 	 Para instanciar una clase interna se necesita un objeto de la clase externa
 * 	 
 * 			Externa ext = new Externa();
 * 			Externa.Interna inter = ext.new Interna();
 * 
 * 	 Una clase interna puede definirse con cualquier modificador de acceso, inclusive private
 
 *	 Clases Estaticas
 *	 ----------------
 *
 * 	 Se definen como un miembro estatico de la clase externa
 * 
 * 			class Externa{
 * 				static class Interna{
 * 					// metodos y atributos
 * 				}
 * 			}
 * 
 * 	 Para instanciar una clase interna NO se necesita un objeto de la clase externa
 * 
 * 			Externa.Interna inter = new Externa.Interna();
 * 
 * 	 La clase estatica interna solo puede acceder a otros miembros estaticos de la clase externa
  
 * 	 Clases locales a Metodo
 * 	 -----------------------
 * 
 * 	 Se definen dentro de un metodo de la clase externa
 * 
 * 			class Externa{
 * 				void metodo(){
 * 					class Local{
 * 						// metodos y atributos
 * 					}
 * 				}
 * 			} 			
 * 
 * 	 Unicamente pueden ser instanciadas desde el interior del metodo al que pertenecen
 * 	 No tienen acceso a otras variables locales del metodo salvo que sean finales
 * 	 Si tienen acceso a los atributos de la clase externa
 * 	 No admiten ningun tipo de modificador salvo default
  
 * 	 Clases Anonimas
 * 	 ---------------
 * 
 * 	 Son clases que no tienen nombre.
 * 	 Heredan de una clase existente o implementan una interfaz o una clase abstracta
 * 	 Se definen al vuelo, en la misma instruccion de instanciacion
 * 
 * 			Runnable rb = new Runnable(){ 	//clase anonima que implementa la interfaz Runnable
 * 				public void run(){			//sobreescribe el metodo run de Runnable que es el unico que tiene
 * 					// codigo del metodo run
 * 				}
 * 			}
 
 * 	 Revision de Conceptos
 * 	 ---------------------
 * 
 * 	 Dada la siguiente clase, indica que ocurrira al ejecutar el codigo que aparece a continuacion
 * 
 * 		 class Externa {
 * 			private static int k;
 * 			private static class Interna{
 * 				public void imprimir(){
 * 					System.out.println(k);
 * 				}
 * 			}
 * 		}
 * 
 * 					------		
 * 
 * 		Externa.Interna inter = new Externa.Interna();
 * 		inter.imprimir();
 * 
 * 	Error de compilacion. la clase Interna esta declarada como private, por lo tanto no tenemos acceso a
 * ella, no podemos crear la instancia inter, y mucho menos al metodo imprimir
 * 
 * *******************************************************************************************************
 * 
 * 	 Discute cuales de las instrucciones marcadas no compila y razonalo:
 * 
 * 		 class InternaMetodo{
 * 			int a = 3;
 * 			void metodo(){
 * 				var c=10;
 * 				c++;
 * 				class Local{
 * 					private void met(){
 * 						a++; // linea 1	
 * 						System.out.println(c);// linea 2
 *					}
 *				}
 *				Local l= new Local();// linea 3
 *			}
 *		}
 *
 *	linea 1: bien
 *	linea 2: la clase local no tiene acceso a las variables del metodo por lo tanto no tiene acceso a c
 *	linea 3: bien. estamos instanciando l dentro del metodo donde se define la clase Local 
 */					
 				
public class V36_ClasesAnidadas {

	int x=5;
	
	public void miMetodoNormal() {
		class ClaseLocal{
			
			void miMetodoClaseLocal() {
				System.out.println("el valor del atributo x de la clase externa es: " + x);
			}
		}
		
		ClaseLocal cl = new ClaseLocal();
		cl.miMetodoClaseLocal();
	}
	
	public static void main(String[] args) {
		
		V36_ClasesAnidadas v36ca= new V36_ClasesAnidadas();
		
		v36ca.miMetodoNormal();
	}
	

	
}


