package Main;

import java.util.HashMap;
import java.util.Map;

public class ProfExample {
    public static void main(String[] args) {
        String word = "hello";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (char c : word.toCharArray()) {
            if (frequencyMap.containsKey(c)) { // if the character is already in the map increament the value by 1
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else { // new character encountered, add it to the map with a value of 1
                frequencyMap.put(c, 1);
            }
        }

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}