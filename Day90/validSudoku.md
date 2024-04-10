# Valid Sudoku

## Problem Statement

Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

- Each row must contain the digits 1-9 without repetition.
- Each column must contain the digits 1-9 without repetition.
- Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

## Examples

- **Example 1:**
  - Input: 
    ```
    [["5","3",".",".","7",".",".",".","."]
    ,["6",".",".","1","9","5",".",".","."]
    ,[".","9","8",".",".",".",".","6","."]
    ,["8",".",".",".","6",".",".",".","3"]
    ,["4",".",".","8",".","3",".",".","1"]
    ,["7",".",".",".","2",".",".",".","6"]
    ,[".","6",".",".",".",".","2","8","."]
    ,[".",".",".","4","1","9",".",".","5"]
    ,[".",".",".",".","8",".",".","7","9"]]
    ```
  - Output: true
  - Explanation: The Sudoku board is valid.

- **Example 2:**
  - Input: 
    ```
    [["8","3",".",".","7",".",".",".","."]
    ,["6",".",".","1","9","5",".",".","."]
    ,[".","9","8",".",".",".",".","6","."]
    ,["8",".",".",".","6",".",".",".","3"]
    ,["4",".",".","8",".","3",".",".","1"]
    ,["7",".",".",".","2",".",".",".","6"]
    ,[".","6",".",".",".",".","2","8","."]
    ,[".",".",".","4","1","9",".",".","5"]
    ,[".",".",".",".","8",".",".","7","9"]]
    ```
  - Output: false
  - Explanation: The Sudoku board is invalid due to a duplicate number in the top left 3x3 sub-box.

## Constraints

- `board.length == 9`
- `board[i].length == 9`
- `board[i][j]` is a digit 1-9 or '.'.

## Code Walkthrough

The solution involves using three HashMaps to keep track of digits encountered in rows, columns, and 3x3 sub-boxes. Then, iterate through each cell of the board, check for duplicates in rows, columns, and sub-boxes accordingly.

## Implementation

### Code

```java
public boolean isValidSudoku(char[][] board) {
    Map<Integer, Set<Character>> rows = new HashMap<>();
    Map<Integer, Set<Character>> cols = new HashMap<>();
    Map<Integer, Set<Character>> boxes = new HashMap<>();

    // Initialize the HashMaps
    for (int i = 0; i < 9; i++) {
        rows.put(i, new HashSet<>());
        cols.put(i, new HashSet<>());
        boxes.put(i, new HashSet<>());
    }
    // Iterate through each cell in the board
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            char val = board[i][j];

            // Skip if the cell is empty
            if (val == '.') continue;

            // Calculate the index for the 3x3 box
            int boxIndex = (i / 3) * 3 + j / 3;

            // Check for duplicates in the row, column, and box
            if (!rows.get(i).add(val) || !cols.get(j).add(val) || !boxes.get(boxIndex).add(val)) {
                return false; // Found a duplicate
            }
        }
    }
    return true; // No duplicates found
}
```

## Time and Space Complexity

- **Time Complexity:** O(1) - Since the board size is fixed (9x9), the time complexity is constant.
- **Space Complexity:** O(1) - Same as time complexity, the space used does not depend on the input size.