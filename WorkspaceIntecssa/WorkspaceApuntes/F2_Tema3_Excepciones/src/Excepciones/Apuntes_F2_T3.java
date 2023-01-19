package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * 	Manejo de EXCEPCIONES
 * 	---------------------
 * 
 * 	El manejo de excepciones es que automatiza gran parte del código de manejo de errores
 * 	El manejo de excepciones agiliza el manejo de errores que se ejecuta automáticamente cuando ocurre un error
 * 	No es necesario verificar manualmente el éxito o el fracaso de cada operación específica o llamada a un método. 
 * 	Si se produce un error, será procesado por el manejador de excepciones.
 * 
 * 	Todas las clases de excepción se derivan de una clase llamada Throwable
 * 	Hay dos subclases directas de Throwable: Exception y Error: 
 *  
 * 		Exception:
 * 			Los errores que resultan de la actividad del programa están representados por subclases de Exception. 
 * 				Por ejemplo, dividir por cero
 * 			Una subclase importante de Exception es RuntimeException
 * 				Representa varios tipos comunes de errores en tiempo de ejecución.
 * 
 * 		Error:
 * 			Las excepciones de tipo Error están relacionadas con errores que ocurren en la JVM y no en el programa
 * 				Por ejemplo, la rotura del teclado
 * 
  
 * 	Fundamentos de manejo de excepciones
 * 	------------------------------------
 * 
 * 	El manejo de excepciones Java se gestiona a través de cinco palabras clave: 
 * 
 * 		try, catch, throw, throws y finally
 * 
 * 	try:
 * 	Las declaraciones de programa que desea supervisar para excepciones están contenidas dentro de un bloque try
 * 	Las excepciones generadas por el sistema son lanzadas automáticamente por el sistema en tiempo de ejecución. 
 * 
 * 	catch:
 * 	Si se produce una excepción se puede atrapar esta excepción usando catch y manejarlo de una manera racional. 
 * 	
 * 	throw:
 * 	Para lanzar manualmente una excepción, use la palabra clave throw. 
 * 
 * 	throws:
 * 	En algunos casos, una excepción arrojada por un método debe ser especificada como tal por una cláusula throws. 
 * 
 * 	finally:
 * 	Cualquier código que debe ejecutarse al salir de un bloque try se coloca en un bloque finally.
 * 
 * 	Sintaxis:
 * 
 * 		try {
 * 			expresiona a evaluar
 * 		} catch (Exception e) {
 * 			codigo en caso de que se produzca la excepcion
 * 		} finally
 * 			codigo que se ejecuta al salir tanto si se produce la excepcion como si no
 * 
 * 	Ejemplo:
 */

class DemoException {
	public static void main(String[] args) {
		int [] arrayDemo = new int[5];
		
		try {
			System.out.println("iniciamos el try");
			arrayDemo[6] = 5; 							//esto daria error
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("salta la excepcion porque no se puede añadir un valor fuera de los limites del array");
		} finally {
			System.out.println("esto se ejecuta despues de la excepcion tanto si salta la excepcion como si no");
		}
	}
}

 /* 
 * 	Tipos de Excepciones
 * 	--------------------
 * 
 * 	Hay problemas que podemos solucionar con el codigo y otros que no
 * 
 * 		Runtime Exception:
 * 	
 * 			Son errores generados en el codigo, una division por cero y se pueden/tienen que solucionar
 * 
 * 		IOException
 * 	
 * 			Errores de entrada y salida que suelen ser ajenos al programador. 
 *
 
 * 	Lanzamiento de Excepciones
 *  --------------------------
 * 
 * 	Para lanzar una excepción en tiempo de ejecución vamos a utilizar la palabra clave throw junto a una 
 * instancia de la excepción que queremos lanzar
 *
 * Ejemplo error en tiempo de ejecucion:
 * 
 * 		Si introducimos una edad negativa salta la excepcion con el texto que indicamos
 * 		Utilizamos la excepcion RuntimeException
 */

class DemoLanzarExcepcion {
	 
    private int edad;
 
    public int getEdad() {
        return this.edad;
    }
 
    public void setEdad(int edad) {
        if (edad <= 0)
            throw new RuntimeException("La edad debe ser positiva");// obligamos a que salte un RuntimeException
        this.edad = edad;
    }
    
    
    public static void main(String[] args) {
    	// si lo hacemos directamente salta la excepcion y acaba el programa como con cualquier excepcion
//    	DemoLanzarExcepcion persona = new DemoLanzarExcepcion();
//        persona.setEdad(-10);
        
        // si lo colocamos dentro de un try catch podemos controlar el error y que no acabe la ejecucion
    	try {
    		DemoLanzarExcepcion persona = new DemoLanzarExcepcion();
            persona.setEdad(-10);
        } catch (RuntimeException e) {	// si salta el RuntimeException controlamos el error
            System.out.println(e.getMessage());
        }
    }
}

/*
 * 	Ejemplo error en tiempo de compilacion
 * 
 * 		debemos controlar la excepcion lanzada con throw con el metodo throws (cuidado con la "s")
 * 		Las excepciones en tiempo de compilacion se hacen directamente con Exception
 */

class DemoLanzarExcepcion2 {
	 
