import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class thinkjava {
    public static void main(String[] args) {
        Integer[] arr = {44, 1, 2, 10, 10, 11, 2, 1, 44, 11,44,11,44,2,44,1,20,10,23};

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);

        
        Collections.sort(list);

        List<Integer> sortedAndUniqueList = new ArrayList<>();
        Integer previous = null;

        for (Integer current : list) {
            if (!current.equals(previous)) {
                sortedAndUniqueList.add(current);
            }
            previous = current;
        }

       
        System.out.println("Sorted and Unique List: " + sortedAndUniqueList);
    }
}
