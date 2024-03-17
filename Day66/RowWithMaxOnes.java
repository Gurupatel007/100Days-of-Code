public class RowWithMaxOnes {
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
    public static void main(String[] args) {
        int[][] mat = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };
        RowWithMaxOnes obj = new RowWithMaxOnes();
        int[] result = obj.rowAndMaximumOnes(mat);
        System.out.println("Row with maximum ones: " + result[0]);
        System.out.println("Maximum ones: " + result[1]);   
    }
}