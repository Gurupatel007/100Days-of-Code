# Row With Maximum Ones

## Problem Statement
Given a `m x n` binary matrix `mat`, the goal is to find the 0-indexed position of the row that contains the maximum count of ones, as well as the number of ones in that row. In case multiple rows have the maximum count of ones, the row with the smallest row number should be selected. The function should return an array containing the index of the row and the number of ones in it.

## Examples

**Example 1:**
- Input: `mat = [[0,1],[1,0]]`
- Output: `[0,1]`
- Explanation: Both rows have the same number of 1's. So, we return the index of the smaller row, 0, and the maximum count of ones (1).

**Example 2:**
- Input: `mat = [[0,0,0],[0,1,1]]`
- Output: `[1,2]`
- Explanation: The row indexed 1 has the maximum count of ones (2). So, we return its index, 1, and the count.

**Example 3:**
- Input: `mat = [[0,0],[1,1],[0,0]]`
- Output: `[1,2]`
- Explanation: The row indexed 1 has the maximum count of ones (2). So the answer is [1,2].

## Approach
The approach to solving this problem involves iterating through each row of the matrix and counting the number of ones in each row. A couple of variables are maintained to track the maximum number of ones found so far and the index of the row where this maximum was found. If a row is found with more ones than the current maximum, these variables are updated. In the end, the index of the row with the maximum number of ones and the count of ones in that row are returned as an array.

### Code
```java
public int[] rowAndMaximumOnes(int[][] mat){
    int maxOnes = 0;
    int rowIndex = 0;

    // Loop through each row of the matrix
    for (int i = 0; i < mat.length; i++) {
        // Count the number of ones in the current row
        int onesCount = 0;
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][j] == 1) {
                onesCount++;
            }
        }
            
        // If the current row has more ones than the previous maximum,
        // update the maximum and the row index
        if (onesCount > maxOnes) {
            maxOnes = onesCount;
            rowIndex = i;
        }
    }

    // Return the index of the row with the maximum count of ones and the count
    return new int[] {rowIndex, maxOnes};
}
```
