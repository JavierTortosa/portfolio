package seccion4_poo;

/*
 * 	 Encapsulacion
 * 	 -------------
 * 
 * 	 Principio que se basa en mantener como privados los atributos que definen carateristicas de un objeto
 * 	 Para dar acceso a estos atributos se hace a traves de metodos y constructores
 * 	 Evita que:
 * 		Se puedan asignar valores no validos a los atributos
 * 		Se puedan corromper los objetos
 * 	
 * 	 El acceso a cada propiedad se realiza mediante metodos o constructores
 * 	 Por cada propiedad se suelen crear dos metodos llamados getters y setters
 * 	 	
 * 		Los getters devuelven el valor del atributo
 * 		Los setters asignan un valor al atributo
 * 
 * 	 El constructor permite inicializar los atributos durante la creacion del objeto
 * 
 * 
 */

class Mesa{
	private int largo;
	private int ancho;
	
	public Mesa() {
		this(150,70);
	}
	
	public Mesa (int largo, int ancho) {
		if (largo>0) this.largo=largo;
		if (ancho>0) this.ancho=ancho;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public void setAncho(int ancho) {
		if (ancho>0) this.ancho=ancho;
	}
	
	public int getLargo() {
		return largo;
	}
	
	public void setLargo(int largo) {
		if (largo>0) this.largo=largo;
	}
	
}
public class V24_Encapsulacion {

	public static void main(String[] args) {
		
	
		Mesa mesa1 = new Mesa(200, 30); 	//crea un objeto mesa1 de 20x30 usando el constructor
		Mesa mesa2 = new Mesa();		//crea un objeto mesa2 usando la llamada a otro constructor de 10x15

		System.out.println("mesa 1: " + mesa1.getLargo()+" x " + mesa1.getAncho());
		System.out.println("mesa 2: " + mesa2.getLargo()+" x " + mesa2.getAncho());
		
		mesa2.setLargo(60);
		mesa2.setAncho(40);
		
		System.out.println("ahora el tamaño de la mesa 2 es: " + mesa2.getLargo()+" x " + mesa2.getAncho());
		
	}
}
