package pruebaModulo;

import mibiblioteca.MyBiblioteca;

public class Inicio {

	public static void main(String[] args) {

		MyBiblioteca mb = new MyBiblioteca();
		
		String rndDNI = mb.getRandomString("99999999");
		char rndchar = mb.getLetraDNI(rndDNI);
		System.out.println("la letra del dni " + rndDNI + " es " + rndchar);
		
		String rndStr = mb.getRandomString("(999)-999.999.999"); 
		System.out.println("el telefono es " + rndStr);

		String rndPass = mb.getRandomPassword(25, 25);
		System.out.println("el password es " + rndPass + "("+rndPass.length()+")");
		
		boolean evaluapass = mb.getEvaluaPassword(rndPass, 6, 3, 2, false);
		System.out.println("el password es seguro? " + evaluapass);
		
		String nomH = mb.getRandomNombre(mb.HOMBRE);
		System.out.println("el niño se llama " + nomH);
		
		String nomM = mb.getRandomNombre(mb.MUJER);
		System.out.println("La niña se llama " + nomM);
		
		String nomRnd = mb.getRandomNombre(mb.MIXTO);
		System.out.print("y el coco es " + nomRnd);
		
		int edad = mb.getRandomEdad(15, 20);
		System.out.print(", tiene " + edad +" años");
		
		int altura = mb.getRandomAltura(150, 190);
		System.out.println(" y mide "+ altura + "cm");
	}
}
