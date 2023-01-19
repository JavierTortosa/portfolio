package seccion4_poo;

class Test_V21 {
	

	//metodo 1
	static int sum(Integer a, int b) {
		return a + b;
	}
	
	//metodo 2
	static long sum(long x, int y) {
		return x + y + 10;
	}
	
	// metodo 3
	static double sum(int n, double r) {
		return n + r;
	}

	//metodo 4
	//este metodo no seria valido porque no puede hacer una promocion de tipo y un autoboxing a la vez 
	static long sum(Long x, int y) {
		return x + y + 10;
	}
	
	public static void main(String[] args) {
//			System.out.println(sum(3,2));	//error de compilacion

		long va = 3L;
		int vb = 5;

		System.out.println(va + vb);

	}
}

class Number {
	private int n;

	public void setN(int a) {
		System.out.println("a vale = "+ a);
		n = a;
	}

	public int getN() {
		return n;
	}
}

class TestPregunta2 {
	public static void main(String[] args) {
		Number num = new Number();
		processing(num);
		System.out.print(num.getN());
	}

	static void processing(Number x) {
		System.out.println("X vale = "+String.valueOf(x));
		x.setN(x.getN() + 5);
		System.out.print(x.getN());
	}
}

public class V21_Revision_V18_V20 {

	public static void main(String[] args) {
	}
}
