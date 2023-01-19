package Pregunta_3;

import java.util.*;

/* PREGUNTA 3
 * Con el siguiente código:

import java.util.*;
public class SimpleTesting {
public static void main (String[] args) {
List<String> dateArray = new ArrayList<String>();
dateArray.add("2020-03-25");
dateArray.add("2019-01-27");
dateArray.add("2020-03-26");
dateArray.add("2020-02-26");

 * Utilizar el método collections.sort()
*/


public class SimpleTesting {
	public static void main(String[] args) {
		List<String> dateArray = new ArrayList<String>();
		dateArray.add("2020-03-25");
		dateArray.add("2019-01-27");
		dateArray.add("2020-03-26");
		dateArray.add("2020-02-26");
		
		Collections.sort(dateArray);
		
		System.out.println("Ordenado " + dateArray);
	}
}
