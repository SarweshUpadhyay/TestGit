import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String inputString = scanner.nextLine();
    	
    	String str="Sarwesh Upadhyay";

        // Split the string into words using a space as the delimiter
        String[] words = str.split(" ");

        // Reverse the order of the words in the array
        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = words[words.length - 1 - i];
        }

        // Join the reversed words into a single string separated by spaces
        String reversedSentence = String.join(" ", reversedWords);

        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
