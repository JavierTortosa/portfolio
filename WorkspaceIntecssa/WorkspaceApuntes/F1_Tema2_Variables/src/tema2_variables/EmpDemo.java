package tema2_variables;

/*
 * Variables estaticas
 * se crean como las variables de instancia pero con la palabra static
 * Son variables de clase, no confundir con propiedades de clase
 * Solo se puede tener una copia de una variable estatica por clase
 * esta variable no se crea con cada objeto
 * Se crean al inicio de la ejecucion del programa y duran mientras el programa esta en ejecucion
 * para acceder a estas variables se accede:
 * 
 * 		nombre_clase.nombre_variable;
 */

class Emp {
	// salario como variable estatica
	public static double salary;
	public static String name = "Alex";
}

public class EmpDemo {
	public static void main(String args[]) {

		// acceder a la variable estatica sin objeto
		Emp.salary = 1000;
		System.out.println(Emp.name + " tiene un salario promedio de: " + Emp.salary);
	}

}
