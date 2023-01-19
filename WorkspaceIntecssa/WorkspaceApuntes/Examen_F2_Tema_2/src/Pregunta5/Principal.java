package Pregunta5;

/*
Con el siguiente código:
public interface OperacionesInterface {
public String insertarEmpleado(int id, String nombre);
public String actualizarEmpleado(String nombre);
public String borrarEmpleado(int id);
public String consultarEmpleado(int id);
}
Implementar los métodos creados en una clase
*/

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		
		System.out.println("Empleado insertado: "+empleado.insertarEmpleado(1, "Paco"));
		System.out.println("Empleado Actualizado: " +empleado.actualizarEmpleado("Pedro"));
		System.out.println("Consulta del empleado: " + empleado.consultarEmpleado(1));
		System.out.println("Empleado " + empleado.borrarEmpleado(1) + " Eliminado...");
	}
}
