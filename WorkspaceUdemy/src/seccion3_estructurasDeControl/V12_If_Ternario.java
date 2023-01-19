package seccion3_estructurasDeControl;

/*
 * 	 Instruccion If
 * 	 --------------
 * 
 *   Comprueba una condicion tipo boolean y ejecuta un bloque de codigo si se cumple
 *   Se puede añadir un comando else que ejecuta un bloque alternativo si no se cumple la condicion
 *  
 *  		if(condicion){
 *  			si verdadero
 *  		}else {
 *  			si falso
 *			}  		
 *  
 *   Las llaves solo son obligatorias si el bloque de codigo tiene mas de una linea
 *   si tiene mas de una linea y no se ponen llaves, se considera que solo la primera linea pertenece al if 
 *   Si la condicion no es boolean da error de compilacion
 *  
 *   Operador Ternario
 *   -----------------
 *  
 *   es una forma abreviada de if
 *  
 *  		variable = (expresion) ? si_verdadero : si_falso;
 *  
 *   Comprueba una condicion tipo boolean y si se cumple ejecuta el codigo despues de la interrogacion
 *  si no ejecuta el cofdigo despues de los :
 *  
 *  tanto si se cumple como si no se tiene que devolver un resultado
 *  
 *  		String parImpar = (20%2==0)?"Par":"Impar";
 *  
 *  
 *  
 *  
 * 
 */

public class V12_If_Ternario {

	public static void main(String[] args) {
		
		int numero =21;
		String parImpar=(numero%2==0)?"PAR":"IMPAR";
		System.out.println(parImpar);
		
		
		
	}
}
