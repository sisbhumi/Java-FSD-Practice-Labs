package lesson2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo29 {

	public static void main(String[] args) {
		
		MapsDemo29 obj = new MapsDemo29();
		obj.treeMapDemo();
		obj.HashMapDemo();
		obj.LinkedMapDemo();
	}
	
	void treeMapDemo() {
		
		Map<Integer,String> mp = new TreeMap<>();
		mp.put(5, "Ram");
		mp.put(8, "Nayra");
		mp.put(1, "Tia");
		mp.put(4, "Sam");
		mp.put(3, "Krish");
		System.out.println(mp);
		
		//returns set of all keys
		System.out.println(mp.keySet());
	}
	
	void HashMapDemo() {
		
		Map<Integer,String> mp = new HashMap<>();
		mp.put(5, "Ram");
		mp.put(8, "Nayra");
		mp.put(1, "Tia");
		mp.put(4, "Sam");
		mp.put(3, "Krish");
		System.out.println(mp);
		
		//returns set of all keys
		System.out.println(mp.keySet());
	}
	
	void LinkedMapDemo() {
		
		Map<Integer,String> mp = new LinkedHashMap<>();
		mp.put(5, "Ram");
		mp.put(8, "Nayra");
		mp.put(1, "Tia");
		mp.put(4, "Sam");
		mp.put(3, "Krish");
		System.out.println(mp);
		
		//returns set of all keys
		System.out.println(mp.keySet());
		
	}

}

