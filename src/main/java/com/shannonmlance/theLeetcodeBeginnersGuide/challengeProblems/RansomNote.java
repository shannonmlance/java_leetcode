package main.java.com.shannonmlance.theLeetcodeBeginnersGuide.challengeProblems;

import java.util.HashMap;

public class RansomNote {

/*    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
    Each letter in magazine can only be used once in ransomNote.

    Example 1:
    Input: ransomNote = "a", magazine = "b"
    Output: false

    Example 2:
    Input: ransomNote = "aa", magazine = "ab"
    Output: false

    Example 3:
    Input: ransomNote = "aa", magazine = "aab"
    Output: true

    Constraints:
    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.
*/

    public static boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        HashMap<Character, Integer> catalog = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ransomNoteChar = ransomNote.charAt(i);
            char magazineChar = magazine.charAt(i);
            if (catalog.containsKey(ransomNoteChar)) {
                int val = catalog.get(ransomNoteChar);
                catalog.put(ransomNoteChar, val + 1);
            } else {
                catalog.put(ransomNoteChar, 1);
            }
            if (catalog.containsKey(magazineChar)) {
                int val = catalog.get(magazineChar);
                catalog.put(magazineChar, val - 1);
            } else {
                catalog.put(magazineChar, -1);
            }
        }
        for (int i = ransomNote.length(); i < magazine.length(); i++) {
            char magazineChar = magazine.charAt(i);
            if (catalog.containsKey(magazineChar)) {
                int val = catalog.get(magazineChar);
                catalog.put(magazineChar, val -1);
            } else {
                catalog.put(magazineChar, -1);
            }
        }
        for (char c : catalog.keySet()) {
            if (catalog.get(c) > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        HashMap<Character, Integer> catalog = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char magazineChar = magazine.charAt(i);
            int val = catalog.getOrDefault(magazineChar, 0);
            catalog.put(magazineChar, val + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ransomNoteChar = ransomNote.charAt(i);
            int val = catalog.getOrDefault(ransomNoteChar, 0);
            if (val == 0) {
                return false;
            }
            catalog.put(ransomNoteChar, val - 1);
        }
        return true;
    }
}
