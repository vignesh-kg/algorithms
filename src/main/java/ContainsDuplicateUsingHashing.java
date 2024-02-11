import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 */
public class ContainsDuplicateUsingHashing {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }
        if (nums.length != uniqueNums.size()) return true;

        return false;
    }
}