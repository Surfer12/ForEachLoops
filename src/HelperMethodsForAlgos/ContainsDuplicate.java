package HelperMethodsForAlgos;

import java.util.HashSet;


public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) { // If there is a duplicate, the add() will return false
                return true;
            }
        }
        return false;
    }
}