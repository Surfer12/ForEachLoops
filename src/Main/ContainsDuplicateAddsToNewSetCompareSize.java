package Main;

import java.util.HashSet;

public class ContainsDuplicateAddsToNewSetCompareSize {
    static boolean containsDuplicateAddsToNewSetCompareSize(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}