import java.util.Scanner;

public class SpiralMatrix2{
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int left = 0 , up=0, down = n-1,right = n-1;

        int counter = 1;
        while(left<=right && up<=down){
            for(int moveRight = left ; moveRight<=right;moveRight++){
                ans[up][moveRight] = counter;
                counter++;
            }
            up++;
            for(int moveDown = up;moveDown<=down;moveDown++){
                ans[moveDown][right] = counter;
                counter++;
            }
            right--;
            if(up<=down){
                for(int moveLeft = right;moveLeft>=left;moveLeft--){
                    ans[down][moveLeft] = counter;
                    counter++;
                }
            }
            down--;
            if(left<=right){
                for(int moveUp = down;moveUp>=up;moveUp--){
                    ans[moveUp][left] = counter;
                    counter++;
                }
            }
            left++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[][] ans  = generateMatrix(n);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
