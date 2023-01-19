package seccion4_poo;

/*
 * 	 Constructores en la Herencia
 * 	 ----------------------------
 * 
 * 	 	Llamada a constructor de la superclase
 * 		--------------------------------------
 * 
 *  	Todo constructor incluye de forma implicita en sus constructores como primera linea una llamada 
 *  al constructor del padre. si no se especifica nada sera:
 *  
 *  			super();
 *  
 *  	Es una llamada al constructor sin parametros de la superclase
 *  
 * 					Class Padre {
 * 						public Padre(int a){
 * 							System.out.println(b);
 * 						}
 * 					}
 * 
 * 					Class Hija ezxtends Padre{
 * 						public Hija (int b){ //DA ERROR PORQUE LA CLASE PADRE NO TIENE CONSTRUCTOR SIN PARAMETROS 
 * 							super(); // esto se ejecuta lo pongamos o no
 * 							System.out.println(b);
 * 						}
 * 					}
 * 			
 * 	 	Si especificamos que constructor del padre vamos a usar no hace la llamada al constructor por defecto
 * 
 * 							super(25); // el constructor del padre es Padre(int a)
 * 
 * 	--	OJO!!!! Los constructores de la clase Padre llaman al constructor por defecto de la clase Object
 * 
 *
 *	 	Llamada al constructor con parametros
 *		-------------------------------------
 *
 * 		Es posible llamar a otro constructor de la superclase que no sea el constructor sin parametros
 * 		Se utiliza la palabra:
 * 			
 * 							super(argumentos);
 * 
   	
 * 	 RESUMIENDO
 * 	 ----------
 * 
 * 	 para crear una herencia se hace con la palabra extends
 * 
 * 						class hija extends padre {}
 * 
 * 	 Si no queremos que una clase se pueda heredar se hace con la palabra final
 * 
 * 						final class Clase{}
 * 
 * 	 Si no se especifica nada al crear la clase, el padre de dicha clase es object
 * 
 * 	 					class Clase(){} = class Clase() extends Object{}
 *  
 * 	 Los constructores de las clases siempre hacen por defecto una llamada al constructor del padre con:
 * 
 * 						super()
 * 
 *	 Si la clase Padre no tiene el constructor sin parametros dara error de compilacion
 * 	 Se puede llamar a un constructor especifico del padre con:
 * 
 * 						super(argumentos);
 * 
 * 	 Se puede llamar a un constructor especifico del hijo con:
 * 
 * 						this() / this(argumento)
 * 
 * 	 Solo se puede hacer una llamada this o super, y siempre debe ser en la primera linea del constructor	 
 * 
 */


// 							ERROR DE COMPILACION SI NO TENEMOS EL CONSTRUCTOR POR DEFECTO EN LA CLASE PADRE
//							*******************************************************************************

class PadreV27 {
	// Si creamos este constructor el constructor por defecto desaparece
	public PadreV27(int a) {
		System.out.println("1. Estamos en el constructor PadreV27(int a)");
		System.out.println("2. Valor de a en PadreV27(a)= " + a + "\n");
	}
	
	// por lo tanto debemos crear un constructor sin parametros si la clase va a ser heredada
	public PadreV27() {
		this(10);	//en este caso no hay llamada a super porque hay llamada a this
		System.out.println("3. Estamos en el constructor sin parametros de PadreV27\n");
	}
}

class HijaV27 extends PadreV27{
	private int x;
	// cuando creamos este constructor automaticamente llama al constructor por defecto de la clase padre
	
	public HijaV27(int b) {//si no esta el constructor por defecto, este constructor da error de compilacion 

//		super(15); // si llamamos explicitamente al constructor con parametro no hace falta el constructro por defecto

		System.out.println("4. Estamos en el constructor HijaV27(int b)");
		System.out.println("5. valor de a en HijaV27(a)= " + b + "\n");
		this.x=b;
	}
	
	public HijaV27() {
		this(5);
		System.out.println("6. Estamos en el constructor sin parametros de HijaV27");
	}
}

class NietaV27 extends HijaV27{
	int y;
	
	public NietaV27() {
		this (5);
	}
	
	public NietaV27 (int a) {}
	
	public NietaV27(int x, int y) {
	
		super(x);
		this.y=y;
	}
}

public class V27_ConstructoresEnLaHerencia {

	public static void main(String[] args) {
		
		HijaV27 hV27_1 = new HijaV27(); //llamada al constructor sin parametros de la hija (punto 6)
		
		NietaV27 nieta = new NietaV27(2,7);
		
	}
	
}
