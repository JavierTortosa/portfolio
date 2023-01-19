package tema2_variables;

/*
 * Constantes en Java
 * 
 * Una constante es una variable que mantiene su valor durante toda la vida del programa
 * una vez asignado un valor no se puede cambiar
 * 
 * sintaxis:
 * 
 * 		static final NOMBRECONSTANTE = valor;
 * 
 * 
 */

public class ConstanteEnJava {
	static final int DIAS_SEMANA = 7;
	static final int DIAS_LABORABLES = 5;

	public static void main(String[] args) {
		System.out.println("El número de días de la semana son " + DIAS_SEMANA);
		System.out.println("El número de días laborables de la semana son " + DIAS_LABORABLES);
	}
}
