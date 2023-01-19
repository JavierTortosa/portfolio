package Pregunta6;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {

	//private Scanner teclado = new Scanner(System.in);
	private int id=0;
	private String nombre="";
	private ArrayList<Empleado> arrayEmpleados = new ArrayList<>();
	private Empleado empleado = new Empleado();
	
	public Controlador() {
		
		cuerpo();
	}
	
	public void cuerpo() {	
		
		Scanner teclado = new Scanner(System.in);
		String textoSiNo;
		boolean salir = false;
		int encontrado;
		
		do {
			switch (menu()) {
			
			case 1:
				// inserta
				insertarEmpleado();
				break;
			case 2:
				// actualiza
				
				actualizaEmpleado();
				
				break;
			case 3:
				// consulta
				consultaEmpleado();
				
				break;
			case 4:
				// borrar
				borrarEmpleado();

				break;
			case 5:
				// listado
				listadoEmpleados();
				break;
			case 6:
				// salir
				System.out.println("\nHasta pronto...");
				salir =true;
				break;
				
			case 7:
				for (int i =0; i<10; i++) {

					nombre="Paco"+i;
					arrayEmpleados.add(empleado.insertarEmpleado(i, nombre));
				}	
				break;
			}
		} while (!salir);
	}

	private void listadoEmpleados() {
		for (Empleado lista : arrayEmpleados) {
			System.out.println(lista.toString());
		}
	}

	private void borrarEmpleado() {
		Scanner teclado = new Scanner(System.in);
		String textoSiNo;
		int encontrado;
		id = pideNumero("Introduzca Id: ");
		encontrado = buscaId(id);

		if (encontrado > 0) {
			System.out.println(arrayEmpleados.get(encontrado).toString());
			boolean sino = false;

			System.out.println("Esta seguro? (Si/No)");
			textoSiNo = teclado.next();

			if (textoSiNo.toLowerCase().equals("si") || textoSiNo.toLowerCase().equals("s")) {
				// sino=true;
				arrayEmpleados.remove(encontrado);
				System.out.println("Registro eliminado");
			}
		} else {
			System.out.println("Id no encontrado)");
		}
	}

	private void consultaEmpleado() {
		int encontrado=-1;
		id = pideNumero("Introduzca Id: ");
		encontrado = buscaId(id);
		
		if (encontrado>=0) {
			System.out.println(arrayEmpleados.get(encontrado).toString());
		} else {
			System.out.println("Id no encontrado");
		}
	}

	private void actualizaEmpleado() {
		int encontrado;
		id = pideNumero("Introduzca Id: ");
		encontrado = buscaId(id);
		
		if (encontrado>0) {
			System.out.println("registro encontrado en "+ encontrado);
			nombre=pideNombre();
			arrayEmpleados.get(encontrado).setNombre(nombre);
			
		} else {
			System.out.println("Id no encontrado)");
		}
	}

	private void insertarEmpleado() {
		id = pideNumero("Introduzca Id: ");
		nombre = pideNombre();
		arrayEmpleados.add(empleado.insertarEmpleado(id, nombre));
	}
	
	public int buscaId(int id) {
		
		int registro=0;
		//int idBuscado;
		int idActual;
		
		for(int i=0; i<arrayEmpleados.size(); i++) {
			
			idActual = arrayEmpleados.get(i).getId();
			
			if (idActual == id) {
				
				registro = idActual;
				break;
			}
		}
		return registro;
	}
	
	private int pideNumero(String texto) {
		Scanner teclado = new Scanner(System.in);
		String numero;
		int id;
		
		do {          
		    System.out.println(texto);
		    numero = teclado.nextLine(); 
		} while(!validaEntero(numero)); 
		
		id = Integer.parseInt(numero); 
		
		return id;
	}
	
	public static boolean validaEntero(String text) {
	    int v;
	    try {
	      v=Integer.parseInt(text);
	      return true;
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
	
	private String pideNombre() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca nombre:");
		String nombre = teclado.next();
		
		return nombre;
	}
	
	public int menu() {
		
		//Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("\nMENU\n----\n");
		System.out.println("1. Insertar");
		System.out.println("2. Actualizar");
		System.out.println("3. Consultar");
		System.out.println("4. Borrar");
		System.out.println("5. Listado");
		System.out.println("\n6. Salir");
		
		do {
			opcion = pideNumero("\nElija Opcion:");
		} while (!(opcion<=7 && opcion >=1));
		
		return opcion;
	}
}
