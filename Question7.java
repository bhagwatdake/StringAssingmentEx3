package StringAssingnmentEx3;

public class Question7 {
	public static void main(String[] args) {
		String str = " India is my country! ";
		
		//replace all white spaces 
		String str2 = str.replaceAll("\s", "**");
		
		System.out.println("Original String = " + str);
		System.out.println("repalce String =" + str2);
	}

}
//Write a program to remove all white spaces from a string