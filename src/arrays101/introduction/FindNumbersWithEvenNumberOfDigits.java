package arrays101.introduction;

public class FindNumbersWithEvenNumberOfDigits {

/*    Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore, only 12 and 7896 contain an even number of digits.

Example 2:
Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.


Constraints:
1 <= nums.length <= 500
1 <= nums[i] <= 105
 */

    public static int findNumbers1(int[] nums) {
        int totalCounter = 0;
        for (int n : nums) {
            int counter = 1;
            while (n >= 10) {
                n /= 10;
                counter++;
            }
            if (counter % 2 == 0) {
                totalCounter++;
            }
        }
        return totalCounter;
    }

    public static int findNumbers2(int[] nums) {
        int totalCount = 0;
        for (int n : nums) {
            if (((int) Math.floor(Math.log10(n)) + 1 & 1) == 0) totalCount++;
        }
        return totalCount;
    }

    public static int findNumbers3(int[] nums) {
        int totalCount = 0;
        for (int n : nums) {
            if ((n >= 10 && n < 100) || (n >= 1000 && n < 10000) || n == 100000) totalCount++;
        }
        return totalCount;
    }
}
