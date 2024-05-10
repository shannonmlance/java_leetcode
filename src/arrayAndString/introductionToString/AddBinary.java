package arrayAndString.introductionToString;

import java.util.ArrayList;
import java.util.Collections;

public class AddBinary {

/*    Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

    public static String addBinary(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        boolean carryover = false;
        ArrayList<Integer> solutionArray = new ArrayList<>();
        int pointerA = charA.length - 1;
        int pointerB = charB.length - 1;
        while (pointerA >= 0 && pointerB >= 0) {
            int intA = Character.getNumericValue(charA[pointerA]);
            int intB = Character.getNumericValue(charB[pointerB]);
            if (!carryover) {
                if (intA == 0 && intB == 0) {
                    solutionArray.add(0);
                } else if (intA == 1 && intB == 1) {
                    solutionArray.add(0);
                    carryover = true;
                } else {
                    solutionArray.add(1);
                }
            } else {
                if (intA == 0 && intB == 0) {
                    solutionArray.add(1);
                    carryover = false;
                } else if (intA == 1 && intB == 1) {
                    solutionArray.add(1);
                } else {
                    solutionArray.add(0);
                }
            }
            pointerA--;
            pointerB--;
        }
        while (pointerA >= 0) {
            int intA = Character.getNumericValue(charA[pointerA]);
            if (!carryover) {
                if (intA == 0) {
                    solutionArray.add(0);
                } else {
                    solutionArray.add(1);
                }
            } else {
                if (intA == 0) {
                    solutionArray.add(1);
                    carryover = false;
                } else {
                    solutionArray.add(0);
                }
            }
            pointerA--;
        }
        while (pointerB >= 0) {
            int intB = Character.getNumericValue(charB[pointerB]);
            if (!carryover) {
                if (intB == 0) {
                    solutionArray.add(0);
                } else {
                    solutionArray.add(1);
                }
            } else {
                if (intB == 0) {
                    solutionArray.add(1);
                    carryover = false;
                } else {
                    solutionArray.add(0);
                }
            }
            pointerB--;
        }
        if (carryover) {
            solutionArray.add(1);
        }
        Collections.reverse(solutionArray);
        StringBuilder builder = new StringBuilder();
        for(int i : solutionArray) {
            builder.append(i);
        }
        return builder.toString();
    }
}
