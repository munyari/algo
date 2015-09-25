import java.util.HashMap;
import java.util.Set;

public class FrequentInt {
	public static int frequentInt(int[] ar) {
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int i : ar) {
			if (freq.containsKey(i)) {
				freq.put(i, freq.get(i) + 1);
			}
			else {
				freq.put(i, 1);
			}
		}
		int max = Integer.MIN_VALUE;
		int maxNum = -1;
		Set<Integer> nums = freq.keySet(); 
		for (int i: nums) {
			if (freq.get(i) > max) {
				max = freq.get(i);
				maxNum = i;
			}
		}
		return maxNum;
	}
}
