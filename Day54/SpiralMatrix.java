import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result; // Check for null or empty matrix.

        int m = matrix.length, n = matrix[0].length;
        int up = 0, down = m - 1, left = 0, right = n - 1;

        while (left <= right && up <= down) {
            // Traverse Right
            for (int col = left; col <= right; col++) {
                result.add(matrix[up][col]);
            }
            up++;

            // Traverse Down
            for (int row = up; row <= down; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // Make sure we are now on a different row
            if (up <= down) {
                // Traverse Left
                for (int col = right; col >= left; col--) {
                    result.add(matrix[down][col]);
                }
                down--;
            }

            // Make sure we are now in a different column
            if (left <= right) {
                // Traverse Up
                for (int row = down; row >= up; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans  = spiralOrder(arr);
        System.out.println(ans);
    }
}
