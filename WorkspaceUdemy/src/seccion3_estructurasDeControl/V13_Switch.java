package seccion3_estructurasDeControl;

/*
 *	 Uso de Switch
 *	 -------------
 *
 *	 Evalua una expresion cuyo resultado debe ser un entero int
 *	 Se ejecutaran diferentes bloques de codigo en funcion de los posibles resultados
 *	
 *	 		switch (expresion){
 *				case valor 1:
 *					//sentencias
 *					break;
 *				case valor 2:
 *					//sentencias
 *					break;
 * 				....
 * 				default:
 * 					//sentencias
 * 			}
 * 
 * 	 Si el resultado de la expresion coincide con de los valores indicados en los case, se ejecutara ese codigo
 * 	 si no coincide, el programa entrara dentro del bloque default si lo hay
 * 	 La instruccion break; al final de cada bloque es opcional. 
 * 	 Si no ponemos el break; el flujo del programa entrara dentro del siguiente bloque incluso default
 *	 Los valores de la expresion deben ser int o constantes enteras int o convertibles implicitamente en int
 *	 el bloque default no tiene porque estar al final
 *	 
 *
 * 	 Switch con String
 * 	 -----------------
 * 
 * 	 Se pueden evaluar expresiones cuyo resultado sea una cadena de caracteres 
 * 
 * 			String data = "prueba";
 * 			final String s = "Hello";
 * 			switch(data){
 * 				case "uno":	//ok
 * 				case s:		//Ok. s es una constante
 * 				case 10:	//Error. si evaluamos strings no podemos porner un case de int
 * 
 * 					
 * 
 * 	
 * 
 * 	
 * 
 * 
 */

public class V13_Switch {

	public static void main(String[] args) {
		
		int x=100;  	 	
		int a=x++; //a=100 x=101 	 	
		int b=++x; //b=102 x=102 	 	
		int c=x++; //c=102 x=103
		
		int d=(a>b)
				?(a<c)
					?a
					:(b<c)
						?b
					:c
				:b; 
		
		var res = (args == null ? false : true);
		System.out.println(res);
		System.out.println(args);
		if(res){ //1
			System.out.print ("with params");
			}{
			System.out.println("no params");
			}
		
		Integer x1 = new Integer ("1");
		
		switch(x1){
		case 1:
		System.out.println("One");
		break;
		case 2:
		System.out.println("Two");
		break;
		}
	}
	
	public void switchTest(byte x){
		switch(x){
		case 'b': // 1
		default : // 2
		case -2: // 3
		case 80: // 4
		}
		}
}

class test{
	public static void main(String[] args) {
		
		final int j;
		
		j=2;
		int x=0;
		
		switch(x) {
		case 0: {System.out.println("A");}
		case 1: System.out.println("B");break;
//		case j: System.out.println("C");
		}
		
	}
}
