# Search a 2D Matrix

## Problem Statement
Given an `m x n` integer matrix, where each row is sorted in non-decreasing order and the first integer of each row is greater than the last integer of the previous row, the task is to determine whether a given target integer is present in the matrix.

## Examples

**Example 1:**
- Input: `matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3`
- Output: `true`

**Example 2:**
- Input: `matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13`
- Output: `false`

## Approach
The provided code snippet implements a straightforward approach by iterating through each element of the matrix to find the target. This method, although simple and easy to understand, does not take advantage of the sorted nature of the matrix and results in a time complexity of O(m*n), where `m` is the number of rows and `n` is the number of columns in the matrix.

### Code
```java
public boolean searchMatrix(int[][] matrix, int target) {
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == target) {
                return true;
            }
        }
    }
    return false;
}
```