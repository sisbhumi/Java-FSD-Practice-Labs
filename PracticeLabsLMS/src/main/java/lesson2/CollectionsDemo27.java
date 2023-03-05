package lesson2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo27 {

	public static void main(String[] args) {
		
		System.out.println("Inside List Demo");
		ListDemo lstObj = new ListDemo();
		lstObj.arrayList();
		lstObj.linkedList();
		lstObj.vectorDemo();
		lstObj.stackDemo();
		
		System.out.println("Inside Queue Demo");
		QueueDemo queObj = new QueueDemo();
		queObj.prioQueDemo();
		queObj.arrayQueDemo();
		
		System.out.println("Inside Set Demo");
		SetDemo setObj = new SetDemo();
		setObj.hashSetDemo();
		setObj.linkedHashSetDemo();
		setObj.treeSetDemo();

	}

}

class ListDemo{
	
	void arrayList() {
		List<Integer> arrList = new ArrayList<Integer>(); 
		
		arrList.add(1); //adding an element to list manually
		
		//adding elements through loop
		
		for( int i = 0; i<5 ; i++) {
			arrList.add(i);
		}
		System.out.println(arrList);
		
		//fetching elements of List
		for( int a: arrList)
			System.out.println(a);
		
		arrList.remove(4);
		System.out.println(arrList);
				
	}
	
	void linkedList() {
		List<Integer> LList = new LinkedList<Integer>(); 
		
		LList.add(1); //adding an element to linked list manually
		
		//adding elements through loop
		
		for( int i = 0; i<5 ; i++) {
			LList.add(i);
		}
		System.out.println(LList);
		
		//fetching elements of Linked List
		for( int a: LList)
			System.out.println(a);
		
		LList.remove(4);
		System.out.println(LList);
	}
	
	void vectorDemo() {
		List<Integer> vecDemo = new Vector<Integer>(); 
		
		vecDemo.add(1); //adding an element to vector manually
		
		//adding elements through loop
		
		for( int i = 0; i<5 ; i++) {
			vecDemo.add(i);
		}
		System.out.println(vecDemo);
		
		//fetching elements of vector
		for( int a: vecDemo)
			System.out.println(a);
		
		vecDemo.remove(4);
		System.out.println(vecDemo);
	}
	
	void stackDemo() {
		List<Integer> stackDemo = new Stack<Integer>(); 
		
		stackDemo.add(1); //adding an element to stack manually
		
		//adding elements through loop
		
		for( int i = 0; i<5 ; i++) {
			stackDemo.add(i);
		}
		System.out.println(stackDemo);
		
		//fetching elements of stack
		for( int a: stackDemo)
			System.out.println(a);
		
		stackDemo.remove(4);
		System.out.println(stackDemo);
		
		stackDemo.set(3, 15); //set 15 at index 3
		System.out.println(stackDemo);
		
	}
	
}

class QueueDemo{
	
	
	Queue<Integer> que = new PriorityQueue<Integer>();
	
	void prioQueDemo(){
		
		for( int i=0 ; i<8 ; i++) 
			que.add(i);
		
		System.out.println(que);
		//return head of the queue and removes it
		que.poll();
		System.out.println(que);
		//returns head of queue but not removes it
		que.peek();
		System.out.println(que);
	}
	
	void arrayQueDemo(){
		
		for( int i=0 ; i<8 ; i++) 
			que.add(i);
		
		System.out.println(que);
		//return head of the queue and removes it
		que.poll();
		System.out.println(que);
		//returns head of queue but not removes it
		que.peek();
		System.out.println(que);
	}
}

class SetDemo{
	void hashSetDemo() {
		Set<String> set1 = new HashSet<String>();
		
		set1.add("Mona");
		set1.add("Reena");
		set1.add("Jaya");
		set1.add("Tom");
		
		System.out.println(set1);
		
		set1.remove("Jaya");
		System.out.println(set1);
	}
	
	void linkedHashSetDemo() {
		
		Set<String> set1 = new LinkedHashSet<String>();
		
		set1.add("Mona");
		set1.add("Reena");
		set1.add("Jaya");
		set1.add("Tom");
		
		System.out.println(set1);
		
		set1.remove("Jaya");
		System.out.println(set1);
	}
	
	void treeSetDemo() {
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Mona");
		set1.add("Reena");
		set1.add("Jaya");
		set1.add("Tom");
		
		System.out.println(set1);
		
		set1.remove("Jaya");
		System.out.println(set1);
	}
}