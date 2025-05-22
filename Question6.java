package StringAssingnmentEx3;

public class Question6 {
	public static void main(String[] args) {
	  String str = " I love pune...!";
	  int [] count = new  int [256];  
	  for(int i = 0; i < str.length(); i ++) {
		  char ch = str.charAt(i);
		  count [ch] ++;
		  
	  }
	  System.out.println("Frequency of character =");
	  for (int i = 0; i < 256; i ++) {
		  if(count[i] > 0) {
			  System.out.println((char)i + " = " + count[i]);
		  }
	  }
	}

}
//6. Write a program to count the frequency of characters in a string.
