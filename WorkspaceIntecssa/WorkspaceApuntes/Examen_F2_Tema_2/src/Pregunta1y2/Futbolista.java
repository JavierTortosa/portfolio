package Pregunta1y2;

public class Futbolista extends SeleccionFutbol{

	private double salario;
	private String posicion;
	
	public Futbolista(int id, String nombre, String apellidos, int	edad, double salario, String posicion) {
		super(id, nombre, apellidos, edad);
		this.salario = salario;
		this.posicion = posicion;
	}

	public double getSalario() {
		return salario;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return super.toString() + ", salario=" + salario + ", posicion=" + posicion;
	}

	
	
}
