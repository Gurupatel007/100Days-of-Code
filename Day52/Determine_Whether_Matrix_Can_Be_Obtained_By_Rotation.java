import java.util.Arrays;

public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    public static boolean findRotation(int[][] mat, int[][] target) {
        int row = mat.length;
        for(int i=0;i<=3;i++) {
            // for rotating maximum three times as if it will rotate 4 times that it will come to same position as it was earlier
            int[][] arr = new int[row][row];
            for(int j=0;j<row;j++){
                for(int k=0;k<row;k++){
                    arr[k][row-1-j] = mat[j][k];
                }
                if(Arrays.deepEquals(target,arr)){
                    return true;
                }
            }
            mat = arr;
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        boolean result = findRotation(mat, target);
        System.out.println(result ? "The target matrix can be obtained by rotation" : "The target matrix cannot be obtained by rotation");
    }
}