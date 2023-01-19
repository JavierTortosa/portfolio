

/*
 * 	JAVA ENTERPRISE EDITION
 * 	-----------------------
 * 
 * 	Permite utilizar arquitecturas de N capas distribuidas y se apoya ampliamente en componentes de software modulares ejecutándose sobre un servidor de aplicaciones. 
 *  Java EE está definido por una especificación similar a otras especificaciones del Java Community Process (JCP)
 *  Java EE es también considerado informalmente como un estándar 
 *  Se deben de cumplir ciertos requisitos de conformidad para declarar que sus productos son conformes a Java EE
 * estandarizado por JCP.
 * 
 * 		JCP		Java Comunity Process
 * 
 * 	PLATAFORMA JAVA
 * 	---------------
 * 
 * 		JAVA SE	Standard Edition					La base del lenguaje Java
 * 		JAVA EE	Enterprise Edition					Java Empresarial orientado a aplicaciones web
 * 		JAVA ME	Micro Edition						Java orientado a movil
 * 		JAVA FX
 * 
 * 		JVM		Java Virtual Machine				traduce el codigo para el sistema operativo en uso
 * 		API		Aplication Program interface
 * 
 * 		GUI		Graphics User Interface				Interfaz grafica de usuario
 * 		
 * 	ARQUITECTURA JAVA EE
 * 	--------------------
 * 	
 * 	La arquitectura Java EE está basada en tres conceptos clave: 
 * 	
 * 		SERVICIOS		Servicios proporcionados por el contenedor (loggin, seguridad,...)
 * 		CONTENEDORES	Entornos en tiempo de ejecucion
 * 		COMPONENTES		Son objetos Java que contienen la lógica de la aplicación y usan los servicios del contenedor
 * 
 * 	Estos tres conceptos permiten a Java EE definir una arquitectura de capas: 
 * 
 * 			*****************************************************************
 * 
 * 			CAPA CLIENTE 	----------------->	CAPA SERVIDOR 	-> CAPA DATOS
 * 							\------------------------------------> CAPA DATOS
 * 			CAPA CLIENTE	<-	CAPA WEB	<-	CAPA SERVIDOR	<- CAPA DATOS
 * 
 * 			*****************************************************************	
 * 
 * 		CAPA CLIENTE			Capa que se ejecuta en el ordenador del usuario
 * 		CAPA WEB/PRESENTACION	Recoge la informacion del servidor y la transforma al formato de la capa cliente
 * 		CAPA SERVIDOR/NEGOCIO	Recibe la informacion del cliente hacia los datos y devuelve el resultado
 * 		CAPA DATOS				donde persisten los datos (base de datos por ej.)
 * 
 * 		MVC		Modelo Vista Controlador			Modelo tipico de construccion de una aplicacion
 * 														Modelo		: Capa de acceso a datos
 * 														Vista		: Capa de presentacion(por pantalla por ej)
 * 														Controlador	: Capa de negocio
 * 	
 * 	CAPA CLIENTE
 * 	------------
 * 
 * 	Es donde interactua el usuario mandando y recibiendo la informacion
 * 
 * 	CAPA WEB/PRESENTACION
 * 	---------------------
 * 
 * 	La capa de presentación está formada por la lógica de aplicación
 *  Prepara datos para su envío a la capa de cliente 
 *  Procesa solicitudes desde la capa de cliente para su envío a la lógica de negocios del servidor.
 *  
 *  	JSP		Java Server Page					tecnología que ayuda a crear páginas web basadas en HTML y XML
 * 		SERVLET										es una clase en Java para ampliar las capacidades de un servidor.
 * 	
 * 	CAPA DE NEGOCIO
 * 	---------------
 * 
 * 	Expone la lógica necesaria a la capa de presentación para que el usuario interactúe con la aplicación
 * 	
 * 	Enterprise Java Beans
 * 	---------------------
 * 	
 * 	Son una de las interfaces que forman parte del estándar de construcción de aplicaciones empresariales J2EE
 * 
 * 		EJB		Enterprise Java Beans				
 * 		CORBA	
 * 		JMS		Java Messaging Service				
 * 	
 * 	Tipos de EJB (Enterprise Java Beans)
 * 	------------------------------------
 * 
 * 	Entity EJB	 				: Encapsula los objetos del lado del servidor que almacena los datos
 * 	Session EJB	  				: Gestionan el flujo de la información en el servidor.
 * 	EJB Dirigidos por mensaje 	: Son los únicos beans con funcionamiento asíncrono.
 * 
 * 	JAVA DATABASE CONNECTIVITY 
 * 	--------------------------
 * 
 * 	JDBC es una especificación para acceder a una base de datos relacional de una manera común y coherente. 
 *  Con JDBC, puede ejecutar sentencias SQL y obtener resultados en diferentes bases de datos utilizando API comunes. 
 *  Un controlador específico de la base de datos se encuentra entre la llamada JDBC y la base de datos
 *  Traduce las llamadas JDBC a llamadas API específicas del proveedor de la base de datos. 
 * 
 * 		JDBC	Java DataBase Connectivity
 * 
 * 	JAVA CONNECTOR ARCHITECTURE
 * 	---------------------------
 * 
 * 	Las API (JCA) se pueden utilizar para comunicarse con sistemas de integración empresarial (EIS)
 *  Tiene controladores de base de datos para negociar la comunicación entre las API JDBC y las bases de datos
 *  Tiene adaptadores JCA entre las llamadas JCA y los EIS. 
 *  La mayoría de las aplicaciones EIS ahora proporcionan API REST, que son livianas y fáciles de usar
 *  REST podría reemplazar a JCA en algunos casos. 
 *  Si se utiliza JCA, obtiene soporte para transacciones y agrupaciones del servidor de aplicaciones JEE.
 *  
 * 		JCA		Java Connector Architecture			API que se puede usar para comunicarse con sistemas EIS
 * 		EIS		Empresarial Integration System		Programas tipo SAP
 * 
 * 	WEB SERVICES
 * 	------------
 * 
 * 	Los servicios web son componentes de aplicaciones remotas y exponen API autónomas. 
 * 	Los servicios web se pueden clasificar en términos generales según los dos estándares siguientes:
 *  
 * 		SOAP	Simple Object Acces Protocol		
 * 		REST	Representation State Transfer		API que devuelven la mayoria de aplicaciones EIS
 * 
 * 	
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Saludos hola = new Saludos();
		
		hola.Saludos("Mauricio");
		hola.Saludos("Mauricio", "Raul");
		
		hola.Saludos();
	}
}
