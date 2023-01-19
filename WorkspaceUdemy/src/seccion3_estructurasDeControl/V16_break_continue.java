package seccion3_estructurasDeControl;

/*
 * 	 Instrucciones break y continue
 * 	 ------------------------------
 * 
 * 	 provocan una salida forzada de un bucle
 * 
 * 		break: abandona el bucle
 * 		continue: pasa a la siguiente iteracion
 * 
 * 	 ambas instrucciones pueden usarse con for y con while
 * 
 * 	 Break
 * 	 -----
 * 
 * 	 provoca la salida del bucle y devuelve el control del programa a la siguiente instruccion
 * 
 * 				int n=leenumero();
 * 				int s=0;
 * 				for(int i=1; i<n; i++){
 * 					s+=i;
 * 					if (s>100){
 * 						break;
 * 					}
 * 				}
 * 				// si se cumple la condicion se ejecuta el break y viene a este punto
 * 
 * 	Continue
 * 	--------
 * 
 * 	pasa a la siguiente interacion del bucle
 *  en el caso de un for, continue nos lleva a la instruccion de incremento
 *  
 *  			// muestra los numeros del 1 al 10 menos el 5
 *  			for int (i=1; i<10; i++){
 *  				if (i == 5)
 *  					continue;
 *  				System.out.println(i);
 *  			}
 * 	
 * 	los bucles for y while se pueden anidar, declara un bucle dentro de otro
 * 
 * 	Bucles Etiquetados
 * 	------------------
 * 
 * 	es posible asignar una etiqueta a una instruccion for o while
 * 	en bucles anidados, permite a las instrucciones break o continue indicar el bucle que se quiere abandonar
 * 
 * 				externo: for (...){
 * 
 * 					interno: for (...) {
 * 
 * 						for(...){
 * 							break;
 * 						}
 * 					// el break nos lleva aqui y continuan los bucles externos e internos
 * 
 * 					break externo;
 * 					}
 * 				}
 * 				// break externo sale del bucle externo abandonando todos los demas bucles y vendria aqui
 * 
 *  si no se especifica etiqueta despues del break/continue, afectara al bucle mas interno;
 *  
 *  
 * 
 */	

public class V16_break_continue {

	public static void main(String[] args) {
		
		int a1 = 0 , s = 0, i1 = 1;		// a,s,i
		principal:						//	1		2		3		4		5		6		7		8	9	10
			for (;i1<10;i1++) {			//	0,0,1	
				while (a1<5) {			//	0,0,1	1,3,2	2,5,3	3,7,4	4,9,5
					a1 = i1++;			//	1,0,2	2,3,3	3,5,4	4,7,5	5,9,6
					s = a1+i1;			//	1,3,2	2,5,3	3,7,4	4,9,5	5,11,6
					if (s>10) {			//	
						break principal;//	
					}
				}
			}
		System.out.println(i1+":"+a1+":"+s);	//resultado = "6:5:11"
		
													 //1	2	3	4
		String[][] cars={{"A","B","C"},{"D","E"}};	 //i,k			
		ex: for(int i=0;i<cars.length;i++){			 // 0		1		2
				for(int k=0;k<cars[i].length;k++){	 //	0.0	0.1	1.0	1.1
					System.out.print(cars[i][k]+" ");//	A	B	D	E
					if(cars[i][k].equals("B")){		 // 	
						break;
					}
					continue ex;
				}
			}
		System.out.println("\n\n");
		
		int a=5;
		while(isPresent(a)){
			System.out.println(a); //line 1
			//line 2
		}
	}
	
public static boolean isPresent(int a){ //line 3
	return a-->0?true:false;
	}
}





