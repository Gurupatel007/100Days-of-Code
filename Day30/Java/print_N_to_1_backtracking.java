public class print_N_to_1_backtracking {
    static void printNumbers(int i,int x,int[] arr){
        if(x<1) return;
        printNumbers(i, x-1, arr);
        arr[x-1] = i-(x-1);
    }
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        printNumbers(x, x, arr);
        return arr;
    }   
    public static void main(String[] args) {
        int n = 5;
        int[] ans = printNos(n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
