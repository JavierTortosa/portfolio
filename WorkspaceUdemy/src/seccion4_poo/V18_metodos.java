package seccion4_poo;

/*
 *	 Metodos y sobrecarga
 *	 --------------------
 *
 * 	 Un metodo es una funcion que realiza una determinada tarea
 * 	 Siempre se encuentra dentro de una clase
 * 	 Puede recibir parametros y devolver resultados
 * 
 * 	 Estructura:
 * 
 * 			modificador tipo_devolucion nombre_metodo(parametros){
 * 				//instrucciones;
 * 				//return valor_devuelto; //return es si tiene que devolver algo si no no hace falta 
 * 
 * 	 	modificador: public, private...
 * 		tipo_devolucion: String, int... o void si no tiene que devolver nada
 * 		nombre_metodo: nombre propio del metodo, debe cumplir con las normas de java
 * 		parametros: asignacion de tipo y variable a los parametros recibidos
 * 
 *	 Ejemplo:
 * 
 * 			public int sumar(int a, int b){
 * 				int s= a+b;
 * 				return s;
 * 			}
  
 * 	 Llamada a metodo
 * 	 ----------------
 * 
 * 	 Los metodos se crean dentro de clases y para llamarlos hay que crear un objeto de dicha clase
 * 	 
 * 	 Sintaxis
 * 
 * 			objeto.metodo(argumentos);
 * 
 * 	 Si un metodo se va a llamar desde su misma clase no hace falta crear el objeto de la clase
  	 
 * 	 Sobrecarga de metodos
 * 	 ---------------------
 * 	
 * 	 una clase puede tener varios metodos con el mismo nombre, esto es la sobrecarga
 * 	 un metodo sobrecargado debe tener diferente cantidad o tipo de parametros sino dara error de compilacion
 * 	 el tipo de devolucion no afecta a la sobrecarga
 * 
 * 	 Ejemplo
 * 	
 * 			(1) public int sumar (int a, int b);{...}
 * 			(2) public int sumar (int a);{...}
 * 			(3) public int sumar (long b);{...}
  
 *	 Llamada a metodos sobrecargados
 *	 -------------------------------
 *
 *	 Para llamar a un metodo sobrecargado u otro se realiza de la misma manera que un metodo normal
 *	 Java determina a que metodo llamar segun los parametros dados
 *
 * 			sumar(3,9) 	-----> metodo (1)
 * 			suamr(5)	-----> metodo (2)
 * 			sumar(7L)	-----> metodo (3)
 * 
 * 	 PRECAUCION
 * 	 ----------
 * 
 * 	 Cuando hay varios posibles metodos que se puedan ejecutar en una llamada:
 * 
 * 			PRIMERO:	coincidencia exacta
 * 			SEGUNDO:	promocion de tipos
 * 			TERCERO:	autounboxing
 * 
 * 							metodo(4);				//esta seria la llamada al metodo
 * 					CASO 1
 * 							void metodo(int a);		//	metodo al que se llama (coincidencia exacta)
 * 							void metodo(Integer e);	//
 * 					CASO 2
 * 							void metodo(long a);	//	metodo al que se llama (promocion de tipos)
 * 							void metodo(Integer a);	//
 *  				CASO 3
 * 							void metodo(Long a);	//	
 * 							void metodo(Integer a);	//	metodo al que se llama (autoboxing)
 * 
 * 		
 * 
 */
							

public class V18_metodos {

}
