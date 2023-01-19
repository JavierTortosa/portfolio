package seccion4_poo;

/*
 *	 Creacion e inicializacion de instancias
 *	 ---------------------------------------
 *
 *	 Constructores
 *	 -------------
 *
 *	 - 	Sintaxis
 *
 *			creacion del constructor	class NombreClase{}
 *											modificador NombreClase(parametros){}
 *			
 *			creacion del objeto			NombreClase nombreObjeto = new NombreClase(parametros);
 *
 *	 -	Definicion:
 *		
 *		Es un bloque de codigo que se va a ejecutar al crear un objeto de una clase
 *		Como los metodos, pueden recibir parametros pero no tienen devolucion
 *		Siempre se va a llamar como el nombre de la clase
 *
 *	 -	Constructor por defecto:
 *
 *		Es un constructor que esta definido por defecto si no declaramos ningun constructor
 *		No tiene ningun parametro ni ninguna instruccion
 *		En cuanto creamos un constructor, el constructor por defecto desaparece
 *
 *					class Clase{
 * 						public Clase(int i){
 * 							...
 * 						}
 * 
 * 					Clase myClase = new Clase(); // Error de compilacion. este constructor no existe
 * 
 * 	 -	Sobrecarga de Constructores
 * 
 * 		Una clase puede incluir varios constructores que inicializan los objetos de forma diferente
 * 		Se siguen las mismas normas que en la sobrecarga de metodos
 * 		Las reglas de promocion de tipo y autoboxing tambien son las mismas
 * 		
 * 	 -	Llamadas a otro constructor
 * 
 * 		Desde un constructor se puede llamar a otro constructor de la misma clase
 * 
 *  				this(parametros);
 *  
 *  	Debe ser la primera instruccion del constructor
 *  	
 *  				class Test{
 *  					public Test(){
 *  						this(4);
 *  					}
 *  
 *  					pubilc Test(int n){}
 *  
 *  					public Test(int a, int b){
 *  						int s = a+b;
 *  						this(s);	// ERROR de compilacion. no es la primera linea
 *  					}
 *  				}
 *
 *   -	Bloque de inicializacion de Instancia
 *   
 *   	Son bloques de codigo que se ejecutan cada vez que se crea un objeto de la clase
 *   	Se ejecuta antes que el constructor
 *   	Se delimita por llaves
 *   
 *   				class Test{
 *   					//bloque de inicializacion de instancia
 *   					{
 *   						System.out.println("Estamos en el Bloque de inicializacion de instancia");
 *   					}
 *   
 *   					public Test(){
 *   						System.out.println("Estamos en el Constructor");
 *   					}
 *   				}
 *   
 *   	
 *  
 * 		
 */

class TestConstructores{    
	
	
	//bloque de inicializacion de instancia                                        
	{
		System.out.println("\nCreando Objeto");
		System.out.println("Estamos en el Bloque de inicializacion de instancia\n"); 
	}                                                                              
                                                                                   
	public TestConstructores(){ 
		this(5);
		System.out.println("Estamos en el Constructor sin parametros");  
		
	}           
	
	public TestConstructores(int n) {
		
		System.out.println("Estamos en el Constructor con 1 parametro int");
	}
	
	public TestConstructores(int a, int b) {
		
		System.out.println("Estamos en el Constructor con 2 parametro int");
		metodoIndependiente(a,b);
		
	}
	
	public void metodoIndependiente(int a, int b) {
		System.out.print("Estamos en el metodo independiente. la suma es ");
		System.out.println((a+b));
	}

}                                                                                  

public class V22_CreacionDeInstancias {
	
	public static void main(String[] args) {
		
		TestConstructores t1 = new TestConstructores();
		TestConstructores t2 = new TestConstructores();
		TestConstructores t3 = new TestConstructores(2,4);
		
	}
	
}
