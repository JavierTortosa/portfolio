package tema5_bucles;

import java.util.Scanner;



/*
 * IF - ELSE
 * ---------
 * 
 * 	Sirve para tomar decisiones segun una condicion
 * 	Se puede interpretar como: si (lo que sea) es verdadero pues hacemos esto si no pues hacemos lo otro
 * 
 * 	Estructura
 * 
 * 			if(condicion){
 * 				si se cumple la condicion
 * 			} else {
 * 				si 	no se cumple la condicion
 * 			}
 * 
 * 
 * 	Se les conoce también como estructuras selectivas de casos dobles
 * 	la clausula else no es obligatoria
 * 
 * IF - ELSE - Anidados
 * 
 * Estructura
 * 
 * 			if(condicion 1){
 * 
 * 				//se cumple condicion 1
 * 
 * 				if (condicion 2) {
 * 
 * 					//se cumple condicion 2
 * 
 * 				} else {
 * 
 * 					//no se cumple condicion 2
 * 				}
 * 			} else {
 * 
 * 				//no se cumple la condicion 1
 * 			}
 * 
 * CICLO FOR
 * ---------
 * 
 * 	Sirve para repetir una cantidad de veces dada un codigo
 * 	conociendo un valor especifico inicial y otro valor final
 * 	permiten determinar el tamaño del paso entre cada "giro" o iteración del ciclo
 * 
 * 	Lo podemos interpretar como: repite las veces que sea lo que sea
 * 
 * 	Estructura:
 * 
 * 			for (inicializacion; condicion; incremento){
 * 				instrucciones que se va a repetir
 * 			}
 * 
 * 	Como Funciona:
 * 
 * 		Inicializacion	:	Se usa una variable de control ya instanciada o podemos instanciar una para el bloque for
 * 		Condicion		:	si no se cumple la condicion se sale del bucle
 * 		Instrucciones	:	si se cumple la condicion se ejecutan estas instrucciones
 * 		Incremento:		:	cantidad del incremento en cada ciclo puede ser positivo o negativo
 * 		Finalizacion	:	Si la condicion se cumple se sale del bucle y continua el programa normalmente
 * 
 * Ejemplo
 * 			for(int i; i<10; i++){
 * 				System.out.println("Estamos contando hasta 10);
 * 			}
 * 
 * A destacar:
 * ------------
 * 
 * 	La variable de control podemos llamarla como queramos y puede ser del tipo que queramos
 * 	La condicion para finalizar el bucle tambien puede ser cualquier condicion que consideremos
 * 	Si no ponemos la llave despues de la linea del for solo se ejecuta la primera linea de codigo
 * 	dentro de las lineas de codigo a repetir se pueden incluir mas sentencias for. esto son for anidados
 * 	Depende directamente del inicio y final dado	
 * 
 * 	Ejercicios Ciclo For
 * 	--------------------
 */
	
class BucleFor {
	
