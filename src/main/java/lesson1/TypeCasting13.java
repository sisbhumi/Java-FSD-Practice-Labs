package lesson1;

public class TypeCasting13 {

	public static void main(String[] args) {
		
		byte b = 1;
		int a = 10;
		double d = 453.2000;
		float f = 23.23f;
		char c = 'K';
		
		int x = b; //implicit type casting
		System.out.println(x);
		
		double y =  10; //implicit type casting
		System.out.println(y);
		
		float z = (float) 34; //explicit type casting
		System.out.println(z);
		

	}

}
