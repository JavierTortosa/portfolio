package Pregunta1y2;

public class SeleccionFutbol {

	private int id;
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	public SeleccionFutbol() {
		
	}
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int	edad) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad;
	}
	
	
	
}
