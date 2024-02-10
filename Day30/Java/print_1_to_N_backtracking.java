public class print_1_to_N_backtracking {
    static void printval(int i,int x,int[] arr){
        if(i<1) return;
        printval(i-1, x, arr);
        arr[i-1] = i;
    }
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        printval(x, x, arr);
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
