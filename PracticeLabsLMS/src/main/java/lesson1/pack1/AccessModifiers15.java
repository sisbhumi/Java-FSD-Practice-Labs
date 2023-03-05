package lesson1;

public class AccessModifiers15 {
	public static void main(String args[]) {
		SubClass obj = new SubClass();
		TestClass obj1 = new TestClass();
		System.out.println("Inside AccessModifier Class: a = " + obj.a);
		System.out.println("Inside AccessModifier Class: c = " + obj.c);
		obj1.set();
		obj.set();
	}
}

class TestClass {
	
	public int a;
	private int b;
	protected int c;
	
	TestClass(){
		this.a = 10;
		this.b = 20;
		this.c = 30;
	}
	
	public void set() {
		System.out.println("Inside TestClass: b = " + b);
	}
}

class SubClass extends TestClass{
	
	SubClass(){
		System.out.println("Inside sub class constructor");
	}
	
	public void set() {
		System.out.println("Inside childclass a and c are accessible. a= "+a +" c="+ c);
	}
}
