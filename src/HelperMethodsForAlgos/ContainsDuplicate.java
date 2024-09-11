package HelperMethodsForAlgos;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); // Create a HashSet to store seen numbers      
        for (int num : nums) {
            if (seen.contains(num)) { // .contains() is a method that checks if the HashSet contains the number
                return true; // Duplicate found
            }
            seen.add(num);
        }
        return false; // No duplicates
    }
}