package Problems;

import java.util.ArrayList;
import java.util.List;

// 	647. Palindromic Substrings

public class Palindromic_Substrings_647 {

	public static boolean isPalindrome(String subStr) {

		String a = "";
		for (int i = subStr.length() - 1; i >= 0; i--) {
			a += subStr.charAt(i);
		}
		
		System.out.println(a+" "+subStr);
		
		if (a.equals(subStr)) {
			return true;
		}
		return false;
	}

	public static int countSubstrings(String s) {
		List<String> listStr = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
//			if (isPalindrome(s.substring(i, s.length() - 1))) {
//				listStr.add(s.substring(i,s.length()-1));	
//			}
			
			System.out.println(s.substring(i,s.length()));
			
		}
		System.out.println();
		for (int i = s.length(); i >= 0; i--) {
//			if (isPalindrome(s.substring(0, i))) {
//				listStr.add(s.substring(0, i));
//			}
			
			System.out.println(s.substring(0,i));

		}
		
//		System.out.println(listStr);
		
		return 0;
	}
	

	public static void main(String[] args) {

		String s = "abc";
		System.out.println(countSubstrings(s));
	}

}
