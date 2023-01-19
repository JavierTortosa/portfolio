package Jshell;

class FibonacciRecursivo {
	 
    public static void main(String[] args) {
 
        int serie = 10;
 
        for (int i = 0; i < serie; i++) {
 
            System.out.print(fibonacci(i)+" ");
        }
 
    }
 
    public static int fibonacci(int n) {
 
        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n<=0 tambien para incluir negativos
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
 
    }
 
}



public class Apuntes_F2_T5 {

	public static void main(String[] args) {
		
	}
}
