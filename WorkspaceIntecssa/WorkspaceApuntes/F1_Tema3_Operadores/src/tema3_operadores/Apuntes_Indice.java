package tema3_operadores;

/*
 * Operadores Aritmeticos
 * ----------------------
 * 
 * Las expresiones realizan acciones especificas segun su operador
 * Pueden ser con 1 o 2 operandos
 * Un operando puede ser:
 * 		una constante, una variable o el resultado de una funcion
 * Los operadores son:
 * 
 * 		Aritmeticos	: 	operaciones matematicas
 * 			Unarios	: 	1 solo operando
 * 				El signo - invierte el signo de una expresion
 * 				
 * 				Prefijos:	a=1;
 * 							b=a++; //b vale 1 y a vale 2
 * 							b=a--; //b vale 1 y a vale 0
 * 
 * 				Postfijos:	a=1;
 * 							b= ++a; //b vale 2 y a vale 2
 * 							
 * 			Binarios:	2 operandos. El orden de evaluacion depende de las reglas de dependencia
 * 
 * 			OPERADOR	RESULTADO
 * 			--------	--------------
 * 				+	:	suma
 * 				-	:	resta
 * 				*	:	multiplicacion
 * 				/	:	division
 * 				**	:	potencia
 * 				%	:	resto
 * 
 * 		Logicos		:	Evaluan una expresion en la que estan implicados uno o dos operandos de tipo logico
 * 
 * 			OPERADOR	NOMBRE		USO					EFECTO
 * 			--------	--------	-------------------	-----------------------------------------------------
 * 				&&	:	AND		:	A=true && B=true	:si A Y B son verdaderos devuelve verdadero
 * 														si A es falso no evalua B
 * 				||	:	OR		:	A=true || B=false	:si A O B son verdaderos devuelve verdadero
 * 														si A es true ya no evalua B
 * 				^	:	XOR		:	A=true ^ B=true		:si A Y B son diferentes devuelve verdadero
 * 				!	:	NOT		:	!A=false			:si A NO es verdadero devuelve verdadero
 * 				&	:	AND		:	A=true & B=true		:si A Y B son verdaderos devuelve verdadero
 * 														si A es falso SIEMPRE evaluara B
 * 				|	:	OR		:	A=true || B=false	:si A O B son verdaderos devuelve verdadero
 * 														si A es true SIEMPRE evaluara B
 * 
 * 		Relacionales:	Se utilizan para verificar relaciones como igualdad, mayo que...
 * 						devuelven un resultado booleano de verdadero o falso
 * 						normalmente se usan: 	VARIABLE OPERADOR_DE_REALCION VALOR
 * 
 * 			OPERADOR		NOMBRE				USO					EFECTO
 * 			--------	-------------------	------------	-----------------------------------------------------
 * 				>	:	Mayor que			: 	A > B	:	 A es mayor que B			
 * 				>=	:	Mayor o igua que	:	A >= B	:	 A es mayor o igual que B	
 * 				<	:	Menor que			:	A < B	:	 A es menor que B			
 * 				<=	:	Menor o igual que	:	A <= B	:	 A es menor o igual que B	
 * 				==	:	Igual que			:	A == B	:	 A es igual que B			
 * 				!=	:	Distinto que		:	A != B	:	 A es distinto que B		
 * 			
 * A nivel de Bits:
 * 
 * 		Operadores:		Las operaciones de bits se utilizan con frecuencia para definir señales o flags
 * 						Son variables de tipo entero en las que sus bits indican si una opción está activada o no. 
 * 			OPERADOR		USO							EFECTO
 * 			--------	-----------	----------------------------------------------------- 
 * 				>> 	:	op1 >> op2 	:	Desplaza los bits de op1 a la derecha una distancia op2
 *				<< 	:	op1 << op2 	:	Desplaza los bits de op1 a la izquierda una distancia op2
 *				>>> :	op1 >>> op2 :	Desplaza los bits de op1 a la derecha una distancia op2 (positiva)
 *				& 	:	op1 & op2 	:	Operador AND a nivel de bits
 *				| 	:	op1 | op2 	:	Operador OR a nivel de bits
 *				^ 	:	op1 ^ op2 	:	Operador XOR a nivel de bits (1 si sólo uno de los operandos es 1)
 *				~ 	:	~op2 		:	Operador complemento (invierte el valor de cada bit)	
 * 
 * 		Operadores de asignacion:
 * 
 *  		OPERADOR		USO						EFECTO
 * 			--------	 ------------		-----------------------------------------------------
 * 				&= 		:	op1 &= op2 		:	op1 = op1 & op2
 *				|= 		:	op1 |= op2 		:	op1 = op1 | op2
 *				^= 		:	op1 ^= op2 		:	op1 = op1 ^ op2
 *				<<= 	:	op1 <<= op2 	:	op1 = op1 << op2
 *				>>= 	:	op1 >>= op2 	:	op1 = op1 >> op2
 *				>>>=	:	op1 >>>= op2 	:	op1 = op1 >>> op2
 *
 * Orden que se realizan las operacines
 * ------------------------------------
 * 	Las operaciones se realizan de arriba a abajo y de izquierda a derecha
 * 	
 * 		postfix operators 		:	[] . (params) expr++ expr--
 * 		unary operators 		:	++expr --expr +expr -expr ~ !
 * 		creation or cast 		:	new (type)expr
 * 		multiplicative 			:	* / %
 * 		additive 				:	+ -
 * 		shift 					:	<< >> >>>
 * 		relational 				:	< > <= >= instanceof
 * 		equality 				:	== !=
 * 		bitwise AND 			:	&
 * 		bitwise exclusive OR 	:	^
 * 		bitwise inclusive OR 	:	|
 * 		logical AND 			:	&&
 * 		logical OR 				:	||
 * 		conditional 			:	? :
 * 
 * En el caso de las de asignacion funcionan al reves .... de derecha a izquierda
 * por lo tanto las variables de la derecha se copian en las de la izquierda
 * 
 * 		assignment 				:	= += -= *= /= %= &= ^= |= <<= >>= >>>=
 *
 *
 *
 * Casting
 * -------
 * 
 * El casting es el procedimiento para cambiar una variable de un tipo primitivo a otro
 * tambien se usa para cambiar de un tipo de clase a otro si hay relacion de herencia
 * hay 2 tipos
 * 		Implicito:	no se necesita codigo para que se lleve a cabo
 * 					widening casting : 	Cuando se coloca un valor pequeño en un contenedor grande
 * 						ej.: metemos un valor float en una variable double
 * 
 * 		Explicito:	Es necesario escribir codigo
 * 					Para realizar el casting: 	(tipoNuevo) objeto_de_otro_tipo;
 * 					narrowing casting: 	Cuando se coloca un valor grande en un contenedor pequeño
 * 										Son susceptibles de perder datos
 * 						ej: metemos un double en un int.... perderemos los decimales
 * 
 * 			CONVERTIR						CONVERTIR A 
 * 			DESDE
 * 						BOOLEAN	BYTE	SHORT	CHAR	INT		LONG	FLOAT	DOUBLE
 * 			BOOLEAN				NO		NO		NO		NO		NO		NO		NO
 * 			BYTE		NO				SI		SI		SI		SI		SI		SI
 * 			SHORT		NO		CAST			SI		SI		SI		SI		SI
 * 			CHAR		NO		CAST	CAST			SI		SI		SI*		SI
 * 			INT			NO		CAST	CAST	CAST			SI		SI*		SI*
 * 			LONG		NO		CAST	CAST	CAST	CAST			SI		SI*
 * 			FLOAT		NO		CAST	CAST	CAST	CAST	CAST			SI
 * 			DOUBLE		NO		CAST	CAST	CAST	CAST	CAST	CAST
 * 
 * 			NO 		=	NO HAY POSIBILIDAD DE CONVERSION
 * 			SI 		= 	CASTING IMPLICITO
 * 			SI*		=	CASTING IMPLICITO CON POSIBLE PERDIDA DE PRECISION
 * 			CAST 	= 	NECESIDAD DE CASTING EXPLICITO
 * 
 * Reglas de construccion sintactica:
 * ----------------------------------
 * 
 * 	Un simbolo no es una formula
 * 	Los operadores unarios se anteponen a un simbolo
 * 	Los operadores binarios se situan entre los simbolos
 * 	Los parentesis deben estar bien formados y tienen que haber tantos de apertura como de cierre
 * 	Son correctos: (p),  p and (q), p or ((not q) and r)...
 * 	No son correctos: (), (p (or) q), p and (q or (not r)...
 * 	Son fórmulas: p, not p, p and q, p xor (not q), not (p -> q)...
 * 
 * Operadores Ternarios
 * --------------------
 * 
 * Sintaxis:
 * 		expresion condicional ?valor1 :valor2;
 * 
 * Si el condicional es verdadero, la expresion toma el valor1 si no toma el valor2
 * 
 * Ejemplo:
 * 		boolean b=40<50 ? true : false;
 * 
 * 
 */

public class Apuntes_Indice {
	
	public static void main(String[] args) {
		
//		bucle con etiquetas
		
		bucleI: // etiqueta o label
		for (int i = 0, j = 0; i < 100; i++) {
			while (true) {
				if ((++j) > 5) {
					
					break bucleI;
				} // Finaliza ambos bucles
				else {
					break;
				} // Finaliza el bucle interior (while)
			}
		}
		
		/*
		bucle1:
		for (int i=0; i<n; i++) {
			bucle2:
			for (int j=0; j<m; j++) {
				...
				if (expression) continue bucle1; then continue bucle2;
					...
			}
		}
		*/
	}

}
