package School;

import java.util.Arrays;

public class MaxOccurringCharacter {
    public static char getMaxOccurringCharacter(String str) {
        int[] charCount = new int[26]; // Array to store character count

        // Traverse the input string and update character counts
        for (char c : str.toCharArray()) {
            charCount[c - 'a']++;
        }
        System.out.println(Arrays.toString(charCount));
        char maxChar = 'a'; // Initialize with the first lowercase alphabet
        int maxCount = charCount[0]; // Initialize with the count of 'a'

        // Iterate through the character count array to find the maximum occurring character
        for (int i = 1; i < 26; i++) {
            if (charCount[i] > maxCount) {
                maxChar = (char) ('a' + i);
                maxCount = charCount[i];
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str = "aabbcdd";
        char maxChar = getMaxOccurringCharacter(str);
        System.out.println("Maximum occurring character: " + maxChar);
    }
}
