package seccion6_Modularidad;

/*	 Empaquetado de modulos
 * 	 ----------------------
 * 
 * 	 Para empaquetar un modulo en un archivo .jar debemos hacer uso del comando jar
 * 
 * 		jar -c -file=dir_destino/nombre_archivo.jar -C path_Modulo .
 * 
 * 	 dir_destino es el directorio destino del modulo
 * 	 paht_modulo es el directorio raiz del modulo
 *	 El punto "." indica que se incluya todo el contenido del directorio
 *
 *	 Ejemplo:
 *
 *		Queremos tener un directorio llamdo ejecutables donde metemos los jar finales
 *	
 *			jar -c -files=ejecutables/modulo2.jar -C modulo2 .
 *			jar -c -files=ejecutables/modulo1.jar -C modulo1 .
 * 
 * 		Para ejecutar com.module1 desde el directorio ejecutables:
 * 
 * 			java -p . -m com.module1/com.cliente.Test
 * 
  
 *	 Empaquetado en archivos .jmod
 *	 -----------------------------
 * 
 * 	 Similiar a .jar
 * 	 Debe ser utilizado para librerias nativas en vez de modulos en general
 * 	 No es muy comun
 * 
 * 			jmod create --class-path dir_modulo nombre_fichero.jmod
 * 
 * 	 Ejemplo:
 * 
 * 			jmod creat -- class-path modulo2 ejecutables/modulo2.jmod
 * 			jmod creat -- class-path modulo1 ejecutables/modulo1.jmod
 * 
 * 		No se puede utilizar el formato jmod para la ejecucion de modulos
 * 
   
 *	 Comandos jdeps
 *	 --------------
 *
 *	 Se emplea para obtener informacion sobre la dependencia de modulos
 *	 No admite abreviaturas
 *
 *			jdeps -s dir_modulo
 *			jdeps -s dir_modulo/nombre_archivo.jar
 *
 *	 Si depende de algun metodo extra:
 *
 *			jdeps --module-path dir_mod_dependiente -s dir_modulo
 *
 *	 Ejemplo:
 *
 *			jdeps --module-path ejecutables/modulo2.jar -s ejecutables/modulo1.jar
 *
 *		Resultado:
 *			
 *			modulo2 -> java.base
 *			modulo1 -> modulo2
 *
 
 *	 Revision de conceptos:
 *	 ----------------------
 * 
 * 	 Queremos mostrar todas las dependencias de temp/m1.jar
 * 	 teniendo en cuenta que depende del modulo /users/cam/m2.jar
 * 	 Que comando tendremos que usar?
 * 	 
 * 		jdeps --module-path /users/cam/m2.jar -s temp/m1.jar 
 */

public class V55_EmpaquetadoModulos {

}
