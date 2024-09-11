
/* LeetCode 217 
Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true
 */
import java.util.Arrays;
import java.util.HashSet;

/**
 * Checks if an array contains any duplicate elements.
 *
 * @param nums the array of integers to be checked
 * @return true if the array contains duplicate elements, false otherwise
 */
public class Leetcode217Attemp1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.add(num)) { // If there is a duplicate, the add() will return false
                return true;
            }
        }
        return false;
    }

    static boolean containsDuplicateAddsToNewSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}

static boolean containsDuplicateSorting(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == nums[i + 1]) {
            return true;
        }
    }
    return false;
}