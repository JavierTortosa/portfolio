package seccion6_Modularidad;

/*	 Modulos anonimos y automaticos
 * 	 ------------------------------
 * 
 * 	 Modulos Anonimos
 * 	 ----------------
 * 	
 * 	 Conjunto de paquetes de clases de una aplicacion que no forman parte de un modulo.
 * 	 Habitualmente se distribuyen en un .jar
 * 	 Desde estas clases, se puede acceder a cuaquier paquete de clases que se encuentre en el classpath
 * 	incluyento otros modulos anonimos como estandares
 * 	 Solo pueden acceder a las clases de un modulo anonimos las clases de otros modulos anonimos
 * 	 
 
 *	 Modulos Automaticos
 *	 -------------------
 *
 * 	 Cuando un modulo anonimo se incluye en el module-path (que no el class-path) de una aplicacion modular,
 * 	se convierte en un modulo automatico
 * 	 Desde los modulos automaticos se puede acceder a cualquier paquete de clases, tanto modulos anonimos
 * 	como automaticos como estandares
 * 	 Exportan implicitamente todas sus clases, que podran ser utilizadas por otros modulos que lo requieran
 * 
 */

public class V56_ModulosAnonimos {

}
