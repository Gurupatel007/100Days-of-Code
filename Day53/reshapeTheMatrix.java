import java.util.Arrays;

public class reshapeTheMatrix {
    static int[][] reshape(int[][] nums,int r, int c){
        int m = nums.length;
        int n = nums[0].length;
        
        int[][] res = new int[r][c];
        for(int i=0;i<m*n;i++){
            int newRow = i/c;
            int newCol = i%c;

            int originalRow = i/n;
            int originalCol = i%n;

            res[newRow][newCol] = nums[originalRow][originalCol];
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] ans = reshape(nums, r, c);
        System.out.println(Arrays.deepToString(ans));
    }
}
