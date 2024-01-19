import java.util.HashMap;
import java.util.Map;

public class javacount {
    public static void main(String[] args) {
        String input = "Hello,nbadmajbnadAD 9611728272";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to lowercase to ignore case sensitivity
        input = input.toLowerCase();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Skip counting non-alphabetic characters and whitespaces
            if (!Character.isLetter(c) || Character.isWhitespace(c)) {
                continue;
            }

            // Update the character count in the map
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c);
                charCountMap.put(c, count + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print the duplicate character count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
            }
        }
    }
}
