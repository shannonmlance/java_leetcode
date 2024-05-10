package arrays101.insertingItemsIntoAnArray;

public class DuplicateZeros {

/*    Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

Example 1:
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:
Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]

Constraints:
1 <= arr.length <= 104
0 <= arr[i] <= 9
 */

    public static void duplicateZeros1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j -1];
                }
                i++;
            }
        }
    }


//     arr = [1,0,0,0,0,0,0,0]  -> length = 8
//    goal = [1,0,0,0,0,0,0,0]
//       i = 5
//   zeros = 0
//       j = 0
    public static void duplicateZeros2(int[] arr) {
        int i = 0;
        int zeros = 0;
        while ((i + zeros) < arr.length) {
            if (arr[i] == 0) {
                zeros++;
            }
            i++;
        }
        for (int j = arr.length - 1; j > 0; j--) {
            if (i + zeros > arr.length) {
                arr[j] = 0;
                zeros--;
                j--;

            }
            if (arr[j - zeros] == 0) {
                arr[j] = 0;
                arr[j - 1] = 0;
                zeros--;
                j--;
            } else {
                arr[j] = arr[j - zeros];
            }
        }
    }
}
