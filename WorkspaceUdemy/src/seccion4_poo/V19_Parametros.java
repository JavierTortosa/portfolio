package seccion4_poo;

/*
 * 	 Paso de Parametros a metodos
 * 	 ----------------------------
 * 
 * 	 Al pasar un tipo primitivo a un metodo estamos pasando una copia del dato
 * 	 Si el metodo modifica su copia no afecta al original
 * 
 *		Calc calc = new Calc();				class Calc{ 
 * 		int n=5;								public void suma(int a);
 * 		calc.suma (n);								a=a+3;
 * 		System.out.println(n);					}
 *											}
 * 			// esto devuelve 5				
 * 			
 * 	 Al pasar un tipo objeto a un metodo estamos pasando una copia de la referencia de dicho objeto
 * 	 
 * 		StringBuilder sb= new StringBuilder ("Hola");		class Calc{
 * 		Calc calc = new Calc();									public int modif (StringBuilder d){
 * 		cl.modif(sb);												d.append("Adios");
 * 		System.out.println(sb.toString());							return 5;
 * 																}
 * 			// esto devuelve Hola Adios						}
 * 
 * 	 Al pasar un tipo String a un metodo pasaria lo mismo que con un tipo primitivo, String es inmutable
 * 
 * 		String sb= new String "Hola";						class Calc{
 * 		Calc calc = new Calc();									public int modif (String d){
 * 		cl.modif(sb);												d += "Adios"; //se genera un nuevo objeto
 * 		System.out.println(sb);										System.out.println(d);
 * 																	return 5;
 * 			// esto devuelve Hola								}
 *  														}
 */																		// esto devuelve Hola Adios

public class V19_Parametros {
	
	public static void main(String[] args) {

		
		Calc calc = new Calc();
		int n = 5;
		calc.suma(n);
		System.out.println("valor del int			= "+n);

		System.out.println("------------------------");
		
		StringBuilder sb = new StringBuilder("Hola ");
		Calc cl = new Calc();
		cl.modif(sb);
		System.out.println("valor del StringBuilder		= "+sb.toString());

		System.out.println("------------------------");
		
		String sb1 = new String("Hola ");
		Calc cal = new Calc();
		cal.modif(sb1);
		System.out.println("valor del String		= "+ sb1);	    

	}
}

class Calc{
	
	public void suma(int a) {
		a=a+3;
		System.out.println("int dentro del metodo		= " + a);
	}     
	
 	public int modif (StringBuilder d){ 
 		d.append("Adios");                 
 		System.out.println("StringBuilder dentro del metodo	= " + d);
 		return 5;                          
 	}                                   
	
	public int modif (String d){          
		d += "Adios"; //se genera un nuevo objeto   
		System.out.println("String dentro del metodo	= " + d);                      
		return 5;                                                           
    }                                            
}
	
	