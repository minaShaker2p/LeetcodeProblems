import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumberProblem136 {
    public static int singleNumber(int[] nums) {
        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], -1);
            } else {
                map.put(nums[i], 1);
            }
        }
        // Get the iterator over the HashMap
        Iterator<Map.Entry<Integer, Integer>>
                iterator = map.entrySet().iterator();
        // Iterate over the HashMap
        while (iterator.hasNext()) {

            // Get the entry at this iteration
            Map.Entry<Integer, Integer>
                    entry
                    = iterator.next();
            if (entry.getValue() == 1)
                result = entry.getKey();


        }
        return result;
    }
}
