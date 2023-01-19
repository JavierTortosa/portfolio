package seccion4_poo;

/*
 * 	 Modificadores de acceso
 * 	 -----------------------
 * 
 * 	 Funcion y tipos
 * 	 ---------------
 * 
 * 	 Determinan la visibilidad de los miembros de una clase
 *	 La siguiente tabla indica los tipos de modificadores y donde se aplican:
 * 
 *								public	protected	(default)	private
 * 					clase		SI		NO			SI			NO
 * 					atributo	SI		SI			SI			SI
 * 					metodo		SI		SI			SI			SI
 * 					constructor	SI		SI			SI			SI
 * 
 * 	- 	Public (cualquier sitio)
 * 
 * 		Puede utilizar ese miembro de la clase en su mismo paquete o culaquer otro
 * 
 * 	-	Default	(solo mismo paquete)
 * 
 * 		Es el modificador por defecto. 
 * 		Si no se especifica otro modificador se aplia default
 * 		Solo es accesible desde clases de su mismo paquete
 * 
 * 	-	Private	(solo misma clase)
 * 
 * 		El miembro solo es accesible desde el interior de la clase
 * 		Muy habitual en atributos para encapsulacion
 * 
 * 	
 * 	 Tabla de visibilidad segun modificador
 * 
 *									public	protected	(default)	private
 * 					Otra Clase		Si		SI			SI			SI
 * 					Mismo Paquete	SI		SI			SI			NO 
 * 					Otro paquete	SI		NO			NO			NO
 * 					Subclase		SI		SI			NO			NO				
 * 					Todos			SI		NO			NO			NO
 * 
 * 
 */

public class V23_ModificadoresDeAcceso {
	public static void main(String[] args) {
	}
}
