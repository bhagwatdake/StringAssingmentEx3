package StringAssingnmentEx3;

public class Question4 {
	public static void main(String[] args) {
		String str = "level";

		// Use StringBuilder to reverse the string
		String reversed = new StringBuilder(str).reverse().toString();

		if (str.equals(reversed)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}

}
//Write a program to check if a string is a palindrome.

