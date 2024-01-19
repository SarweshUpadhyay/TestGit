import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class poly {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 3};

        // Convert array to set to remove duplicates
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert set back to array
        Integer[] resultArray = set.toArray(new Integer[0]);

        // Print the result
        System.out.println(Arrays.toString(resultArray));
    }
}
