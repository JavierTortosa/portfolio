package seccion5_arraysYcolecciones;

/*	 ARRAYS MULTIDIMENSIONALES
 * 	 -------------------------
 * 
 * 	 Funcionan igual que los arrays de 1 dimension salvo que tienen mas de 1 dimension
 * 
 * 	Declaracion e instanciacion
 *	---------------------------
 *
 *	  	- Declaracion
 *	      -----------
 *
 *			2 dimensiones (tabla)
 *			---------------------
 *
 *		 	int[][] arr2;
 *			int arr2[][];
 *	 		int[] arr2[];
 * 
 *			3 o mas dimensiones (3 dimensiones se puede imaginar como un cubo)
 *			------------------------------------------------------------------
 * 		
 *		 	int[][][] arr3;
 *			int arr3[][][]; 
 * 			int[] arr3[][];
 * 
 * 		- Instanciacion
 *	   	  -------------
 *
 *			ar2 = new [3][4];		//array de 12 elementos
 *			arr3 = new [2][5][10]; 	//array de 100 elementos
 *
 *		-  Acceso a elementos
 *		   ------------------
 *
 *			arr2 = [2][3];			//posicion 2,3
 *			arr3 = [0][2][0];		//posicion 0,3,0
 *
 
 *	 Recorrido de arrays multidimensionales
 *	 --------------------------------------
 *
 *	 Igual que los unidimensionales
 *
 *	 Con for normal
 *
 *		int nums[][] = new int[5][7];
 *		for (int i=0; i<nums.length; i++){ 			//longitud primera dimension
 *			for (int k=0; k<nums[i].length; k++){ 	//longitud segunda dimension
 *				nums [i][k] = i*k;
 *			}
 *		}
 *
 * 	 O un foreach si es para solo lectura
 * 
 * 		int nums[][] = new int[5][7];
 * 		for(int[] n : nums){
 * 			for (int s:n){
 * 				System.out.println(s);
 * 			}
 *		}
 
 * 	 Arrays irregulares
 * 	 ------------------
 * 
 * 	 En el caso de los arrays multidimensionales se pueden dejar las ultimas dimensiones sin asignar tamaño
 * 
 * 		int [][] d= new int [5][];
 * 		int [][][] n = new int [4][][];
 * 		int [][][] v = new int [4][10][];
 * 		int [][][] h = new int [4][][6];	// ERROR! no se pueden dejar dimensiones intermedias vacias
 * 
 * 	 A cada posicion vacia se le puede asignar un array con tantas dimensiones como queden sin tamaño
 * 	 Basicamente, a cada elemento de un array se le asigna un array de n elementos
 * 
 * 		d[0] = new int [4]; 	// d[0][4] 	// la posicion d[0] tiene 4 elementos
 * 								// d[1][]	// la posicion d[1] no tiene elementos 
 * 		d[2] = new int [7];		// d[2][7]	// la posicion d[2] tiene un array asignado de 7 elementos
 * 								// ...
 * 
 * 		n1[] = new int [4][2]; 	// n[4][[4][2]
 * 		v[0][0] = new int [6];	//
 *
 
 *	 Ejemplos a tener en cuenta
 *	 --------------------------
 *
 *		int[] a = new int[10];
 *		long[][] b= new long [2][];
 *		int [][] c = new int [3][];
 *		long[][][] d= new long [5][][];
 *
 *	 Correcto:
 *
 *		b[0][0]=a[1];
 *		c[1] = a;
 *		d[0]=b;
 *
 *	 Incorrectos:
 *
 *		c[0][0] =a[1]; 	//no hemos asignado la segunda dimension 
 *		c[2]=a[3];		//a la posicion 2 no se le puede asignar un int (a[3] es un valor entero no un array)
 *		d[1]=a;			//a es un array de 1 dimension y d de 3, no se puede asignar 
 *		d[0]=c;			//no se puede asignar un array de int a uno de long, solo mismo tipo
 *
 
 *	 Creacion abreviada de un array multidimensional
 *	 -----------------------------------------------
 *
 *	 Funciona como los arrays unidimensionales
 *
 *	 	int [][] datos = {{3, 5, 10, 15}{10, 15, 20}};
 *
 *	 Se ponen entre llaves cada dimension
 *
 *		d[0][4] -> d[0][0]= 3
 *				-> d[0][1]= 5
 *				-> d[0][2]= 10
 *				-> d[0][3]= 15
 *
 *		d[1][3]	-> d[1][0]= 10
 *				-> d[1][1]= 15
 *				-> d[1][2]= 20
 *
 *	 Se pueden dejar las ulti	mas dimensiones sin asignar
 *
 *		int [][] datos = new int[2][];
 *		datos[0] = new int []{2, 4, 2, 8, 10};
 *		datos[1] = {3,6,8};	// ERROR! no se admite la forma simplificada
 *
 * 
 */

