public class test8java {

	

	    public static void main(String[] args) {
	        String sentence = "This is a sentence.";
	        reverseWords(sentence);
	        System.out.println(sentence); // Output: .ecnetnes a si siht
	    }

	    private static void reverseWords(String sentence) {
	        int left = 0;
	        int right = 0;

	        // Reverse the entire sentence
	        for (int i = 0; i < sentence.length(); i++) {
	            if (sentence.charAt(i) == ' ') {
	                reverse(sentence, left, right - 1);
	                left = right + 1;
	            }
	            right++;
	        }

	        // Reverse the last word
	        reverse(sentence, left, right - 1);
	    }

	    private static void reverse(String sentence, int left, int right) {
	        while (left < right) {
	            char temp = sentence.charAt(left);
	            sentence = replaceChar(sentence, left, sentence.charAt(right));
	            sentence = replaceChar(sentence, right, temp);
	            left++;
	            right--;
	        }
	    }

	    private static String replaceChar(String str, int index, char c) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.setCharAt(index, c);
	        return sb.toString();
	    }
	


	    
	
	
	}


	
	
	