    private int edad;
 
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) throws Exception { //aki colocamos el throws (con "s")
        if (edad <= 0)
            throw new Exception("La edad debe ser positiva.");	// aki colocamos el throw (sin "s")
        this.edad = edad;
    }
    
    public static void main(String[] args) {
        try {
        	DemoLanzarExcepcion2 persona = new DemoLanzarExcepcion2();
            persona.setEdad(-10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 * 	Capturar Excepciones
 * 	--------------------
 * 
 * 	Las excepciones más comunes que podemos nombrar:
 * 
 *		Tratar de convertir a entero un String que no contiene valores numéricos.
 * 		Tratar de dividir por cero.
 * 		Abrir un archivo de texto inexistente o que se encuentra bloqueado por otra aplicación.
 *		Conectar con un servidor de bases de datos que no se encuentra activo.
 * 		Acceder a subíndices de vectores y matrices fuera de rango.
 * 
 * 	Ejemplo InputMismatchException:
 * 
 * 		se tiene que importar de 
 * 
 * 				import java.util.InputMismatchException;
 */

class DemoTypeMismatchException {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		try {
			System.out.println("ingresa un valor entero:");
			num = teclado.nextInt();
			int cuadrado = num*num;
			System.out.println("el cuadrado de " + num + " es " + cuadrado);
		} catch (InputMismatchException ex){
			System.out.println("Se debe introducir un numero entero");
			}
	}
}

/*
 * 	Ejemplo anidamiento de try catch
 * 
 */

class DemoTryCatchAnidado{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		try {
		
			System.out.println("Introduce un numero:");
			n1 = sc.nextInt();
		
			try {
				
				System.out.println("Introduce otro numero:");
				n2 = sc.nextInt();
				System.out.println(n1 + " / " + n2 + " = " + n1/(double)n2);;
	
			} catch (InputMismatchException ex) {
				
				sc.nextLine();
				n2=0;
				System.out.println("Debemos introducir un numero");
			
		} catch (ArithmeticException e){
			
			sc.nextLine();
			n2=0;
			System.out.println("no se puede dividir por 0");

		}
			
		} catch (InputMismatchException e) {
			
			sc.nextLine();
			n1=0;
			System.out.println("Debemos introducir un numero");
		}
	}
}
	

/*
 * 	Propagacion de Excepciones
 * 	--------------------------
 * 
 * 	Es el mecanismo para interceptar errores que se produzcan durante la ejecución de las aplicaciones
 * 	son objetos derivados de la clase System.Exception 
 * 	se generan cuando en tiempo de ejecución se produce algún error y que contienen información sobre el mismo
 * 
 * 	Ejemplo:	
 */
	
class Propagacion{
	
	public static void metodo() {
		try {
			System.out.println("En el try del metodo() ");
			metodo2();
			System.out.println("al finalizar el try de metodo()");
			
		}catch(RuntimeException e) {
			
			System.out.println("en el catch de metodo()");
			
		}finally {
			System.out.println("En el finally del metodo()");
		}
	}
	
	private static void metodo2() {
		try {
			System.out.println("En el try del metodo2() ");
			throw new RuntimeException("esta es la excepcion del metodo2");
//			System.out.println("al finalizar el try de metodo2()");
			
		}catch(ArithmeticException e) {
			
			System.out.println("en el catch de metodo2()");
			
		}finally {
			System.out.println("En el finally del metodo2()");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("En el try del main() ");
			metodo();
			System.out.println("al finalizar el try de main()");
			
		}catch(RuntimeException e) {
			
			System.out.println("en el catch de main()");
			
		}finally {
			System.out.println("En el finally del main()");
		}
	}
}

/*
 * 	Excepciones Multiples
 * 	---------------------
 * 
 * 	Es cuando un try puede dar varias excepciones
 * 	Podemos controlar cada excepcion con una linea catch independiente
 * 
 * 	Ejemplo:
 */
class ExcepcionesMultiples{
	
	public static void main(String[] args) {
		
		System.out.println("Introduce 2 numeros");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Numero 1");
			int num1 = sc.nextInt();
			
			System.out.println("Numero 2");
			int num2 = sc.nextInt();
			
			double divideNum =(double) num1/num2;
			
			System.out.println("La division da " + divideNum);
			
		}catch(InputMismatchException e1){
			
			System.out.println("Debes introducir un numero");
			
		}catch(ArithmeticException e2) {
			
			
			
		}catch(Exception e3) {
			
			System.out.println("Ha ocurrido un error. Prueba otra vez...");
		}
	}
	
}

/*
 * 	Multiples excepciones usando instanceOf()
 * 	-----------------------------------------
 * 
 * 	la función instanceOf verifica si un objeto es del tipo dado o no; devuelve un valor booleano	
 * 	
 * 	Ejemplo:
 * 		Usamos el ejemplo anterior pero cambiamos la forma de tratar las excepciones
 */

class ExcepcionesMultiplesInstanceOF {
	public static void main(String[] args) {
		
		System.out.println("Introduce 2 numeros");
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Numero 1");
			int num1 = sc.nextInt();

			System.out.println("Numero 2");
			int num2 = sc.nextInt();

			double divideNum = (double) num1 / num2;

			System.out.println("La division da " + divideNum);

		} catch (Exception e) {
			
			if(e instanceof InputMismatchException) {
				
				System.out.println("Debes introducir un numero");
				
			} else if (e instanceof ArithmeticException){

				System.out.println("no se puede dividir por 0");
				
			} else {
				
				System.out.println("Ha ocurrido un error. Prueba otra vez...");
				
			}
		}
	}
}


public class Apuntes_F2_T3 {

	public static void main(String[] args) {
		
	}
}
