/* Task 2

Given a word, write a function to count how many times each character appears in the word in java. 
Use a HashMap to store the frequency of each character. 
Use keyset and entry set to print the frequency of each character. */
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String word = "hello";
        Map<Character, Integer> frequencyMap = new HashMap<>(); 

        // Populate the frequency map
        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print the frequency of each character using entrySet for better performance
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}   
