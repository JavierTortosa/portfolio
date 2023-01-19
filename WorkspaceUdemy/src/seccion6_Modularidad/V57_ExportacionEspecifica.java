package seccion6_Modularidad;

/*	 Exportacion Especifica
 * 	 ----------------------
 * 
 * 	 Se puede especificar que un determinado paquete de un modulo sea accesible unicamente por cierto modulo
 * 	 Se emplea la palabra reservada to
 * 
 * 	 Ejemplo:
 * 
 * 			module modulo1{
 * 				exports com.paquete1 to moduloX, modK;
 * 			}
 * 
 * 		El paquete com.paquete1 solo es accesible para el modulo moduloX y modK;
 * 
 
 *	 Dependencias transitivas
 *	 ------------------------
 *
 * 	 Evita redundancias a la hora de requerir dos modulos en los que a su vez uno requiere a otro
 * 
 * 	 Ejemplo:
 * 
 * 		 El modulo 1 requiere el moduloX y el modulo2 requiere el modulo1 y el moduloX
 * 
 *	 		module modulo1{							module moduloX{
 *	 			requires moduloX;						}
 *	 		}
 * 
 * 			module modulo2{
 * 				requires moduloX;
 * 				requires modulo1;
 * 			}
 * 
 * 	 Con dependencia transitiva:
 * 
 * 		 El modulo1 usa requires transitive y hace que cuando el modulo2 incorpore el modulo1 tambien incorpora
 * 		el moduloX
 * 
 *	 		module modulo1{							module moduloX{
 * 				requires transitive moduloX;				}
 * 			}
 * 
 * 			module modulo2{
 * 				requires modulo1;
 * 			}
 * 
 
 *	 Servicios
 *	 ---------
 *
 *	 Es una funcionalidad que expone una aplicacion y que otras aplicaciones utilizan
 *	 Los servicios se describen a traves de una interfaz
 *	 Hay 3. El servicio como tal, el proveedor de servicio y el consumidor del servicio
 *
 * 	 	Servicio: interfaz definida en un modulo:
 * 
 * 			module service{
 * 				export com.Interfaz1;
 * 				//export 	-> en este caso exporta la interfaz
 * 			}
 * 
 * 	 	Proveedor de servicio: Modulo que implementa una interfaz:
 * 	
 * 		 	module proveedor{
 * 				provides com.Interfaz1 with com.Clase1;
 * 				//provides 	-> interfaz que se va a implementar
 * 				//with		-> clase que implementa la interfaz
 * 			}
 * 
 * 	 	Consumidor: Modulo que utiliza el servicio
 * 
 * 			module consumidor{
 * 				uses com.Interfaz1;
 * 				//uses 		-> indica la interfaz que se va a utilizar
 * 			}
 * 
 
 *	 Acceso por reflexion
 *	 --------------------
 *
 * 	 Es posible especificar que los paquetes del modulo son accesibles via reflexion a otros modulos
 * 
 * 			module moduloX{
 * 				opens com.paquete;
 * 			}
 * 
 * 	Incluso que lo sean para ciertos modulos
 * 
 * 			module moduloX{
 * 				opens com.paquete to modA, modB;
 * 			}
 */

public class V57_ExportacionEspecifica {

}
