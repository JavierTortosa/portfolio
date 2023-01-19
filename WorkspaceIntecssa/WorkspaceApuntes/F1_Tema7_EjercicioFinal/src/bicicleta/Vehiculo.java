package bicicleta;

public abstract class Vehiculo {

	protected int ruedas;
	protected int velocidadMaxima;
	protected boolean vehiculoMotor;
	
	public abstract void acelerar();
	public abstract void frenar();

	public Vehiculo(int ruedas, int velocidadMaxima, boolean vehiculoMotor) {
		super();
		this.ruedas = ruedas;
		this.velocidadMaxima = velocidadMaxima;
		this.vehiculoMotor = vehiculoMotor;
	}

	public Vehiculo() {
		super();
	}
	
	
}
