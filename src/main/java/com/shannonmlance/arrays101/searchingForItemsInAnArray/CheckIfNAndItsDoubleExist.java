package main.java.com.shannonmlance.arrays101.searchingForItemsInAnArray;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {

/*    Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

Example 1:
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

Example 2:
Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.

Constraints:
2 <= arr.length <= 500
-103 <= arr[i] <= 103
 */

    public static boolean checkIfExist1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkIfExist2(int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            int x = arr.length - 1 - i;
            for (int j = i + 1; j < arr.length - i; j++) {
                int y = arr.length - 1 - j;
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2 || arr[x] == arr[y] * 2 || arr[y] == arr[x] * 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkIfExist3(int[] arr) {
        Set<Integer> integerSet = new HashSet<>();
        for (int num : arr) {
            if (integerSet.contains(num * 2) || ((num % 2 == 0) && integerSet.contains(num / 2))) {
                return true;
            }
            integerSet.add(num);
        }
        return false;
    }
}
