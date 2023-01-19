package RevisionPreguntasExamen;

public class V06_Revision_V02_V05 {

	//Given the code fragment
	
	public static void main(String[] args) {

		int ivar=100;
		float fvar=23.4f;
		double dvar = 20;
		
//		ivar=fvar; //7
		fvar=ivar; //8
		dvar=fvar; //9
//		fvar=dvar; //10
		dvar=ivar; //11
//		ivar=dvar; //12
		
//		int a=2.7;				//a
		byte n=(byte)4546.9;	//b
		int c=0b110_100;		//c
//		double t = _6.4;		//e
		float g =23;			//f
		short k = (short)45L;	//g
//		boolean n=(boolean)1;	//h
//		char w=300000;			//i
		
	}
}

class Marca{
	int num;
	
	public static void save (Marca obj4) {
		obj4.num+=10;
	}
	//1
	public static void main(String[] args) {
		Marca obj1 = new Marca();
		Marca obj2 = obj1;
		Marca obj3 = null;
		
		obj1.num=10;
		System.out.println(obj1.num);
		
		obj2.num=60;
		save (obj2);
		
		System.out.println(obj1.num);
		
		int p=10,s;
		System.out.println(p);
	}
}

