import java.util.*;

public class ArrayCompressor {
    public static void main(String[] args) {
        int[] inputArray = {8, 4, 1, 9, 1, 2, 3, 6, 3, 7, 3, 9};
        String compressedOutput = compressArray(inputArray);
        System.out.println("Compressed output: " + compressedOutput);
    }

    private static String compressArray(int[] inputArray) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the occurrences of each element in the input array
        for (int num : inputArray) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list to store the compressed output
        List<String> compressedList = new ArrayList<>();

        // Convert the frequency map to the compressed output format
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency == 1) {
                compressedList.add(String.valueOf(num));
            } else {
                compressedList.add(num + "," + "3".repeat(frequency - 1));
            }
        }

        // Sort the compressed list
        Collections.sort(compressedList);

        // Join the elements of the compressed list with spaces
        return String.join(" ", compressedList);
    }
}
