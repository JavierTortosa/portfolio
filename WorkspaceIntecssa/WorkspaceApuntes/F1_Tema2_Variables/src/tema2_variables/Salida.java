package tema2_variables;

/*
 * Salida por Consola
 * print() y println()
 * 
 * para mostrar texto por consola se utilizan print() o println
 * los dos metodos estan incluidos en la clase System de la libreria java.lang
 * para usarlos se debe poner
 * 
 * 		System.out.print() o System.out.println()
 * 
 * print() 		escribe en una linea
 * println() 	escribe en una linea y añade un salto de linea al final
 * 
 * 
 */
public class Salida
{
 public static void main(String[] args)
 {
   System.out.println("Hola usuario bienvenido");
   System.out.println("A continuación se muestra una cuenta regresiva");
   for (int i = 10; i >= 1; i--)
   {
     System.out.println(i);//Se muestra cada valor de i (de 10 al 1)
   }
   System.out.println("Ahora, otra cuenta regresiva");
   for (int i = 10; i >= 1; i--)
   {
     System.out.print(i);//Se muestra cada valor de i (de 1 a 10)
  }
 }
}