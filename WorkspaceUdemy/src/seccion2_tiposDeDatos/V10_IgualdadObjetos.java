package seccion2_tiposDeDatos;

/*
 *	 Igualdad de objetos == y equals()
 *	 ---------------------------------
 *
 * 	 Operador == y equals()
 * 	 ----------------------
 * 
 * 	 == Se utiliza para comprobar la igualdad con tipos primitivos
 * 	 En variables objeto, compara referencias no los objetos en si
 * 	 Si queremos comprobar el valor de un objeto se hace con equals()
 * 
 * 			String ob1 = new String("texto");
 * 			String ob2 = new String("texto");
 * 			if(ob1 == ob2){
 * 				System.out.println("Iguales");
 * 			}else{ 
 * 				System.out.println("No son iguales");
 * 			}
 * 
 * 		Este ejemplo da falso porque ob1 y ob2 tienen referencias diferentes 
 * 
 * 		Para comparar los textos se haria con
 * 
 * 				if(ob1.equals(ob2){
 * 
 * 		El metodo equals() lo tienen todas las clases  
 * 		La clase String tiene el metodo equals() sobreescrito para que compare el texto y no la referencia
 * 		Distingue mayusculas de minusculas
 * 		Hay un metodo que solo tiene la clase String que es equalsIgnoreCase() que no hace esta diferencia
 * 	
 * 	 Pool de cadenas
 * 	 ---------------
 * 
 * 		Java guarda todos los literales usados en un pool de cadenas
 * 		Si asignamos a una variable String un valor, dicho valor se guarda en el pool
 * 		Si asignamos a otra variable Strign el valor anterior, se recupera del pool
 * 		La nueva variable apuntará al mismo literal que la primera variable
 * 
 * 		Cuando asignamos el valor a una variable String con
 * 
 * 			String var = "texto";
 * 
 * 		Java antes de crear el objeto var comprueba si el valor esta en el pool, si no crea el objeto
 * 
 * 	 Igualdad con objetos tipo Envoltorio
 * 	 ------------------------------------
 * 
 * 		Se aplica lo mismo que para cadenas
 * 		Tambien tenemos un pool de cada tipo envoltorio
 * 
 * 			Esto da false al if int1==int2		Esto da true al if int1==int2
 * 			------------------------------		-----------------------------
 * 			Integer int1 = new Integer(5);		Integer int1 = 5;
 *			Integer int2 = new Integer(5);		Integer int2 = 5;
 * 
 * 		Con los tipo envoltorio se puede usar equals() 
 * 
 *   Igualdad de StringBuilder
 *   -------------------------
 *   
 *   	Representa cadenas modificables
 *   	== dara falso para 2 objetos
 *   	equals() tambien da falso para 2 objetos
 *   
 *   	No se puede usar la asignacion directa
 *   	No se puede usar el + para concatenar texto
 *   
 *   	StringBuilder sb1= "texto" // ESTO DA ERROR!
 *   
 *   Inmutabilidad objetos String
 *   ----------------------------
 *   
 *   	Un objeto String representa una cadena de caracteres y es inmutable, no se puede modificar
 *   	En la concatenacion de un objeto String crea un nuevo objeto y destruye el anterior
 *   
 *	
 */

public class V10_IgualdadObjetos {

	private static void comparaI(Object var1, Object var2) {
		
		if (var1==var2) {
			System.out.println("Iguales");
		}else{ 
			System.out.println("No son iguales");
		}
	}
	
	private static void comparaE(Object var1, Object var2) {
		
		if( var1.equals(var2)) {
			System.out.println("Iguales");
		}else{ 
			System.out.println("No son iguales");
		}
	}
	
	public static void main(String[] args) {
		
		String str1 = "texto";
		String str2 = "texto";
		
		System.out.print("str1 == str2 -> 		");
			V10_IgualdadObjetos.comparaI(str1, str2);
		
		System.out.print("str1.equals(str2) -> 		");
			V10_IgualdadObjetos.comparaE(str1, str2);
		
			
		String strNew1 = new String ("texto");
		String strNew2 = new String ("texto");
		
		System.out.print("\nstrNew1 == strNew2 -> 		");
			V10_IgualdadObjetos.comparaI(str1, str2);
		
		System.out.print("strNew1.equals(strNew2) -> 	");
			V10_IgualdadObjetos.comparaE(str1, str2);
			
				
		Integer int1 = 5;
		Integer int2 = 5;
		
		System.out.print("\nint1 == int2 -> 		");
			V10_IgualdadObjetos.comparaI(int1, int2);
		
		System.out.print("int1.equals(int2) -> 		");
			V10_IgualdadObjetos.comparaE(int1, int2);
			
			
		Integer intNew1 = new Integer(5);
		Integer intNew2 = new Integer(5);
		
		System.out.print("\nintNew1 == intNew2 -> 		");
			V10_IgualdadObjetos.comparaI(intNew1, intNew2);
		
		System.out.print("intNew1.equals(intNew2) -> 	");
			V10_IgualdadObjetos.comparaE(intNew1, intNew2);
		
			
		StringBuilder sbNew1 = new StringBuilder("cadena");
		StringBuilder sbNew2 = new StringBuilder("cadena");
		
		System.out.print("\nsbNew1 == sbNew2 -> 		");
			V10_IgualdadObjetos.comparaI(sbNew1, sbNew2);
		
		System.out.print("sbNew1.equals(sbNew2) -> 	");
			V10_IgualdadObjetos.comparaE(sbNew1, sbNew2);
		
		System.out.println("\n\nOJO con esta mierda\n"
				+ 			   "-------------------\n");
		
		char x=34;
		
		System.out.println("System.out.println (1 + 2 + " + (char)x +"3"+ "" + (char)x +"); //will print 33.");
		System.out.println(1+2+"3"); //esto da 33
		
		System.out.println("\nSystem.out.println ("+(char)x +"3" + (char)x +" + 1 + 2); //will print 312.");
		System.out.println("3"+1+2); // esto da 312
		
		System.out.println("\n\n");
		
		System.out.println("if ((a++>++b) && (++a>5))\n");
		System.out.println("compara a sin incremento si es mayor que b con incremento");
		System.out.println("a continuacion hace el incremento de a");
		System.out.println("si la primera condicion se cumple compara a incrementada mayor que 5");
		System.out.println("si la primera condicion no se cumple la segunda condicion se ignora");
		
	}
}
