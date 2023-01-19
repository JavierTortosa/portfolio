package Pregunta_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* PREGUNTA 2
 * 
 * Crear un Map que contenga la clave entera y los valores String. Usamos la
 * clase HashMap e insertamos elementos usando el método put()
*/

public class Pregunta_2 {

	public static void main(String[] args) {
		Map<String, String> mapa = new HashMap<>();
		
		mapa.put("clave1", "elemento1");
		mapa.put("clave2", "elemento2");
		mapa.put("clave3", "elemento3");
		mapa.put("clave4", "elemento4");
		mapa.put("clave5", "elemento5");
		mapa.put("clave6", "elemento6");
		mapa.put("clave7", "elemento7");
		mapa.put("clave8", "elemento8");
		mapa.put("clave9", "elemento9");
		mapa.put("clave10", "elemento10");
		
		System.out.println("lista de keySet\n" + mapa.keySet());
		System.out.println("\nlista de values\n" + mapa.values());
		System.out.println();
		System.out.println("el elemento con la clave5 es " + mapa.get("clave5"));
		System.out.println();
		
		Iterator it = mapa.keySet().iterator();
		while (it.hasNext()) {
			  Object key = it.next();
			  System.out.println("Clave: " + key + " -> Valor: " + mapa.get(key));
		}
	}
}
