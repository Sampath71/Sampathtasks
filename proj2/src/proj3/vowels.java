package proj3;

public class vowels {
	    public static void main(String[] args) {
	        String input = "w3resource";
	        int vowel = Vowels(input);
	        System.out.println("Number of Vowels in the string: " + vowel);
	    }

	    public static int Vowels(String str) {
	        int count = 0;
	       

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (isVowel(ch)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static boolean isVowel(char ch) {
	       
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}


	  
