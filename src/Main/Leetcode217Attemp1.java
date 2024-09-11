package Main; // Changed from HelperMethodsForAlgos to Main
/* LeetCode 217 
Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true
 */

import HelperMethodsForAlgos.ContainsDuplicate;
import HelperMethodsForAlgos.ContainsDuplicateAddsToNewSetCompareSize;
import HelperMethodsForAlgos.ContainsDuplicateBruteForce;
import HelperMethodsForAlgos.ContainsDuplicateSorting;

/**
 * Checks if an array contains any duplicate elements.
 *
 * @param nums the array of integers to be checked
 * @return true if the array contains duplicate elements, false otherwise
 */
public class Leetcode217Attemp1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(ContainsDuplicate.containsDuplicate(nums));
        System.out.println(ContainsDuplicateAddsToNewSetCompareSize.containsDuplicateAddsToNewSetCompareSize(nums));
        System.out.println(ContainsDuplicateSorting.containsDuplicateSorting(nums));
        System.out.println(ContainsDuplicateBruteForce.containsDuplicateBruteForce(nums));
    }
}