public class V40_ArraysMultidimensionales {

	public static void main(String[] args) {

		int[] variable2D[];
		int[] variable3D[][];
		int[][] variable3D2[];
		
		variable2D = new int [3][4];
		
		
		for(int i =0; i<variable2D.length; i++) {
			for (int k =0; k<variable2D[i].length; k++) {
				variable2D[i][k]=i*k;
			}
		}
		
		for(int n[] : variable2D) {
			for (int s : n) {
				System.out.print(s + ", ");
			}
			System.out.println();
		}
		
		variable3D2 = new int [5][4][8];
		
		for(int i =0; i<variable3D2.length; i++) {
			for (int k =0; k<variable3D2[i].length; k++) {
				for (int j = 0; j<variable3D2[i][k].length; j++) {
					variable3D2[i][k][j]=i*k*j;
					
				}
			}
		}
		
		System.out.println("\n\n");
		for (int t[][] : variable3D2) {
			for(int n[] : t) {
				for (int s : n) {
					System.out.print(s + ", ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
//		array irregular
		int d[][][] = new int[4][][];
		
		//asignacion de tamaños
		for (int i = 0; i<d.length; i++) {
			int tam2 = 5+i+i;
			int tam3 = tam2*2;
			d[i] = new int [tam2][tam3];
			System.out.println("d["+i+"]["+tam2+"]["+tam3+"]");
		}
		
		// asignacion de valores
		for(int i =0; i<d.length; i++) {
			for (int k =0; k<d[i].length; k++) {
				for (int j = 0; j<d[i][k].length; j++) {
					d[i][k][j]=(i*k*j)+j;
					
				}
			}
		}
		
		//mostramos por pantalla d
		for (int t[][] : d) {
			for(int n[] : t) {
				for (int s : n) {
					System.out.print(s + ", ");
				}
				System.out.println("");
			}
			System.out.println("");
		}

//		asignacion de dimensiones a arrays irregulares
		
		int [] 		aint 	= new int[10];
		long[] 		along 	= new long [10]; 
		long[][] 	blong	= new long [2][];
		int [][] 	bint	= new int [3][];
		long[][][] 	clong	= new long [5][][];
		int[][][] 	cint	= new int [5][][];
		
//		blong[0]=aint;	//MAL DIFERENCIA DE TIPOS
		blong[0]=along;
		bint[0]=aint;
//		bint[0]=aint[0];//MAL ESTAMOS ASIGNANDO EL VALOR DE a[0]
//		bint[0]=along;	//MAL DIFERENCIA DE TIPOS
		cint[0]=bint;
//		cint[0] =aint;	//MAL FALTAN 2 DIMENSIONES Y LE DAMOS SOLO 1 
		
//		creacion abreviada arrays multidimensionales irregulares
		int [][] datos = {{3, 5, 10, 15},{10, 15, 20}};
		
		for(int i =0; i<datos.length; i++) {
			for (int k =0; k<datos[i].length; k++) {
				System.out.println("datos[" + i + "][" + k + "]= " + datos[i][k]);
			}
			System.out.println();
		}
	}
}
