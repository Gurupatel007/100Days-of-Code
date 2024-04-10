import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class validSudoku {
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
    public static void main(String[] args) {
        validSudoku obj = new validSudoku();
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(obj.isValidSudoku(board)); // Output: true
    }
}
