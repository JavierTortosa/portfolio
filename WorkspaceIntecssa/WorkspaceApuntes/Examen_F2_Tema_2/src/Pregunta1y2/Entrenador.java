package Pregunta1y2;

public class Entrenador extends SeleccionFutbol{

	private int anyosDeExperiencia;

	public Entrenador(int id, String nombre, String apellidos, int	edad, int anyosDeExperiencia) {
		super(id, nombre, apellidos, edad);
		this.anyosDeExperiencia = anyosDeExperiencia;
	}

	public int getAnyosDeExperiencia() {
		return anyosDeExperiencia;
	}

	public void setAnyosDeExperiencia(int anyosDeExperiencia) {
		this.anyosDeExperiencia = anyosDeExperiencia;
	}

	@Override
	public String toString() {
		return super.toString() + ", Años De Experiencia=" + anyosDeExperiencia;
	}
	
	
}
