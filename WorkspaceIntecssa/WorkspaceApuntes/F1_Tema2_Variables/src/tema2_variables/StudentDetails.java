package tema2_variables;

/*
 * Variable local
 * Una variable definida dentro de un bloque, método o constructor se llama variable local
 * Se mantienen mientras estamos en el bloque donde han sido declaradas
 * Tienen un alcance del propio bloque
 * 
 */
public class StudentDetails
{
 public void StudentAge()
 { //variable local age
   int age = 0;
   age = age + 5;
   System.out.println("La edad del estudiante es : " +
age);
 }
 public static void main(String args[])
 {
   StudentDetails obj = new StudentDetails();
   obj.StudentAge();
 }
}
