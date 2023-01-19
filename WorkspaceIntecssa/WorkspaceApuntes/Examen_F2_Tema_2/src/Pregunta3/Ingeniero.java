package Pregunta3;

public class Ingeniero extends Persona{

	private int kmIngeniero;
	
	public Ingeniero(String nombre) {
		super(nombre);
		this.kmIngeniero=2;
	
	}

	@Override
	public int correr() {

		System.out.println("El ingeniero " + super.getNombre()+" corre a "+kmIngeniero+" km/h");
		return kmIngeniero;
	}

}
