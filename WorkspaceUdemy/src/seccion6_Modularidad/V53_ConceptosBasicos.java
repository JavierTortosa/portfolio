package seccion6_Modularidad;

/*	 CONCEPTOS BASICOS DE MODULARIDAD
 * 	 --------------------------------
 * 
 * 	 Que es la Modularidad
 * 	 ---------------------
 * 
 * 	 Es un nivel de division superior al de paquete
 * 	 Agrupa un conjunto de paquetes e incluye informacion de dependecia de los mismos
 * 	 La configuracion de un modulo se incluye en un archivo llamado module-info.java
 * 	 El JDK 9 esta organizado de forma modular
 * 
  
 *	 Descriptor del modulo
 *	 ---------------------
 *
 * 	 Se trata del archivo module-info.java
 * 	 Debe estar en el directorio raiz del modulo
 * 	 Indica los modulos requeridos por nuestro modulo y los paquetes a exportar para otros modulos
 * 	 
 * 	 Sintaxis:
 * 
 * 		 Tenemos un modulo hipotetico llamado moduloTest donde tenemos 2 paquetes de clases
 * 		 El paquete1 nos interesa que lo usen otras clases de otros modulos
 * 		 Al mismo tiempo tenemos un paquete2 que hace uso de un modulo externo llamado moduloExt 
 * 
 * 			Dentro del archivo module-info.java
 * 
 *  			module moduloTest{
 *  				exports paquete1;	//otras clases podran ver las clases del paquete1
 *  				requires moduloExt;	//cualquiera de nuestras clases puede usar las clases de moduloExt
 *  			}
 * 
  
 *	 Ventajas
 *	 --------
 *
 * 	 Mejor control de acceso. 
 * 		Permite que ciertos paquetes sean usados solo por otros paquetes
 * 
 * 	 Claridad de las dependencias
 * 		A traves de module-info, se especifica las dependencias entre modulos
 * 	 	Son evaluadas al compilar y lanzar la aplicacion
 * 
 * 	 Paquetes de distribucion mas pequeños
 * 		Facilita la distribucion de aplicaciones y mejora el rendimiento
 * 
 * 	 Existencia de paquetes unicos
 * 		No puede haber 2 modulos que expongan el mismo paquete
 */

public class V53_ConceptosBasicos {

	public static void main(String[] args) {
		
	}
}
