package sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//class Stud implements Comparable<Stud> {
//
//	int rollNo, marks;
//	String name;
//
//	public Stud(int rollNo, String name, int marks) {
//		super();
//		this.rollNo = rollNo;
//		this.name = name;
//		this.marks = marks;
//	}
//	
//	@Override
//	public String toString() {
//		return "Stud [rollno="+rollNo+", marks="+marks+",name="+name;
//	}
//
//	@Override
//	public int compareTo(Stud o) {
//		return rollNo > o.rollNo ? 1 : -1;
//	}
//
//}

public class Practice_Collection {

//	public static String func(String S) {
//		String val="";
//		for(int i=S.length()-1;i>=0 ;i--) {
//			val += S.charAt(i);
//		}
//		
//		return val.toString();
//	}

	public static void main(String[] args) {

		// Collections

//		Collection values = new ArrayList();
//		values.add(4);
//		values.add(6);
//		values.add(10);
//		
//		Iterator it = values.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		// List

//		List values = new ArrayList();
//		values.add(4);
//		values.add(6);
//		values.add(10);
//		values.add(2, 20);
//		
//		for(Object o : values) {
//			System.out.println(o);
//		}

		// Generic with List

//		List<Integer> values = new ArrayList<Integer>();
//		values.add(4);
//		values.add(6);
//		values.add(10);
//		values.add(2, 20);
//		
//		for(Integer o : values) {
//			System.out.println(o);
//		}

//		List<Integer> values = new ArrayList<Integer>(); // list is by default mutable
//		List<Integer> values = new ArrayList<>();
//		values.add(4);
//		values.add(6);
//		values.add(10);
//		values.add(2, 20);
//		
//		Collections.sort(values);
//		Collections.reverse(values);
//		
//		for(Integer o : values) {
//			System.out.println(o);
//		}

		// Comparable Interface

//		List<Stud> studs = new ArrayList<>();
//		studs.add(new Stud(23,"Abhishek",23));
//		studs.add(new Stud(25,"Ashish",50));
//		studs.add(new Stud(29,"Nishant",60));
//		studs.add(new Stud(18,"Devraj",43));
//		studs.add(new Stud(20,"Yashwant",20));
//
//		Collections.sort(studs);
//		
//		for(Stud s : studs) {
//			System.out.println(s);
//		}

		// Set Interface

//		Set<Integer> values = new HashSet<>(); // hashSet will not return values in certain order 
//		values.add(5);
//		values.add(9);
//		values.add(8);
//		values.add(4);
//		values.add(9);
//		
//		for(int i : values) {
//			System.out.println(i);
//		}

		// TreeSet

//		Set<Integer> values = new TreeSet<>(); // hashSet will not return values in certain order 
//		values.add(5);
//		values.add(9);
//		values.add(8);
//		values.add(4);
//		values.add(9);
//		
//		for(int i : values) {
//			System.out.println(i);
//		}

		// Map Interface

//		Map<String, String> map = new HashMap<>();
//		map.put("name", "Navin");
//		map.put("actor", "john");
//		map.put("ceo", "marico");
//
//		Set<String> keys = map.keySet();
//
//		for (String key : keys) {
//			System.out.println(key +" "+map.get(key));
//		}
		
		
//		Map<String, String> map = new HashTable<>();
//		map.put("name", "Navin");
//		map.put("actor", "john");
//		map.put("ceo", "marico");
//
//		Set<String> keys = map.keySet();
//
//		for (String key : keys) {
//			System.out.println(key +" "+map.get(key));
//		}
		
		// Creating a Generic Method
		
//		Integer[] arr = {1,4,3,7,2,1};
//		Integer item = 1;
//		int result = countItems(arr, item);
//		System.out.println(result);
	}
	
	
	// Creating a Generic Method
//	public static <T> int countItems(T[] arr, T item) {
//		int count = 0;
//
//		for (T i : arr) {
//			if (i.equals(item)) {
//				count++;
//			}
//		}
//
//		return count;
//	}

}
