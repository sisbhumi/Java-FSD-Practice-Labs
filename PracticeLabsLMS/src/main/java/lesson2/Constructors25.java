package lesson2;

public class Constructors25 {

	public static void main(String[] args) {
		//constructor without paramenters gets called.
		ClassDemo obj = new ClassDemo();
		//parameterised constructor gets called.
		ClassDemo obj2 = new ClassDemo();
	}

}


class ClassDemo{
	
	ClassDemo(){
		System.out.println("Inside Default Constructor.");
	}
	
	ClassDemo(int a, String b){
		System.out.println("Inside Parameterised constructor.");
	}
}