	public static void main (String[] args) {
		/*
		Ejercicio #1
		Enunciado: Hacer una cuenta regresiva de números con el ciclo for.
		*/
		
		for (int i = 100 ; i>0; i--) System.out.println(i);
		
		/*
		Ejercicio #2
		Enunciado: Usa el bucle for para imprimir strings hasta cierto número.
		Mostrar la suma  de 1 hasta n número ingresado.
		*/
		
		int ciertoNumero = 10;
		for (int i=0; i<ciertoNumero; i++) {
			System.out.println("hasta cierto numero");
		}
		
		int n=10;
		int suma=0;
		
		for (int i=0; i<=n ; i++) {
			suma += i;
		}
		System.out.println(suma);
		
		
	}
}

 /* 
 * 	CICLO WHILE
 * 	-----------
 * 
 * 	Es una estructura ciclica
 * 	No necesitamos saber el valor inicial para empezar
 * 	Repite un codigo dado hasta que se cumple la condicion dada
 * 	No depende de valores numericos sino booleanos
 * 	
 * 	Lo podemos interpretar como: mientras se cumpla la condicion, repite el codigo
 * 
 * 	Estructura:
 * 
 * 			while (condicion) {
 * 				codigo a repetir
 * 			}
 * 
 * 		La llave no es obligatoria, pero si no la ponemos solo ejecutara la primera linea de codigo
 * 		Dentro de las llaves podriamos encontrar mas ciclos while. esto serian ciclos while anidados
 * 
 * Ciclo Do - While
 * ----------------
 * 
 * 	Es una estructura ciclica
 * 	No necesitamos saber el valor inicial para empezar
 * 	Repite un codigo dado hasta que se cumple la condicion dada
 * 	No depende de valores numericos sino booleanos
 * 	La diferencia de while es que do-while ejecuta el codigo una vez antes de mirar si se cumple la condicion
 * 
 * 	Lo podemos interpretar: repite este codigo mientras se cumpla la condicion
 * 
 * 	Sintaxis:
 * 
 * 				do{
 * 					codigo a repetir;
 * 				}while (condicion);
 * 
 * 		Primero ejecuta el codigo
 * 		A continuacion evalua la condicion y repite hasta que no se cumpla la condicion
 * 		
 * 	SCOPE
 * 	-----
 * 
 * 	alcance o al área donde una variable puede utilizarse
 * 	Normalmente las variables solo son accesibles dentro del bloque en que se definen
 * 	Si definimos una variable dentro de un bloque if esta variable sera valida fuera del if
 * 	El SCOPE nos ayuda a delimitar quien tiene acceso a partes de nuestro codigo y asi aumentar la seguridad
 * 
 * 	TIPOS DE SCOPE
 * 	--------------
 * 
 * 	GLOBAL SCOPE		:	Cuando una variable está declarada fuera de una función o de un bloque. 
 * 							Vamos a poder acceder a este tipo de variables desde cualquier parte de nuestro código
 * 							ya sea dentro o fuera de una función
 * 		
 * 	LOCAL SCOPE			:	Las variables que definimos dentro de una función son variables locales
 * 							van a vivir únicamente dentro de la función en donde las hayamos declarado 
 * 							si intentamos accederlas fuera de ella, dichas variables no van a estar definidas.
 * 
 * 	GLOBAL AUTOMATICA	:	Si asignamos un valor a una variable que no ha sido declarada 
 * 							Se convertirá automáticamente en una variable global.
 * 
 * 	BLOCK SCOPE			:	está limitado al bloque de código donde fue definida la variable
 * 							las variables solo van a vivir dentro del bloque de código correspondiente
 * 
 * 	LEXICAL SCOPE		:	las funciones hijas están vinculadas al contexto de ejecución de sus padres
 * 
 * 
 * 	SWITCH
 * --------------
 * 
 * 	Es una estructura de control condicional
 * 	Se utiliza para definir un comportamiento cuando una variable puede tener multiples resultados
 * 	Envia la ejecución a diferentes partes del código en función del valor de la expresión. 
 * 	La expresión puede ser tipos de datos primitivos byte, short, char e int.
 * 
 * 	Sintaxis:
 * 
				switch(expresión)
				{
				 // declaración case
				 // los valores deben ser del mismo tipo de la expresión
				 case valor1 :
					// Declaraciones
				 break; // break es opcional
				 
				 case valor2 :
				 	// Declaraciones
				 	break; // break es opcional
				 	
				 	// Podemos tener cualquier número de declaraciones de casos o case
				 	// debajo se encuentra la declaración predeterminada, que se usa
					//	cuando ninguno de los casos es verdadero.
				 	// No se necesita descanso en el case default
				 
				 default :
				 	
				 	// Declaraciones
				}
				
 * 	Reglas importantes para declaraciones switch:
 * 	---------------------------------------------
 * 
 * 	Los valores duplicados de los case no están permitidos. 
 * 	El valor para un case debe ser del mismo tipo de datos que la variable en el switch. 
 * 	El valor para un case debe ser una constante o un literal. Las variables no están permitidas. 
 * 	La declaración break se usa dentro del switch para finalizar una secuencia de instrucción
 * 	La declaración break es opcional. Si se omite, la ejecución continuará en el siguiente case.
 * 	La instrucción default es opcional, y debe aparecer al final del switch. 
 * 
 * 	Omitir la declaración break:
 *		La declaración break es opcional. 
 *		Si omitimos el break, la ejecución continuará en el siguiente case. 
 *		A veces es deseable tener múltiples case sin declaraciones break entre ellos. 
 *
 *	Ejercico Switch
 *
 *	Enunciado: 
 *		Introducir un dato tipo entero por teclado y verificar si pertenece a una opción con la sentencia switch.
 *		hacer que muestre si es laborable o fin de semana
 */

class miSwitch{
	
	public static void main(String[] args) {
		
		Scanner textoTeclado = new Scanner(System.in);
		
		int dia=0;
		
		System.out.println("Introduce el numero dia de la semana: ");
		dia = textoTeclado.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIERCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default:
			if(dia<1 || dia>12)
				System.out.println(dia +" no es un numero valido");
		}
		
		switch (dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Dia laboral");
			break;
		case 6:
		case 7:
			System.out.println("Fin de semana");
		}
	}
}
	
 /* 
 * 	BREAK Y CONTINUE
 * 	----------------
 * 
 * 	Hay 2 sentencias para forzar la salida de un bucle
 * 	
 * 		break		:	sale completamente del bucle
 * 		continue	:	sale de la iteraccion actual y pasa a la siguiente
 * 
 * 	Estas sentencias normalmente van dentro de un if-else
 * 	Se pueden usar con etiquetas para que vayan a la etiqueta indicada en lugar de salir directamente
 * 		
 * 	
 * 	El break sale del bucle y no se ejecutara lo que venga despues del break
 * 		Su uso normal es en las sentencias Switch
 * 
 * 	El continue sale de la interaccion actual y saltar a la siguiente
 * 		Se suele usar cuando tenemos una busqueda o similar y ya hemos encontrado la que buscabamos		
 * 	
 * RETURN
 * -------------
 * 
 * La sentencia Return es usada para regresar puntualmente de algún método de llamada
 * Opcionalmente puede devolver algún valor
 * 
 * Principales funciones:
 * 		Tiene como función indicar que el método en cuestión ha concluido.
 * 		Cuando se manipule más de una instancia del mismo tipo, 
 * 			se usa Return para evitar que se interprete de distintas maneras.	
 * 
 * 
 */
	
class UsoDeReturn{

	public int cero () {
		return 0;
	}

	public void saludo() {
		System.out.println("Hola Pedro");
	}
}
	
public class IndiceApuntes {
	
	public static void main(String[] args) {

		UsoDeReturn retorno = new UsoDeReturn();
		System.out.println("hola, que tal");
		System.out.println("como has estado");
		
	}

}
