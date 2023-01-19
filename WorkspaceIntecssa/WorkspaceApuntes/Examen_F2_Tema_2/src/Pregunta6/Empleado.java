package Pregunta6;

public class Empleado implements OperacionesInterface{

	private String nombre;
	private int id;

	public Empleado() {
		
	}
	
	public Empleado(int id, String nombre) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		
		return "Empleado [id=" + id + ", nombre=" + nombre + "]";
	}

	
	@Override
	public Empleado insertarEmpleado(int id, String nombre) {

		return new Empleado (id, nombre);
	}

	@Override
	public String actualizarEmpleado(String nombre) {

		this.nombre = nombre;
		return getId() + " " + getNombre();
	}

	@Override
	public String borrarEmpleado(int id) {
		
		this.id=0;
		this.nombre=null;
		return getId() + " " + getNombre();
	}

	@Override
	public String consultarEmpleado(int id) {
		
		return getId() + " " + getNombre();
	}
	
	
	
}
