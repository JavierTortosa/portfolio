package main;

import bicicleta.Bicicleta;
import bicicleta.BicicletaMontaña;
import bicicleta.BicicletaTandem;

public class Inicio {

	public static void main(String[] args) {

		
		Bicicleta miBicicleta = new Bicicleta(5, 2, 2);
		Bicicleta tuBicicleta = new Bicicleta(10, 3, 3);
		
		miBicicleta.acelerar();
		tuBicicleta.cambiarPiñon(4);
		tuBicicleta.getAtributos();
		
		System.out.println(miBicicleta.toString());
		System.out.println(tuBicicleta.toString());
		
		
		BicicletaMontaña miBiciMont = new BicicletaMontaña(8, 3, 3, 2);
		BicicletaTandem miBiciTand = new BicicletaTandem(12, 2, 2, 4);
		
		miBiciMont.acelerar();
		miBiciTand.acelerar();
		System.out.println(miBiciMont.toString());
		System.out.println(miBiciTand.toString());
		
		Bicicleta miBiciMont2 = new BicicletaMontaña(10,2,2,2);
		miBiciMont2.acelerar();
		System.out.println(miBiciMont2.toString());
		
		System.out.println();
		Bicicleta [] grupo = {new Bicicleta(5, 2, 2)
				, new BicicletaMontaña(8, 3, 3, 2)
				, new BicicletaTandem(12, 2, 2, 4)
				, new BicicletaMontaña(10,2,2,2)
				, new Bicicleta(10, 3, 3)};
		
		for (int i=0; i<grupo.length; i++) {
			grupo[i].acelerar();
			//System.out.println(grupo[i].toString());
			grupo[i].imprime();
		}
	}
}
