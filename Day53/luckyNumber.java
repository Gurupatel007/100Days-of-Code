import java.util.ArrayList;
import java.util.List;

public class luckyNumber {
    static List<Integer> LuckyNumber(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j=0;j<n;j++){
                if(arr[i][j]<min){
                    min  = arr[i][j];
                    index = j;
                }
            }
            boolean flag = true;
            for(int row = 0;row<m;row++){
                if(arr[row][index]>min) flag = false;
            }
            if(flag) ls.add(min);
        }
        return ls;
    }
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans = LuckyNumber(arr);
        System.out.println(ans);
    }
}