package lesson2;

public class InnerClassess211 {

	public static void main(String[] args) {
		
		//member Inner Class
		OuterClass obj = new OuterClass();  
		OuterClass.MemberInner in = obj.new MemberInner();  
		in.msg();
		
		//Anonymous class
		OuterTestClass test = new OuterTestClass();
		test.t.test1();
		
		//local Inner Class
		LocalInner ic = new LocalInner();
		ic.display();
	}

}

/*---------------------------------------------------*/

class OuterClass{
	
	private int data=30;  
	 
	class MemberInner{  
	  
		 void msg(){
		  System.out.println("Inside Member inner Class: data = "+data);
		 }  
	 }
}

/*----------------------------------------------------*/

interface Test{
	void test1();
}

class OuterTestClass{
	
	Test t = new Test() {
		
		public void test1() {
			System.out.println("Anonymus Inner Class.");
		}
	};
}

/*----------------------------------------------------*/

class LocalInner{  
	
	private int data=30;//instance variable  
	void display(){  
		class Local{  
			void msg(){   System.out.println("Inside Local Inner Class: data = "+ data);	 }  
		}  
		
		Local l=new Local();  
		l.msg();  
	} 
}