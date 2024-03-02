package Day51;

public class Cells_with_Odd_values {
    public static int oddCells(int m, int n, int[][] indices) {
        int oddValues = 0;
        int[][] arr = new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices[i].length;j++){
                if(j%2==0) rowIncre(arr,indices[i][j]);
                else columnIncre(arr,indices[i][j]);
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    oddValues++;
                }
            }
        }
        return oddValues;
    }
    public static void rowIncre(int[][] arr,int row){
        for(int i=0;i<arr[0].length;i++){
            arr[row][i]++;
        }
    }
    public static void columnIncre(int[][] arr,int column){
        for(int i=0;i<arr.length;i++){
            arr[i][column]++;
        }
    }
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m, n, indices));
    }
}
