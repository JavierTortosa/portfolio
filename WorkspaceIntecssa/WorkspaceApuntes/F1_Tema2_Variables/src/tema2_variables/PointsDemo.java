package tema2_variables;

/*
 * Variables de Instancia
 * Variables de Instancia son variables no estaticas
 * Se crean fuera de cualquier bloque dentro de la clase
 * son los atributos de la clase
 * Se crean cuando se crea un objeto de la clase
 * Duran mientras dura el objeto
 * Cada vez que se crea un objeto se crea una copia de dichas variables
 * 
 * 
 * 
 */
class Points{
	
 //Estas variables son variables de instancia.
 //Estas variables están en una clase y no están dentro
 //de ninguna función/método
   int engPoints;
   int mathsPoints;
   int phyPoints;
}

public class PointsDemo{
	
 public static void main(String args[])
 { //primer objeto
   Points obj1 = new Points();
   obj1.engPoints = 50;
   obj1.mathsPoints = 80;
   obj1.phyPoints = 90;
 //segundo objeto
   Points obj2 = new Points();
   obj2.engPoints = 80;
   obj2.mathsPoints = 60;
  obj2.phyPoints = 85;
 //mostrando puntos para el primer objeto
   System.out.println("Puntos para el primer objeto:");
   System.out.println(obj1.engPoints);
   System.out.println(obj1.mathsPoints);
   System.out.println(obj1.phyPoints);

 //mostrando puntos para el segundo objeto
   System.out.println("Puntos para el segundo objeto:");
   System.out.println(obj2.engPoints);
   System.out.println(obj2.mathsPoints);
   System.out.println(obj2.phyPoints);
 }
}
