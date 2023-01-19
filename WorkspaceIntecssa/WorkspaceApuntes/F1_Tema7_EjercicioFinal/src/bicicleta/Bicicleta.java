package bicicleta;

/*
Implementa la clase Bicicleta, que tiene tres atributos, velocidadActual, platoActual y piñonActual, 
de tipo entero y cuatro métodos acelerar(), frenar(), cambiarPlato(int plato), y cambiarPiñon(int piñon), 
donde el primero dobla la velocidad actual, el segundo reduce a la mitad la velocidad actual, 
y el tercero y cuarto ajustan el plato y el piñón actual respectivamente según los parámetros recibidos. 
La clase debe tener además un constructor que inicialice todos los atributos.

•Crea dos objetos de la clase bicicleta: miBicicleta y tuBicicleta
*/

public class Bicicleta extends Vehiculo implements Imprimible {

	private int velocidadActual;
	private int platoActual;
	private int piñonActual;

	public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}

	public Bicicleta() {
		velocidadActual = 0;
		platoActual = 1;
		piñonActual = 1;
	}

	public void acelerar() {
		this.velocidadActual *= 2;
	}

	public void frenar() {
		this.velocidadActual /= 2;
	}

	public void cambiarPlato(int plato) {
		this.platoActual = plato;
	}

	public void cambiarPiñon(int piñon) {
		this.piñonActual = piñon;
	}

	public void cambiarPlato() {
		this.platoActual = 1;
	}

	public void cambiarPiñon() {
		this.piñonActual = 1;
	}

	@Override
	public void getAtributos() {
		int vel = getVelocidadActual();
		int plato = getPlatoActual();
		int piñon = getPiñonActual();

		System.out.print(" Velocidad: " + vel);
		System.out.print(" plato: " + plato);
		System.out.println(" piñon: " + piñon + "\n");
	}

	@Override
	public void imprime() {
		System.out.print(" Velocidad: " + velocidadActual);
		System.out.print(" Piñon: " + piñonActual);
		System.out.println(" Plato " + platoActual);
	}

	@Override
	public String toString() {
		return "Bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", piñonActual="
				+ piñonActual + "]";
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getPlatoActual() {
		return platoActual;
	}

	public void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}

	public int getPiñonActual() {
		return piñonActual;
	}

	public void setPiñonActual(int piñonActual) {
		this.piñonActual = piñonActual;
	}
}
