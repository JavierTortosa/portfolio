package Pregunta3;

		/*
		PREGUNTA 3
		----------
		Crear la clase Archivo con los siguientes atributos:
		• private String nombre;
		• private String extension;
		• private String ruta;
		Luego de crear los atributos, crear un constructor:
		• vacío
		• con 2 atributos
		• con 3 atributos
		Crear los getters y setters correspondientes
		Crear el método toString();
		*/

public class Archivo {
	private String nombre;
	private String extension;
	private String ruta;
	
	public Archivo() {
	}

	public Archivo(String nombre, String extension) {
		
		this.nombre 	= nombre;
		this.extension 	= extension;
	}

	public Archivo(String nombre, String extension, String ruta) {
		
		this.nombre 	= nombre;
		this.extension 	= extension;
		this.ruta 		= ruta;
	}

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + "." + extension + ", ruta=" + ruta + "]";
	}
}
