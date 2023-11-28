package main.java.com.shannonmlance.arrays101.conclusion;

public class SquaresOfSortedArray {

/*    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */

//    nums = [-7, -4, -1, 0, 2, 3, 4, 11]
//    sort = [0, 1, 4, 9, 16, 16, 49, 121]
//    i = 3
//    j = 3
//    x = 0

    public static int[] sortedSquares(int[] nums) {
        int[] sortedNums = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        for (int x = nums.length - 1; x >= 0; x--) {
            if ((nums[i] * nums[i]) > (nums[j] * nums[j])) {
                sortedNums[x] = nums[i] * nums[i];
                i++;
            } else {
                sortedNums[x] = nums[j] * nums[j];
                j--;
            }
        }
        return sortedNums;
    }
}
