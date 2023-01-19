package Pregunta6;


/*
Con el siguiente código: 
public class A { 
protected void mostrar(){ 
System.out.println("Aloha mundo"); 
} 
}   
Extender en la clase B R. 
*/

public class A {
	
	protected void mostrar() {
		System.out.println("Aloha mundo");
	}

	public static void main(String[] args) {
		B claseB = new B();
	}
}

class B extends A{
	
	public B() {
		mostrar(); // lo podemos mostrar porque B toma los metodos por la herencia 
	}
}



