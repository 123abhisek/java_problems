package Problems;

public class Maximum_Nesting_Depth_of_the_Parentheses_1614 {

	public static int maxDepth(String s) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				count += 1;
			}
			if (s.charAt(i) == ')') {
				count -= 1;
			}
			if (max < count) {
				max = count;
			}
			System.out.println("character : " + s.charAt(i) + " count : " + count + " max value : " + max);
		}

		return (count == 0) ? max : 0;
	}

	public static void main(String[] args) {

//		String s = "(1+(2*3)+((8)/4))+1";
//		String s = "(1)+((2))+(((3)))";
		String s =  "((())(()()(())))";

		System.out.println(maxDepth(s));
	}

}
