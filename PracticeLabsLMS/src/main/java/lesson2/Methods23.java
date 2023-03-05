package lesson2;

public class Methods23 {
	public static void main(String args[]) {
		MethodCalling obj = new MethodCalling();
		obj.method1();
		obj.method2(10,20);
	}
}

class MethodCalling{
	public int method1() {
		System.out.println("Inside method1 returning an integer value.");
		return 0;
	}
	
	public void method2(int a, int b) {
		System.out.println("Inside Parameterised method not returning anything.");
	}
}
