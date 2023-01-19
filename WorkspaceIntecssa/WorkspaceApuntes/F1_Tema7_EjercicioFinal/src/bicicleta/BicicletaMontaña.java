package bicicleta;

public class BicicletaMontaña extends Bicicleta{

	private int suspension;
	
	
	
	public BicicletaMontaña(int velocidadActual, int platoActual, int piñonActual, int suspension) {
		super(velocidadActual, platoActual, piñonActual);
		this.suspension = suspension;
	}

	public void cambiarSuspension(int suspension) {
		this.suspension = suspension;
	}
	
	public void acelerar() {
		int velocidad=super.getVelocidadActual();
		super.setVelocidadActual(velocidad*3);
		
	}
	
	
	

	public int getSuspension() {
		return suspension;
	}

	public void setSuspension(int suspension) {
		this.suspension = suspension;
	}

	@Override
	public String toString() {
		return "BicicletaMontaña [suspension=" + suspension + ", getVelocidadActual()=" + getVelocidadActual()
				+ ", getPlatoActual()=" + getPlatoActual() + ", getPiñonActual()=" + getPiñonActual() +"]";
	}
	
	
}
