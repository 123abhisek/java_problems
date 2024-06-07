package Problems;

public class Make_The_String_Great_1544 {

	public static String makeGood(String s) {
		String newStr = s;
		int i = 0;
		int j = 1;
		while (j < newStr.length()) {
			if (((newStr.charAt(i) - 32) == newStr.charAt(j)) || ((newStr.charAt(i) + 32) == newStr.charAt(j))) {
				if (newStr.length() == 2) {
					newStr = "";		
				} else {
					newStr = (newStr.substring(0, i) + newStr.substring(j + 1));
					i = 0;
					j = 1;
				}
			} else {
				i++;
				j++;
			}
		}
		return newStr;
	}

	public static void main(String[] args) {

//		String s = "abBAcC"; // output : ""
//		String s = "leEeetcode"; // output : "leetcode"
//		String s = "Pp"; // output : ""
//		String s = "sPp";

//		System.out.println((char)65 +" : "+(char)97 +" : "+ (char) (66+32));

//		System.out.println(s.substring(0,1));
//		System.out.println(s.substring(3));
//		System.out.println(s.length());

//		int i = 1, j = 2;
//		System.out.println(s.charAt(i));
//		System.out.println(s.charAt(j));
//		if (((s.charAt(i) - 32) == s.charAt(j)) || ((s.charAt(i) + 32) == s.charAt(j))) {
//			System.out.println("true");
//			
//		}

		System.out.println("result :" + makeGood(s));

	}
}
