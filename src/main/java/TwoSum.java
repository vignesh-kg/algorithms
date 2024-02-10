import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Time Complexity : O(N)
     * Space Complexity : O(N) - to store data in HashMap
     *
     * LeetCode : https://leetcode.com/problems/two-sum/
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumUsingHashing(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = result[1] = -1;

        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (!hmap.containsKey(key)) {
                hmap.put(nums[i], i);
            } else {
                result[0] = hmap.get(key);
                result[1] = i;
                break;
            }
        }
        return result;
    }
}