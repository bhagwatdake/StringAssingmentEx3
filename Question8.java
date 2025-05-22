package StringAssingnmentEx3;

public class Question8 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		String str1 = "Good Morning";
		String str2 = "Good Morning";
		String str3 = "how are you";
		
		//use equal() method
		System.out.println("using equals() =" + str1.equals(str2));
		
		// use equalIgnorecase() method 
		System.out.println("use equalIgnore case() =" + str1.equalsIgnoreCase(str3));
		
		//use compareTo() method
		int a = str1.compareTo(str2);
		System.out.println("use CompareTo() =" + str1.compareTo(str2));
		
		//use compareToIgnoreCase() method
		int b = str3.compareToIgnoreCase(str2);
		System.out.println("USE compareToIgnoreCase() =" + str3.compareToIgnoreCase(str2));
	    System.out.println("**Program Ends**");	
	}

}
//Write a program to compare two strings
