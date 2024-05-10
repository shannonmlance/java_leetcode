package arrayAndString.introductionToString;

public class LongestCommonPrefix {
/*    Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/

    public static String longestCommonPrefix(String[] strs) {
        String output = "";
        int shortest = 200;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortest) {
                shortest = strs[i].length();
            }
        }
        for (int i = 0; i < shortest; i++) {
            char current = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != current) {
                    return output;
                }
            }
            output += current;
        }
        return output;
    }
}
