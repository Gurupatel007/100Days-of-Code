package Day51;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transposed = transpose(matrix);
        for(int i=0;i<transposed.length;i++){
            for(int j=0;j<transposed[i].length;j++){
                System.out.print(transposed[i][j]+" ");
            }
            System.out.println();
        }
    }
}
