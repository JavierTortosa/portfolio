package seccion4_poo;

/*	 ENUMERACIONES
 * 	 -------------
 * 
 * 	 Una enumeracion define un tipo de dato que consiste en una lista de valores
 * 	 Su uso es similar a las constantes
 * 
 * 	 Definicion
 * 	 ----------
 * 
 * 	 		modificador enum NombreEnumeracion{
 * 				valor1, valor2, valor3;
 * 			}
 * 
 * 	 				public enum Dias{
 * 						LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
 * 					}
 * 
 * 	 Una variable de un tipo enumerado solo puede tomar los valores definidos en dicho tipo:
 * 
 * 					Dias obj;
 * 					obj=Dias.LUNES;
 
 *	 Uso en instrucciones de control
 *	 -------------------------------
 *
 *	 Las variables de tipo enumerado se pueden usar con el operador == o != para comprobar la igualdad
 *	 No se pueden usar los operadores de mayor o menor que.
 * 
 * 					if (obj==Dias.MARTES){
 * 						...
 * 					}
 * 
 * 	 Tambien se pueden usar en un switch
 * 
 *  				switch (obj){
 *  					case LUNES:	//como valores de los case podemos usar directamente la constanta
 *  						....
 *  					case MARTES:
 *  						....
 *  				}
 
 *   Constructores
 *   -------------
 *   
 *   Una enumeracion tambien puede terer constructores.
 *   Estos constructores son privados
 *   A cada valor de la enumeracion se le asignan los posibles valores de los parametros del constructor
 */   
   			enum Dias{
   				LUNES(20), MARTES(8), MIERCOLES(12), JUEVES(1);
   
   				int data;
   
   				//constructor y es PRIVATE
   				Dias(int n){ 	//solo admite el modificador private que es el por defecto
   					data=n;
   				}
   			}
 
/* 	 Cada objeto enumerado tendra asociado su correspondiente valor)
 * 
 * 				Dias d = Dias.MIERCOLES;
 * 				System.out.println(d.data); // imprimira 12
  
 *	 Metodos de una Enumeracion
 *	 --------------------------
 *
 *	 Toda enumeracion es una subclase de java.lang.Enum
 *	 Proporciona los siguientes metodos:
 *
 *	 	values()	: Devuelve un array con todos los valores de la enumeracion
 *		name()		: Cadena de caracteres con el nombre del valor
 *		ordinal()	: Posicion del valor dentro de la enumeracion siendo 0 el primer elemento
 *		toString()	: Devuelve el mismo valor que name
 *
 *	 Ejemplo:
 */
   			
enum EjemEnum{
	ENERO(1,31), FEBRERO(2,28), MARZO(3,31), ABRIL(4,30), MAYO(5,31), JUNIO(6,30), 
	JULIO(7,31), AGOSTO(8,31), SEPTIEMBRE(9,30), OCTUBRE(10,31), NOVIEMBRE(11,30), DICIEMBRE(12,31);
	
	int numeroMes;
	int diasMes;
	
	EjemEnum (int numeroMes, int diasMes){
		this.numeroMes=numeroMes;
		this.diasMes=diasMes;
	}
}

class MetodosEnum{
	
	public static void main(String[] args) {
		for (var m:EjemEnum.values()) {
			System.out.print("Mes numero: " + m.numeroMes +"\t");
			System.out.print("Nombre: " + m.name());
			
			if (m.ordinal()==8 || m.ordinal()==10 || m.ordinal()==11) {
				System.out.print("\t");
			}else {
				System.out.print("\t\t");
			}
			System.out.print("Ordinal: " + m.ordinal()+ " ");
			System.out.print("Tiene " + m.diasMes + " dias\t");
			System.out.print("toString: " + m.toString());
			System.out.println();
		}
	}
}
   			
public class V37_Enumeraciones {

	enum Posicion{
		NORTE(2), SUR(1), ESTE(5), OESTE(3);
		
		int s;
		
		Posicion(int s){
			this.s=s;
		}
	}

	public static void main(String[] args) {
		Posicion[] pos= {Posicion.NORTE,Posicion.ESTE,Posicion.SUR};
		pos[1].s=3; //1
		
		for(Posicion p:pos) {
			System.out.print(p.name()+" ");
		}
	}
}
