package seccion3_estructurasDeControl;

/*
 * 	Instrucciones Repetitivas For y while
 * 
 * 	FOR
 * 	---
 *	
 *	Ejecuta un grupo de instrucciones un numero determinado de veces
 *	Sinstaxis:
 *
 *			for (inicializacion; condicion; incremento){
 *				//instrucciones;
 * 			}
 * 
 * 	repetira las instrucciones desde que la variable toma el valor de inicializacion hasta que la condicion
 * deje de cumplirse
 * 	las llaves son obligatorias si hay mas de 1 instruccion
 * 	si hay mas de 1 instruccion sin llaves, solo se repetira la primera instruccion
 * 	las instrucciones de control tambien son opcionales
 * 
 * 			int i=0;
 * 			for(;i<10;){				//esto es valido
 * 				System.out.println(i);
 * 				i++;
 * 			}
 * 
 * 	tambien pueden contener mas de una sentencia separadas por comas
 * 
 * 			for(int a=0, b=10; a<b;	a++,b--){ //esto es valido
 * 				...
 * 			}
 * 	
 * 	la condicion siempre tiene que ser un boolean
 * 	los incrementos pueden ser de cualquier tipo
 * 	si no se especifica el incremento tendremos un bucle infinito
 * 
 * 	Instruccion Enhanced for
 * 	------------------------
 * 
 * 	Se utiliza para el recorrido, en modo lectura, de arrays y colecciones
 * 	
 * 			for(tipo variable:array){
 * 				//instrucciones;
 * 			}
 * 
 * 	la variable de control va pasando por todas las posiciones del array, pero no es un indice
 * 		
 * 			int[] nums = {2, 4, 6, 8}
 * 			for (int n:nums){
 * 				System.out.println(n);
 * 			}
 * 
 * 	Instruccion while y do while
 * 	----------------------------
 * 
 * 	Ejecuta un bloque de sentencias mientras se cumpla una condicion
 * 	se suele utilizar para hacer repeticiones cuando no esta claro cuantas veces se va a repetir el codigo
 * 	la condicion puede evaluarse al principio con while o al final con do while
 * 
 *  		while (condicion){			do{
 *  			//instrucciones;			//instrucciones
 *  		}							}while (condicion);
 *  
 *  las instrucciones de dentro del bloque provocaran que en algun momento deje de cumplirse la condicion
 * si no bucle infinito.
 * 	la condicion siempre debe dar como resultado un boolean
 * 	
 * 	
 */

public class V15_for_while {

}
