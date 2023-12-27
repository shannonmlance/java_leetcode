package main.java.com.shannonmlance.arrayAndString.introductionTo2DArray;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
/*    Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
        1
       / \
      1   1
     / \+/ \
    1   2   1
   / \+/ \+/ \
  1   3   3   1
 / \+/ \+/ \+/ \
1   4   6   4   1

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]

Constraints:
1 <= numRows <= 30
*/
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> initRow = new ArrayList<>();
        initRow.add(1);
        triangle.add(initRow);
        if (numRows > 1) {
            for (int i = 1; i < numRows; i++) {
                List<Integer> row = pacalsNext(triangle.get(i - 1));
                triangle.add(row);
            }
        }
        return triangle;
    }

    public static List<Integer> pacalsNext(List<Integer> previousRow) {
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        for (int i = 1; i < previousRow.size(); i++) {
            currentRow.add(previousRow.get(i - 1) + previousRow.get(i));
        }
        currentRow.add(1);
        return currentRow;
    }
}
