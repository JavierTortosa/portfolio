package bicicleta;

public class BicicletaTandem extends Bicicleta{

	private int numAsientos;

	public BicicletaTandem(int velocidadActual, int platoActual, int piñonActual, int numAsientos) {
		super(velocidadActual, platoActual, piñonActual);
		this.numAsientos = numAsientos;
	}

	public void acelerar() {
		int velocidad=super.getVelocidadActual();
		super.setVelocidadActual(velocidad*4);
		
	}
	
	
	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	@Override
	public String toString() {
		return "BicicletaTandem [numAsientos=" + numAsientos + ", getVelocidadActual()=" + getVelocidadActual()
				+ ", getPlatoActual()=" + getPlatoActual() + ", getPiñonActual()=" + getPiñonActual() 
				+"]";
	}
	
	
}
