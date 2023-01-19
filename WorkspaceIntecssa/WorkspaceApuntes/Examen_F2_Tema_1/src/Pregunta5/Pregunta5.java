package Pregunta5;

/*
 PREGUNTA 5
 ---------- 
 
Con un modificador de acceso privado, mostrar el resultado con el siguiente código: 

class A { 
private void mostrar() { 
System.out.println("Hola mundo"); 
} 
} 
*/

class A {
	private void mostrar() {
		System.out.println("Hola mundo");
	}
	
	// si creamos un constructor podemos acceder al metodo mostrar() aunque sea private
	public A() {
		mostrar();
	}
	
}

// con el codigo dado sin constructor no se puede generar ningun resultado 
// porque private hace que mostrar() no sea visible.
public class Pregunta5 {

	public static void main(String[] args) {
		A claseA = new A();
		
//		claseA.mostrar();// esto no se puede hacer porque mostrar() es private de A y no es visible fuera de A
	}
	
	
}


