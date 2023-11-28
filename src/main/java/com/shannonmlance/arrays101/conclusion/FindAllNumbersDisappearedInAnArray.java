package main.java.com.shannonmlance.arrays101.conclusion;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

/*    Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */

    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            missing.add(i, i + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            missing.set(nums[i] - 1, null);
        }
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (missing.get(i) != null) {
                Integer temp = missing.get(i);
                missing.set(i, null);
                missing.set(pointer, temp);
                pointer++;
            }
        }
        for (int i = missing.size() - 1; i >= pointer; i--) {
            missing.remove(i);
        }
        return missing;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing.add(i + 1);
            }
        }
        return missing;
    }
}
