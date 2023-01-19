package seccion6_Modularidad;

/*	 Compilacion y ejecucion de modulos
 * 	 ----------------------------------
 * 
 * 	 Estructura de ejemplo
 * 	 ---------------------
 * 	
 * 	 Partimos de la siguiente estructura de modulos y clases de ejemplo
 * 
 * 		raiz
 * 			modulo1					//com.module1
 * 				module-info.java
 * 				test.java
 * 
 * 			modulo2					//com.module2
 * 				module-info.java*
 * 				Oper.java
 * 
 * 		************ este ejmplo son los proyectos ************   
 * 						V54_Ejemplo_modulo1
 * 						V54_Ejemplo_modulo2
 * 		*******************************************************
 * 
 
 *	 Compilacion de un modulo en la linea de comandos
 *	 ------------------------------------------------
 *
 * 	 Desde el directorio raiz, el que contiene el modulo a compilar
 * 
 * 		javac --module-path dir_modulos_que_depende -d dir_destino_ficheros
 * 
 * 	 Para compilar el ejemplo
 *
 * 		modulo2: javac -d modulo2 modulo2/*.java
 * 
 * 				-d modulo2 		-> destino donde queremos guardar los .class con sus paquetes
 * 				modulo2/*.java 	-> direccion donde estan los .java que queremos compilar
 * 
 * 		modulo1: javac --module-path modulo2 -d modulo1 modulo1/*.java
 * 
 * 				--module-path modulo2 	-> direccion (que no nombre) donde se encuentra el modulo
 *				-d modulo1 				->donde queremos depositar los archivos de compilacion del modulo1
 *				modulo1/*.java 			-> donde se encuentran los archivos .java a compilar
 *
  
 *	----------------------------------------------------------------------------------------------------------
 * 	EN MI CASO:
 * 
 * 		modulo2: javac -d modulo2 V54_Ejemplo_modulo2/src/com/operaciones/*.java
 * 		modulo1: javac --module-path modulo2 -d modulo1 V54_Ejemplo_modulo1/src/com/cliente/*.java
 * 
 * *NO CONSIGO HACER QUE FUNCIONE!!!!!!
 * 	----------------------------------------------------------------------------------------------------------
 * 
 
 * 	 Ejecucion de un modulo
 * 	 ----------------------
 * 
 * 	 Desde el directorio raiz, el que contiene al modulo a ejecutar
 * 		
 * 		java --module-path dir_modulos --module nombre_modulo/loc_clase
 * 
 * 	 Ejecucion del ejemplo:
 * 
 * 		java --module-path modulo1;modulo2 --module com.module1/com.cliente.Test
 * 
 * 									o
 * 
 * 		java --module-path . --module com.module1/com.cliente.Test
 * 
  
 *	 Abreviaturas
 *	 ------------
 *
 *  	Parametro			Abreviatura
 * 
 * 		--module-path		-p
 * 		--module			-m
 * 
 * 	 La compilacion y ejecucion del modulo1 de ejemplo podria ser:
 * 
 * 		javac -p modulo2 -d modulo1 modulo1/*.java
 *
 *		javac -p . -m modulo1/com.cliente.Test
 *
 
 *	 Revision de conceptos:
 *	 ----------------------
 *
 *	 Queremos ejecutar la clas com.Test que se encuentra dentro del modulo mymodule.
 *	 Si todos los modulos se encuentran dentro del directorio mods, indica la instruccion a ejecutar
 *
 *	 a. java -p ./mods/mymodule -m com.Test
 *	 b. java -p mods/mymodule -m mods/com.Test
 *	 c. java -m mods/mymodule/com.Test
 *	 d. java -p mods -m mymodule/com.Test
 *
 *	 Respuesta la d.
 *		java 				: para compilar
 *		-p					: para el --module-path
 *		mods				: directorio donde estan los modulos
 *		-m					: para --module
 *		mymodule/com.Test	: nombre del modulo(mymodule) y la clase con la direccion completa(com.Test)	
 *		
 */

public class V54_CompilacionModulos {

	public static void main(String[] args) {

		
	}

}
