package lesson1.arithmaticcalc;

import java.util.Scanner;

public class ArithimaticCalcDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number one: ");
		int a = sc.nextInt();
		
		System.out.println("Enter operator ");
		String ch = sc.next();
		char[] c = ch.toCharArray();
		System.out.println("Enter number one: ");
		int b = sc.nextInt();
		
		calc obj = new calc(a,b);
		if(c[0] == '+')
			System.out.println(obj.add());
		else if(c[0] == '-')
			System.out.println(obj.sub());
		else if(c[0] == '*')
			System.out.println(obj.mul());
		else if(c[0] == '/')
			System.out.println(obj.div());
	}

}

class calc{
	
	int a , b;
	
	calc( int a, int b){
		this.a = a;
		this.b = b;
	}
	
	int add() {
		return a+b;
	}
	
	int sub() {
		return a-b;
	}
	
	int mul() {
		return a*b;
	}
	
	int div() {
		return a/b;
	}
}
