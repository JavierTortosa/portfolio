package Pregunta6;

public interface OperacionesInterface {

	public Empleado insertarEmpleado(int id, String nombre);

	public String actualizarEmpleado(String nombre);

	public String borrarEmpleado(int id);

	public String consultarEmpleado(int id);

}
