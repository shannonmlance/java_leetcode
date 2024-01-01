package main.java.com.shannonmlance.arrayAndString.introductionToString;

public class ImplementStrStr {

/*    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

Constraints:
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
*/

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int i = 0;
        while (i <= haystack.length() - needle.length()) {
            int pointerH = i;
            int pointerN = 0;
            while (pointerH < haystack.length() && pointerN < needle.length() && haystack.charAt(pointerH) == needle.charAt(pointerN)) {
                pointerH++;
                pointerN++;
            }
            if (pointerN == needle.length()) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
