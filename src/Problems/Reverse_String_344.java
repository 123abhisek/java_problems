package Problems;

public class Reverse_String_344 {
	public static void reverseString(char[] s) {
		for (int i = 0, j = s.length - 1; i < j; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}

	public static void main(String[] args) {

		char[] s = { 'h', 'e', 'l', 'l', 'o' }; // output: "o","l","l","e","h" 
//		char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' }; // output : "h","a","n","n","a","H"

		System.out.println("Before Reverse :");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

		reverseString(s);

		System.out.println("\n\nAfter Reverse :");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

	}

}
