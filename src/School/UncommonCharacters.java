package School;

import java.util.*;

public class UncommonCharacters {
    
    String uncommonChars(String A, String B) {
        Set<Character> commonChars = new HashSet<>();
        StringBuilder uncommonChars = new StringBuilder();
        
        // Add characters from string A to the set
        for (char c : A.toCharArray()) {
            commonChars.add(c);
        }
        
        // Check characters in string B and add to uncommonChars if not in commonChars
        for (char c : B.toCharArray()) {
            if (!commonChars.contains(c)) {
                uncommonChars.append(c);
            } else {
                commonChars.remove(c); // Remove from commonChars if it's a common character
            }
        }
        
        return uncommonChars.toString();
    }

    public static void main(String[] args) {
        String A = "geeksforgeeks";
        String B = "geeksquiz";
        
        UncommonCharacters uc = new UncommonCharacters();
        String result = uc.uncommonChars(A, B);
        
        System.out.println(result);
    }
}
