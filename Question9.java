package StringAssingnmentEx3;

public class Question9 {
    public static void main(String[] args) {
        String str = "banana";
        char result = '_';  // default value if no non-repeated character is found

        // Outer loop
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeated = false;

            // Inner loop - check if the character is repeated
            for (int k = 0; k < str.length(); k++) {
                if (i != k && str.charAt(i) == str.charAt(k)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                result = str.charAt(i);
                break;
            }
        }

        // Output the result
        if (result != '_') {
            System.out.println("First non-repeated character = " + result);
        } else {
            System.out.println("No non-repeated character found");
        }
    }
}

//9. Write a program to find the first non-repeated character in a string.
