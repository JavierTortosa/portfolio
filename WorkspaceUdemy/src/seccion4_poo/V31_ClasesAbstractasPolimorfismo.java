package seccion4_poo;

/*
 * 	 CLASES ABSTRACTAS Y POLIMORFISMO
 * 	 --------------------------------
 * 
 * 	 Clases Abstractas
 * 	 -----------------
 * 	
 * 	 Un metodo abstracto es aquel que esta declarado pero no implementado
 * 	 Una clase abstracta es una clase que cuenta con al menos un metodo abstracto
 * 	 Tanto la clase como los metodos abstractos se definen con la palbara abstract
 * 
 *		abstract class Clase1{
 *			public abstract int calculo();// ojo al punto y coma... define el metodo pero no lo implementa
 *		}
 * 					
 
 *	 Caracteristicas de las clases abstractas
 *	 ----------------------------------------
 *
 * 	 No es posible crear objetos de una clase abstracta
 * 	 Ademas de metodos abstractos pueden incluir atributos, constructores y metodos standards
 * 	 Una clase que herede una clase abstracta esta obligada a sobreescribir los metodos abstractos heredados
 *  o declararse tambien como abstract
 *   El objetivo de los metodos abstractos es forzar a que todas las subclases tengan el mismo formato de metodo
 *   
 *   Ejemplo:
 */

abstract class Figura{				// definicion de una clase abstracta

	private String color;
	
	public Figura (String color) {
		this.color=color;
	}
	
	public abstract double area();	//definicion de un metodo abstracto
}

class Circulo extends Figura {		//definicion de una clase que hereda de una clase abstracta

	private int radio;
	
	public Circulo(String color, int radio) {
		super(color);
		this.radio=radio;
	}

	@Override
	public double area() {			//definicion del metodo abstracto

		return Math.PI*radio*radio;
	}
}

class Triangulo extends Figura{		//definicion de una clase que hereda de una clase abstracta
	
	private int base,altura;
	
	public Triangulo(String color,int base, int altura) {
		super(color);
		this.base=base;
		this.altura=altura;
	}

	@Override
	public double area() {			//definicion del metodo abstracto 
		return base*altura/2;
	}
}

/*	 Polimorfismo
 * 	 ------------
 * 
 * 	 Es la asignacion de referencias a objetos de subclases en variables de su superclase (abstracta o no)
 * 	 La principal ventaja son:
 * 
 * 		Reutilizacion de codigo: una misma expresion llama a diferentes metodos
 * 	 	Flexibilidad: hace que el programa haga diferentes cosas con la misma instruccion
 * 		Dinamismo: durante la ejecucion del programa se determina a que metodo se tiene que llamar
 * 
 * 	 Consiste en utilizar una misma instruccion para llamar a diferentes versiones de un mismo metodo
 * 	 
 */

class Calculo{
	public static void main(String[] args) {
		
		double area=0;
		
		//definimos la variable f de tipo figura que almacena un objeto Circulo
		Figura f = new Circulo("Rojo", 15);	
		
		area = f.area();												// instruccion comun 
		System.out.println("el area del circulo es  : " + f.area());
		
		//ahora definimos la variable f de tipo figura que almacena un objeto Triangulo
		f = new Triangulo("Verde", 15, 20);
		
		area = f.area();												// instruccion comun
		System.out.println("el area del triangulo es: " + f.area());
		
	}
}

/*	 Metodos abstractos vs finales
 * 	 -----------------------------
 * 
 * 	 Lo contrario a un metodo abstracto es un metodo final
 * 	 Un metodo final es aquel que no puede ser sobreescrito
 * 	 El modificador final se utiliza delante del tipo
 * 
 * 			class Clase1{
 * 				public final int calculo(){
 * 					System.out.println("ESTE METODO SE TIENE QUE USAR ASI Y NO PUEDE CAMBIAR");
 * 				}
 * 			}
 *  
 * 			class Clase2 extends Clase1{
 * 				public int calculo{}		//ERROR de compilacion
 *	 		}
 */

public class V31_ClasesAbstractasPolimorfismo {

	public static void main(String[] args) {

		
		
	}

}
