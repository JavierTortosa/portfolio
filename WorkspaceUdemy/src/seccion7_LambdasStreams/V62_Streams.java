package seccion7_LambdasStreams;

import java.util.stream.IntStream;

/*	 Streams
 * 	 -------
 * 
 * 	 Que es un stream:
 * 	 -----------------
 * 
 * 	 Es un objeto que permite realizar de operaciones de busqueda, filtrado, etc, sobre un grupo de datos
 * 	 Para manipular un stream utilizamos la interfaz Stream de java.util.stream
 * 	 Hay otras variantes para trabajar con tipos primitivos como: IntStream, LongStream, DoubleStream
 *
 
 * 	 Funcionamiento:
 * 	 ---------------
 *
 * 	 Recorre los datos del primero al ultimo y durante el recorrido realiza algun calculo u operacion
 * 	 Una vez realizado el recorrido el stream se cierra y no puede volver a utilizarse
 * 
 
 *	 Creacion de un stream
 *	 ---------------------
 *
 * 	 A partir de una coleccion
 * 
 * 		ArrayList<Integer> nums = new ArrayList<>();
 * 		nums.add(20); nums.add(100); nums.add(8);
 * 		Stream <Integer> st = nums.stream();
 * 
 * 	 A partir de un array
 * 	
 * 		String[] cads = {"a", "xy", "jl", "mv"};
 * 		Stream<String> st = Arrays.stream(cads);
 * 
 * 	 A partir de una serie discreta de datos
 * 	
 * 		Stream <Double> st = Stream.of(2.4, 7.4, 9.1);
 * 
 * 	 A partir de un rango de datos
 * 
 * 		IntStream stint = IntStream.range (1,10); //crea un stream con los datos del 1 al 9
 * 		IntStream stint2 = IntStream.rangeClosed (1,10);//crea un stream con los datos del 1 al 10
 * 
 
 *	 Tipos de metodos de Stream
 *	 --------------------------
 *
 * 	 Metodos intermedios:
 * 
 * 		 El resultado de su ejecucion es un nuevo stream
 * 		 Ejemplo: filtrado, transformacion de datos, ordenacion, etc
 * 
 * 	 Metodos finales:
 *			
 *		 Generan un resultado
 *		 Pueden ser void o devolver un valor resultado de alguna operacion
 *		 Ejemplo: calculo (suma, resta....) busquedas, reduccion, etc
 *
 * 
 */

public class V62_Streams {

	public static void main(String[] args) {

		IntStream stint = IntStream.range (1,10); //crea un stream con los datos del 1 al 9
		stint.forEach(n->System.out.println(n)); 
		
	}

}
