
import java.util.HashMap;
public class array {

		static void removeDups(int[] a, int n)
		{

			HashMap<Integer, Boolean> mp = new HashMap<>();

			for (int i = 0; i < n; ++i) {

				if (mp.get(a[i]) == null)
				{
					System.out.print(a[i] + " ");
					mp.put(a[i], true);
				}
			}
		}

			public static void main(String[] args)
		{
			int[] arr = { 1, 2, 54, 1,55 ,75, 23, 4, 2,2,75,6 };
		
			int n = arr.length;
			removeDups(arr, n);
		}

}
