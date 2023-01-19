package Pregunta3;

public class Deportista extends Persona{

	private int kmDeportista;
	
	public Deportista(String nombre) {
		super(nombre);
		this.kmDeportista=7;
	}

	@Override
	public int correr() {
		System.out.println("El deportista " + super.getNombre() +" corre a "+ kmDeportista+" km/h");
		return kmDeportista;
	}

}
