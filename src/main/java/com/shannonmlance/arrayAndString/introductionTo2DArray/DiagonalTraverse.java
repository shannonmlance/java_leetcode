package main.java.com.shannonmlance.arrayAndString.introductionTo2DArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DiagonalTraverse {

/*    Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

Example 1:
Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:
Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
-105 <= mat[i][j] <= 105
*/

    public static int[] findDiagonalOrder1(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int k = 0;
        int[] flat = new int[m * n];
        ArrayList<Integer> reversible = new ArrayList<>();
        for (int i = 0; i < m + n - 1; i++) {
            reversible.clear();
            int row;
            int column;
            if (i < n) {
                row = 0;
                column = i;
            } else {
                row = i - n + 1;
                column = n - 1;
            }
            while ((row < m) && (column > -1)) {
                reversible.add(mat[row][column]);
                row++;
                column--;
            }
            if (i % 2 == 0) {
                Collections.reverse(reversible);
            }
            for (int j = 0; j < reversible.size(); j++) {
                flat[k] = reversible.get(j);
                k++;
            }
        }
        return flat;
    }

    public static int[] findDiagonalOrder2(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int k = 0;
        int[] flat = new int[m * n];
        int row = 0;
        int column = 0;
        boolean leftToRight = true;
        while ((row < m) && (column < n)) {
            if (leftToRight) {
                while ((row > -1) && (column < n)) {
                    flat[k] = mat[row][column];
                    k++;
                    row--;
                    column++;
                }
                leftToRight = false;
                if (column == n) {
                    row += 2;
                    column--;
                } else if (row < 0) {
                    row = 0;
                }
            } else {
                while ((row < m) && (column > -1)) {
                    flat[k] = mat[row][column];
                    k++;
                    row++;
                    column--;
                }
                leftToRight = true;
                if (row == m) {
                    row --;
                    column += 2;
                } else if (column < 0) {
                    column = 0;
                }
            }
        }
        return flat;
    }
}
