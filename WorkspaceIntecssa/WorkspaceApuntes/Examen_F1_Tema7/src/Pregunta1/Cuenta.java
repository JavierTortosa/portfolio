package Pregunta1;

import java.util.Scanner;

/*
 	PREGUNTA 1
 	----------
	Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular
	y cantidad (puede tener decimales).
	
	El titular será obligatorio y la cantidad es opcional. Crea dos
	constructores que cumpla lo anterior.
	
	Crea sus métodos get, set y toString.
	
	Tendrá dos métodos especiales:
	• ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la
	cantidad introducida es negativa, no se hará nada.
	• retirar(double cantidad): se retira una cantidad a la cuenta, si
	restando la cantidad actual a la que nos pasan es negativa, la
	cantidad de la cuenta pasa a ser 0.
*/

public class Cuenta {

//	atributos
	private String nombre;
	private double cantidad;
	
//	constructores
	public Cuenta(String nombre, double cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public Cuenta(String nombre) {
		super();
		this.nombre = nombre;
	}
	
//	getters/setters/toString
	@Override
	public String toString() {
		return "El saldo de la cuenta de " + nombre + " tiene un saldo de: " + cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
//	metodos especiales
	public void ingresar(double cantidad) {
		
		if (cantidad > 0) {
			this.cantidad += cantidad;
		} else {
			System.out.println("no se puede ingresar una cantidad negativa");
		}
	}
	
	public void retirar (double cantidad) {
		
		double saldo = this.cantidad;
		
		if ( cantidad <0) cantidad = cantidad*-1;
				
		if ((saldo - cantidad)<0){
			System.out.println("\nSaldo insuficiente. Retirado el maximo posible");
			this.cantidad=0;
		}else {
			this.cantidad=saldo-cantidad;
		}
	}
	
//	main
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		double importe=0;
		String nombre="";
		Cuenta cuenta;
		
		System.out.println("Intoduce un nombre:");
		nombre = teclado.next();
		
		System.out.println("\nIntoduce el saldo:");
		importe = teclado.nextDouble();
		
		if (importe >= 1) {
			cuenta = new Cuenta(nombre, importe);
		}else {
			cuenta = new Cuenta(nombre);
		}
		
		System.out.print("\nCuenta creada: ");
		System.out.println(cuenta.toString()+"\n");
		
		System.out.println("cantidad a ingresar:");
		importe = teclado.nextDouble();
		cuenta.ingresar(importe);

		System.out.println("\n"+cuenta.toString()+"\n");
		
		System.out.println("cantidad a retirar:");
		importe = teclado.nextDouble();
		cuenta.retirar (importe);

		System.out.println("\n"+cuenta.toString()+"\n");
	}
}
