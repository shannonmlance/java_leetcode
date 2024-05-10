package arrayAndString.introductionTo2DArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

/*    Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> flat = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        double k = Math.ceil((Math.min(m, n)) / 2.0);
        int row = 0;
        int column = 0;
        int round = 0;
        while (round < k) {
            while ((column < n - round) && (flat.size() < m * n)) {
                flat.add(matrix[row][column]);
                column++;
            }
            row++;
            column--;
            while ((row < m - round) && (flat.size() < m * n)) {
                flat.add(matrix[row][column]);
                row++;
            }
            row--;
            column--;
            while ((column > -1 + round) && (flat.size() < m * n)) {
                flat.add(matrix[row][column]);
                column--;
            }
            row--;
            column++;
            while ((row > round) && (flat.size() < m * n)) {
                flat.add(matrix[row][column]);
                row--;
            }
            round++;
            row++;
            column++;
        }
        return flat;
    }
}
