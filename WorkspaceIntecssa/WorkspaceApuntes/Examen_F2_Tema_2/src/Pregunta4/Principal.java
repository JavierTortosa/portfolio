package Pregunta4;

/*
Declarar un tipo enum llamado 'Mes', asociar para cada constante el número de mes que corresponde.
*/

public class Principal {

	public static void main(String[] args) {
		
		// este es el metodo que hemos visto en el tema pero no tiene el numero del mes asociado
		System.out.println("METODO DEL TEMA");
		System.out.println("***************\n");
		for (Mes listaMes : Mes.values()) {
			System.out.println("el mes de " + listaMes + " es el mes " + (listaMes.ordinal()+1));
		}
		
		// este metodo no lo hemos visto. tiene asignado el numero de mes y los dias que tiene cada mes
		System.out.println("\nMETODO ALTERNATIVO");
		System.out.println("******************\n");
		for (Mes1 listaMes1 : Mes1.values()) {
			System.out.println("El mes de " + listaMes1 + " es el mes " + listaMes1.getNumeroMes() 
					+ " y tiene "+ listaMes1.getDiasMes() + " dias");
		}
	}
	
}
