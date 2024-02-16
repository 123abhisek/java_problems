package Problems;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_character_387 {

	public static int firstUniqueCharcter(String value) {

		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		
		for (int i = 0; i < value.length(); i++) {
			if(maps.containsKey(value.charAt(i))) {
				int val = maps.get(value.charAt(i));
				maps.put(value.charAt(i), val+1 );
			}
			else {
				maps.put(value.charAt(i), 1 );
			}
		}
		
		for(int j = 0; j < value.length(); j++) {
			if(maps.get(value.charAt(j)) == 1) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String value = "aabb";
		System.out.println(firstUniqueCharcter(value));
	}

}
