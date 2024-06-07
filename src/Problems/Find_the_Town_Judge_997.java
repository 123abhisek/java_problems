package Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// 		997. Find the Town Judge

public class Find_the_Town_Judge_997 {

	public static int findJudge(int n, int[][] trust) {

//		HashMap<Integer, Integer> judge_map = new HashMap<Integer, Integer>();

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < trust.length; i++) {
			for (int j = 1; j < trust[i].length; j++) {
				if (trust[i][j - 1] == trust[i][j]) {
					return -1;
				} else {
					set.add(trust[i][j]);
				}
			}
		}

		Integer value = 0;
		for (Integer i : set) {
			value = i;
		}

		return (set.size() > 1) ? -1 : value;
	}

	public static void main(String[] args) {

		int n = 4;
		int[][] trust = { { 1, 2 }, { 2, 3 }, { 2, 4 }, { 3, 4 }, { 4, 2 } };

		System.out.println(findJudge(n, trust));
	}
}
