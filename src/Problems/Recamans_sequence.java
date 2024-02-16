package Problems;

import java.util.ArrayList;
import java.util.HashSet;

public class Recamans_sequence {

//	static ArrayList<Integer> recamanSequence(int n) {
//
//		Object[] arr ;
//
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(0);
//
//		for (int i = 1; i < n; i++) {
//			arr = list.toArray();
//			int val = (Integer)arr[i - 1] - i;
//			if (val < 0 || list.contains(val)) {
//				list.add((Integer)arr[i - 1] + i);
//			} else {
//				list.add(val);
//			}
//			System.out.println();
//		}
//
//		return list;
//	}
	
	static ArrayList<Integer> recamanSequence(int n) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);

		HashSet<Integer> set = new HashSet<>();
		set.add(0);

		for (int i = 1; i < n; i++) {
		    int val = list.get(i - 1) - i;
		    if (val < 0 || set.contains(val)) {
		        val = list.get(i - 1) + i;
		    }
		    list.add(val);
		    set.add(val);
		}

		return list;
	}

	public static void main(String[] args) {

		
		
		long startTime = System.currentTimeMillis();

		// Your Java code block here
		
		int n = 20;
		System.out.println(recamanSequence(n));

		

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;

		System.out.println("Execution time: " + duration + " milliseconds");

		
	
	}

}
